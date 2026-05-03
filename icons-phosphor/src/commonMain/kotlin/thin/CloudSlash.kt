package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorThinIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(86.16f, 87.93f),
                    PathNode.QuadTo(84.78f, 90.48f, 83.57f, 93.12f),
                    PathNode.CurveTo(61.17492f, 88.73119f, 38.228992f, 97.426994f, 24.367449f, 115.55595f),
                    PathNode.CurveTo(10.505906f, 133.68489f, 8.128938f, 158.1079f, 18.234657f, 178.56946f),
                    PathNode.CurveTo(28.340376f, 199.03102f, 49.178932f, 211.98814f, 72.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(171.30063f, 212.02638f, 182.48816f, 209.75009f, 192.88f, 205.31f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 204.0f),
                    PathNode.LineTo(72.0f, 204.0f),
                    PathNode.CurveTo(43.281193f, 204.0f, 20.0f, 180.71881f, 20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 123.2812f, 43.281193f, 100.0f, 72.0f, 100.0f),
                    PathNode.CurveTo(74.86145f, 100.00872f, 77.71748f, 100.24951f, 80.54f, 100.72f),
                    PathNode.CurveTo(77.533646f, 109.50101f, 75.999626f, 118.71861f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 130.20914f, 77.79086f, 132.0f, 80.0f, 132.0f),
                    PathNode.CurveTo(82.20914f, 132.0f, 84.0f, 130.20914f, 84.0f, 128.0f),
                    PathNode.CurveTo(83.996925f, 116.288284f, 86.70061f, 104.734314f, 91.9f, 94.24f),
                    PathNode.LineTo(187.13f, 199.0f),
                    PathNode.CurveTo(178.4713f, 202.32158f, 169.27393f, 204.01665f, 160.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.01218f, 148.63725f, 236.41418f, 168.55434f, 222.66f, 183.94f),
                    PathNode.CurveTo(221.18816f, 185.59685f, 218.65186f, 185.74684f, 216.995f, 184.275f),
                    PathNode.CurveTo(215.33815f, 182.80316f, 215.18816f, 180.26686f, 216.66f, 178.61f),
                    PathNode.CurveTo(242.51242f, 149.57932f, 242.29071f, 105.719826f, 216.14607f, 76.952f),
                    PathNode.CurveTo(190.00146f, 48.18418f, 146.36284f, 43.78261f, 115.0f, 66.75f),
                    PathNode.CurveTo(113.21888f, 68.058914f, 110.71391f, 67.67612f, 109.405f, 65.895f),
                    PathNode.CurveTo(108.096085f, 64.113884f, 108.47888f, 61.608913f, 110.26f, 60.3f),
                    PathNode.CurveTo(135.78127f, 41.546448f, 169.68097f, 38.74139f, 197.93759f, 53.045055f),
                    PathNode.CurveTo(226.19418f, 67.34872f, 244.0038f, 96.329346f, 244.0f, 128.0f),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
