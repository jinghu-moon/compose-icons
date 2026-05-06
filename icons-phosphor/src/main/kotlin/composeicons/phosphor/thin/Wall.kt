package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorThinIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192c-2.209 0-4 1.791-4 4v144c0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4v-144c0-2.209-1.791-4-4-4ZM84 148v-40h88v40ZM36 148v-40h40v40ZM180 108h40v40h-40ZM220 100h-88v-40h88ZM124 60v40h-88v-40ZM36 156h88v40h-88ZM132 196v-40h88v40Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
