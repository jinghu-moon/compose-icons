package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineLeft: ImageVector
    get() {
        if (_caretLineLeft != null) return _caretLineLeft!!
        _caretLineLeft = phosphorBoldIcon(
            name = "CaretLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.49f, 199.51f),
                    PathNode.CurveTo(205.18442f, 204.20442f, 205.18442f, 211.81558f, 200.49f, 216.51f),
                    PathNode.CurveTo(195.79558f, 221.20442f, 188.18442f, 221.20442f, 183.49f, 216.51f),
                    PathNode.LineTo(103.49f, 136.51f),
                    PathNode.CurveTo(101.230545f, 134.25838f, 99.96054f, 131.19981f, 99.96054f, 128.01f),
                    PathNode.CurveTo(99.96054f, 124.82018f, 101.230545f, 121.76162f, 103.49f, 119.51f),
                    PathNode.LineTo(183.49f, 39.51f),
                    PathNode.CurveTo(188.18442f, 34.81558f, 195.79558f, 34.81558f, 200.49f, 39.51f),
                    PathNode.CurveTo(205.18442f, 44.20442f, 205.18442f, 51.81558f, 200.49f, 56.51f),
                    PathNode.LineTo(129.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 36.0f),
                    PathNode.CurveTo(65.37258f, 36.0f, 60.0f, 41.37258f, 60.0f, 48.0f),
                    PathNode.LineTo(60.0f, 208.0f),
                    PathNode.CurveTo(60.0f, 214.62741f, 65.37258f, 220.0f, 72.0f, 220.0f),
                    PathNode.CurveTo(78.62742f, 220.0f, 84.0f, 214.62741f, 84.0f, 208.0f),
                    PathNode.LineTo(84.0f, 48.0f),
                    PathNode.CurveTo(84.0f, 41.37258f, 78.62742f, 36.0f, 72.0f, 36.0f),
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
        return _caretLineLeft!!
    }

private var _caretLineLeft: ImageVector? = null
