package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorBoldIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.85f, 134.0f),
                    PathNode.CurveTo(232.03008f, 115.98872f, 219.59534f, 100.97482f, 202.79718f, 92.88412f),
                    PathNode.CurveTo(185.99901f, 84.79341f, 166.50778f, 84.4304f, 149.42f, 91.89f),
                    PathNode.LineTo(163.64f, 35.12f),
                    PathNode.CurveTo(164.88223f, 30.126392f, 162.80238f, 24.896626f, 158.47f, 22.12f),
                    PathNode.CurveTo(129.40233f, 3.696635f, 90.96948f, 11.558436f, 71.47137f, 39.91639f),
                    PathNode.CurveTo(51.973255f, 68.274345f, 58.39148f, 106.97445f, 86.0f, 127.52f),
                    PathNode.LineTo(29.72f, 143.59f),
                    PathNode.CurveTo(24.760109f, 145.0077f, 21.26124f, 149.43666f, 21.03f, 154.59f),
                    PathNode.CurveTo(19.274607f, 189.20473f, 45.392765f, 218.92688f, 79.94596f, 221.63567f),
                    PathNode.CurveTo(114.49916f, 224.34444f, 144.92989f, 199.0554f, 148.59f, 164.59f),
                    PathNode.LineTo(190.59f, 205.29f),
                    PathNode.CurveTo(194.3017f, 208.86272f, 199.87967f, 209.66762f, 204.45f, 207.29f),
                    PathNode.CurveTo(231.10002f, 193.48027f, 244.57246f, 163.0051f, 236.85f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 121.37258f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(134.62741f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 36.0f),
                    PathNode.CurveTo(128.78035f, 35.999996f, 133.522f, 36.85688f, 138.0f, 38.53f),
                    PathNode.LineTo(124.6f, 92.17f),
                    PathNode.CurveTo(114.23723f, 93.15928f, 104.81002f, 98.58585f, 98.75f, 107.05f),
                    PathNode.CurveTo(85.600655f, 96.37088f, 80.603874f, 78.56693f, 86.27636f, 62.605354f),
                    PathNode.CurveTo(91.94884f, 46.64378f, 107.06044f, 35.986023f, 124.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(105.0f, 192.1f),
                    PathNode.CurveTo(93.63231f, 198.6785f, 79.759445f, 199.2573f, 67.883286f, 193.64856f),
                    PathNode.CurveTo(56.00713f, 188.03981f, 47.64108f, 176.95827f, 45.5f, 164.0f),
                    PathNode.LineTo(98.68f, 148.81f),
                    PathNode.CurveTo(104.70494f, 157.30705f, 114.11492f, 162.77798f, 124.48f, 163.81f),
                    PathNode.CurveTo(122.59389f, 175.69862f, 115.433685f, 186.09709f, 105.0f, 192.1f),
                    PathNode.Close,
                    PathNode.MoveTo(209.7f, 170.54f),
                    PathNode.CurveTo(207.30861f, 174.69344f, 204.18883f, 178.3823f, 200.49f, 181.43f),
                    PathNode.LineTo(160.73f, 143.0f),
                    PathNode.CurveTo(165.07248f, 133.53458f, 165.09071f, 122.64993f, 160.78f, 113.17f),
                    PathNode.CurveTo(176.60318f, 107.12905f, 194.51581f, 111.70854f, 205.49814f, 124.60251f),
                    PathNode.CurveTo(216.48048f, 137.49648f, 218.15158f, 155.90956f, 209.67f, 170.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fan!!
    }

private var _fan: ImageVector? = null
