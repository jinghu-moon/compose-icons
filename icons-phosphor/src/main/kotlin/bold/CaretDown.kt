package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = phosphorBoldIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 104.49f),
                    PathNode.LineTo(136.49f, 184.49f),
                    PathNode.CurveTo(134.23837f, 186.74945f, 131.17982f, 188.01947f, 127.99f, 188.01947f),
                    PathNode.CurveTo(124.80018f, 188.01947f, 121.74162f, 186.74945f, 119.49f, 184.49f),
                    PathNode.LineTo(39.49f, 104.49f),
                    PathNode.CurveTo(34.79558f, 99.79558f, 34.79558f, 92.18442f, 39.49f, 87.49f),
                    PathNode.CurveTo(44.18442f, 82.79558f, 51.79558f, 82.79558f, 56.49f, 87.49f),
                    PathNode.LineTo(128.0f, 159.0f),
                    PathNode.LineTo(199.51f, 87.48f),
                    PathNode.CurveTo(204.20442f, 82.78558f, 211.81558f, 82.78558f, 216.51f, 87.48f),
                    PathNode.CurveTo(221.20442f, 92.17442f, 221.20442f, 99.785576f, 216.51f, 104.48f),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
