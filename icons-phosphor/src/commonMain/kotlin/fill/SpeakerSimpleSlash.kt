package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) return _speakerSimpleSlash!!
        _speakerSimpleSlash = phosphorFillIcon(
            name = "SpeakerSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.92f, 210.62f),
                    PathNode.CurveTo(223.88303f, 212.7287f, 224.56061f, 215.73003f, 223.69395f, 218.47755f),
                    PathNode.CurveTo(222.82729f, 221.2251f, 220.55025f, 223.29443f, 217.73259f, 223.89514f),
                    PathNode.CurveTo(214.91493f, 224.49586f, 211.9919f, 223.53516f, 210.08f, 221.38f),
                    PathNode.LineTo(168.0f, 175.09f),
                    PathNode.LineTo(168.0f, 223.69f),
                    PathNode.CurveTo(168.04951f, 226.60428f, 166.56493f, 229.33044f, 164.09f, 230.87f),
                    PathNode.CurveTo(161.26054f, 232.55293f, 157.68901f, 232.3307f, 155.09f, 230.31f),
                    PathNode.LineTo(85.25f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(31.163445f, 176.0f, 24.0f, 168.83656f, 24.0f, 160.0f),
                    PathNode.LineTo(24.0f, 96.0f),
                    PathNode.CurveTo(24.0f, 87.163445f, 31.163445f, 80.0f, 40.0f, 80.0f),
                    PathNode.LineTo(81.55f, 80.0f),
                    PathNode.LineTo(50.08f, 45.38f),
                    PathNode.CurveTo(47.172737f, 42.102833f, 47.442047f, 37.0969f, 50.68412f, 34.15056f),
                    PathNode.CurveTo(53.926197f, 31.204214f, 58.934998f, 31.413485f, 61.92f, 34.62f),
                    PathNode.Close,
                    PathNode.MoveTo(200.53f, 160.0f),
                    PathNode.CurveTo(204.79767f, 159.63339f, 208.05766f, 156.033f, 208.0f, 151.75f),
                    PathNode.LineTo(208.0f, 104.27f),
                    PathNode.CurveTo(208.06825f, 99.97935f, 204.80547f, 96.36713f, 200.53f, 96.0f),
                    PathNode.CurveTo(198.31801f, 95.85313f, 196.14429f, 96.63069f, 194.52731f, 98.147194f),
                    PathNode.CurveTo(192.91034f, 99.6637f, 191.99513f, 101.783165f, 192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(191.99513f, 154.21684f, 192.91034f, 156.3363f, 194.52731f, 157.85281f),
                    PathNode.CurveTo(196.14429f, 159.36931f, 198.31801f, 160.14687f, 200.53f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(161.0f, 119.87f),
                    PathNode.CurveTo(162.10686f, 121.12542f, 163.87831f, 121.55899f, 165.43987f, 120.95668f),
                    PathNode.CurveTo(167.00142f, 120.35436f, 168.02287f, 118.84353f, 168.0f, 117.17f),
                    PathNode.LineTo(168.0f, 32.24f),
                    PathNode.CurveTo(168.03749f, 29.78781f, 166.98204f, 27.446053f, 165.12f, 25.85f),
                    PathNode.CurveTo(162.23492f, 23.462852f, 158.07997f, 23.396374f, 155.12f, 25.69f),
                    PathNode.LineTo(111.83f, 59.33f),
                    PathNode.CurveTo(110.9505f, 60.014652f, 110.39654f, 61.035213f, 110.30162f, 62.145737f),
                    PathNode.CurveTo(110.2067f, 63.25626f, 110.57944f, 64.356026f, 111.33f, 65.18f),
                    PathNode.Close,
                    PathNode.MoveTo(231.47f, 80.0f),
                    PathNode.CurveTo(227.19453f, 80.36713f, 223.93175f, 83.97935f, 224.0f, 88.27f),
                    PathNode.LineTo(224.0f, 167.73f),
                    PathNode.CurveTo(223.94234f, 172.013f, 227.20233f, 175.61339f, 231.47f, 175.98f),
                    PathNode.CurveTo(233.68199f, 176.12688f, 235.85571f, 175.34932f, 237.47269f, 173.83281f),
                    PathNode.CurveTo(239.08966f, 172.3163f, 240.00487f, 170.19684f, 240.0f, 167.98f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(240.00487f, 85.783165f, 239.08966f, 83.6637f, 237.47269f, 82.147194f),
                    PathNode.CurveTo(235.85571f, 80.63069f, 233.68199f, 79.85313f, 231.47f, 80.0f),
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
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
