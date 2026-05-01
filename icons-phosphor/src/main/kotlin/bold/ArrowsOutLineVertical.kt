package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorBoldIcon(
            name = "ArrowsOutLineVertical",
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
                    PathNode.MoveTo(104.49f, 56.48f),
                    PathNode.LineTo(116.0f, 45.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 94.62742f, 121.37258f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(134.62741f, 100.0f, 140.0f, 94.62742f, 140.0f, 88.0f),
                    PathNode.LineTo(140.0f, 45.0f),
                    PathNode.LineTo(151.51f, 56.51f),
                    PathNode.CurveTo(156.20442f, 61.20442f, 163.81558f, 61.20442f, 168.51f, 56.51f),
                    PathNode.CurveTo(173.20442f, 51.81558f, 173.20442f, 44.20442f, 168.51f, 39.51f),
                    PathNode.LineTo(136.51f, 7.51f),
                    PathNode.CurveTo(134.25838f, 5.250546f, 131.19981f, 3.980537f, 128.01f, 3.980537f),
                    PathNode.CurveTo(124.82018f, 3.980537f, 121.76162f, 5.250546f, 119.51f, 7.51f),
                    PathNode.LineTo(87.51f, 39.51f),
                    PathNode.CurveTo(82.81558f, 44.20442f, 82.81558f, 51.81558f, 87.51f, 56.51f),
                    PathNode.CurveTo(92.20442f, 61.20442f, 99.81558f, 61.20442f, 104.51f, 56.51f),
                    PathNode.Close,
                    PathNode.MoveTo(151.49f, 199.48f),
                    PathNode.LineTo(140.0f, 211.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 161.37259f, 134.62741f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(121.37258f, 156.0f, 116.0f, 161.37259f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 211.0f),
                    PathNode.LineTo(104.49f, 199.48f),
                    PathNode.CurveTo(99.79558f, 194.78558f, 92.18442f, 194.78558f, 87.49f, 199.48f),
                    PathNode.CurveTo(82.79558f, 204.17442f, 82.79558f, 211.78558f, 87.49f, 216.48f),
                    PathNode.LineTo(119.49f, 248.48f),
                    PathNode.CurveTo(121.74162f, 250.73946f, 124.80018f, 252.00946f, 127.99f, 252.00946f),
                    PathNode.CurveTo(131.17982f, 252.00946f, 134.23837f, 250.73946f, 136.49f, 248.48f),
                    PathNode.LineTo(168.49f, 216.48f),
                    PathNode.CurveTo(173.18442f, 211.78558f, 173.18442f, 204.17442f, 168.49f, 199.48f),
                    PathNode.CurveTo(163.79558f, 194.78558f, 156.18442f, 194.78558f, 151.49f, 199.48f),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
