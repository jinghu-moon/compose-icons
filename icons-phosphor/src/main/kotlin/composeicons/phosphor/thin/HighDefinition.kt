package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorThinIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 76h-24c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4h24c28.719 0 52-23.281 52-52C228 99.281 204.719 76 176 76ZM176 172h-20v-88h20c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44ZM116 176v-44h-64v44c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v44h64v-44c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v96c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM28 48c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4ZM228 208c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4Z"),
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
