package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = phosphorFillIcon(
            name = "Shield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 164.72f, 198.48f, 196.67f, 177.07f, 214.19f),
                    PathNode.CurveTo(154.01f, 233.05f, 131.07f, 239.46f, 130.07f, 239.72f),
                    PathNode.CurveTo(128.69499f, 240.09406f, 127.24502f, 240.09406f, 125.87f, 239.72f),
                    PathNode.CurveTo(124.87f, 239.46f, 101.96f, 233.05f, 78.87f, 214.19f),
                    PathNode.CurveTo(57.52f, 196.67f, 32.0f, 164.72f, 32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 47.163445f, 39.163445f, 40.0f, 48.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(216.83656f, 40.0f, 224.0f, 47.163445f, 224.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shield!!
    }

private var _shield: ImageVector? = null
