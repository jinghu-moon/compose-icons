package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorLightIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 58.0f),
                    PathNode.LineTo(174.0f, 58.0f),
                    PathNode.LineTo(174.0f, 16.0f),
                    PathNode.CurveTo(174.0f, 12.686292f, 171.3137f, 10.0f, 168.0f, 10.0f),
                    PathNode.CurveTo(164.6863f, 10.0f, 162.0f, 12.686292f, 162.0f, 16.0f),
                    PathNode.LineTo(162.0f, 58.0f),
                    PathNode.LineTo(94.0f, 58.0f),
                    PathNode.LineTo(94.0f, 16.0f),
                    PathNode.CurveTo(94.0f, 12.686292f, 91.313705f, 10.0f, 88.0f, 10.0f),
                    PathNode.CurveTo(84.686295f, 10.0f, 82.0f, 12.686292f, 82.0f, 16.0f),
                    PathNode.LineTo(82.0f, 58.0f),
                    PathNode.LineTo(32.55f, 58.0f),
                    PathNode.CurveTo(30.872978f, 57.87579f, 29.219069f, 58.44939f, 27.979065f, 59.585266f),
                    PathNode.CurveTo(26.739063f, 60.721153f, 26.022974f, 62.318542f, 26.0f, 64.0f),
                    PathNode.CurveTo(26.0f, 67.313705f, 28.68629f, 70.0f, 32.0f, 70.0f),
                    PathNode.LineTo(50.0f, 70.0f),
                    PathNode.LineTo(50.0f, 160.0f),
                    PathNode.CurveTo(50.0f, 180.98682f, 67.013176f, 198.0f, 88.0f, 198.0f),
                    PathNode.LineTo(122.0f, 198.0f),
                    PathNode.LineTo(122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.LineTo(134.0f, 198.0f),
                    PathNode.LineTo(168.0f, 198.0f),
                    PathNode.CurveTo(188.98682f, 198.0f, 206.0f, 180.98682f, 206.0f, 160.0f),
                    PathNode.LineTo(206.0f, 70.0f),
                    PathNode.LineTo(224.0f, 70.0f),
                    PathNode.CurveTo(227.3137f, 70.0f, 230.0f, 67.313705f, 230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 60.68629f, 227.3137f, 58.0f, 224.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 160.0f),
                    PathNode.CurveTo(194.0f, 174.3594f, 182.3594f, 186.0f, 168.0f, 186.0f),
                    PathNode.LineTo(88.0f, 186.0f),
                    PathNode.CurveTo(73.640594f, 186.0f, 62.0f, 174.3594f, 62.0f, 160.0f),
                    PathNode.LineTo(62.0f, 70.0f),
                    PathNode.LineTo(194.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.07f, 131.42f),
                    PathNode.CurveTo(105.94597f, 129.80177f, 105.688065f, 127.73481f, 106.38f, 125.89f),
                    PathNode.LineTo(118.38f, 93.89f),
                    PathNode.CurveTo(119.54532f, 90.78616f, 123.00616f, 89.21467f, 126.11f, 90.38f),
                    PathNode.CurveTo(129.21384f, 91.54532f, 130.78532f, 95.00616f, 129.62f, 98.11f),
                    PathNode.LineTo(120.62f, 122.0f),
                    PathNode.LineTo(144.0f, 122.0f),
                    PathNode.CurveTo(145.96907f, 121.998924f, 147.81332f, 122.96408f, 148.93488f, 124.58253f),
                    PathNode.CurveTo(150.05641f, 126.20097f, 150.31245f, 128.26671f, 149.62f, 130.11f),
                    PathNode.LineTo(137.62f, 162.11f),
                    PathNode.CurveTo(136.45468f, 165.21384f, 132.99384f, 166.78532f, 129.89f, 165.62f),
                    PathNode.CurveTo(126.78616f, 164.45468f, 125.21467f, 160.99384f, 126.38f, 157.89f),
                    PathNode.LineTo(135.38f, 134.0f),
                    PathNode.LineTo(112.0f, 134.0f),
                    PathNode.CurveTo(110.03312f, 134.00005f, 108.19112f, 133.03607f, 107.07f, 131.42f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
