package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorRegularIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 72h-24c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8h24c30.928 0 56-25.072 56-56C232 97.072 206.928 72 176 72ZM176 168h-16v-80h16c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40ZM112 176v-40h-56v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40h56v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM24 48c0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8ZM232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
