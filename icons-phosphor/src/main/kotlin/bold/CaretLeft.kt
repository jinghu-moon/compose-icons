package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorBoldIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.49f, 199.51f),
                    PathNode.CurveTo(173.18442f, 204.20442f, 173.18442f, 211.81558f, 168.49f, 216.51f),
                    PathNode.CurveTo(163.79558f, 221.20442f, 156.18442f, 221.20442f, 151.49f, 216.51f),
                    PathNode.LineTo(71.49f, 136.51f),
                    PathNode.CurveTo(69.230545f, 134.25838f, 67.96054f, 131.19981f, 67.96054f, 128.01f),
                    PathNode.CurveTo(67.96054f, 124.82018f, 69.230545f, 121.76162f, 71.49f, 119.51f),
                    PathNode.LineTo(151.49f, 39.51f),
                    PathNode.CurveTo(156.18442f, 34.81558f, 163.79558f, 34.81558f, 168.49f, 39.51f),
                    PathNode.CurveTo(173.18442f, 44.20442f, 173.18442f, 51.81558f, 168.49f, 56.51f),
                    PathNode.LineTo(97.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
