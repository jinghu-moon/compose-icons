package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorBoldIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 92h-28.7C209.607 87.21 205.08 84.006 200 84h-64c-5.08 .006-9.607 3.21-11.3 8h-56.7v-40c0-4.418 3.582-8 8-8 3.884-.003 7.276 2.628 8.24 6.39 1.32 6.495 7.655 10.69 14.15 9.37 6.495-1.32 10.69-7.655 9.37-14.15C104.394 29.48 89.401 18.489 73.006 20.132 56.612 21.776 44.098 35.523 44 52v40h-28C9.373 92 4 97.373 4 104v40c.043 31.564 24.508 57.711 56 59.85v12.15c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h88v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12.15c31.492-2.139 55.957-28.286 56-59.85v-40c0-6.627-5.373-12-12-12ZM148 108h40v24h-40ZM228 144c0 19.882-16.118 36-36 36h-128C44.118 180 28 163.882 28 144v-28h96v28c0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12v-28h16Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
