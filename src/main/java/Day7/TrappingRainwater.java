package org.example.Day7;

public class TrappingRainwater {
    public static void main(String args[]) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The total water trapped is " + trap(arr));
        System.out.println("The total water trapped with optimal is " + trapOptimal(arr));
    }
    public static int trap(int [] arr)
    {
        int n = arr.length;
        int[] prefix = new int[n];
        int [] suffix = new int [n];
        prefix[0] = arr[0];
        for(int i = 1; i<n;i++)
        {
            prefix[i] = Math.max(arr[i], prefix[i-1]);
        }
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0;i--)
        {
            suffix[i] = Math.max(arr[i], suffix[i+1]);
        }
        int ans = 0;
        for(int i = 0; i<n; i++)
        {
            ans += Math.min(suffix[i], prefix[i]) - arr[i];
        }

        return ans;
    }
    public static int trapOptimal(int[] arr)
    {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int leftmax = Integer.MIN_VALUE;
        int rightmax = Integer.MIN_VALUE;
        int res = 0;

            while(left<=right)
            {
                if(arr[left]<=arr[right])
                {
                    if(arr[left]>leftmax)
                    {
                        leftmax = arr[left];
                        res += leftmax - arr[left];
                    }
                    else{
                        res += leftmax - arr[left];
                    }
                    left++;
                }
                else{
                    if(arr[right]>rightmax)
                    {
                        rightmax = arr[right];
                        res += rightmax - arr[right];
                    }
                    else{
                        res += rightmax - arr[right];
                    }
                    right --;
                }
            }
            return res;
        }

    }

