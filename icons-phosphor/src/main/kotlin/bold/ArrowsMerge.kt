package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorBoldIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 40.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0025f, 107.183556f, 194.73987f, 110.23763f, 192.49f, 112.49f),
                    PathNode.LineTo(140.0f, 165.0f),
                    PathNode.LineTo(140.0f, 203.0f),
                    PathNode.LineTo(151.51f, 191.48f),
                    PathNode.CurveTo(156.20442f, 186.78558f, 163.81558f, 186.78558f, 168.51f, 191.48f),
                    PathNode.CurveTo(173.20442f, 196.17442f, 173.20442f, 203.78558f, 168.51f, 208.48f),
                    PathNode.LineTo(136.51f, 240.48f),
                    PathNode.CurveTo(134.25838f, 242.73946f, 131.19981f, 244.00946f, 128.01f, 244.00946f),
                    PathNode.CurveTo(124.82018f, 244.00946f, 121.76162f, 242.73946f, 119.51f, 240.48f),
                    PathNode.LineTo(87.51f, 208.48f),
                    PathNode.CurveTo(82.81558f, 203.78558f, 82.81558f, 196.17442f, 87.51f, 191.48f),
                    PathNode.CurveTo(92.20442f, 186.78558f, 99.81558f, 186.78558f, 104.51f, 191.48f),
                    PathNode.LineTo(116.0f, 203.0f),
                    PathNode.LineTo(116.0f, 165.0f),
                    PathNode.LineTo(63.51f, 112.49f),
                    PathNode.CurveTo(61.260136f, 110.23763f, 59.997498f, 107.183556f, 60.0f, 104.0f),
                    PathNode.LineTo(60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 33.37258f, 65.37258f, 28.0f, 72.0f, 28.0f),
                    PathNode.CurveTo(78.62742f, 28.0f, 84.0f, 33.37258f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 99.0f),
                    PathNode.LineTo(128.0f, 143.0f),
                    PathNode.LineTo(172.0f, 99.0f),
                    PathNode.LineTo(172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 33.37258f, 177.37259f, 28.0f, 184.0f, 28.0f),
                    PathNode.CurveTo(190.62741f, 28.0f, 196.0f, 33.37258f, 196.0f, 40.0f),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
