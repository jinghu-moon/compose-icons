package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorLightIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.0f, 124.67f),
                    PathNode.LineTo(199.37f, 56.23f),
                    PathNode.CurveTo(196.77226f, 52.336433f, 192.4006f, 49.99863f, 187.72f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(29.785244f, 49.996716f, 27.748787f, 51.213768f, 26.702639f, 53.16588f),
                    PathNode.CurveTo(25.656492f, 55.11799f, 25.770807f, 57.487656f, 27.0f, 59.33f),
                    PathNode.LineTo(72.79f, 128.0f),
                    PathNode.LineTo(27.0f, 196.67f),
                    PathNode.CurveTo(25.770807f, 198.51236f, 25.656492f, 200.88202f, 26.702639f, 202.83412f),
                    PathNode.CurveTo(27.748787f, 204.78622f, 29.785244f, 206.00328f, 32.0f, 206.0f),
                    PathNode.LineTo(187.72f, 206.0f),
                    PathNode.CurveTo(192.4006f, 206.00137f, 196.77226f, 203.66356f, 199.37f, 199.77f),
                    PathNode.LineTo(245.0f, 131.33f),
                    PathNode.CurveTo(246.3452f, 129.31378f, 246.3452f, 126.68622f, 245.0f, 124.67f),
                    PathNode.Close,
                    PathNode.MoveTo(189.39f, 193.11f),
                    PathNode.CurveTo(189.01974f, 193.66496f, 188.39714f, 193.99876f, 187.73f, 194.0f),
                    PathNode.LineTo(43.21f, 194.0f),
                    PathNode.LineTo(85.0f, 131.33f),
                    PathNode.CurveTo(86.3452f, 129.31378f, 86.3452f, 126.68622f, 85.0f, 124.67f),
                    PathNode.LineTo(43.21f, 62.0f),
                    PathNode.LineTo(187.72f, 62.0f),
                    PathNode.CurveTo(188.38715f, 62.001236f, 189.00974f, 62.335037f, 189.38f, 62.89f),
                    PathNode.LineTo(232.79f, 128.0f),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
