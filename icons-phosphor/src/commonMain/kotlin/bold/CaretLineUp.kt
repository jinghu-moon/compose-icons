package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineUp: ImageVector
    get() {
        if (_caretLineUp != null) return _caretLineUp!!
        _caretLineUp = phosphorBoldIcon(
            name = "CaretLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 183.51f),
                    PathNode.CurveTo(221.18442f, 188.20442f, 221.18442f, 195.81558f, 216.49f, 200.51f),
                    PathNode.CurveTo(211.79558f, 205.20442f, 204.18442f, 205.20442f, 199.49f, 200.51f),
                    PathNode.LineTo(128.0f, 129.0f),
                    PathNode.LineTo(56.49f, 200.49f),
                    PathNode.CurveTo(51.79558f, 205.18442f, 44.18442f, 205.18442f, 39.49f, 200.49f),
                    PathNode.CurveTo(34.79558f, 195.79558f, 34.79558f, 188.18442f, 39.49f, 183.49f),
                    PathNode.LineTo(119.49f, 103.49f),
                    PathNode.CurveTo(121.74162f, 101.230545f, 124.80018f, 99.96054f, 127.99f, 99.96054f),
                    PathNode.CurveTo(131.17982f, 99.96054f, 134.23837f, 101.230545f, 136.49f, 103.49f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 84.0f),
                    PathNode.LineTo(208.0f, 84.0f),
                    PathNode.CurveTo(214.62741f, 84.0f, 220.0f, 78.62742f, 220.0f, 72.0f),
                    PathNode.CurveTo(220.0f, 65.37258f, 214.62741f, 60.0f, 208.0f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.CurveTo(41.37258f, 60.0f, 36.0f, 65.37258f, 36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 78.62742f, 41.37258f, 84.0f, 48.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretLineUp!!
    }

private var _caretLineUp: ImageVector? = null
