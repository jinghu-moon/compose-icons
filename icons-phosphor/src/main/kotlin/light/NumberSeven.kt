package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorLightIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(173.75f, 49.72f),
                    PathNode.LineTo(125.75f, 209.72f),
                    PathNode.CurveTo(124.79731f, 212.89563f, 121.45064f, 214.6977f, 118.275f, 213.745f),
                    PathNode.CurveTo(115.099365f, 212.79231f, 113.29731f, 209.44563f, 114.25f, 206.27f),
                    PathNode.LineTo(159.94f, 54.0f),
                    PathNode.LineTo(88.0f, 54.0f),
                    PathNode.CurveTo(84.686295f, 54.0f, 82.0f, 51.31371f, 82.0f, 48.0f),
                    PathNode.CurveTo(82.0f, 44.68629f, 84.686295f, 42.0f, 88.0f, 42.0f),
                    PathNode.LineTo(168.0f, 42.0f),
                    PathNode.CurveTo(169.89621f, 41.999424f, 171.68109f, 42.89524f, 172.81375f, 44.415977f),
                    PathNode.CurveTo(173.94643f, 45.936714f, 174.29358f, 47.903378f, 173.75f, 49.72f),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
