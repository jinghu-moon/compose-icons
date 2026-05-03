package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorFillIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 150.09f, 176.84f, 168.0f, 168.0f, 168.0f),
                    PathNode.CurveTo(159.16f, 168.0f, 152.0f, 150.09f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 105.91f, 159.16f, 88.0f, 168.0f, 88.0f),
                    PathNode.CurveTo(176.84f, 88.0f, 184.0f, 105.91f, 184.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 224.0f),
                    PathNode.CurveTo(240.0f, 228.41827f, 236.41827f, 232.0f, 232.0f, 232.0f),
                    PathNode.LineTo(92.0f, 232.0f),
                    PathNode.CurveTo(58.36f, 232.0f, 32.0f, 186.32f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 69.68f, 58.36f, 24.0f, 92.0f, 24.0f),
                    PathNode.LineTo(164.0f, 24.0f),
                    PathNode.CurveTo(197.64f, 24.0f, 224.0f, 69.68f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 165.47f, 213.12f, 197.73f, 196.41f, 216.0f),
                    PathNode.LineTo(232.0f, 216.0f),
                    PathNode.CurveTo(236.41827f, 216.0f, 240.0f, 219.58173f, 240.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.87f, 111.81f),
                    PathNode.CurveTo(59.53472f, 111.812675f, 61.15807f, 111.29139f, 62.51f, 110.32f),
                    PathNode.LineTo(80.0f, 97.83f),
                    PathNode.LineTo(93.28f, 107.32f),
                    PathNode.CurveTo(96.86817f, 109.65207f, 101.65618f, 108.74738f, 104.14607f, 105.26688f),
                    PathNode.CurveTo(106.63597f, 101.786385f, 105.94589f, 96.96276f, 102.58f, 94.32f),
                    PathNode.LineTo(84.65f, 81.49f),
                    PathNode.CurveTo(81.86838f, 79.50307f, 78.13162f, 79.50307f, 75.35f, 81.49f),
                    PathNode.LineTo(53.21f, 97.3f),
                    PathNode.CurveTo(50.378433f, 99.32242f, 49.17889f, 102.94322f, 50.24288f, 106.25621f),
                    PathNode.CurveTo(51.306873f, 109.5692f, 54.390354f, 111.81448f, 57.87f, 111.81f),
                    PathNode.Close,
                    PathNode.MoveTo(104.54f, 159.7f),
                    PathNode.LineTo(84.65f, 145.49f),
                    PathNode.CurveTo(81.86838f, 143.50307f, 78.13162f, 143.50307f, 75.35f, 145.49f),
                    PathNode.LineTo(56.0f, 159.29f),
                    PathNode.CurveTo(53.53207f, 160.89398f, 52.144257f, 163.7236f, 52.386795f, 166.65697f),
                    PathNode.CurveTo(52.629333f, 169.59033f, 54.463047f, 172.15358f, 57.160904f, 173.33044f),
                    PathNode.CurveTo(59.858757f, 174.50731f, 62.984947f, 174.10768f, 65.3f, 172.29f),
                    PathNode.LineTo(80.0f, 161.83f),
                    PathNode.LineTo(95.24f, 172.71f),
                    PathNode.CurveTo(97.55505f, 174.52768f, 100.68124f, 174.9273f, 103.3791f, 173.75044f),
                    PathNode.CurveTo(106.07695f, 172.57358f, 107.91067f, 170.01033f, 108.153206f, 167.07697f),
                    PathNode.CurveTo(108.395744f, 164.1436f, 107.00793f, 161.31398f, 104.54f, 159.71f),
                    PathNode.Close,
                    PathNode.MoveTo(193.74f, 192.07f),
                    PathNode.CurveTo(202.93f, 175.07f, 208.0f, 152.33f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 103.67f, 202.93f, 80.91f, 193.74f, 63.93f),
                    PathNode.CurveTo(185.38f, 48.5f, 174.82f, 40.0f, 164.0f, 40.0f),
                    PathNode.CurveTo(153.18f, 40.0f, 142.62f, 48.5f, 134.26f, 63.93f),
                    PathNode.CurveTo(125.07f, 80.91f, 120.0f, 103.67f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 152.33f, 125.07f, 175.09f, 134.26f, 192.07f),
                    PathNode.CurveTo(142.62f, 207.5f, 153.18f, 216.0f, 164.0f, 216.0f),
                    PathNode.CurveTo(174.82f, 216.0f, 185.38f, 207.5f, 193.74f, 192.07f),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
