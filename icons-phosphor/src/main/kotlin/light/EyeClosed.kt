package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorLightIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.21f, 165.0f),
                    PathNode.CurveTo(230.86685f, 167.87741f, 229.87741f, 171.55315f, 227.0f, 173.21f),
                    PathNode.CurveTo(224.12259f, 174.86685f, 220.44685f, 173.87741f, 218.79f, 171.0f),
                    PathNode.LineTo(198.79f, 135.92f),
                    PathNode.CurveTo(186.96332f, 144.21103f, 173.75833f, 150.33612f, 159.79f, 154.01f),
                    PathNode.LineTo(165.96f, 191.01f),
                    PathNode.CurveTo(166.22318f, 192.58017f, 165.85152f, 194.19054f, 164.92685f, 195.48657f),
                    PathNode.CurveTo(164.0022f, 196.7826f, 162.60036f, 197.65799f, 161.03f, 197.92f),
                    PathNode.CurveTo(160.69907f, 197.97107f, 160.36484f, 197.99782f, 160.03f, 198.0f),
                    PathNode.CurveTo(157.10448f, 197.99704f, 154.60759f, 195.8846f, 154.12f, 193.0f),
                    PathNode.LineTo(148.0f, 156.44f),
                    PathNode.CurveTo(134.74794f, 158.52205f, 121.25205f, 158.52205f, 108.0f, 156.44f),
                    PathNode.LineTo(101.92f, 193.0f),
                    PathNode.CurveTo(101.431786f, 195.88834f, 98.9293f, 198.0019f, 96.0f, 198.0f),
                    PathNode.CurveTo(95.66516f, 197.99782f, 95.33093f, 197.97107f, 95.0f, 197.92f),
                    PathNode.CurveTo(93.429436f, 197.65575f, 92.02837f, 196.77791f, 91.105515f, 195.47989f),
                    PathNode.CurveTo(90.182655f, 194.18188f, 89.81372f, 192.57022f, 90.08f, 191.0f),
                    PathNode.LineTo(96.25f, 154.0f),
                    PathNode.CurveTo(82.28167f, 150.32611f, 69.07668f, 144.20103f, 57.25f, 135.91f),
                    PathNode.LineTo(37.21f, 171.0f),
                    PathNode.CurveTo(35.553146f, 173.87741f, 31.877403f, 174.86685f, 29.0f, 173.21f),
                    PathNode.CurveTo(26.122597f, 171.55315f, 25.133146f, 167.87741f, 26.79f, 165.0f),
                    PathNode.LineTo(47.64f, 128.52f),
                    PathNode.CurveTo(40.222427f, 122.260956f, 33.421375f, 115.30587f, 27.33f, 107.75f),
                    PathNode.CurveTo(25.247887f, 105.17083f, 25.650831f, 101.39211f, 28.23f, 99.31f),
                    PathNode.CurveTo(30.80917f, 97.22789f, 34.587887f, 97.63083f, 36.67f, 100.21f),
                    PathNode.CurveTo(53.54f, 121.11f, 83.07f, 146.0f, 128.0f, 146.0f),
                    PathNode.CurveTo(172.93f, 146.0f, 202.46f, 121.11f, 219.33f, 100.23f),
                    PathNode.CurveTo(221.41211f, 97.65083f, 225.19083f, 97.24789f, 227.77f, 99.33f),
                    PathNode.CurveTo(230.34917f, 101.41212f, 230.75212f, 105.19083f, 228.67f, 107.77f),
                    PathNode.CurveTo(222.57863f, 115.32587f, 215.77757f, 122.28096f, 208.36f, 128.54f),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
