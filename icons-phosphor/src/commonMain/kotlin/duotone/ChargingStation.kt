package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) return _chargingStation!!
        _chargingStation = phosphorDuotoneIcon(
            name = "ChargingStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 56.0f),
                    PathNode.LineTo(168.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(56.0f, 47.163445f, 63.163445f, 40.0f, 72.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(160.83656f, 40.0f, 168.0f, 47.163445f, 168.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.62f, 123.51f),
                    PathNode.CurveTo(136.1118f, 125.70796f, 136.4153f, 128.50308f, 135.43f, 130.97f),
                    PathNode.LineTo(119.43f, 170.97f),
                    PathNode.CurveTo(117.78143f, 175.07347f, 113.11848f, 177.06357f, 109.015f, 175.415f),
                    PathNode.CurveTo(104.91152f, 173.76643f, 102.92143f, 169.10347f, 104.57f, 165.0f),
                    PathNode.LineTo(116.18f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(93.337456f, 136.0046f, 90.847115f, 134.68425f, 89.3568f, 132.47786f),
                    PathNode.CurveTo(87.86649f, 130.27148f, 87.57154f, 127.46825f, 88.57f, 125.0f),
                    PathNode.LineTo(104.57f, 85.0f),
                    PathNode.CurveTo(106.22685f, 80.89652f, 110.89652f, 78.91315f, 115.0f, 80.57f),
                    PathNode.CurveTo(119.10348f, 82.22685f, 121.08685f, 86.89652f, 119.43f, 91.0f),
                    PathNode.LineTo(107.82f, 120.0f),
                    PathNode.LineTo(128.0f, 120.0f),
                    PathNode.CurveTo(130.65205f, 120.00039f, 133.13153f, 121.31504f, 134.62f, 123.51f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 86.63f),
                    PathNode.LineTo(248.0f, 168.0f),
                    PathNode.CurveTo(248.0f, 181.25484f, 237.25484f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(210.74516f, 192.0f, 200.0f, 181.25484f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 123.58172f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(196.41827f, 208.0f, 200.0f, 211.58173f, 200.0f, 216.0f),
                    PathNode.CurveTo(200.0f, 220.41827f, 196.41827f, 224.0f, 192.0f, 224.0f),
                    PathNode.LineTo(32.0f, 224.0f),
                    PathNode.CurveTo(27.581722f, 224.0f, 24.0f, 220.41827f, 24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 211.58173f, 27.581722f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 42.745167f, 58.745167f, 32.0f, 72.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(165.25484f, 32.0f, 176.0f, 42.745167f, 176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(205.25484f, 104.0f, 216.0f, 114.74516f, 216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(216.0f, 172.41827f, 219.58173f, 176.0f, 224.0f, 176.0f),
                    PathNode.CurveTo(228.41827f, 176.0f, 232.0f, 172.41827f, 232.0f, 168.0f),
                    PathNode.LineTo(232.0f, 86.63f),
                    PathNode.CurveTo(231.99373f, 84.51803f, 231.15257f, 82.49422f, 229.66f, 81.0f),
                    PathNode.LineTo(210.34f, 61.66f),
                    PathNode.CurveTo(207.21407f, 58.53407f, 207.21407f, 53.46593f, 210.34f, 50.34f),
                    PathNode.CurveTo(213.46593f, 47.21407f, 218.53407f, 47.21407f, 221.66f, 50.34f),
                    PathNode.LineTo(241.0f, 69.66f),
                    PathNode.CurveTo(245.504f, 74.15617f, 248.02425f, 80.26596f, 248.0f, 86.63f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 208.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 51.581722f, 156.41827f, 48.0f, 152.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(67.58172f, 48.0f, 64.0f, 51.581722f, 64.0f, 56.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
