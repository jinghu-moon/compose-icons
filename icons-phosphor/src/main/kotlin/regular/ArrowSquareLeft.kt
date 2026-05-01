package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowSquareLeft: ImageVector
    get() {
        if (_arrowSquareLeft != null) return _arrowSquareLeft!!
        _arrowSquareLeft = phosphorRegularIcon(
            name = "ArrowSquareLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.34f, 133.66f),
                    PathNode.CurveTo(80.83778f, 132.15945f, 79.993706f, 130.12328f, 79.993706f, 128.0f),
                    PathNode.CurveTo(79.993706f, 125.876724f, 80.83778f, 123.840546f, 82.34f, 122.34f),
                    PathNode.LineTo(114.34f, 90.34f),
                    PathNode.CurveTo(117.465935f, 87.214066f, 122.534065f, 87.214066f, 125.66f, 90.34f),
                    PathNode.CurveTo(128.78593f, 93.465935f, 128.78593f, 98.534065f, 125.66f, 101.66f),
                    PathNode.LineTo(107.31f, 120.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(172.41827f, 120.0f, 176.0f, 123.58172f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 132.41827f, 172.41827f, 136.0f, 168.0f, 136.0f),
                    PathNode.LineTo(107.31f, 136.0f),
                    PathNode.LineTo(125.66f, 154.34f),
                    PathNode.CurveTo(128.78593f, 157.46593f, 128.78593f, 162.53407f, 125.66f, 165.66f),
                    PathNode.CurveTo(122.534065f, 168.78593f, 117.465935f, 168.78593f, 114.34f, 165.66f),
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
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
