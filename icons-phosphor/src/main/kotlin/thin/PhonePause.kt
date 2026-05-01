package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorThinIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.78f, 170.13f),
                    PathNode.LineTo(165.56f, 149.0f),
                    PathNode.CurveTo(161.84114f, 147.39053f, 157.56117f, 147.76665f, 154.18f, 150.0f),
                    PathNode.CurveTo(154.04695f, 150.08434f, 153.91997f, 150.1779f, 153.8f, 150.28f),
                    PathNode.LineTo(129.0f, 171.42f),
                    PathNode.CurveTo(127.88083f, 172.10895f, 126.48994f, 172.18788f, 125.3f, 171.63f),
                    PathNode.CurveTo(109.06f, 163.79f, 92.3f, 147.11f, 84.41f, 131.06f),
                    PathNode.CurveTo(83.84667f, 129.87779f, 83.91428f, 128.49178f, 84.59f, 127.37f),
                    PathNode.LineTo(105.79f, 102.16f),
                    PathNode.CurveTo(105.89f, 102.04f, 105.98f, 101.91f, 106.07f, 101.78f),
                    PathNode.CurveTo(108.29628f, 98.40376f, 108.6722f, 94.133255f, 107.07f, 90.42f),
                    PathNode.LineTo(85.9f, 43.28f),
                    PathNode.CurveTo(83.80066f, 38.375713f, 78.71573f, 35.446175f, 73.42f, 36.09f),
                    PathNode.CurveTo(47.387196f, 39.522343f, 27.94557f, 61.741955f, 28.0f, 88.0f),
                    PathNode.CurveTo(28.0f, 165.2f, 90.8f, 228.0f, 168.0f, 228.0f),
                    PathNode.CurveTo(194.25804f, 228.05443f, 216.47766f, 208.61282f, 219.91f, 182.58f),
                    PathNode.CurveTo(220.54898f, 177.30971f, 217.64899f, 172.24593f, 212.78f, 170.13f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 181.58f),
                    PathNode.CurveTo(209.07867f, 203.62758f, 190.24014f, 220.07704f, 168.0f, 220.0f),
                    PathNode.CurveTo(95.22f, 220.0f, 36.0f, 160.78f, 36.0f, 88.0f),
                    PathNode.CurveTo(35.922955f, 65.75986f, 52.37242f, 46.92132f, 74.42f, 44.0f),
                    PathNode.CurveTo(74.57985f, 43.990067f, 74.74015f, 43.990067f, 74.9f, 44.0f),
                    PathNode.CurveTo(76.513596f, 44.013756f, 77.96091f, 44.995716f, 78.57f, 46.49f),
                    PathNode.LineTo(99.68f, 93.63f),
                    PathNode.CurveTo(100.179504f, 94.798416f, 100.09413f, 96.13465f, 99.45f, 97.23f),
                    PathNode.LineTo(78.26f, 122.43f),
                    PathNode.CurveTo(78.16f, 122.56f, 78.06f, 122.68f, 77.97f, 122.82f),
                    PathNode.CurveTo(75.674f, 126.33107f, 75.37826f, 130.78625f, 77.19f, 134.57f),
                    PathNode.CurveTo(85.88f, 152.36f, 103.8f, 170.15f, 121.79f, 178.84f),
                    PathNode.CurveTo(125.60014f, 180.64026f, 130.07538f, 180.31003f, 133.58f, 177.97f),
                    PathNode.LineTo(133.95f, 177.69f),
                    PathNode.LineTo(158.78f, 156.57f),
                    PathNode.CurveTo(159.85753f, 155.91171f, 161.18573f, 155.81126f, 162.35f, 156.3f),
                    PathNode.LineTo(209.56f, 177.46f),
                    PathNode.CurveTo(211.19629f, 178.1411f, 212.18925f, 179.81776f, 212.0f, 181.58f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 48.0f),
                    PathNode.CurveTo(196.0f, 45.79086f, 197.79086f, 44.0f, 200.0f, 44.0f),
                    PathNode.CurveTo(202.20914f, 44.0f, 204.0f, 45.79086f, 204.0f, 48.0f),
                    PathNode.LineTo(204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 106.20914f, 202.20914f, 108.0f, 200.0f, 108.0f),
                    PathNode.CurveTo(197.79086f, 108.0f, 196.0f, 106.20914f, 196.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 104.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 45.79086f, 157.79086f, 44.0f, 160.0f, 44.0f),
                    PathNode.CurveTo(162.20914f, 44.0f, 164.0f, 45.79086f, 164.0f, 48.0f),
                    PathNode.LineTo(164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 106.20914f, 162.20914f, 108.0f, 160.0f, 108.0f),
                    PathNode.CurveTo(157.79086f, 108.0f, 156.0f, 106.20914f, 156.0f, 104.0f),
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
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
