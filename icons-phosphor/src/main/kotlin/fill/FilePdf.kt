package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorFillIcon(
            name = "FilePdf",
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
                    PathNode.MoveTo(224.0f, 152.53f),
                    PathNode.CurveTo(223.62871f, 156.79535f, 220.03116f, 160.05276f, 215.75f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.LineTo(207.73f, 176.0f),
                    PathNode.CurveTo(212.013f, 175.94234f, 215.61339f, 179.20233f, 215.98f, 183.47f),
                    PathNode.CurveTo(216.12688f, 185.68199f, 215.34932f, 187.85571f, 213.83281f, 189.47269f),
                    PathNode.CurveTo(212.3163f, 191.08966f, 210.19684f, 192.00487f, 207.98f, 192.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(192.0f, 207.73f),
                    PathNode.CurveTo(192.05766f, 212.013f, 188.79767f, 215.61339f, 184.53f, 215.98f),
                    PathNode.CurveTo(182.31801f, 216.12688f, 180.14429f, 215.34932f, 178.52731f, 213.83281f),
                    PathNode.CurveTo(176.91034f, 212.3163f, 175.99513f, 210.19684f, 176.0f, 207.98f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 147.58173f, 179.58173f, 144.0f, 184.0f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(218.21684f, 143.99513f, 220.3363f, 144.91034f, 221.85281f, 146.52731f),
                    PathNode.CurveTo(223.36931f, 148.14429f, 224.14687f, 150.31801f, 224.0f, 152.53f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(43.581722f, 144.0f, 40.0f, 147.58173f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 207.73f),
                    PathNode.CurveTo(39.931744f, 212.02065f, 43.19454f, 215.63287f, 47.47f, 216.0f),
                    PathNode.CurveTo(49.68197f, 216.14687f, 51.855713f, 215.36931f, 53.472687f, 213.85281f),
                    PathNode.CurveTo(55.089657f, 212.3363f, 56.00487f, 210.21684f, 56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(63.4f, 200.0f),
                    PathNode.CurveTo(78.64f, 200.0f, 91.54f, 188.08f, 91.99f, 172.85f),
                    PathNode.CurveTo(92.219925f, 165.27953f, 89.37313f, 157.93883f, 84.09916f, 152.5028f),
                    PathNode.CurveTo(78.82519f, 147.06679f, 71.573975f, 143.99922f, 64.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(63.65f, 184.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.CurveTo(67.394165f, 159.9841f, 70.63631f, 161.40634f, 72.92329f, 163.91438f),
                    PathNode.CurveTo(75.210266f, 166.42244f, 76.32814f, 169.7817f, 76.0f, 173.16f),
                    PathNode.CurveTo(75.27672f, 179.40807f, 69.9391f, 184.09306f, 63.65f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.CurveTo(107.58172f, 144.0f, 104.0f, 147.58173f, 104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.CurveTo(104.0f, 212.41827f, 107.58172f, 216.0f, 112.0f, 216.0f),
                    PathNode.LineTo(127.32f, 216.0f),
                    PathNode.CurveTo(146.98f, 216.0f, 163.53f, 200.52f, 163.99f, 180.87f),
                    PathNode.CurveTo(164.22438f, 171.1741f, 160.53664f, 161.79381f, 153.76193f, 154.85344f),
                    PathNode.CurveTo(146.98723f, 147.91309f, 137.69873f, 143.99986f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(127.51f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(128.0f, 160.0f),
                    PathNode.CurveTo(133.44048f, 159.99597f, 138.64781f, 162.20847f, 142.4215f, 166.12743f),
                    PathNode.CurveTo(146.19514f, 170.04639f, 148.20946f, 175.33356f, 148.0f, 180.77f),
                    PathNode.CurveTo(147.58f, 191.59f, 138.34f, 200.0f, 127.51f, 200.0f),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
