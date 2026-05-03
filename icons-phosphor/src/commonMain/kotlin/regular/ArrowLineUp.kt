package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorRegularIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 138.34f),
                    PathNode.CurveTo(208.78593f, 141.46593f, 208.78593f, 146.53407f, 205.66f, 149.66f),
                    PathNode.CurveTo(202.53407f, 152.78593f, 197.46593f, 152.78593f, 194.34f, 149.66f),
                    PathNode.LineTo(136.0f, 91.31f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 132.41827f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 91.31f),
                    PathNode.LineTo(61.66f, 149.66f),
                    PathNode.CurveTo(58.53407f, 152.78593f, 53.46593f, 152.78593f, 50.34f, 149.66f),
                    PathNode.CurveTo(47.21407f, 146.53407f, 47.21407f, 141.46593f, 50.34f, 138.34f),
                    PathNode.LineTo(122.34f, 66.34f),
                    PathNode.CurveTo(123.840546f, 64.83778f, 125.876724f, 63.993706f, 128.0f, 63.993706f),
                    PathNode.CurveTo(130.12328f, 63.993706f, 132.15945f, 64.83778f, 133.66f, 66.34f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.CurveTo(32.0f, 44.418278f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 44.418278f, 224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
