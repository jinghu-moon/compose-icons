package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorDuotoneIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 172.0f),
                    PathNode.CurveTo(72.0f, 187.46397f, 59.46397f, 200.0f, 44.0f, 200.0f),
                    PathNode.CurveTo(28.536028f, 200.0f, 16.0f, 187.46397f, 16.0f, 172.0f),
                    PathNode.CurveTo(16.0f, 156.53603f, 28.536028f, 144.0f, 44.0f, 144.0f),
                    PathNode.CurveTo(59.46397f, 144.0f, 72.0f, 156.53603f, 72.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 144.0f),
                    PathNode.CurveTo(196.53603f, 144.0f, 184.0f, 156.53603f, 184.0f, 172.0f),
                    PathNode.CurveTo(184.0f, 187.46397f, 196.53603f, 200.0f, 212.0f, 200.0f),
                    PathNode.CurveTo(227.46397f, 200.0f, 240.0f, 187.46397f, 240.0f, 172.0f),
                    PathNode.CurveTo(240.0f, 156.53603f, 227.46397f, 144.0f, 212.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 136.0f),
                    PathNode.CurveTo(210.82f, 136.0f, 209.65f, 136.06f, 208.49f, 136.17f),
                    PathNode.LineTo(175.59f, 37.47f),
                    PathNode.CurveTo(174.50096f, 34.203148f, 171.44359f, 31.999744f, 168.0f, 32.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(131.58173f, 32.0f, 128.0f, 35.581722f, 128.0f, 40.0f),
                    PathNode.CurveTo(128.0f, 44.418278f, 131.58173f, 48.0f, 136.0f, 48.0f),
                    PathNode.LineTo(162.23f, 48.0f),
                    PathNode.LineTo(179.67f, 100.31f),
                    PathNode.LineTo(124.21f, 168.0f),
                    PathNode.LineTo(79.77f, 168.0f),
                    PathNode.CurveTo(77.728546f, 149.79968f, 62.348045f, 136.0328f, 44.033604f, 136.01283f),
                    PathNode.CurveTo(25.719164f, 135.99286f, 10.308679f, 149.72617f, 8.227532f, 167.92198f),
                    PathNode.CurveTo(6.146384f, 186.11781f, 18.05796f, 202.97606f, 35.90393f, 207.09193f),
                    PathNode.CurveTo(53.749905f, 211.20781f, 71.8417f, 201.26933f, 77.94f, 184.0f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.CurveTo(130.39821f, 184.0005f, 132.67014f, 182.92511f, 134.19f, 181.07f),
                    PathNode.LineTo(185.65f, 118.26f),
                    PathNode.LineTo(193.31f, 141.26f),
                    PathNode.CurveTo(177.94948f, 150.62245f, 171.85771f, 169.88652f, 179.04247f, 186.37836f),
                    PathNode.CurveTo(186.22723f, 202.87018f, 204.48297f, 211.52711f, 221.7992f, 206.65375f),
                    PathNode.CurveTo(239.1154f, 201.78038f, 250.17639f, 184.87271f, 247.70511f, 167.05435f),
                    PathNode.CurveTo(245.23383f, 149.236f, 229.98889f, 135.97679f, 212.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 192.0f),
                    PathNode.CurveTo(32.954304f, 192.0f, 24.0f, 183.0457f, 24.0f, 172.0f),
                    PathNode.CurveTo(24.0f, 160.9543f, 32.954304f, 152.0f, 44.0f, 152.0f),
                    PathNode.CurveTo(55.045696f, 152.0f, 64.0f, 160.9543f, 64.0f, 172.0f),
                    PathNode.CurveTo(64.0f, 183.0457f, 55.045696f, 192.0f, 44.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.CurveTo(200.9543f, 192.0f, 192.0f, 183.0457f, 192.0f, 172.0f),
                    PathNode.CurveTo(192.0f, 160.9543f, 200.9543f, 152.0f, 212.0f, 152.0f),
                    PathNode.CurveTo(223.0457f, 152.0f, 232.0f, 160.9543f, 232.0f, 172.0f),
                    PathNode.CurveTo(232.0f, 183.0457f, 223.0457f, 192.0f, 212.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scooter!!
    }

private var _scooter: ImageVector? = null
