package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorThinIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M202.83 53.15c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-56 56c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l56-56c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM244 58.41c.033 12.32-4.864 24.142-13.6 32.83l-53.23 53.24c-2.246 2.254-5.298 3.518-8.48 3.51h-16.69c-2.209 0-4 1.791-4 4v16.83c-.006 2.617-.863 5.161-2.44 7.25-.11 .14-.23 .28-.35 .41l-8 8c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L98.7 163 18.83 242.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L93.05 157.29 71.51 135.75c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l8-8c.131-.131 .271-.251 .42-.36 2.089-1.563 4.631-2.402 7.24-2.39h16.83c2.209 0 4-1.791 4-4v-16.7c-.003-3.184 1.26-6.238 3.51-8.49L164.75 25.58C178.03 12.309 197.995 8.342 215.34 15.527c17.345 7.185 28.656 24.109 28.66 42.883ZM236 58.41c.001-15.543-9.361-29.556-23.72-35.505-14.359-5.949-30.888-2.664-41.88 8.325L117.17 84.47c-.75 .751-1.171 1.769-1.17 2.83v16.7c0 6.627-5.373 12-12 12h-16.83c-.794 0-1.571 .237-2.23 .68l-7.77 7.77c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l48.72 48.72c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l7.77-7.77c.443-.659 .68-1.436 .68-2.23v-16.83c0-6.627 5.373-12 12-12h16.69c1.058-.002 2.072-.422 2.82-1.17L224.75 85.59C231.977 78.394 236.027 68.608 236 58.41Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
