package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorLightIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 149.31f),
                    PathNode.CurveTo(238.0f, 165.06f, 234.93f, 178.48f, 229.12f, 188.12f),
                    PathNode.CurveTo(222.07f, 199.82f, 211.12f, 206.0f, 197.44f, 206.0f),
                    PathNode.CurveTo(170.7f, 206.0f, 151.14f, 169.49f, 130.44f, 130.83f),
                    PathNode.CurveTo(113.14f, 98.57f, 93.55f, 62.0f, 74.0f, 62.0f),
                    PathNode.CurveTo(50.72f, 62.0f, 30.0f, 110.83f, 30.0f, 149.31f),
                    PathNode.CurveTo(30.0f, 162.88f, 32.48f, 174.15f, 37.16f, 181.93f),
                    PathNode.CurveTo(42.06f, 190.05f, 49.06f, 194.0f, 58.56f, 194.0f),
                    PathNode.CurveTo(74.72f, 194.0f, 90.87f, 168.94f, 104.56f, 144.43f),
                    PathNode.CurveTo(106.29914f, 141.82803f, 109.746124f, 140.99986f, 112.4775f, 142.52776f),
                    PathNode.CurveTo(115.20888f, 144.05565f, 116.307076f, 147.42633f, 115.0f, 150.27f),
                    PathNode.CurveTo(100.0f, 177.23f, 82.0f, 206.0f, 58.56f, 206.0f),
                    PathNode.CurveTo(44.89f, 206.0f, 33.93f, 199.82f, 26.88f, 188.12f),
                    PathNode.CurveTo(21.07f, 178.48f, 18.0f, 165.06f, 18.0f, 149.31f),
                    PathNode.CurveTo(18.0f, 108.82f, 39.81f, 50.0f, 74.0f, 50.0f),
                    PathNode.CurveTo(100.74f, 50.0f, 120.3f, 86.51f, 141.0f, 125.17f),
                    PathNode.CurveTo(158.29f, 157.43f, 177.88f, 194.0f, 197.44f, 194.0f),
                    PathNode.CurveTo(206.94f, 194.0f, 213.94f, 190.05f, 218.84f, 181.93f),
                    PathNode.CurveTo(223.52f, 174.15f, 226.0f, 162.88f, 226.0f, 149.31f),
                    PathNode.CurveTo(226.0f, 110.83f, 205.29f, 62.0f, 182.0f, 62.0f),
                    PathNode.CurveTo(173.0f, 62.0f, 163.09f, 69.76f, 151.86f, 85.73f),
                    PathNode.CurveTo(149.95186f, 88.44172f, 146.20671f, 89.09315f, 143.495f, 87.185f),
                    PathNode.CurveTo(140.78328f, 85.276855f, 140.13185f, 81.531715f, 142.04f, 78.82f),
                    PathNode.CurveTo(150.75f, 66.45f, 164.37f, 50.0f, 182.0f, 50.0f),
                    PathNode.CurveTo(216.19f, 50.0f, 238.0f, 108.82f, 238.0f, 149.31f),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
