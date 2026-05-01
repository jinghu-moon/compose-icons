package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorLightIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.0f, 124.67f),
                    PathNode.LineTo(199.37f, 56.23f),
                    PathNode.CurveTo(196.77226f, 52.336433f, 192.4006f, 49.99863f, 187.72f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(32.268013f, 50.0f, 26.0f, 56.268013f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 199.73198f, 32.268013f, 206.0f, 40.0f, 206.0f),
                    PathNode.LineTo(187.72f, 206.0f),
                    PathNode.CurveTo(192.4006f, 206.00137f, 196.77226f, 203.66356f, 199.37f, 199.77f),
                    PathNode.LineTo(245.0f, 131.33f),
                    PathNode.CurveTo(246.3452f, 129.31378f, 246.3452f, 126.68622f, 245.0f, 124.67f),
                    PathNode.Close,
                    PathNode.MoveTo(189.39f, 193.11f),
                    PathNode.CurveTo(189.01974f, 193.66496f, 188.39714f, 193.99876f, 187.73f, 194.0f),
                    PathNode.LineTo(40.0f, 194.0f),
                    PathNode.CurveTo(38.89543f, 194.0f, 38.0f, 193.10457f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 62.89543f, 38.89543f, 62.0f, 40.0f, 62.0f),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
