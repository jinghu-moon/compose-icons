package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) return _arrowSquareDown!!
        _arrowSquareDown = phosphorBoldIcon(
            name = "ArrowSquareDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(87.51f, 144.49f),
                    PathNode.CurveTo(82.81558f, 139.79558f, 82.81558f, 132.18442f, 87.51f, 127.49f),
                    PathNode.CurveTo(92.20442f, 122.79558f, 99.81558f, 122.79558f, 104.51f, 127.49f),
                    PathNode.LineTo(116.0f, 139.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 81.37258f, 121.37258f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(134.62741f, 76.0f, 140.0f, 81.37258f, 140.0f, 88.0f),
                    PathNode.LineTo(140.0f, 139.0f),
                    PathNode.LineTo(151.51f, 127.48f),
                    PathNode.CurveTo(156.20442f, 122.785576f, 163.81558f, 122.785576f, 168.51f, 127.48f),
                    PathNode.CurveTo(173.20442f, 132.17442f, 173.20442f, 139.78558f, 168.51f, 144.48f),
                    PathNode.LineTo(136.51f, 176.48f),
                    PathNode.CurveTo(134.25838f, 178.73946f, 131.19981f, 180.00946f, 128.01f, 180.00946f),
                    PathNode.CurveTo(124.82018f, 180.00946f, 121.76162f, 178.73946f, 119.51f, 176.48f),
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
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
