package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorThinIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M125.17 106.83c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l40-40c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83l-40-40c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-40 40c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83ZM128 29.66 162.34 64 128 98.34 93.66 64ZM130.83 149.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-40 40c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l40 40c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l40-40c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM128 226.34 93.66 192 128 157.66 162.34 192ZM234.83 125.17l-40-40c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-40 40c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l40 40c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l40-40c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM192 162.34 157.66 128 192 93.66 226.34 128ZM106.83 125.17l-40-40C66.08 84.419 65.062 83.997 64 83.997c-1.062 0-2.08 .422-2.83 1.173l-40 40c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l40 40c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l40-40c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM64 162.34 29.66 128 64 93.66 98.34 128Z"),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
