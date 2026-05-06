package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorDuotoneIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 88v80c0 4.418-3.582 8-8 8h-88v48L24 128 120 32v48h88c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M208 72h-80v-40c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737L18.34 122.34c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l96 96c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-40h80c8.837 0 16-7.163 16-16v-80c0-8.837-7.163-16-16-16ZM208 168h-88c-4.418 0-8 3.582-8 8v28.69L35.31 128 112 51.31v28.69c0 4.418 3.582 8 8 8h88Z"),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
