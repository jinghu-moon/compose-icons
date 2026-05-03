package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorBoldIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 136.49f),
                    PathNode.LineTo(136.49f, 216.49f),
                    PathNode.CurveTo(131.79558f, 221.18442f, 124.18442f, 221.18442f, 119.49f, 216.49f),
                    PathNode.CurveTo(114.79558f, 211.79558f, 114.79558f, 204.18442f, 119.49f, 199.49f),
                    PathNode.LineTo(199.49f, 119.49f),
                    PathNode.CurveTo(204.18442f, 114.79558f, 211.79558f, 114.79558f, 216.49f, 119.49f),
                    PathNode.CurveTo(221.18442f, 124.18442f, 221.18442f, 131.79558f, 216.49f, 136.49f),
                    PathNode.Close,
                    PathNode.MoveTo(200.49f, 31.49f),
                    PathNode.CurveTo(198.23837f, 29.230547f, 195.17982f, 27.960535f, 191.99f, 27.960535f),
                    PathNode.CurveTo(188.80019f, 27.960535f, 185.74162f, 29.230547f, 183.49f, 31.49f),
                    PathNode.LineTo(31.49f, 183.49f),
                    PathNode.CurveTo(26.79558f, 188.18442f, 26.79558f, 195.79558f, 31.49f, 200.49f),
                    PathNode.CurveTo(36.18442f, 205.18442f, 43.79558f, 205.18442f, 48.49f, 200.49f),
                    PathNode.LineTo(200.49f, 48.49f),
                    PathNode.CurveTo(202.74333f, 46.23918f, 204.00945f, 43.18491f, 204.00945f, 40.0f),
                    PathNode.CurveTo(204.00945f, 36.81509f, 202.74333f, 33.76082f, 200.49f, 31.51f),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
