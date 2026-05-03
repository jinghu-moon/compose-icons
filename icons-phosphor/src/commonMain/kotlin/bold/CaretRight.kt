package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = phosphorBoldIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.49f, 136.49f),
                    PathNode.LineTo(104.49f, 216.49f),
                    PathNode.CurveTo(99.79558f, 221.18442f, 92.18442f, 221.18442f, 87.49f, 216.49f),
                    PathNode.CurveTo(82.79558f, 211.79558f, 82.79558f, 204.18442f, 87.49f, 199.49f),
                    PathNode.LineTo(159.0f, 128.0f),
                    PathNode.LineTo(87.51f, 56.49f),
                    PathNode.CurveTo(82.81558f, 51.79558f, 82.81558f, 44.18442f, 87.51f, 39.49f),
                    PathNode.CurveTo(92.20442f, 34.79558f, 99.81558f, 34.79558f, 104.51f, 39.49f),
                    PathNode.LineTo(184.51f, 119.49f),
                    PathNode.CurveTo(186.7668f, 121.74428f, 188.03322f, 124.80434f, 188.02946f, 127.99415f),
                    PathNode.CurveTo(188.02571f, 131.18398f, 186.7521f, 134.24104f, 184.49f, 136.49f),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
