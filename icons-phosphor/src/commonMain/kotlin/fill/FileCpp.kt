package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCpp: ImageVector
    get() {
        if (_fileCpp != null) return _fileCpp!!
        _fileCpp = phosphorFillIcon(
            name = "FileCpp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.0f, 120.0f),
                    PathNode.LineTo(212.0f, 120.0f),
                    PathNode.CurveTo(214.20914f, 120.0f, 216.0f, 118.20914f, 216.0f, 116.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(40.0f, 118.20914f, 41.79086f, 120.0f, 44.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 44.0f),
                    PathNode.LineTo(196.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 191.0f, 55.18f, 200.0f, 64.0f, 200.0f),
                    PathNode.CurveTo(67.83071f, 199.93044f, 71.46739f, 198.3017f, 74.07f, 195.49f),
                    PathNode.CurveTo(76.93881f, 192.46417f, 81.622986f, 192.0767f, 84.95f, 194.59f),
                    PathNode.CurveTo(86.72002f, 195.98552f, 87.81921f, 198.06297f, 87.97723f, 200.31142f),
                    PathNode.CurveTo(88.13524f, 202.55984f, 87.337425f, 204.77063f, 85.78f, 206.4f),
                    PathNode.CurveTo(80.1501f, 212.4604f, 72.27162f, 215.93301f, 64.0f, 216.0f),
                    PathNode.CurveTo(46.35f, 216.0f, 32.0f, 199.85f, 32.0f, 180.0f),
                    PathNode.CurveTo(32.0f, 160.15f, 46.35f, 144.0f, 64.0f, 144.0f),
                    PathNode.CurveTo(72.07784f, 144.06177f, 79.78944f, 147.37857f, 85.39f, 153.2f),
                    PathNode.CurveTo(88.45894f, 156.15025f, 88.77534f, 160.95259f, 86.12f, 164.28f),
                    PathNode.CurveTo(84.65736f, 166.01776f, 82.52498f, 167.05186f, 80.25476f, 167.12436f),
                    PathNode.CurveTo(77.98454f, 167.19685f, 75.79053f, 166.3009f, 74.22f, 164.66f),
                    PathNode.CurveTo(71.600006f, 161.76613f, 67.90288f, 160.08035f, 64.0f, 160.0f),
                    PathNode.CurveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 180.53f),
                    PathNode.CurveTo(155.62871f, 184.79535f, 152.03116f, 188.05276f, 147.75f, 188.0f),
                    PathNode.LineTo(136.0f, 188.0f),
                    PathNode.LineTo(136.0f, 199.73f),
                    PathNode.CurveTo(136.05766f, 204.013f, 132.79767f, 207.61339f, 128.53f, 207.98f),
                    PathNode.CurveTo(126.31803f, 208.12688f, 124.14429f, 207.34932f, 122.52731f, 205.83281f),
                    PathNode.CurveTo(120.91034f, 204.3163f, 119.99513f, 202.19684f, 120.0f, 199.98f),
                    PathNode.LineTo(120.0f, 188.0f),
                    PathNode.LineTo(108.27f, 188.0f),
                    PathNode.CurveTo(103.988846f, 188.05276f, 100.3913f, 184.79535f, 100.02f, 180.53f),
                    PathNode.CurveTo(99.87313f, 178.31801f, 100.65069f, 176.14429f, 102.16719f, 174.52731f),
                    PathNode.CurveTo(103.68369f, 172.91034f, 105.80316f, 171.99513f, 108.02f, 172.0f),
                    PathNode.LineTo(120.02f, 172.0f),
                    PathNode.LineTo(120.02f, 160.27f),
                    PathNode.CurveTo(119.96234f, 155.987f, 123.22233f, 152.38661f, 127.49f, 152.02f),
                    PathNode.CurveTo(129.70197f, 151.87312f, 131.87572f, 152.65068f, 133.49269f, 154.16719f),
                    PathNode.CurveTo(135.10966f, 155.6837f, 136.02486f, 157.80316f, 136.02f, 160.02f),
                    PathNode.LineTo(136.02f, 172.02f),
                    PathNode.LineTo(148.02f, 172.02f),
                    PathNode.CurveTo(150.22964f, 172.02103f, 152.34047f, 172.93594f, 153.85193f, 174.54779f),
                    PathNode.CurveTo(155.36339f, 176.15964f, 156.14087f, 178.32484f, 156.0f, 180.53f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 180.53f),
                    PathNode.CurveTo(223.62871f, 184.79535f, 220.03116f, 188.05276f, 215.75f, 188.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.LineTo(204.0f, 199.73f),
                    PathNode.CurveTo(204.05766f, 204.013f, 200.79767f, 207.61339f, 196.53f, 207.98f),
                    PathNode.CurveTo(194.31801f, 208.12688f, 192.14429f, 207.34932f, 190.52731f, 205.83281f),
                    PathNode.CurveTo(188.91034f, 204.3163f, 187.99513f, 202.19684f, 188.0f, 199.98f),
                    PathNode.LineTo(188.0f, 188.0f),
                    PathNode.LineTo(176.27f, 188.0f),
                    PathNode.CurveTo(171.98885f, 188.05276f, 168.3913f, 184.79535f, 168.02f, 180.53f),
                    PathNode.CurveTo(167.87312f, 178.31801f, 168.65068f, 176.14429f, 170.16719f, 174.52731f),
                    PathNode.CurveTo(171.6837f, 172.91034f, 173.80316f, 171.99513f, 176.02f, 172.0f),
                    PathNode.LineTo(188.02f, 172.0f),
                    PathNode.LineTo(188.02f, 160.27f),
                    PathNode.CurveTo(187.96234f, 155.987f, 191.22232f, 152.38661f, 195.49f, 152.02f),
                    PathNode.CurveTo(197.70197f, 151.87312f, 199.87572f, 152.65068f, 201.49269f, 154.16719f),
                    PathNode.CurveTo(203.10966f, 155.6837f, 204.02486f, 157.80316f, 204.02f, 160.02f),
                    PathNode.LineTo(204.02f, 172.02f),
                    PathNode.LineTo(216.02f, 172.02f),
                    PathNode.CurveTo(218.22964f, 172.02103f, 220.34047f, 172.93594f, 221.85193f, 174.54779f),
                    PathNode.CurveTo(223.36339f, 176.15964f, 224.14087f, 178.32484f, 224.0f, 180.53f),
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
        return _fileCpp!!
    }

private var _fileCpp: ImageVector? = null
