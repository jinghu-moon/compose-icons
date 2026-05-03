package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorBoldIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 222.62741f, 134.62741f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(121.37258f, 228.0f, 116.0f, 222.62741f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 33.37258f, 121.37258f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(134.62741f, 28.0f, 140.0f, 33.37258f, 140.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.49f, 87.51f),
                    PathNode.CurveTo(59.79558f, 82.81558f, 52.18442f, 82.81558f, 47.49f, 87.51f),
                    PathNode.CurveTo(42.79558f, 92.20442f, 42.79558f, 99.81558f, 47.49f, 104.51f),
                    PathNode.LineTo(59.0f, 116.0f),
                    PathNode.LineTo(16.0f, 116.0f),
                    PathNode.CurveTo(9.372583f, 116.0f, 4.0f, 121.37258f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 134.62741f, 9.372583f, 140.0f, 16.0f, 140.0f),
                    PathNode.LineTo(59.0f, 140.0f),
                    PathNode.LineTo(47.51f, 151.51f),
                    PathNode.CurveTo(42.81558f, 156.20442f, 42.81558f, 163.81558f, 47.51f, 168.51f),
                    PathNode.CurveTo(52.20442f, 173.20442f, 59.81558f, 173.20442f, 64.51f, 168.51f),
                    PathNode.LineTo(96.51f, 136.51f),
                    PathNode.CurveTo(98.769455f, 134.25838f, 100.03946f, 131.19981f, 100.03946f, 128.01f),
                    PathNode.CurveTo(100.03946f, 124.82018f, 98.769455f, 121.76162f, 96.51f, 119.51f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 116.0f),
                    PathNode.LineTo(197.0f, 116.0f),
                    PathNode.LineTo(208.52f, 104.49f),
                    PathNode.CurveTo(213.21442f, 99.79558f, 213.21442f, 92.18442f, 208.52f, 87.49f),
                    PathNode.CurveTo(203.82558f, 82.79558f, 196.21442f, 82.79558f, 191.52f, 87.49f),
                    PathNode.LineTo(159.52f, 119.49f),
                    PathNode.CurveTo(157.26054f, 121.74162f, 155.99054f, 124.80018f, 155.99054f, 127.99f),
                    PathNode.CurveTo(155.99054f, 131.17982f, 157.26054f, 134.23837f, 159.52f, 136.49f),
                    PathNode.LineTo(191.52f, 168.49f),
                    PathNode.CurveTo(196.21442f, 173.18442f, 203.82558f, 173.18442f, 208.52f, 168.49f),
                    PathNode.CurveTo(213.21442f, 163.79558f, 213.21442f, 156.18442f, 208.52f, 151.49f),
                    PathNode.LineTo(197.0f, 140.0f),
                    PathNode.LineTo(240.0f, 140.0f),
                    PathNode.CurveTo(246.62741f, 140.0f, 252.0f, 134.62741f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 121.37258f, 246.62741f, 116.0f, 240.0f, 116.0f),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
