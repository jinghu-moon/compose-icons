package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorBoldIcon(
            name = "ArrowsOutLineHorizontal",
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
                    PathNode.MoveTo(88.0f, 116.0f),
                    PathNode.LineTo(45.0f, 116.0f),
                    PathNode.LineTo(56.52f, 104.49f),
                    PathNode.CurveTo(61.21442f, 99.79558f, 61.21442f, 92.18442f, 56.52f, 87.49f),
                    PathNode.CurveTo(51.82558f, 82.79558f, 44.21442f, 82.79558f, 39.52f, 87.49f),
                    PathNode.LineTo(7.52f, 119.49f),
                    PathNode.CurveTo(5.260546f, 121.74162f, 3.990537f, 124.80018f, 3.990537f, 127.99f),
                    PathNode.CurveTo(3.990537f, 131.17982f, 5.260546f, 134.23837f, 7.52f, 136.49f),
                    PathNode.LineTo(39.52f, 168.49f),
                    PathNode.CurveTo(44.21442f, 173.18442f, 51.82558f, 173.18442f, 56.52f, 168.49f),
                    PathNode.CurveTo(61.21442f, 163.79558f, 61.21442f, 156.18442f, 56.52f, 151.49f),
                    PathNode.LineTo(45.0f, 140.0f),
                    PathNode.LineTo(88.0f, 140.0f),
                    PathNode.CurveTo(94.62742f, 140.0f, 100.0f, 134.62741f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 121.37258f, 94.62742f, 116.0f, 88.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.49f, 119.51f),
                    PathNode.LineTo(216.49f, 87.51f),
                    PathNode.CurveTo(211.79558f, 82.81558f, 204.18442f, 82.81558f, 199.49f, 87.51f),
                    PathNode.CurveTo(194.79558f, 92.20442f, 194.79558f, 99.81558f, 199.49f, 104.51f),
                    PathNode.LineTo(211.0f, 116.0f),
                    PathNode.LineTo(168.0f, 116.0f),
                    PathNode.CurveTo(161.37259f, 116.0f, 156.0f, 121.37258f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 134.62741f, 161.37259f, 140.0f, 168.0f, 140.0f),
                    PathNode.LineTo(211.0f, 140.0f),
                    PathNode.LineTo(199.48f, 151.51f),
                    PathNode.CurveTo(194.78558f, 156.20442f, 194.78558f, 163.81558f, 199.48f, 168.51f),
                    PathNode.CurveTo(204.17442f, 173.20442f, 211.78558f, 173.20442f, 216.48f, 168.51f),
                    PathNode.LineTo(248.48f, 136.51f),
                    PathNode.CurveTo(250.74078f, 134.2597f, 252.01259f, 131.20189f, 252.01447f, 128.01207f),
                    PathNode.CurveTo(252.01634f, 124.82226f, 250.74812f, 121.762955f, 248.49f, 119.51f),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
