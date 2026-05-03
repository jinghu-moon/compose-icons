package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorThinIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.16f, 122.74f),
                    PathNode.CurveTo(120.953156f, 114.65359f, 126.861115f, 99.0846f, 122.65316f, 84.54678f),
                    PathNode.CurveTo(118.44521f, 70.008965f, 105.13456f, 60.002777f, 90.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(29.790861f, 60.0f, 28.0f, 61.79086f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 194.20914f, 29.790861f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(94.0f, 196.0f),
                    PathNode.CurveTo(112.203285f, 195.99617f, 127.84699f, 183.08382f, 131.30147f, 165.21133f),
                    PathNode.CurveTo(134.75594f, 147.33884f, 125.050735f, 129.52695f, 108.16f, 122.74f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 68.0f),
                    PathNode.LineTo(90.0f, 68.0f),
                    PathNode.CurveTo(104.359406f, 68.0f, 116.0f, 79.640594f, 116.0f, 94.0f),
                    PathNode.CurveTo(116.0f, 108.359406f, 104.359406f, 120.0f, 90.0f, 120.0f),
                    PathNode.LineTo(36.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.LineTo(94.0f, 128.0f),
                    PathNode.CurveTo(110.56854f, 128.0f, 124.0f, 141.43146f, 124.0f, 158.0f),
                    PathNode.CurveTo(124.0f, 174.56854f, 110.56854f, 188.0f, 94.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 77.79086f, 165.79086f, 76.0f, 168.0f, 76.0f),
                    PathNode.LineTo(232.0f, 76.0f),
                    PathNode.CurveTo(234.20914f, 76.0f, 236.0f, 77.79086f, 236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 82.20914f, 234.20914f, 84.0f, 232.0f, 84.0f),
                    PathNode.LineTo(168.0f, 84.0f),
                    PathNode.CurveTo(165.79086f, 84.0f, 164.0f, 82.20914f, 164.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 108.0f),
                    PathNode.CurveTo(179.31104f, 108.003525f, 161.41913f, 122.4201f, 157.01569f, 142.63501f),
                    PathNode.CurveTo(152.61223f, 162.84991f, 162.88683f, 183.40205f, 181.69986f, 192.01036f),
                    PathNode.CurveTo(200.51288f, 200.6187f, 222.78192f, 194.95764f, 235.2f, 178.41f),
                    PathNode.CurveTo(236.52824f, 176.64268f, 236.17232f, 174.13322f, 234.405f, 172.805f),
                    PathNode.CurveTo(232.6377f, 171.47676f, 230.12825f, 171.83269f, 228.8f, 173.6f),
                    PathNode.CurveTo(219.94391f, 185.41101f, 204.77463f, 190.61827f, 190.53162f, 186.73662f),
                    PathNode.CurveTo(176.2886f, 182.85497f, 165.85889f, 170.67122f, 164.22f, 156.0f),
                    PathNode.LineTo(240.0f, 156.0f),
                    PathNode.CurveTo(242.20914f, 156.0f, 244.0f, 154.20914f, 244.0f, 152.0f),
                    PathNode.CurveTo(243.97244f, 127.71089f, 224.28911f, 108.02756f, 200.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.22f, 148.0f),
                    PathNode.CurveTo(166.24495f, 129.76768f, 181.65558f, 115.97386f, 200.0f, 115.97386f),
                    PathNode.CurveTo(218.34442f, 115.97386f, 233.75505f, 129.76768f, 235.78f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
