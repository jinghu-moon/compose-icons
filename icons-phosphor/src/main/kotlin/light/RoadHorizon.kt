package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorLightIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.94f, 197.23f),
                    PathNode.CurveTo(232.05153f, 198.85355f, 228.39383f, 197.82831f, 226.77f, 194.94f),
                    PathNode.LineTo(156.49f, 70.0f),
                    PathNode.LineTo(134.0f, 70.0f),
                    PathNode.LineTo(134.0f, 80.0f),
                    PathNode.CurveTo(134.0f, 83.313705f, 131.3137f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(124.686295f, 86.0f, 122.0f, 83.313705f, 122.0f, 80.0f),
                    PathNode.LineTo(122.0f, 70.0f),
                    PathNode.LineTo(99.51f, 70.0f),
                    PathNode.LineTo(29.23f, 194.94f),
                    PathNode.CurveTo(28.191277f, 196.8312f, 26.217073f, 198.01906f, 24.059618f, 198.05092f),
                    PathNode.CurveTo(21.902163f, 198.08278f, 19.893738f, 196.95377f, 18.799616f, 195.09406f),
                    PathNode.CurveTo(17.705494f, 193.23434f, 17.694185f, 190.93036f, 18.77f, 189.06f),
                    PathNode.LineTo(85.74f, 70.0f),
                    PathNode.LineTo(24.0f, 70.0f),
                    PathNode.CurveTo(20.68629f, 70.0f, 18.0f, 67.313705f, 18.0f, 64.0f),
                    PathNode.CurveTo(18.0f, 60.68629f, 20.68629f, 58.0f, 24.0f, 58.0f),
                    PathNode.LineTo(232.0f, 58.0f),
                    PathNode.CurveTo(235.3137f, 58.0f, 238.0f, 60.68629f, 238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 67.313705f, 235.3137f, 70.0f, 232.0f, 70.0f),
                    PathNode.LineTo(170.26f, 70.0f),
                    PathNode.LineTo(237.26f, 189.06f),
                    PathNode.CurveTo(238.03725f, 190.45074f, 238.22945f, 192.0935f, 237.79425f, 193.62611f),
                    PathNode.CurveTo(237.35904f, 195.1587f, 236.33215f, 196.45529f, 234.94f, 197.23f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 114.0f),
                    PathNode.CurveTo(124.686295f, 114.0f, 122.0f, 116.686295f, 122.0f, 120.0f),
                    PathNode.LineTo(122.0f, 136.0f),
                    PathNode.CurveTo(122.0f, 139.3137f, 124.686295f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(131.3137f, 142.0f, 134.0f, 139.3137f, 134.0f, 136.0f),
                    PathNode.LineTo(134.0f, 120.0f),
                    PathNode.CurveTo(134.0f, 116.686295f, 131.3137f, 114.0f, 128.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 170.0f),
                    PathNode.CurveTo(124.686295f, 170.0f, 122.0f, 172.6863f, 122.0f, 176.0f),
                    PathNode.LineTo(122.0f, 192.0f),
                    PathNode.CurveTo(122.0f, 195.3137f, 124.686295f, 198.0f, 128.0f, 198.0f),
                    PathNode.CurveTo(131.3137f, 198.0f, 134.0f, 195.3137f, 134.0f, 192.0f),
                    PathNode.LineTo(134.0f, 176.0f),
                    PathNode.CurveTo(134.0f, 172.6863f, 131.3137f, 170.0f, 128.0f, 170.0f),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
