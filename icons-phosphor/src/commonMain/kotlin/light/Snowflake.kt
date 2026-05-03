package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorLightIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.83f, 150.57f),
                    PathNode.CurveTo(222.21004f, 152.11626f, 221.95987f, 153.75015f, 221.1346f, 155.11188f),
                    PathNode.CurveTo(220.30931f, 156.47359f, 218.97661f, 157.45143f, 217.43f, 157.83f),
                    PathNode.LineTo(190.81f, 164.37f),
                    PathNode.LineTo(197.81f, 190.45f),
                    PathNode.CurveTo(198.22241f, 191.98692f, 198.00739f, 193.62474f, 197.21223f, 195.00314f),
                    PathNode.CurveTo(196.41708f, 196.38153f, 195.10693f, 197.38759f, 193.57f, 197.8f),
                    PathNode.CurveTo(193.06345f, 197.92973f, 192.5429f, 197.9969f, 192.02f, 198.0f),
                    PathNode.CurveTo(189.30186f, 198.00166f, 186.92218f, 196.17586f, 186.22f, 193.55f),
                    PathNode.LineTo(178.27f, 164.0f),
                    PathNode.LineTo(134.0f, 138.39f),
                    PathNode.LineTo(134.0f, 189.52f),
                    PathNode.LineTo(156.24f, 211.76f),
                    PathNode.CurveTo(157.84523f, 213.25575f, 158.506f, 215.50844f, 157.96309f, 217.63431f),
                    PathNode.CurveTo(157.42018f, 219.76018f, 155.76018f, 221.42018f, 153.63431f, 221.96309f),
                    PathNode.CurveTo(151.50844f, 222.506f, 149.25575f, 221.84523f, 147.76f, 220.24f),
                    PathNode.LineTo(128.0f, 200.49f),
                    PathNode.LineTo(108.24f, 220.24f),
                    PathNode.CurveTo(105.87592f, 222.44287f, 102.191925f, 222.37787f, 99.90703f, 220.09297f),
                    PathNode.CurveTo(97.62213f, 217.80807f, 97.55713f, 214.12408f, 99.76f, 211.76f),
                    PathNode.LineTo(122.0f, 189.52f),
                    PathNode.LineTo(122.0f, 138.39f),
                    PathNode.LineTo(77.73f, 164.0f),
                    PathNode.LineTo(69.8f, 193.6f),
                    PathNode.CurveTo(69.078964f, 196.20601f, 66.70391f, 198.00778f, 64.0f, 198.0f),
                    PathNode.CurveTo(63.477104f, 197.9969f, 62.956554f, 197.92973f, 62.45f, 197.8f),
                    PathNode.CurveTo(60.91307f, 197.38759f, 59.602917f, 196.38153f, 58.807762f, 195.00314f),
                    PathNode.CurveTo(58.012608f, 193.62474f, 57.79759f, 191.98692f, 58.21f, 190.45f),
                    PathNode.LineTo(65.21f, 164.37f),
                    PathNode.LineTo(38.59f, 157.83f),
                    PathNode.CurveTo(35.37018f, 157.04024f, 33.400234f, 153.78983f, 34.19f, 150.57f),
                    PathNode.CurveTo(34.979767f, 147.35017f, 38.23018f, 145.38023f, 41.45f, 146.17f),
                    PathNode.LineTo(71.68f, 153.6f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.LineTo(71.66f, 102.4f),
                    PathNode.LineTo(41.43f, 109.83f),
                    PathNode.CurveTo(40.9621f, 109.945045f, 40.48183f, 110.00214f, 40.0f, 110.0f),
                    PathNode.CurveTo(36.96024f, 110.006035f, 34.396233f, 107.73785f, 34.031445f, 104.72005f),
                    PathNode.CurveTo(33.666656f, 101.70225f, 35.616352f, 98.88844f, 38.57f, 98.17f),
                    PathNode.LineTo(65.19f, 91.63f),
                    PathNode.LineTo(58.19f, 65.55f),
                    PathNode.CurveTo(57.58505f, 63.462643f, 58.15612f, 61.211334f, 59.682873f, 59.664707f),
                    PathNode.CurveTo(61.209625f, 58.11808f, 63.45336f, 57.517944f, 65.54836f, 58.09585f),
                    PathNode.CurveTo(67.64337f, 58.67376f, 69.2621f, 60.33936f, 69.78f, 62.45f),
                    PathNode.LineTo(77.71f, 92.05f),
                    PathNode.LineTo(122.0f, 117.61f),
                    PathNode.LineTo(122.0f, 66.48f),
                    PathNode.LineTo(99.76f, 44.24f),
                    PathNode.CurveTo(97.55713f, 41.875923f, 97.62213f, 38.19192f, 99.90703f, 35.907024f),
                    PathNode.CurveTo(102.191925f, 33.622128f, 105.87592f, 33.55713f, 108.24f, 35.76f),
                    PathNode.LineTo(128.0f, 55.51f),
                    PathNode.LineTo(147.76f, 35.76f),
                    PathNode.CurveTo(150.12408f, 33.55713f, 153.80807f, 33.622128f, 156.09297f, 35.907024f),
                    PathNode.CurveTo(158.37787f, 38.19192f, 158.44287f, 41.875923f, 156.24f, 44.24f),
                    PathNode.LineTo(134.0f, 66.48f),
                    PathNode.LineTo(134.0f, 117.61f),
                    PathNode.LineTo(178.27f, 92.05f),
                    PathNode.LineTo(186.2f, 62.45f),
                    PathNode.CurveTo(186.7179f, 60.33936f, 188.33662f, 58.67376f, 190.43164f, 58.09585f),
                    PathNode.CurveTo(192.52664f, 57.517944f, 194.77037f, 58.11808f, 196.29713f, 59.664707f),
                    PathNode.CurveTo(197.82388f, 61.211334f, 198.39496f, 63.462643f, 197.79f, 65.55f),
                    PathNode.LineTo(190.79f, 91.63f),
                    PathNode.LineTo(217.41f, 98.17f),
                    PathNode.CurveTo(220.35992f, 98.88755f, 222.30902f, 101.6955f, 221.94972f, 104.71011f),
                    PathNode.CurveTo(221.59042f, 107.72472f, 219.03593f, 109.995895f, 216.0f, 110.0f),
                    PathNode.CurveTo(215.51817f, 110.00214f, 215.0379f, 109.945045f, 214.57f, 109.83f),
                    PathNode.LineTo(184.34f, 102.4f),
                    PathNode.LineTo(140.0f, 128.0f),
                    PathNode.LineTo(184.34f, 153.6f),
                    PathNode.LineTo(214.57f, 146.17f),
                    PathNode.CurveTo(216.11626f, 145.78996f, 217.75015f, 146.04013f, 219.11188f, 146.8654f),
                    PathNode.CurveTo(220.47359f, 147.69069f, 221.45143f, 149.02339f, 221.83f, 150.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
