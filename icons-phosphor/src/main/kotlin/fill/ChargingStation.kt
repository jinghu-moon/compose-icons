package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorFillIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.0f, 69.66f),
                    PathNode.LineTo(221.66f, 50.34f),
                    PathNode.CurveTo(218.53407f, 47.21407f, 213.46593f, 47.21407f, 210.34f, 50.34f),
                    PathNode.CurveTo(207.21407f, 53.46593f, 207.21407f, 58.53407f, 210.34f, 61.66f),
                    PathNode.LineTo(229.66f, 81.0f),
                    PathNode.CurveTo(231.15257f, 82.49422f, 231.99373f, 84.51803f, 232.0f, 86.63f),
                    PathNode.LineTo(232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 172.41827f, 228.41827f, 176.0f, 224.0f, 176.0f),
                    PathNode.CurveTo(219.58173f, 176.0f, 216.0f, 172.41827f, 216.0f, 168.0f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 114.74516f, 205.25484f, 104.0f, 192.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(176.0f, 42.745167f, 165.25484f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(58.745167f, 32.0f, 48.0f, 42.745167f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(27.581722f, 208.0f, 24.0f, 211.58173f, 24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 220.41827f, 27.581722f, 224.0f, 32.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(196.41827f, 224.0f, 200.0f, 220.41827f, 200.0f, 216.0f),
                    PathNode.CurveTo(200.0f, 211.58173f, 196.41827f, 208.0f, 192.0f, 208.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(196.41827f, 120.0f, 200.0f, 123.58172f, 200.0f, 128.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 181.25484f, 210.74516f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(237.25484f, 192.0f, 248.0f, 181.25484f, 248.0f, 168.0f),
                    PathNode.LineTo(248.0f, 86.63f),
                    PathNode.CurveTo(248.02425f, 80.26596f, 245.504f, 74.15617f, 241.0f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(135.43f, 131.0f),
                    PathNode.LineTo(119.43f, 171.0f),
                    PathNode.CurveTo(117.77315f, 175.10347f, 113.10348f, 177.08685f, 109.0f, 175.43f),
                    PathNode.CurveTo(104.89652f, 173.77315f, 102.91315f, 169.10347f, 104.57f, 165.0f),
                    PathNode.LineTo(116.18f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(93.337456f, 136.0046f, 90.847115f, 134.68425f, 89.3568f, 132.47786f),
                    PathNode.CurveTo(87.86649f, 130.27148f, 87.57154f, 127.46825f, 88.57f, 125.0f),
                    PathNode.LineTo(104.57f, 85.0f),
                    PathNode.CurveTo(106.22685f, 80.89652f, 110.89652f, 78.91315f, 115.0f, 80.57f),
                    PathNode.CurveTo(119.10348f, 82.22685f, 121.08685f, 86.89652f, 119.43f, 91.0f),
                    PathNode.LineTo(107.82f, 120.0f),
                    PathNode.LineTo(128.0f, 120.0f),
                    PathNode.CurveTo(130.66254f, 119.99541f, 133.1529f, 121.31575f, 134.6432f, 123.52213f),
                    PathNode.CurveTo(136.13351f, 125.728516f, 136.42845f, 128.53175f, 135.43f, 131.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
