package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorBoldIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(47.51f, 112.49f),
                    PathNode.CurveTo(42.81558f, 107.79558f, 42.81558f, 100.18442f, 47.51f, 95.49f),
                    PathNode.CurveTo(52.20442f, 90.79558f, 59.81558f, 90.79558f, 64.51f, 95.49f),
                    PathNode.LineTo(116.0f, 147.0f),
                    PathNode.LineTo(116.0f, 32.0f),
                    PathNode.CurveTo(116.0f, 25.372583f, 121.37258f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(134.62741f, 20.0f, 140.0f, 25.372583f, 140.0f, 32.0f),
                    PathNode.LineTo(140.0f, 147.0f),
                    PathNode.LineTo(191.51f, 95.48f),
                    PathNode.CurveTo(196.20442f, 90.78558f, 203.81558f, 90.78558f, 208.51f, 95.48f),
                    PathNode.CurveTo(213.20442f, 100.17442f, 213.20442f, 107.785576f, 208.51f, 112.48f),
                    PathNode.LineTo(136.51f, 184.48f),
                    PathNode.CurveTo(134.25838f, 186.73946f, 131.19981f, 188.00946f, 128.01f, 188.00946f),
                    PathNode.CurveTo(124.82018f, 188.00946f, 121.76162f, 186.73946f, 119.51f, 184.48f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(33.37258f, 204.0f, 28.0f, 209.37259f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 209.37259f, 222.62741f, 204.0f, 216.0f, 204.0f),
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
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
