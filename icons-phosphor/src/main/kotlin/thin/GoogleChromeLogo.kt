package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorThinIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(161.67854f, 36.02325f, 192.65762f, 54.431206f, 208.78f, 84.0f),
                    PathNode.LineTo(128.0f, 84.0f),
                    PathNode.CurveTo(105.21918f, 84.02764f, 86.21759f, 101.42047f, 84.18f, 124.11f),
                    PathNode.LineTo(54.51f, 72.72f),
                    PathNode.CurveTo(71.867744f, 49.60256f, 99.0914f, 35.999996f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.CurveTo(35.982925f, 111.07493f, 40.659527f, 94.47663f, 49.51f, 80.05f),
                    PathNode.LineTo(89.9f, 150.0f),
                    PathNode.CurveTo(89.9f, 150.09f, 90.01f, 150.17f, 90.07f, 150.26f),
                    PathNode.CurveTo(101.522705f, 169.82947f, 125.987595f, 177.46744f, 146.54f, 167.89f),
                    PathNode.LineTo(116.84f, 219.32f),
                    PathNode.CurveTo(70.718254f, 213.62517f, 36.058327f, 174.47195f, 36.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(127.23f, 220.0f, 126.47f, 220.0f, 125.71f, 220.0f),
                    PathNode.LineTo(166.1f, 150.0f),
                    PathNode.CurveTo(166.13599f, 149.93619f, 166.16612f, 149.86925f, 166.19f, 149.8f),
                    PathNode.CurveTo(177.48674f, 130.08815f, 171.87315f, 105.01352f, 153.25f, 92.0f),
                    PathNode.LineTo(212.66f, 92.0f),
                    PathNode.CurveTo(224.74272f, 120.4159f, 221.76454f, 152.99815f, 204.73038f, 178.75262f),
                    PathNode.CurveTo(187.69621f, 204.5071f, 158.87808f, 219.99864f, 128.0f, 220.0f),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
