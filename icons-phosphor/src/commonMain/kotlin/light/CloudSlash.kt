package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorLightIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(83.74f, 88.2f),
                    PathNode.CurveTo(83.29f, 89.07f, 82.84f, 89.95f, 82.42f, 90.84f),
                    PathNode.CurveTo(59.394814f, 87.01197f, 36.17087f, 96.43993f, 22.329437f, 115.23428f),
                    PathNode.CurveTo(8.488002f, 134.02864f, 6.374945f, 159.00409f, 16.862026f, 179.85677f),
                    PathNode.CurveTo(27.34911f, 200.70944f, 48.658962f, 213.9052f, 72.0f, 214.0f),
                    PathNode.LineTo(160.0f, 214.0f),
                    PathNode.CurveTo(171.09052f, 214.02477f, 182.07927f, 211.88477f, 192.35f, 207.7f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 202.0f),
                    PathNode.LineTo(72.0f, 202.0f),
                    PathNode.CurveTo(53.40932f, 202.03291f, 36.3353f, 191.74869f, 27.67211f, 175.29987f),
                    PathNode.CurveTo(19.008919f, 158.85104f, 20.187098f, 138.95383f, 30.730915f, 123.64231f),
                    PathNode.CurveTo(41.27474f, 108.3308f, 59.443115f, 100.13338f, 77.9f, 102.36f),
                    PathNode.CurveTo(75.31512f, 110.66125f, 74.00026f, 119.30562f, 74.0f, 128.0f),
                    PathNode.CurveTo(74.0f, 131.3137f, 76.686295f, 134.0f, 80.0f, 134.0f),
                    PathNode.CurveTo(83.313705f, 134.0f, 86.0f, 131.3137f, 86.0f, 128.0f),
                    PathNode.CurveTo(85.99668f, 117.59222f, 88.19122f, 107.30104f, 92.44f, 97.8f),
                    PathNode.LineTo(183.66f, 198.14f),
                    PathNode.CurveTo(176.03706f, 200.71019f, 168.04454f, 202.01413f, 160.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 128.0f),
                    PathNode.CurveTo(246.0121f, 149.12833f, 238.23248f, 169.51912f, 224.15f, 185.27f),
                    PathNode.CurveTo(223.01225f, 186.54205f, 221.38663f, 187.2694f, 219.68f, 187.27f),
                    PathNode.CurveTo(217.31429f, 187.26917f, 215.16989f, 185.87828f, 214.20447f, 183.71852f),
                    PathNode.CurveTo(213.23906f, 181.55875f, 213.63286f, 179.03331f, 215.21f, 177.27f),
                    PathNode.CurveTo(240.41978f, 149.00517f, 240.21906f, 106.26781f, 214.74486f, 78.24104f),
                    PathNode.CurveTo(189.27066f, 50.21428f, 146.74655f, 45.94566f, 116.21f, 68.35f),
                    PathNode.CurveTo(113.5397f, 70.31337f, 109.78337f, 69.740295f, 107.82f, 67.07f),
                    PathNode.CurveTo(105.85663f, 64.399704f, 106.4297f, 60.64337f, 109.1f, 58.68f),
                    PathNode.CurveTo(135.22984f, 39.49334f, 169.92871f, 36.63035f, 198.84995f, 51.27476f),
                    PathNode.CurveTo(227.77118f, 65.919174f, 246.0002f, 95.58246f, 246.0f, 128.0f),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
