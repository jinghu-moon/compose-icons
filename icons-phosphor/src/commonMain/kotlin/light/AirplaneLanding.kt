package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorLightIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(254.0f, 216.0f),
                    PathNode.CurveTo(254.0f, 219.3137f, 251.3137f, 222.0f, 248.0f, 222.0f),
                    PathNode.LineTo(104.0f, 222.0f),
                    PathNode.CurveTo(100.686295f, 222.0f, 98.0f, 219.3137f, 98.0f, 216.0f),
                    PathNode.CurveTo(98.0f, 212.6863f, 100.686295f, 210.0f, 104.0f, 210.0f),
                    PathNode.LineTo(248.0f, 210.0f),
                    PathNode.CurveTo(251.3137f, 210.0f, 254.0f, 212.6863f, 254.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.38f, 189.78f),
                    PathNode.LineTo(53.75f, 140.32f),
                    PathNode.CurveTo(37.36743f, 135.68173f, 26.043549f, 120.74645f, 26.0f, 103.72f),
                    PathNode.LineTo(26.0f, 48.0f),
                    PathNode.CurveTo(25.996986f, 43.497616f, 28.159533f, 39.268536f, 31.811455f, 36.63511f),
                    PathNode.CurveTo(35.463375f, 34.001682f, 40.15897f, 33.285316f, 44.43f, 34.71f),
                    PathNode.LineTo(49.9f, 36.54f),
                    PathNode.CurveTo(51.638866f, 37.12133f, 53.016495f, 38.46581f, 53.64f, 40.19f),
                    PathNode.LineTo(64.64f, 70.52f),
                    PathNode.LineTo(98.0f, 80.0f),
                    PathNode.LineTo(98.0f, 48.0f),
                    PathNode.CurveTo(97.99699f, 43.497616f, 100.15953f, 39.268536f, 103.811455f, 36.63511f),
                    PathNode.CurveTo(107.46338f, 34.001682f, 112.158966f, 33.285316f, 116.43f, 34.71f),
                    PathNode.LineTo(121.9f, 36.54f),
                    PathNode.CurveTo(123.53885f, 37.08817f, 124.86176f, 38.316334f, 125.53f, 39.91f),
                    PathNode.LineTo(148.41f, 94.44f),
                    PathNode.LineTo(210.18f, 111.71f),
                    PathNode.CurveTo(226.60393f, 116.30856f, 237.96893f, 131.26448f, 238.0f, 148.32f),
                    PathNode.LineTo(238.0f, 184.0f),
                    PathNode.CurveTo(238.00089f, 185.87807f, 237.12234f, 187.64821f, 235.62604f, 188.78319f),
                    PathNode.CurveTo(234.12975f, 189.91818f, 232.18831f, 190.28708f, 230.38f, 189.78f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 148.32f),
                    PathNode.CurveTo(225.95844f, 136.67932f, 218.20453f, 126.476814f, 207.0f, 123.32f),
                    PathNode.LineTo(142.42f, 105.32f),
                    PathNode.CurveTo(140.65688f, 104.82391f, 139.21689f, 103.54967f, 138.51f, 101.86f),
                    PathNode.LineTo(115.51f, 47.16f),
                    PathNode.LineTo(112.62f, 46.16f),
                    PathNode.CurveTo(112.02116f, 45.964413f, 111.365166f, 46.06241f, 110.849625f, 46.424465f),
                    PathNode.CurveTo(110.33408f, 46.786526f, 110.019264f, 47.370323f, 110.0f, 48.0f),
                    PathNode.LineTo(110.0f, 88.0f),
                    PathNode.CurveTo(109.99953f, 89.88095f, 109.117004f, 91.65283f, 107.61602f, 92.78642f),
                    PathNode.CurveTo(106.11504f, 93.92002f, 104.16933f, 94.28413f, 102.36f, 93.77f),
                    PathNode.LineTo(58.36f, 81.23f),
                    PathNode.CurveTo(56.504574f, 80.70199f, 55.016174f, 79.31407f, 54.36f, 77.5f),
                    PathNode.LineTo(43.34f, 47.0f),
                    PathNode.LineTo(40.63f, 46.1f),
                    PathNode.CurveTo(40.42709f, 46.031586f, 40.21412f, 45.997784f, 40.0f, 46.0f),
                    PathNode.CurveTo(39.583183f, 46.002693f, 39.17762f, 46.135548f, 38.84f, 46.38f),
                    PathNode.CurveTo(38.31561f, 46.753353f, 38.002975f, 47.356285f, 38.0f, 48.0f),
                    PathNode.LineTo(38.0f, 103.72f),
                    PathNode.CurveTo(38.04828f, 115.35839f, 45.799465f, 125.55732f, 57.0f, 128.72f),
                    PathNode.LineTo(226.0f, 176.05f),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
