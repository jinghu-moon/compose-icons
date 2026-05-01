package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) return _gpsSlash!!
        _gpsSlash = phosphorRegularIcon(
            name = "GpsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 132.41827f, 244.41827f, 136.0f, 240.0f, 136.0f),
                    PathNode.LineTo(215.64f, 136.0f),
                    PathNode.CurveTo(214.77722f, 145.67714f, 212.2996f, 155.14142f, 208.31f, 164.0f),
                    PathNode.CurveTo(207.0213f, 166.87738f, 204.1628f, 168.72954f, 201.01f, 168.73f),
                    PathNode.CurveTo(199.8818f, 168.72954f, 198.7668f, 168.48744f, 197.74f, 168.02f),
                    PathNode.CurveTo(193.72035f, 166.20222f, 191.93088f, 161.47356f, 193.74f, 157.45f),
                    PathNode.CurveTo(205.42117f, 131.31801f, 200.52794f, 100.74981f, 181.27328f, 79.5699f),
                    PathNode.CurveTo(162.0186f, 58.389988f, 132.05362f, 50.614536f, 104.93f, 59.76f),
                    PathNode.CurveTo(102.20181f, 60.760647f, 99.14555f, 60.203224f, 96.94628f, 58.30388f),
                    PathNode.CurveTo(94.74702f, 56.40453f, 93.750626f, 53.46197f, 94.34347f, 50.61718f),
                    PathNode.CurveTo(94.936295f, 47.772385f, 97.02512f, 45.472767f, 99.8f, 44.61f),
                    PathNode.CurveTo(106.34176f, 42.402042f, 113.12257f, 40.978745f, 120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 16.0f),
                    PathNode.CurveTo(120.0f, 11.581722f, 123.58172f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(132.41827f, 8.0f, 136.0f, 11.581722f, 136.0f, 16.0f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(178.25223f, 44.281887f, 211.71811f, 77.74777f, 215.63f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.CurveTo(244.41827f, 120.0f, 248.0f, 123.58172f, 248.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.92f, 210.62f),
                    PathNode.CurveTo(215.88303f, 212.7287f, 216.56061f, 215.73003f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(214.82729f, 221.2251f, 212.55025f, 223.29443f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(206.91493f, 224.49586f, 203.9919f, 223.53516f, 202.08f, 221.38f),
                    PathNode.LineTo(181.0f, 198.23f),
                    PathNode.CurveTo(167.92203f, 208.12357f, 152.3319f, 214.15175f, 136.0f, 215.63f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 244.41827f, 132.41827f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(123.58172f, 248.0f, 120.0f, 244.41827f, 120.0f, 240.0f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(77.74777f, 211.71811f, 44.281887f, 178.25223f, 40.37f, 136.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.CurveTo(11.581722f, 136.0f, 8.0f, 132.41827f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 123.58172f, 11.581722f, 120.0f, 16.0f, 120.0f),
                    PathNode.LineTo(40.37f, 120.0f),
                    PathNode.CurveTo(42.14553f, 100.822655f, 50.141655f, 82.75148f, 63.14f, 68.54f),
                    PathNode.LineTo(42.08f, 45.38f),
                    PathNode.CurveTo(40.116978f, 43.271305f, 39.439384f, 40.26998f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(41.17271f, 34.774906f, 43.44975f, 32.70557f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(49.085068f, 31.50414f, 52.008102f, 32.46484f, 53.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(170.2f, 186.32f),
                    PathNode.LineTo(74.0f, 80.45f),
                    PathNode.CurveTo(49.937336f, 107.98516f, 50.336563f, 149.18442f, 74.9283f, 176.24811f),
                    PathNode.CurveTo(99.520035f, 203.3118f, 140.4929f, 207.64336f, 170.2f, 186.32f),
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
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
