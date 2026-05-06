package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorFillIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 136c-4.418 0-8 3.582-8 8v16h-44.69L177 141.66 227.34 91.31c6.243-6.248 6.243-16.372 0-22.62L189.66 31h0L171.31 12.69C168.309 9.689 164.239 8.002 159.995 8.002c-4.244 0-8.314 1.686-11.315 4.688L2.92 158.94C.067 161.802-.783 166.1 .766 169.833c1.549 3.733 5.193 6.166 9.234 6.167h39.37l35.32 35.31c6.248 6.243 16.372 6.243 22.62 0L165.66 153 184 171.31c2.99 3.014 7.064 4.704 11.31 4.69h44.69v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM160 24l12.69 12.69L49.37 160h-24.91Z"),
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
