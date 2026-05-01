package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorRegularIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 132.41827f, 228.41827f, 136.0f, 224.0f, 136.0f),
                    PathNode.LineTo(91.31f, 136.0f),
                    PathNode.LineTo(149.66f, 194.34f),
                    PathNode.CurveTo(152.78593f, 197.46593f, 152.78593f, 202.53407f, 149.66f, 205.66f),
                    PathNode.CurveTo(146.53407f, 208.78593f, 141.46593f, 208.78593f, 138.34f, 205.66f),
                    PathNode.LineTo(66.34f, 133.66f),
                    PathNode.CurveTo(64.83778f, 132.15945f, 63.993706f, 130.12328f, 63.993706f, 128.0f),
                    PathNode.CurveTo(63.993706f, 125.876724f, 64.83778f, 123.840546f, 66.34f, 122.34f),
                    PathNode.LineTo(138.34f, 50.34f),
                    PathNode.CurveTo(141.46593f, 47.21407f, 146.53407f, 47.21407f, 149.66f, 50.34f),
                    PathNode.CurveTo(152.78593f, 53.46593f, 152.78593f, 58.53407f, 149.66f, 61.66f),
                    PathNode.LineTo(91.31f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(228.41827f, 120.0f, 232.0f, 123.58172f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.CurveTo(44.418278f, 224.0f, 48.0f, 220.41827f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(48.0f, 35.581722f, 44.418278f, 32.0f, 40.0f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
