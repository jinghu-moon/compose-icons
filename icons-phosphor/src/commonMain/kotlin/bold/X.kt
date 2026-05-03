package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorBoldIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 191.51f),
                    PathNode.CurveTo(213.18442f, 196.20442f, 213.18442f, 203.81558f, 208.49f, 208.51f),
                    PathNode.CurveTo(203.79558f, 213.20442f, 196.18442f, 213.20442f, 191.49f, 208.51f),
                    PathNode.LineTo(128.0f, 145.0f),
                    PathNode.LineTo(64.49f, 208.49f),
                    PathNode.CurveTo(59.79558f, 213.18442f, 52.18442f, 213.18442f, 47.49f, 208.49f),
                    PathNode.CurveTo(42.79558f, 203.79558f, 42.79558f, 196.18442f, 47.49f, 191.49f),
                    PathNode.LineTo(111.0f, 128.0f),
                    PathNode.LineTo(47.51f, 64.49f),
                    PathNode.CurveTo(42.81558f, 59.79558f, 42.81558f, 52.18442f, 47.51f, 47.49f),
                    PathNode.CurveTo(52.20442f, 42.79558f, 59.81558f, 42.79558f, 64.51f, 47.49f),
                    PathNode.LineTo(128.0f, 111.0f),
                    PathNode.LineTo(191.51f, 47.48f),
                    PathNode.CurveTo(196.20442f, 42.78558f, 203.81558f, 42.78558f, 208.51f, 47.48f),
                    PathNode.CurveTo(213.20442f, 52.17442f, 213.20442f, 59.78558f, 208.51f, 64.48f),
                    PathNode.LineTo(145.0f, 128.0f),
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
        return _x!!
    }

private var _x: ImageVector? = null
