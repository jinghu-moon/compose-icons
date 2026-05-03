package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorBoldIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.73f, 66.63f),
                    PathNode.LineTo(210.73f, 34.63f),
                    PathNode.CurveTo(208.69684f, 30.566935f, 204.54338f, 28.000532f, 200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(51.456627f, 28.000532f, 47.303158f, 30.566935f, 45.27f, 34.63f),
                    PathNode.LineTo(29.27f, 66.63f),
                    PathNode.CurveTo(28.435266f, 68.29704f, 28.000437f, 70.13565f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(227.99956f, 70.13565f, 227.56471f, 68.29704f, 226.73f, 66.63f),
                    PathNode.Close,
                    PathNode.MoveTo(192.58f, 52.0f),
                    PathNode.LineTo(198.58f, 64.0f),
                    PathNode.LineTo(57.42f, 64.0f),
                    PathNode.LineTo(63.42f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.LineTo(204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.49f, 135.51f),
                    PathNode.CurveTo(173.18442f, 140.20442f, 173.18442f, 147.81558f, 168.49f, 152.51f),
                    PathNode.CurveTo(163.79558f, 157.20442f, 156.18442f, 157.20442f, 151.49f, 152.51f),
                    PathNode.LineTo(140.0f, 141.0f),
                    PathNode.LineTo(140.0f, 180.0f),
                    PathNode.CurveTo(140.0f, 186.62741f, 134.62741f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(121.37258f, 192.0f, 116.0f, 186.62741f, 116.0f, 180.0f),
                    PathNode.LineTo(116.0f, 141.0f),
                    PathNode.LineTo(104.49f, 152.52f),
                    PathNode.CurveTo(99.79558f, 157.21442f, 92.18442f, 157.21442f, 87.49f, 152.52f),
                    PathNode.CurveTo(82.79558f, 147.82558f, 82.79558f, 140.21442f, 87.49f, 135.52f),
                    PathNode.LineTo(119.49f, 103.52f),
                    PathNode.CurveTo(121.74162f, 101.260544f, 124.80018f, 99.99054f, 127.99f, 99.99054f),
                    PathNode.CurveTo(131.17982f, 99.99054f, 134.23837f, 101.260544f, 136.49f, 103.52f),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
