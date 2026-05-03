package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorBoldIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.LineTo(244.0f, 192.0f),
                    PathNode.CurveTo(244.0f, 198.62741f, 238.62741f, 204.0f, 232.0f, 204.0f),
                    PathNode.LineTo(168.0f, 204.0f),
                    PathNode.CurveTo(161.37259f, 204.0f, 156.0f, 198.62741f, 156.0f, 192.0f),
                    PathNode.CurveTo(156.0f, 185.37259f, 161.37259f, 180.0f, 168.0f, 180.0f),
                    PathNode.LineTo(203.0f, 180.0f),
                    PathNode.LineTo(136.0f, 113.0f),
                    PathNode.LineTo(104.49f, 144.52f),
                    PathNode.CurveTo(102.23838f, 146.77945f, 99.17982f, 148.04947f, 95.99f, 148.04947f),
                    PathNode.CurveTo(92.80018f, 148.04947f, 89.74162f, 146.77945f, 87.49f, 144.52f),
                    PathNode.LineTo(15.49f, 72.52f),
                    PathNode.CurveTo(10.79558f, 67.82558f, 10.79558f, 60.21442f, 15.49f, 55.52f),
                    PathNode.CurveTo(20.18442f, 50.82558f, 27.79558f, 50.82558f, 32.49f, 55.52f),
                    PathNode.LineTo(96.0f, 119.0f),
                    PathNode.LineTo(127.51f, 87.48f),
                    PathNode.CurveTo(129.76163f, 85.22054f, 132.82018f, 83.95054f, 136.01f, 83.95054f),
                    PathNode.CurveTo(139.19981f, 83.95054f, 142.25838f, 85.22054f, 144.51f, 87.48f),
                    PathNode.LineTo(220.0f, 163.0f),
                    PathNode.LineTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 121.37258f, 225.37259f, 116.0f, 232.0f, 116.0f),
                    PathNode.CurveTo(238.62741f, 116.0f, 244.0f, 121.37258f, 244.0f, 128.0f),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
