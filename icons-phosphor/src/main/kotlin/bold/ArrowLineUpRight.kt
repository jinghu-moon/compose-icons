package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorBoldIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 222.62741f, 222.62741f, 228.0f, 216.0f, 228.0f),
                    PathNode.LineTo(40.0f, 228.0f),
                    PathNode.CurveTo(33.37258f, 228.0f, 28.0f, 222.62741f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 209.37259f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 209.37259f, 228.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 180.0f),
                    PathNode.CurveTo(83.183556f, 180.0025f, 86.23763f, 178.73987f, 88.49f, 176.49f),
                    PathNode.LineTo(180.0f, 85.0f),
                    PathNode.LineTo(180.0f, 152.0f),
                    PathNode.CurveTo(180.0f, 158.62741f, 185.37259f, 164.0f, 192.0f, 164.0f),
                    PathNode.CurveTo(198.62741f, 164.0f, 204.0f, 158.62741f, 204.0f, 152.0f),
                    PathNode.LineTo(204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 49.37258f, 198.62741f, 44.0f, 192.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(89.37258f, 44.0f, 84.0f, 49.37258f, 84.0f, 56.0f),
                    PathNode.CurveTo(84.0f, 62.62742f, 89.37258f, 68.0f, 96.0f, 68.0f),
                    PathNode.LineTo(163.0f, 68.0f),
                    PathNode.LineTo(71.51f, 159.51f),
                    PathNode.CurveTo(68.074036f, 162.94214f, 67.04552f, 168.10687f, 68.90453f, 172.59348f),
                    PathNode.CurveTo(70.76354f, 177.08008f, 75.14352f, 180.00381f, 80.0f, 180.0f),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
