package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorBoldIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(39.51f, 80.49f),
                    PathNode.CurveTo(34.81558f, 75.79558f, 34.81558f, 68.18442f, 39.51f, 63.49f),
                    PathNode.CurveTo(44.20442f, 58.79558f, 51.81558f, 58.79558f, 56.51f, 63.49f),
                    PathNode.LineTo(128.0f, 135.0f),
                    PathNode.LineTo(199.51f, 63.48f),
                    PathNode.CurveTo(204.20442f, 58.78558f, 211.81558f, 58.78558f, 216.51f, 63.48f),
                    PathNode.CurveTo(221.20442f, 68.17442f, 221.20442f, 75.785576f, 216.51f, 80.48f),
                    PathNode.LineTo(136.51f, 160.48f),
                    PathNode.CurveTo(134.25838f, 162.73946f, 131.19981f, 164.00946f, 128.01f, 164.00946f),
                    PathNode.CurveTo(124.82018f, 164.00946f, 121.76162f, 162.73946f, 119.51f, 160.48f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 180.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(41.37258f, 180.0f, 36.0f, 185.37259f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(214.62741f, 204.0f, 220.0f, 198.62741f, 220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 185.37259f, 214.62741f, 180.0f, 208.0f, 180.0f),
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
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
