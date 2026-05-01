package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorBoldIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 80.49f),
                    PathNode.LineTo(104.49f, 208.49f),
                    PathNode.CurveTo(102.23838f, 210.74945f, 99.17982f, 212.01947f, 95.99f, 212.01947f),
                    PathNode.CurveTo(92.80018f, 212.01947f, 89.74162f, 210.74945f, 87.49f, 208.49f),
                    PathNode.LineTo(31.49f, 152.49f),
                    PathNode.CurveTo(26.79558f, 147.79558f, 26.79558f, 140.18442f, 31.49f, 135.49f),
                    PathNode.CurveTo(36.18442f, 130.79558f, 43.79558f, 130.79558f, 48.49f, 135.49f),
                    PathNode.LineTo(96.0f, 183.0f),
                    PathNode.LineTo(215.51f, 63.51f),
                    PathNode.CurveTo(220.20442f, 58.81558f, 227.81558f, 58.81558f, 232.51f, 63.51f),
                    PathNode.CurveTo(237.20442f, 68.20442f, 237.20442f, 75.81558f, 232.51f, 80.51f),
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
        return _check!!
    }

private var _check: ImageVector? = null
