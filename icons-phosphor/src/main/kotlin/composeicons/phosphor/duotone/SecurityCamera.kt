package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorDuotoneIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.66 85.66l-120 120c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L52.69 168 184 36.69l37.66 37.65c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M248 136c-4.418 0-8 3.582-8 8v16h-44.69L177 141.66 227.34 91.31c6.243-6.248 6.243-16.372 0-22.62l-56-56C168.339 9.689 164.269 8.002 160.025 8.002c-4.244 0-8.314 1.686-11.315 4.688L2.92 158.94C.067 161.802-.783 166.1 .766 169.833c1.549 3.733 5.193 6.166 9.234 6.167h39.37l35.32 35.31c6.248 6.243 16.372 6.243 22.62 0L165.66 153 184 171.31c2.99 3.014 7.064 4.704 11.31 4.69h44.69v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM160 24l12.69 12.69L49.37 160h-24.91ZM96 200 64 168 184 48l32 32Z"),
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
