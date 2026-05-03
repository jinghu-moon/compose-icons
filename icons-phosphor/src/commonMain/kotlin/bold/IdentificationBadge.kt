package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) return _identificationBadge!!
        _identificationBadge = phosphorBoldIcon(
            name = "IdentificationBadge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 28.954306f, 211.0457f, 20.0f, 200.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(196.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 68.0f),
                    PathNode.CurveTo(84.0f, 61.37258f, 89.37258f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(166.62741f, 56.0f, 172.0f, 61.37258f, 172.0f, 68.0f),
                    PathNode.CurveTo(172.0f, 74.62742f, 166.62741f, 80.0f, 160.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.CurveTo(89.37258f, 80.0f, 84.0f, 74.62742f, 84.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.8f, 195.37f),
                    PathNode.CurveTo(101.88343f, 185.57227f, 114.63944f, 180.00372f, 128.0f, 180.00372f),
                    PathNode.CurveTo(141.36055f, 180.00372f, 154.11656f, 185.57227f, 163.2f, 195.37f),
                    PathNode.CurveTo(167.70665f, 200.2301f, 175.29991f, 200.51665f, 180.16f, 196.01f),
                    PathNode.CurveTo(185.02011f, 191.50336f, 185.30664f, 183.91011f, 180.8f, 179.05f),
                    PathNode.CurveTo(175.26988f, 173.10887f, 168.77501f, 168.14558f, 161.59f, 164.37f),
                    PathNode.CurveTo(176.6697f, 146.54091f, 175.19542f, 120.03726f, 158.23135f, 103.990616f),
                    PathNode.CurveTo(141.2673f, 87.94398f, 114.72269f, 87.94398f, 97.75864f, 103.990616f),
                    PathNode.CurveTo(80.794586f, 120.03726f, 79.320305f, 146.54091f, 94.4f, 164.37f),
                    PathNode.CurveTo(87.219795f, 168.14847f, 80.72867f, 173.11148f, 75.2f, 179.05f),
                    PathNode.CurveTo(70.69336f, 183.91011f, 70.9799f, 191.50336f, 75.84f, 196.01f),
                    PathNode.CurveTo(80.7001f, 200.51665f, 88.29336f, 200.2301f, 92.8f, 195.37f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(139.0457f, 116.0f, 148.0f, 124.95431f, 148.0f, 136.0f),
                    PathNode.CurveTo(148.0f, 147.0457f, 139.0457f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(116.95431f, 156.0f, 108.0f, 147.0457f, 108.0f, 136.0f),
                    PathNode.CurveTo(108.0f, 124.95431f, 116.95431f, 116.0f, 128.0f, 116.0f),
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
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
