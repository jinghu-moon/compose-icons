package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorLightIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 128.0f),
                    PathNode.CurveTo(238.0f, 131.3137f, 235.3137f, 134.0f, 232.0f, 134.0f),
                    PathNode.LineTo(203.71f, 134.0f),
                    PathNode.LineTo(165.37f, 210.68f),
                    PathNode.CurveTo(164.354f, 212.71509f, 162.2746f, 214.00069f, 160.0f, 214.0f),
                    PathNode.LineTo(159.7f, 214.0f),
                    PathNode.CurveTo(157.32312f, 213.88326f, 155.23988f, 212.37282f, 154.39f, 210.15f),
                    PathNode.LineTo(95.51f, 55.57f),
                    PathNode.LineTo(61.46f, 130.48f),
                    PathNode.CurveTo(60.48754f, 132.62234f, 58.352722f, 133.99864f, 56.0f, 134.0f),
                    PathNode.LineTo(24.0f, 134.0f),
                    PathNode.CurveTo(20.68629f, 134.0f, 18.0f, 131.3137f, 18.0f, 128.0f),
                    PathNode.CurveTo(18.0f, 124.686295f, 20.68629f, 122.0f, 24.0f, 122.0f),
                    PathNode.LineTo(52.14f, 122.0f),
                    PathNode.LineTo(90.54f, 37.52f),
                    PathNode.CurveTo(91.5403f, 35.314873f, 93.76803f, 33.92714f, 96.188286f, 34.001472f),
                    PathNode.CurveTo(98.60854f, 34.07581f, 100.74691f, 35.597645f, 101.61f, 37.86f),
                    PathNode.LineTo(160.74f, 193.1f),
                    PathNode.LineTo(194.63f, 125.32f),
                    PathNode.CurveTo(195.646f, 123.28491f, 197.7254f, 121.99932f, 200.0f, 122.0f),
                    PathNode.LineTo(232.0f, 122.0f),
                    PathNode.CurveTo(235.3137f, 122.0f, 238.0f, 124.686295f, 238.0f, 128.0f),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
