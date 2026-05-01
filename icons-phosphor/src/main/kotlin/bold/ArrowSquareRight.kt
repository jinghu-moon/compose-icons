package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareRight: ImageVector
    get() {
        if (_arrowSquareRight != null) return _arrowSquareRight!!
        _arrowSquareRight = phosphorBoldIcon(
            name = "ArrowSquareRight",
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
                    PathNode.MoveTo(76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 121.37258f, 81.37258f, 116.0f, 88.0f, 116.0f),
                    PathNode.LineTo(139.0f, 116.0f),
                    PathNode.LineTo(127.48f, 104.49f),
                    PathNode.CurveTo(122.785576f, 99.79558f, 122.785576f, 92.18442f, 127.48f, 87.49f),
                    PathNode.CurveTo(132.17442f, 82.79558f, 139.78558f, 82.79558f, 144.48f, 87.49f),
                    PathNode.LineTo(176.48f, 119.49f),
                    PathNode.CurveTo(178.73946f, 121.74162f, 180.00946f, 124.80018f, 180.00946f, 127.99f),
                    PathNode.CurveTo(180.00946f, 131.17982f, 178.73946f, 134.23837f, 176.48f, 136.49f),
                    PathNode.LineTo(144.48f, 168.49f),
                    PathNode.CurveTo(139.78558f, 173.18442f, 132.17442f, 173.18442f, 127.48f, 168.49f),
                    PathNode.CurveTo(122.785576f, 163.79558f, 122.785576f, 156.18442f, 127.48f, 151.49f),
                    PathNode.LineTo(139.0f, 140.0f),
                    PathNode.LineTo(88.0f, 140.0f),
                    PathNode.CurveTo(81.37258f, 140.0f, 76.0f, 134.62741f, 76.0f, 128.0f),
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
        return _arrowSquareRight!!
    }

private var _arrowSquareRight: ImageVector? = null
