package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorDuotoneIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206.63 94.63l-24 24C128 128 40 216 40 216c0 0 88-88 97.37-142.63l24-24c12.498-12.498 32.762-12.498 45.26 0 12.498 12.498 12.498 32.762 0 45.26Z"),
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
                pathData = parseSvgPathData("M189.66 66.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-16 16c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l16-16c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346ZM224 72c.03 10.614-4.191 20.799-11.72 28.28l-24 24c-1.168 1.17-2.671 1.949-4.3 2.23C132.49 135.35 46.52 220.79 45.66 221.66h0c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315h0C36 208.73 120.69 123.28 129.49 72c.281-1.629 1.06-3.132 2.23-4.3l24-24c11.442-11.439 28.649-14.858 43.595-8.663C214.262 41.232 224.005 55.821 224 72ZM208 72c.024-9.725-5.824-18.504-14.808-22.229C184.209 46.046 173.865 48.111 167 55L144.77 77.29c-4.41 21.15-18.9 46.19-35.49 69.43 23.24-16.59 48.28-31.08 69.43-35.49L201 89c4.511-4.504 7.032-10.626 7-17Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
