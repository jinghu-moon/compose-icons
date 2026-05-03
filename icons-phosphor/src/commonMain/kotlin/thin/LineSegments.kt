package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorThinIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.81f, 36.19f),
                    PathNode.CurveTo(230.5589f, 30.938364f, 223.43655f, 27.98798f, 216.01f, 27.98798f),
                    PathNode.CurveTo(208.58345f, 27.98798f, 201.4611f, 30.938364f, 196.21f, 36.19f),
                    PathNode.LineTo(196.21f, 36.19f),
                    PathNode.CurveTo(190.95836f, 41.4411f, 188.00798f, 48.563442f, 188.00798f, 55.99f),
                    PathNode.CurveTo(188.00798f, 63.416557f, 190.95836f, 70.5389f, 196.21f, 75.79f),
                    PathNode.CurveTo(197.18459f, 76.77363f, 198.23445f, 77.67971f, 199.35f, 78.5f),
                    PathNode.LineTo(169.62f, 133.71f),
                    PathNode.CurveTo(160.73587f, 130.47685f, 150.82115f, 131.93137f, 143.24f, 137.58f),
                    PathNode.LineTo(118.42f, 112.76f),
                    PathNode.CurveTo(127.21455f, 100.99924f, 125.42859f, 84.44214f, 114.32834f, 74.827354f),
                    PathNode.CurveTo(103.22809f, 65.21257f, 86.58557f, 65.80735f, 76.2f, 76.19f),
                    PathNode.LineTo(76.2f, 76.19f),
                    PathNode.CurveTo(70.43662f, 81.95139f, 67.46924f, 89.937805f, 68.072365f, 98.064705f),
                    PathNode.CurveTo(68.6755f, 106.1916f, 72.78929f, 113.65249f, 79.34f, 118.5f),
                    PathNode.LineTo(49.6f, 173.72f),
                    PathNode.CurveTo(39.368877f, 169.97781f, 27.896042f, 172.50957f, 20.19f, 180.21f),
                    PathNode.LineTo(20.19f, 180.21f),
                    PathNode.CurveTo(9.256141f, 191.14497f, 9.256743f, 208.87308f, 20.191347f, 219.80731f),
                    PathNode.CurveTo(31.12595f, 230.74153f, 48.85405f, 230.74153f, 59.788654f, 219.80731f),
                    PathNode.CurveTo(70.72326f, 208.87308f, 70.72386f, 191.14497f, 59.79f, 180.21f),
                    PathNode.CurveTo(58.81023f, 179.23193f, 57.76081f, 178.32623f, 56.65f, 177.5f),
                    PathNode.LineTo(86.38f, 122.29f),
                    PathNode.CurveTo(95.2626f, 125.53811f, 105.184616f, 124.08253f, 112.76f, 118.42f),
                    PathNode.LineTo(137.58f, 143.24f),
                    PathNode.CurveTo(130.79326f, 152.32037f, 130.15146f, 164.59702f, 135.95439f, 174.33554f),
                    PathNode.CurveTo(141.7573f, 184.07408f, 152.85973f, 189.35266f, 164.0758f, 187.70567f),
                    PathNode.CurveTo(175.29189f, 186.0587f, 184.40813f, 177.8112f, 187.16643f, 166.81554f),
                    PathNode.CurveTo(189.92471f, 155.81985f, 185.78069f, 144.24599f, 176.67f, 137.5f),
                    PathNode.LineTo(206.4f, 82.28f),
                    PathNode.CurveTo(218.73438f, 86.781105f, 232.53981f, 82.106895f, 239.60265f, 71.03834f),
                    PathNode.CurveTo(246.66548f, 59.969784f, 245.08853f, 45.480076f, 235.81f, 36.19f),
                    PathNode.Close,
                    PathNode.MoveTo(54.13f, 214.19f),
                    PathNode.CurveTo(48.410515f, 219.91121f, 39.807686f, 221.62343f, 32.333454f, 218.52815f),
                    PathNode.CurveTo(24.859226f, 215.4329f, 19.98573f, 208.1398f, 19.98573f, 200.05f),
                    PathNode.CurveTo(19.98573f, 191.9602f, 24.859226f, 184.6671f, 32.333454f, 181.57184f),
                    PathNode.CurveTo(39.807686f, 178.47656f, 48.410515f, 180.18878f, 54.13f, 185.91f),
                    PathNode.CurveTo(61.91102f, 193.7154f, 61.91102f, 206.3446f, 54.13f, 214.15f),
                    PathNode.Close,
                    PathNode.MoveTo(81.85f, 110.19f),
                    PathNode.CurveTo(74.04184f, 102.37868f, 74.04355f, 89.71685f, 81.85382f, 81.90764f),
                    PathNode.CurveTo(89.664085f, 74.09843f, 102.32591f, 74.09843f, 110.13618f, 81.90764f),
                    PathNode.CurveTo(117.94645f, 89.71685f, 117.94816f, 102.37868f, 110.14f, 110.19f),
                    PathNode.LineTo(110.14f, 110.19f),
                    PathNode.CurveTo(106.38241f, 113.93586f, 101.290375f, 116.03512f, 95.98464f, 116.02574f),
                    PathNode.CurveTo(90.6789f, 116.016365f, 85.59432f, 113.89912f, 81.85f, 110.14f),
                    PathNode.Close,
                    PathNode.MoveTo(174.15f, 174.19f),
                    PathNode.CurveTo(166.33868f, 181.99815f, 153.67685f, 181.99644f, 145.86765f, 174.18619f),
                    PathNode.CurveTo(138.05843f, 166.37592f, 138.05843f, 153.71408f, 145.86765f, 145.90382f),
                    PathNode.CurveTo(153.67685f, 138.09355f, 166.33868f, 138.09184f, 174.15f, 145.9f),
                    PathNode.CurveTo(181.93767f, 153.70654f, 181.93767f, 166.34344f, 174.15f, 174.15f),
                    PathNode.Close,
                    PathNode.MoveTo(230.15f, 70.19f),
                    PathNode.CurveTo(222.33868f, 77.99816f, 209.67685f, 77.996445f, 201.86765f, 70.18619f),
                    PathNode.CurveTo(194.05843f, 62.37591f, 194.05843f, 49.71409f, 201.86765f, 41.90382f),
                    PathNode.CurveTo(209.67685f, 34.09355f, 222.33868f, 34.091843f, 230.15f, 41.9f),
                    PathNode.CurveTo(237.93102f, 49.705395f, 237.93102f, 62.334606f, 230.15f, 70.14f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
