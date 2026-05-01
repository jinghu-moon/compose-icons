package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorThinIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 84.0f),
                    PathNode.CurveTo(167.46397f, 84.0f, 180.0f, 71.463974f, 180.0f, 56.0f),
                    PathNode.CurveTo(180.0f, 40.53603f, 167.46397f, 28.0f, 152.0f, 28.0f),
                    PathNode.CurveTo(136.53603f, 28.0f, 124.0f, 40.53603f, 124.0f, 56.0f),
                    PathNode.CurveTo(124.0f, 71.463974f, 136.53603f, 84.0f, 152.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 36.0f),
                    PathNode.CurveTo(163.0457f, 36.0f, 172.0f, 44.954304f, 172.0f, 56.0f),
                    PathNode.CurveTo(172.0f, 67.04569f, 163.0457f, 76.0f, 152.0f, 76.0f),
                    PathNode.CurveTo(140.9543f, 76.0f, 132.0f, 67.04569f, 132.0f, 56.0f),
                    PathNode.CurveTo(132.0f, 44.954304f, 140.9543f, 36.0f, 152.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.66f, 137.0f),
                    PathNode.CurveTo(217.09f, 137.26f, 210.82f, 140.0f, 199.58f, 140.0f),
                    PathNode.CurveTo(185.72f, 140.0f, 164.33f, 135.85f, 136.77f, 117.84f),
                    PathNode.CurveTo(132.20363f, 132.27444f, 125.64359f, 146.00037f, 117.28f, 158.62f),
                    PathNode.CurveTo(126.75f, 161.18f, 140.36f, 166.12f, 152.42f, 175.29f),
                    PathNode.CurveTo(170.72f, 189.21f, 180.0f, 208.29f, 180.0f, 231.97f),
                    PathNode.CurveTo(180.0f, 234.17914f, 178.20914f, 235.97f, 176.0f, 235.97f),
                    PathNode.CurveTo(173.79086f, 235.97f, 172.0f, 234.17914f, 172.0f, 231.97f),
                    PathNode.CurveTo(172.0f, 216.08f, 166.12f, 178.2f, 112.3f, 165.6f),
                    PathNode.QuadTo(110.74f, 167.66f, 109.08f, 169.68f),
                    PathNode.CurveTo(90.23f, 192.51f, 66.66f, 204.4f, 40.48f, 204.4f),
                    PathNode.QuadTo(36.08f, 204.4f, 31.59f, 203.95f),
                    PathNode.CurveTo(29.380861f, 203.7291f, 27.769087f, 201.75914f, 27.99f, 199.55f),
                    PathNode.CurveTo(28.210915f, 197.34087f, 30.18086f, 195.7291f, 32.39f, 195.95f),
                    PathNode.CurveTo(59.72f, 198.68f, 83.45f, 188.12f, 102.91f, 164.54f),
                    PathNode.CurveTo(116.73f, 147.8f, 125.8f, 127.1f, 129.81f, 113.22f),
                    PathNode.CurveTo(86.97f, 86.53f, 58.81f, 108.42f, 58.49f, 108.65f),
                    PathNode.CurveTo(57.380577f, 109.597336f, 55.843388f, 109.86555f, 54.4787f, 109.3499f),
                    PathNode.CurveTo(53.11401f, 108.83426f, 52.138275f, 107.61654f, 51.932514f, 106.172264f),
                    PathNode.CurveTo(51.726757f, 104.72799f, 52.32361f, 103.28624f, 53.49f, 102.41f),
                    PathNode.CurveTo(53.85f, 102.12f, 62.49f, 95.31f, 77.33f, 92.83f),
                    PathNode.CurveTo(90.83f, 90.56f, 112.33f, 91.57f, 138.24f, 109.17f),
                    PathNode.CurveTo(163.24f, 126.17f, 182.65f, 130.81f, 194.53f, 131.73f),
                    PathNode.CurveTo(207.28f, 132.73f, 214.3f, 129.73f, 214.37f, 129.68f),
                    PathNode.CurveTo(216.37135f, 128.82996f, 218.6852f, 129.73436f, 219.57964f, 131.71626f),
                    PathNode.CurveTo(220.47408f, 133.69818f, 219.62148f, 136.0316f, 217.66f, 136.97f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
