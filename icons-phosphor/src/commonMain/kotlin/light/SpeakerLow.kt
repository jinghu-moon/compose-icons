package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorLightIcon(
            name = "SpeakerLow",
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
                    PathNode.MoveTo(206.0f, 128.0f),
                    PathNode.CurveTo(206.00684f, 137.25844f, 202.62804f, 146.19984f, 196.5f, 153.14f),
                    PathNode.CurveTo(194.30743f, 155.62527f, 190.51527f, 155.86256f, 188.03f, 153.67f),
                    PathNode.CurveTo(185.54472f, 151.47745f, 185.30743f, 147.68529f, 187.5f, 145.2f),
                    PathNode.CurveTo(196.15211f, 135.37686f, 196.15211f, 120.65314f, 187.5f, 110.83f),
                    PathNode.CurveTo(185.42274f, 108.333565f, 185.70885f, 104.63749f, 188.14555f, 102.49048f),
                    PathNode.CurveTo(190.58226f, 100.34347f, 194.28496f, 100.52496f, 196.5f, 102.9f),
                    PathNode.CurveTo(202.6141f, 109.83273f, 205.99158f, 118.756355f, 206.0f, 128.0f),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
