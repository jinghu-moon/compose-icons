package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorBoldIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 136.0f),
                    PathNode.CurveTo(256.0f, 142.62741f, 250.62741f, 148.0f, 244.0f, 148.0f),
                    PathNode.LineTo(236.0f, 148.0f),
                    PathNode.LineTo(236.0f, 156.0f),
                    PathNode.CurveTo(236.0f, 162.62741f, 230.62741f, 168.0f, 224.0f, 168.0f),
                    PathNode.CurveTo(217.37259f, 168.0f, 212.0f, 162.62741f, 212.0f, 156.0f),
                    PathNode.LineTo(212.0f, 148.0f),
                    PathNode.LineTo(204.0f, 148.0f),
                    PathNode.CurveTo(197.37259f, 148.0f, 192.0f, 142.62741f, 192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 129.37259f, 197.37259f, 124.0f, 204.0f, 124.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.CurveTo(212.0f, 109.37258f, 217.37259f, 104.0f, 224.0f, 104.0f),
                    PathNode.CurveTo(230.62741f, 104.0f, 236.0f, 109.37258f, 236.0f, 116.0f),
                    PathNode.LineTo(236.0f, 124.0f),
                    PathNode.LineTo(244.0f, 124.0f),
                    PathNode.CurveTo(250.62741f, 124.0f, 256.0f, 129.37259f, 256.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.19f, 192.28f),
                    PathNode.CurveTo(205.45364f, 197.3555f, 204.7955f, 204.92636f, 199.72f, 209.19f),
                    PathNode.CurveTo(194.6445f, 213.45364f, 187.07364f, 212.7955f, 182.81f, 207.72f),
                    PathNode.CurveTo(169.12f, 191.42f, 145.0f, 172.0f, 108.0f, 172.0f),
                    PathNode.CurveTo(79.11f, 172.0f, 52.54f, 184.68f, 33.19f, 207.72f),
                    PathNode.CurveTo(28.926361f, 212.7955f, 21.355497f, 213.45364f, 16.28f, 209.19f),
                    PathNode.CurveTo(11.204503f, 204.92636f, 10.546362f, 197.3555f, 14.81f, 192.28f),
                    PathNode.CurveTo(27.847252f, 176.53438f, 44.572853f, 164.25383f, 63.5f, 156.53f),
                    PathNode.CurveTo(39.373844f, 137.56212f, 29.922712f, 105.38627f, 39.958393f, 76.3839f),
                    PathNode.CurveTo(49.994072f, 47.381542f, 77.310394f, 27.928322f, 108.0f, 27.928322f),
                    PathNode.CurveTo(138.6896f, 27.928322f, 166.00594f, 47.381542f, 176.04161f, 76.3839f),
                    PathNode.CurveTo(186.07729f, 105.38627f, 176.62616f, 137.56212f, 152.5f, 156.53f),
                    PathNode.CurveTo(171.42877f, 164.25092f, 188.15504f, 176.53195f, 201.19f, 192.28f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 148.0f),
                    PathNode.CurveTo(134.50967f, 148.0f, 156.0f, 126.50967f, 156.0f, 100.0f),
                    PathNode.CurveTo(156.0f, 73.49033f, 134.50967f, 52.0f, 108.0f, 52.0f),
                    PathNode.CurveTo(81.49033f, 52.0f, 60.0f, 73.49033f, 60.0f, 100.0f),
                    PathNode.CurveTo(60.02756f, 126.498245f, 81.501755f, 147.97244f, 108.0f, 148.0f),
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
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
