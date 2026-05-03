package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorLightIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.51f, 149.64f),
                    PathNode.LineTo(197.51f, 37.64f),
                    PathNode.CurveTo(196.5663f, 35.434147f, 194.39925f, 34.00255f, 192.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(61.600758f, 34.00255f, 59.4337f, 35.434147f, 58.49f, 37.64f),
                    PathNode.LineTo(10.49f, 149.64f),
                    PathNode.CurveTo(9.697412f, 151.49263f, 9.887715f, 153.61942f, 10.996625f, 155.30186f),
                    PathNode.CurveTo(12.105535f, 156.98434f, 13.98495f, 157.99785f, 16.0f, 158.0f),
                    PathNode.LineTo(122.0f, 158.0f),
                    PathNode.LineTo(122.0f, 210.0f),
                    PathNode.LineTo(96.0f, 210.0f),
                    PathNode.CurveTo(92.686295f, 210.0f, 90.0f, 212.6863f, 90.0f, 216.0f),
                    PathNode.CurveTo(90.0f, 219.3137f, 92.686295f, 222.0f, 96.0f, 222.0f),
                    PathNode.LineTo(160.0f, 222.0f),
                    PathNode.CurveTo(163.3137f, 222.0f, 166.0f, 219.3137f, 166.0f, 216.0f),
                    PathNode.CurveTo(166.0f, 212.6863f, 163.3137f, 210.0f, 160.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 158.0f),
                    PathNode.LineTo(194.0f, 158.0f),
                    PathNode.LineTo(194.0f, 192.0f),
                    PathNode.CurveTo(194.0f, 195.3137f, 196.6863f, 198.0f, 200.0f, 198.0f),
                    PathNode.CurveTo(203.3137f, 198.0f, 206.0f, 195.3137f, 206.0f, 192.0f),
                    PathNode.LineTo(206.0f, 158.0f),
                    PathNode.LineTo(240.0f, 158.0f),
                    PathNode.CurveTo(242.01505f, 157.99785f, 243.89447f, 156.98434f, 245.00337f, 155.30186f),
                    PathNode.CurveTo(246.11229f, 153.61942f, 246.30258f, 151.49263f, 245.51f, 149.64f),
                    PathNode.Close,
                    PathNode.MoveTo(25.1f, 146.0f),
                    PathNode.LineTo(68.0f, 46.0f),
                    PathNode.LineTo(188.0f, 46.0f),
                    PathNode.LineTo(230.9f, 146.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lamp!!
    }

private var _lamp: ImageVector? = null
