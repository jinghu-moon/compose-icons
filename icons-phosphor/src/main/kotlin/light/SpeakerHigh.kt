package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorLightIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(154.64f, 26.61f),
                    PathNode.CurveTo(152.58206f, 25.60201f, 150.12968f, 25.854233f, 148.32f, 27.26f),
                    PathNode.LineTo(77.94f, 82.0f),
                    PathNode.LineTo(32.0f, 82.0f),
                    PathNode.CurveTo(24.268015f, 82.0f, 18.0f, 88.26801f, 18.0f, 96.0f),
                    PathNode.LineTo(18.0f, 160.0f),
                    PathNode.CurveTo(18.0f, 167.73198f, 24.268015f, 174.0f, 32.0f, 174.0f),
                    PathNode.LineTo(77.94f, 174.0f),
                    PathNode.LineTo(148.32f, 228.74f),
                    PathNode.CurveTo(150.12946f, 230.14513f, 152.58113f, 230.39722f, 154.63866f, 229.3897f),
                    PathNode.CurveTo(156.69618f, 228.38219f, 158.0004f, 226.29095f, 158.0f, 224.0f),
                    PathNode.LineTo(158.0f, 32.0f),
                    PathNode.CurveTo(158.00076f, 29.709234f, 156.6971f, 27.617937f, 154.64f, 26.61f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 160.0f),
                    PathNode.LineTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.0f, 94.89543f, 30.89543f, 94.0f, 32.0f, 94.0f),
                    PathNode.LineTo(74.0f, 94.0f),
                    PathNode.LineTo(74.0f, 162.0f),
                    PathNode.LineTo(32.0f, 162.0f),
                    PathNode.CurveTo(30.89543f, 162.0f, 30.0f, 161.10457f, 30.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 211.73f),
                    PathNode.LineTo(86.0f, 165.07f),
                    PathNode.LineTo(86.0f, 90.93f),
                    PathNode.LineTo(146.0f, 44.27f),
                    PathNode.Close,
                    PathNode.MoveTo(196.53f, 102.88f),
                    PathNode.CurveTo(209.17946f, 117.238f, 209.17946f, 138.76201f, 196.53f, 153.12f),
                    PathNode.CurveTo(194.33743f, 155.60529f, 190.5453f, 155.84258f, 188.06f, 153.65f),
                    PathNode.CurveTo(185.57472f, 151.45743f, 185.33743f, 147.66528f, 187.53f, 145.18f),
                    PathNode.CurveTo(196.18211f, 135.35686f, 196.18211f, 120.63314f, 187.53f, 110.81f),
                    PathNode.CurveTo(185.45274f, 108.31357f, 185.73885f, 104.617485f, 188.17555f, 102.470474f),
                    PathNode.CurveTo(190.61227f, 100.32346f, 194.31496f, 100.50497f, 196.53f, 102.88f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 128.0f),
                    PathNode.CurveTo(246.0138f, 147.18837f, 238.94147f, 165.70607f, 226.14f, 180.0f),
                    PathNode.CurveTo(224.72633f, 181.65495f, 222.52727f, 182.41457f, 220.39354f, 181.98494f),
                    PathNode.CurveTo(218.25981f, 181.55533f, 216.52608f, 180.00389f, 215.86302f, 177.93079f),
                    PathNode.CurveTo(215.19997f, 175.8577f, 215.71161f, 173.58809f, 217.2f, 172.0f),
                    PathNode.CurveTo(239.60867f, 146.94633f, 239.60867f, 109.05366f, 217.2f, 84.0f),
                    PathNode.CurveTo(215.71161f, 82.4119f, 215.19997f, 80.1423f, 215.86302f, 78.06921f),
                    PathNode.CurveTo(216.52608f, 75.99612f, 218.25981f, 74.444664f, 220.39354f, 74.01505f),
                    PathNode.CurveTo(222.52727f, 73.58544f, 224.72633f, 74.34504f, 226.14f, 76.0f),
                    PathNode.CurveTo(238.94147f, 90.29394f, 246.0138f, 108.81162f, 246.0f, 128.0f),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
