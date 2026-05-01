package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AddressBook: ImageVector
    get() {
        if (_addressBook != null) return _addressBook!!
        _addressBook = phosphorBoldIcon(
            name = "AddressBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 20.0f),
                    PathNode.LineTo(64.0f, 20.0f),
                    PathNode.CurveTo(52.954304f, 20.0f, 44.0f, 28.954306f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(25.372583f, 60.0f, 20.0f, 65.37258f, 20.0f, 72.0f),
                    PathNode.CurveTo(20.0f, 78.62742f, 25.372583f, 84.0f, 32.0f, 84.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(44.0f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(25.372583f, 116.0f, 20.0f, 121.37258f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 134.62741f, 25.372583f, 140.0f, 32.0f, 140.0f),
                    PathNode.LineTo(44.0f, 140.0f),
                    PathNode.LineTo(44.0f, 172.0f),
                    PathNode.LineTo(32.0f, 172.0f),
                    PathNode.CurveTo(25.372583f, 172.0f, 20.0f, 177.37259f, 20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 190.62741f, 25.372583f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 227.0457f, 52.954304f, 236.0f, 64.0f, 236.0f),
                    PathNode.LineTo(208.0f, 236.0f),
                    PathNode.CurveTo(219.0457f, 236.0f, 228.0f, 227.0457f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 28.954306f, 219.0457f, 20.0f, 208.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 212.0f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(68.0f, 44.0f),
                    PathNode.LineTo(204.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.8f, 171.37f),
                    PathNode.CurveTo(109.88343f, 161.57227f, 122.63944f, 156.00372f, 136.0f, 156.00372f),
                    PathNode.CurveTo(149.36055f, 156.00372f, 162.11656f, 161.57227f, 171.2f, 171.37f),
                    PathNode.CurveTo(175.70665f, 176.2301f, 183.29991f, 176.51665f, 188.16f, 172.01f),
                    PathNode.CurveTo(193.02011f, 167.50336f, 193.30664f, 159.91011f, 188.8f, 155.05f),
                    PathNode.CurveTo(183.26988f, 149.10887f, 176.77501f, 144.14558f, 169.59f, 140.37f),
                    PathNode.CurveTo(184.6697f, 122.54091f, 183.19542f, 96.03726f, 166.23135f, 79.990616f),
                    PathNode.CurveTo(149.2673f, 63.943977f, 122.72269f, 63.943977f, 105.75864f, 79.990616f),
                    PathNode.CurveTo(88.794586f, 96.03726f, 87.320305f, 122.54091f, 102.4f, 140.37f),
                    PathNode.CurveTo(95.219795f, 144.14847f, 88.72867f, 149.11148f, 83.2f, 155.05f),
                    PathNode.CurveTo(78.69336f, 159.91011f, 78.9799f, 167.50336f, 83.84f, 172.01f),
                    PathNode.CurveTo(88.7001f, 176.51665f, 96.29336f, 176.2301f, 100.8f, 171.37f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 112.0f),
                    PathNode.CurveTo(116.0f, 100.95431f, 124.95431f, 92.0f, 136.0f, 92.0f),
                    PathNode.CurveTo(147.0457f, 92.0f, 156.0f, 100.95431f, 156.0f, 112.0f),
                    PathNode.CurveTo(156.0f, 123.04569f, 147.0457f, 132.0f, 136.0f, 132.0f),
                    PathNode.CurveTo(124.95431f, 132.0f, 116.0f, 123.04569f, 116.0f, 112.0f),
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
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
