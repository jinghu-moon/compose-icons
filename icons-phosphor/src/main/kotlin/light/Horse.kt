package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorLightIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 100.0f),
                    PathNode.CurveTo(134.0f, 105.52285f, 129.52284f, 110.0f, 124.0f, 110.0f),
                    PathNode.CurveTo(118.47715f, 110.0f, 114.0f, 105.52285f, 114.0f, 100.0f),
                    PathNode.CurveTo(114.0f, 94.47715f, 118.47715f, 90.0f, 124.0f, 90.0f),
                    PathNode.CurveTo(129.52284f, 90.0f, 134.0f, 94.47715f, 134.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 129.45f),
                    PathNode.CurveTo(229.08014f, 184.36057f, 184.96396f, 228.74602f, 130.06f, 230.0f),
                    PathNode.LineTo(127.93f, 230.0f),
                    PathNode.CurveTo(102.91137f, 230.16806f, 78.715065f, 221.0744f, 60.0f, 204.47f),
                    PathNode.CurveTo(58.34504f, 203.05634f, 57.585438f, 200.85727f, 58.015053f, 198.72354f),
                    PathNode.CurveTo(58.444668f, 196.58981f, 59.996113f, 194.85608f, 62.069214f, 194.19302f),
                    PathNode.CurveTo(64.1423f, 193.52997f, 66.4119f, 194.04161f, 68.0f, 195.53f),
                    PathNode.CurveTo(74.59073f, 201.41948f, 82.03933f, 206.27167f, 90.09f, 209.92f),
                    PathNode.LineTo(119.09f, 170.03f),
                    PathNode.CurveTo(95.16f, 158.66f, 68.91f, 163.1f, 54.29f, 165.58f),
                    PathNode.CurveTo(43.005135f, 167.55118f, 31.588005f, 162.88795f, 24.91f, 153.58f),
                    PathNode.CurveTo(24.830994f, 153.47734f, 24.757557f, 153.37053f, 24.69f, 153.26f),
                    PathNode.LineTo(10.9f, 131.26f),
                    PathNode.CurveTo(10.053352f, 129.90366f, 9.783092f, 128.26547f, 10.149199f, 126.70905f),
                    PathNode.CurveTo(10.515306f, 125.152626f, 11.487495f, 123.8067f, 12.85f, 122.97f),
                    PathNode.LineTo(114.0f, 60.65f),
                    PathNode.LineTo(114.0f, 32.0f),
                    PathNode.CurveTo(114.0f, 28.68629f, 116.686295f, 26.0f, 120.0f, 26.0f),
                    PathNode.LineTo(128.0f, 26.0f),
                    PathNode.CurveTo(155.30519f, 25.99724f, 181.47148f, 36.942455f, 200.64243f, 56.385925f),
                    PathNode.CurveTo(219.81337f, 75.8294f, 230.38818f, 102.14757f, 230.0f, 129.45f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 129.28f),
                    PathNode.CurveTo(218.34265f, 105.189514f, 209.01201f, 81.96745f, 192.09647f, 64.81132f),
                    PathNode.CurveTo(175.18091f, 47.655186f, 152.09293f, 37.997562f, 128.0f, 38.0f),
                    PathNode.LineTo(126.0f, 38.0f),
                    PathNode.LineTo(126.0f, 64.0f),
                    PathNode.CurveTo(125.99904f, 66.084496f, 124.91626f, 68.01911f, 123.14f, 69.11f),
                    PathNode.LineTo(24.29f, 129.94f),
                    PathNode.LineTo(34.76f, 146.68f),
                    PathNode.CurveTo(38.78695f, 152.17918f, 45.586246f, 154.91597f, 52.3f, 153.74f),
                    PathNode.CurveTo(68.12f, 151.07f, 100.72f, 145.56f, 129.53f, 161.96f),
                    PathNode.CurveTo(152.11086f, 161.13687f, 169.99348f, 142.59586f, 170.0f, 120.0f),
                    PathNode.CurveTo(170.0f, 116.686295f, 172.6863f, 114.0f, 176.0f, 114.0f),
                    PathNode.CurveTo(179.3137f, 114.0f, 182.0f, 116.686295f, 182.0f, 120.0f),
                    PathNode.CurveTo(181.9652f, 148.5921f, 159.6723f, 172.21284f, 131.13f, 173.9f),
                    PathNode.LineTo(101.77f, 214.27f),
                    PathNode.CurveTo(110.87445f, 216.93945f, 120.33433f, 218.1974f, 129.82f, 218.0f),
                    PathNode.CurveTo(178.25822f, 216.87999f, 217.17574f, 177.72417f, 218.0f, 129.28f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _horse!!
    }

private var _horse: ImageVector? = null
