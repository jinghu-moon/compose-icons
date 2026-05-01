package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorBoldIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 134.62741f, 222.62741f, 140.0f, 216.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(33.37258f, 140.0f, 28.0f, 134.62741f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 121.37258f, 33.37258f, 116.0f, 40.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.51f, 96.49f),
                    PathNode.CurveTo(121.76162f, 98.74945f, 124.82018f, 100.01946f, 128.01f, 100.01946f),
                    PathNode.CurveTo(131.19981f, 100.01946f, 134.25838f, 98.74945f, 136.51f, 96.49f),
                    PathNode.LineTo(168.51f, 64.49f),
                    PathNode.CurveTo(173.20442f, 59.79558f, 173.20442f, 52.18442f, 168.51f, 47.49f),
                    PathNode.CurveTo(163.81558f, 42.79558f, 156.20442f, 42.79558f, 151.51f, 47.49f),
                    PathNode.LineTo(140.0f, 59.0f),
                    PathNode.LineTo(140.0f, 16.0f),
                    PathNode.CurveTo(140.0f, 9.372583f, 134.62741f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(121.37258f, 4.0f, 116.0f, 9.372583f, 116.0f, 16.0f),
                    PathNode.LineTo(116.0f, 59.0f),
                    PathNode.LineTo(104.49f, 47.51f),
                    PathNode.CurveTo(99.79558f, 42.81558f, 92.18442f, 42.81558f, 87.49f, 47.51f),
                    PathNode.CurveTo(82.79558f, 52.20442f, 82.79558f, 59.81558f, 87.49f, 64.51f),
                    PathNode.Close,
                    PathNode.MoveTo(136.51f, 159.49f),
                    PathNode.CurveTo(134.25838f, 157.23055f, 131.19981f, 155.96054f, 128.01f, 155.96054f),
                    PathNode.CurveTo(124.82018f, 155.96054f, 121.76162f, 157.23055f, 119.51f, 159.49f),
                    PathNode.LineTo(87.51f, 191.49f),
                    PathNode.CurveTo(82.81558f, 196.18442f, 82.81558f, 203.79558f, 87.51f, 208.49f),
                    PathNode.CurveTo(92.20442f, 213.18442f, 99.81558f, 213.18442f, 104.51f, 208.49f),
                    PathNode.LineTo(116.0f, 197.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(116.0f, 246.62741f, 121.37258f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(134.62741f, 252.0f, 140.0f, 246.62741f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 197.0f),
                    PathNode.LineTo(151.51f, 208.52f),
                    PathNode.CurveTo(156.20442f, 213.21442f, 163.81558f, 213.21442f, 168.51f, 208.52f),
                    PathNode.CurveTo(173.20442f, 203.82558f, 173.20442f, 196.21442f, 168.51f, 191.52f),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
