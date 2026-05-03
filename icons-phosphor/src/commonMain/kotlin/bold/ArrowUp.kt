package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorBoldIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 120.49f),
                    PathNode.CurveTo(206.23837f, 122.74945f, 203.17982f, 124.01946f, 199.99f, 124.01946f),
                    PathNode.CurveTo(196.80019f, 124.01946f, 193.74162f, 122.74945f, 191.49f, 120.49f),
                    PathNode.LineTo(140.0f, 69.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 222.62741f, 134.62741f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(121.37258f, 228.0f, 116.0f, 222.62741f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 69.0f),
                    PathNode.LineTo(64.49f, 120.49f),
                    PathNode.CurveTo(59.79558f, 125.18442f, 52.18442f, 125.18442f, 47.49f, 120.49f),
                    PathNode.CurveTo(42.79558f, 115.79558f, 42.79558f, 108.18442f, 47.49f, 103.49f),
                    PathNode.LineTo(119.49f, 31.49f),
                    PathNode.CurveTo(121.74162f, 29.230547f, 124.80018f, 27.960535f, 127.99f, 27.960535f),
                    PathNode.CurveTo(131.17982f, 27.960535f, 134.23837f, 29.230547f, 136.49f, 31.49f),
                    PathNode.LineTo(208.49f, 103.49f),
                    PathNode.CurveTo(210.74945f, 105.74162f, 212.01947f, 108.80018f, 212.01947f, 111.99f),
                    PathNode.CurveTo(212.01947f, 115.17982f, 210.74945f, 118.23838f, 208.49f, 120.49f),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
