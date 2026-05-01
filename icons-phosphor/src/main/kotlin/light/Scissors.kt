package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorLightIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(159.38f, 112.0f),
                    PathNode.CurveTo(158.48201f, 110.68592f, 158.14294f, 109.0689f, 158.43738f, 107.504776f),
                    PathNode.CurveTo(158.73183f, 105.94066f, 159.63567f, 104.55761f, 160.95f, 103.66f),
                    PathNode.LineTo(228.61f, 57.35f),
                    PathNode.CurveTo(231.34657f, 55.477757f, 235.08275f, 56.17843f, 236.955f, 58.915f),
                    PathNode.CurveTo(238.82722f, 61.65157f, 238.12657f, 65.38776f, 235.39f, 67.26f),
                    PathNode.LineTo(167.72f, 113.56f),
                    PathNode.CurveTo(164.98613f, 115.431984f, 161.2524f, 114.73358f, 159.38f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.0f, 197.09f),
                    PathNode.CurveTo(235.12761f, 199.82358f, 231.39386f, 200.52199f, 228.66f, 198.65f),
                    PathNode.LineTo(136.0f, 135.27f),
                    PathNode.LineTo(91.0f, 166.06f),
                    PathNode.CurveTo(98.27805f, 182.06879f, 92.14748f, 200.98589f, 76.86293f, 209.68266f),
                    PathNode.CurveTo(61.57838f, 218.37946f, 42.18416f, 213.98578f, 32.139996f, 199.55087f),
                    PathNode.CurveTo(22.095833f, 185.11598f, 24.71656f, 165.40375f, 38.183372f, 154.09462f),
                    PathNode.CurveTo(51.650185f, 142.78549f, 71.5187f, 143.61177f, 84.0f, 156.0f),
                    PathNode.CurveTo(84.05812f, 156.07143f, 84.12164f, 156.13829f, 84.19f, 156.2f),
                    PathNode.LineTo(125.37f, 128.0f),
                    PathNode.LineTo(84.23f, 99.84f),
                    PathNode.LineTo(84.0f, 100.0f),
                    PathNode.CurveTo(71.53792f, 112.40304f, 51.67501f, 113.25874f, 38.192425f, 101.97341f),
                    PathNode.CurveTo(24.709835f, 90.68809f, 22.055468f, 70.98474f, 32.070953f, 56.53383f),
                    PathNode.CurveTo(42.086437f, 42.082916f, 61.467674f, 37.651775f, 76.7677f, 46.314796f),
                    PathNode.CurveTo(92.06773f, 54.977814f, 98.23909f, 73.87707f, 91.0f, 89.9f),
                    PathNode.LineTo(235.38f, 188.7f),
                    PathNode.CurveTo(236.71661f, 189.5903f, 237.64053f, 190.97928f, 237.94499f, 192.55614f),
                    PathNode.CurveTo(238.24947f, 194.133f, 237.90909f, 195.76608f, 237.0f, 197.09f),
                    PathNode.Close,
                    PathNode.MoveTo(75.56f, 91.55f),
                    PathNode.CurveTo(84.14857f, 82.9574f, 84.146385f, 69.02965f, 75.55513f, 60.439735f),
                    PathNode.CurveTo(66.963875f, 51.849823f, 53.036125f, 51.849823f, 44.444866f, 60.439735f),
                    PathNode.CurveTo(35.85361f, 69.02965f, 35.851433f, 82.9574f, 44.44f, 91.55f),
                    PathNode.CurveTo(48.550278f, 95.70771f, 54.153553f, 98.04751f, 60.0f, 98.04751f),
                    PathNode.CurveTo(65.84644f, 98.04751f, 71.44972f, 95.70771f, 75.56f, 91.55f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 180.0f),
                    PathNode.CurveTo(81.99651f, 169.50456f, 74.57975f, 160.4731f, 64.285355f, 158.42871f),
                    PathNode.CurveTo(53.990955f, 156.38431f, 43.685947f, 161.89638f, 39.672268f, 171.59402f),
                    PathNode.CurveTo(35.658585f, 181.29166f, 39.05405f, 192.4741f, 47.782192f, 198.3028f),
                    PathNode.CurveTo(56.510338f, 204.13148f, 68.14035f, 202.98314f, 75.56f, 195.56f),
                    PathNode.LineTo(75.56f, 195.56f),
                    PathNode.CurveTo(79.6966f, 191.44023f, 82.015205f, 185.83813f, 82.0f, 180.0f),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
