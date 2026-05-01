package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorBoldIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 152.49f),
                    PathNode.LineTo(136.49f, 224.49f),
                    PathNode.CurveTo(134.23837f, 226.74945f, 131.17982f, 228.01947f, 127.99f, 228.01947f),
                    PathNode.CurveTo(124.80018f, 228.01947f, 121.74162f, 226.74945f, 119.49f, 224.49f),
                    PathNode.LineTo(47.49f, 152.49f),
                    PathNode.CurveTo(42.79558f, 147.79558f, 42.79558f, 140.18442f, 47.49f, 135.49f),
                    PathNode.CurveTo(52.18442f, 130.79558f, 59.79558f, 130.79558f, 64.49f, 135.49f),
                    PathNode.LineTo(116.0f, 187.0f),
                    PathNode.LineTo(116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 33.37258f, 121.37258f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(134.62741f, 28.0f, 140.0f, 33.37258f, 140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 187.0f),
                    PathNode.LineTo(191.51f, 135.48f),
                    PathNode.CurveTo(196.20442f, 130.78558f, 203.81558f, 130.78558f, 208.51f, 135.48f),
                    PathNode.CurveTo(213.20442f, 140.17442f, 213.20442f, 147.78558f, 208.51f, 152.48f),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
