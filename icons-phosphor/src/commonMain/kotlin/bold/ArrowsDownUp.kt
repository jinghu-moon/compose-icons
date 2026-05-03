package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorBoldIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.49f, 167.51f),
                    PathNode.CurveTo(122.74945f, 169.76163f, 124.01946f, 172.82018f, 124.01946f, 176.01f),
                    PathNode.CurveTo(124.01946f, 179.19981f, 122.74945f, 182.25838f, 120.49f, 184.51f),
                    PathNode.LineTo(88.49f, 216.51f),
                    PathNode.CurveTo(86.23838f, 218.76945f, 83.17982f, 220.03946f, 79.99f, 220.03946f),
                    PathNode.CurveTo(76.80018f, 220.03946f, 73.74162f, 218.76945f, 71.49f, 216.51f),
                    PathNode.LineTo(39.49f, 184.51f),
                    PathNode.CurveTo(34.79558f, 179.81558f, 34.79558f, 172.20442f, 39.49f, 167.51f),
                    PathNode.CurveTo(44.18442f, 162.81558f, 51.79558f, 162.81558f, 56.49f, 167.51f),
                    PathNode.LineTo(68.0f, 179.0f),
                    PathNode.LineTo(68.0f, 48.0f),
                    PathNode.CurveTo(68.0f, 41.37258f, 73.37258f, 36.0f, 80.0f, 36.0f),
                    PathNode.CurveTo(86.62742f, 36.0f, 92.0f, 41.37258f, 92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 179.0f),
                    PathNode.LineTo(103.51f, 167.48f),
                    PathNode.CurveTo(105.7648f, 165.23065f, 108.821304f, 163.96992f, 112.00622f, 163.97556f),
                    PathNode.CurveTo(115.19113f, 163.98119f, 118.24317f, 165.2527f, 120.49f, 167.51f),
                    PathNode.Close,
                    PathNode.MoveTo(216.49f, 71.51f),
                    PathNode.LineTo(184.49f, 39.51f),
                    PathNode.CurveTo(182.23837f, 37.250546f, 179.17982f, 35.980537f, 175.99f, 35.980537f),
                    PathNode.CurveTo(172.80019f, 35.980537f, 169.74162f, 37.250546f, 167.49f, 39.51f),
                    PathNode.LineTo(135.49f, 71.51f),
                    PathNode.CurveTo(130.79558f, 76.20442f, 130.79558f, 83.81558f, 135.49f, 88.51f),
                    PathNode.CurveTo(140.18442f, 93.20442f, 147.79558f, 93.20442f, 152.49f, 88.51f),
                    PathNode.LineTo(164.0f, 77.0f),
                    PathNode.LineTo(164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 214.62741f, 169.37259f, 220.0f, 176.0f, 220.0f),
                    PathNode.CurveTo(182.62741f, 220.0f, 188.0f, 214.62741f, 188.0f, 208.0f),
                    PathNode.LineTo(188.0f, 77.0f),
                    PathNode.LineTo(199.51f, 88.52f),
                    PathNode.CurveTo(204.20442f, 93.21442f, 211.81558f, 93.21442f, 216.51f, 88.52f),
                    PathNode.CurveTo(221.20442f, 83.82558f, 221.20442f, 76.214424f, 216.51f, 71.52f),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
