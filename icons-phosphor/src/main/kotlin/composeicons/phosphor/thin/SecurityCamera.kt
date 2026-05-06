package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorThinIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 140c-2.209 0-4 1.791-4 4v20h-48.69c-1.058-.002-2.072-.422-2.82-1.17L171.31 141.66 224.49 88.49c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5l-56-56c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L5.76 161.76c-1.714 1.716-2.226 4.295-1.298 6.535 .928 2.241 3.113 3.702 5.538 3.705h41l36.48 36.49c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l61.18-61.18 21.17 21.17c2.242 2.26 5.296 3.528 8.48 3.52h48.69v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM157.17 21.17c1.584-1.511 4.076-1.511 5.66 0l15.51 15.52L51 164h-36.18ZM98.83 202.83c-1.584 1.511-4.076 1.511-5.66 0L58.34 168 184 42.34l34.83 34.83c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83Z"),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
