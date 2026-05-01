package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorBoldIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.09f, 35.41f),
                    PathNode.CurveTo(241.23283f, 30.923885f, 236.85533f, 27.998974f, 232.0f, 28.0f),
                    PathNode.LineTo(24.0f, 28.0f),
                    PathNode.CurveTo(19.14534f, 28.000225f, 14.769068f, 30.92546f, 12.912621f, 35.41114f),
                    PathNode.CurveTo(11.056176f, 39.89682f, 12.085328f, 45.059147f, 15.52f, 48.49f),
                    PathNode.LineTo(116.0f, 149.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(88.0f, 204.0f),
                    PathNode.CurveTo(81.37258f, 204.0f, 76.0f, 209.37259f, 76.0f, 216.0f),
                    PathNode.CurveTo(76.0f, 222.62741f, 81.37258f, 228.0f, 88.0f, 228.0f),
                    PathNode.LineTo(168.0f, 228.0f),
                    PathNode.CurveTo(174.62741f, 228.0f, 180.0f, 222.62741f, 180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 209.37259f, 174.62741f, 204.0f, 168.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 149.0f),
                    PathNode.LineTo(240.48f, 48.49f),
                    PathNode.CurveTo(243.91606f, 45.05953f, 244.94629f, 39.896515f, 243.09f, 35.41f),
                    PathNode.Close,
                    PathNode.MoveTo(203.0f, 52.0f),
                    PathNode.LineTo(191.0f, 64.0f),
                    PathNode.LineTo(65.0f, 64.0f),
                    PathNode.LineTo(53.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 127.0f),
                    PathNode.LineTo(89.0f, 88.0f),
                    PathNode.LineTo(167.0f, 88.0f),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
