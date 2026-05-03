package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareLeft: ImageVector
    get() {
        if (_arrowSquareLeft != null) return _arrowSquareLeft!!
        _arrowSquareLeft = phosphorBoldIcon(
            name = "ArrowSquareLeft",
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
                    PathNode.MoveTo(79.51f, 136.49f),
                    PathNode.CurveTo(77.25055f, 134.23837f, 75.98054f, 131.17982f, 75.98054f, 127.99f),
                    PathNode.CurveTo(75.98054f, 124.80018f, 77.25055f, 121.74162f, 79.51f, 119.49f),
                    PathNode.LineTo(111.51f, 87.49f),
                    PathNode.CurveTo(116.20442f, 82.79558f, 123.81558f, 82.79558f, 128.51f, 87.49f),
                    PathNode.CurveTo(133.20442f, 92.18442f, 133.20442f, 99.79558f, 128.51f, 104.49f),
                    PathNode.LineTo(117.0f, 116.0f),
                    PathNode.LineTo(168.0f, 116.0f),
                    PathNode.CurveTo(174.62741f, 116.0f, 180.0f, 121.37258f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 134.62741f, 174.62741f, 140.0f, 168.0f, 140.0f),
                    PathNode.LineTo(117.0f, 140.0f),
                    PathNode.LineTo(128.52f, 151.51f),
                    PathNode.CurveTo(133.21442f, 156.20442f, 133.21442f, 163.81558f, 128.52f, 168.51f),
                    PathNode.CurveTo(123.82558f, 173.20442f, 116.214424f, 173.20442f, 111.52f, 168.51f),
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
        return _arrowSquareLeft!!
    }

private var _arrowSquareLeft: ImageVector? = null
