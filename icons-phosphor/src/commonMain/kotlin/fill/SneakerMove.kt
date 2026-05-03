package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorFillIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(70.8f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(27.581722f, 184.0f, 24.0f, 180.41827f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 171.58173f, 27.581722f, 168.0f, 32.0f, 168.0f),
                    PathNode.LineTo(70.8f, 168.0f),
                    PathNode.CurveTo(75.21828f, 168.0f, 78.8f, 171.58173f, 78.8f, 176.0f),
                    PathNode.CurveTo(78.8f, 180.41827f, 75.21828f, 184.0f, 70.8f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.8f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 203.58173f, 40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(102.8f, 216.0f),
                    PathNode.CurveTo(107.21828f, 216.0f, 110.8f, 212.41827f, 110.8f, 208.0f),
                    PathNode.CurveTo(110.8f, 203.58173f, 107.21828f, 200.0f, 102.8f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(231.16f, 166.63f),
                    PathNode.LineTo(202.53f, 152.32f),
                    PathNode.CurveTo(186.22768f, 144.23561f, 175.93893f, 127.58668f, 176.0f, 109.39f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.00015f, 75.60892f, 172.46092f, 72.03842f, 168.07f, 72.0f),
                    PathNode.CurveTo(141.5717f, 72.01111f, 120.06618f, 50.568214f, 120.0f, 24.07f),
                    PathNode.CurveTo(120.023926f, 21.021776f, 118.31347f, 18.224861f, 115.589096f, 16.857367f),
                    PathNode.CurveTo(112.86472f, 15.489873f, 109.59997f, 15.789484f, 107.17f, 17.63f),
                    PathNode.LineTo(45.11f, 64.68f),
                    PathNode.CurveTo(44.19445f, 65.37869f, 43.62448f, 66.43812f, 43.545967f, 67.587135f),
                    PathNode.CurveTo(43.46745f, 68.73615f, 43.888004f, 69.86326f, 44.7f, 70.68f),
                    PathNode.LineTo(96.14f, 122.12f),
                    PathNode.CurveTo(99.19871f, 125.0958f, 99.4598f, 129.92157f, 96.74f, 133.21f),
                    PathNode.CurveTo(95.287224f, 134.89236f, 93.19999f, 135.89442f, 90.97867f, 135.97601f),
                    PathNode.CurveTo(88.75736f, 136.05759f, 86.60225f, 135.21127f, 85.03f, 133.64f),
                    PathNode.LineTo(32.03f, 80.64f),
                    PathNode.CurveTo(31.11387f, 79.71989f, 29.80813f, 79.30169f, 28.527916f, 79.51837f),
                    PathNode.CurveTo(27.2477f, 79.735054f, 26.15231f, 80.559654f, 25.59f, 81.73f),
                    PathNode.CurveTo(22.661577f, 87.850525f, 23.91198f, 95.15255f, 28.71f, 99.95f),
                    PathNode.LineTo(142.4f, 213.66f),
                    PathNode.CurveTo(143.90158f, 215.15993f, 145.93762f, 216.00166f, 148.06f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(232.83656f, 216.0f, 240.0f, 208.83656f, 240.0f, 200.0f),
                    PathNode.LineTo(240.0f, 180.94f),
                    PathNode.CurveTo(240.0194f, 174.87563f, 236.5917f, 169.32695f, 231.16f, 166.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
