package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ambulance: ImageVector
    get() {
        if (_ambulance != null) return _ambulance!!
        _ambulance = phosphorDuotoneIcon(
            name = "Ambulance",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 120v64c0 4.418-3.582 8-8 8h-24c.001-7.792-3.781-15.099-10.143-19.598-6.362-4.499-14.511-5.629-21.857-3.032h0c-9.59 3.391-16.001 12.458-16 22.63h-64C104 178.745 93.255 168 80 168c-13.255 0-24 10.745-24 24h-24c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h152v56Z"),
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
                pathData = parseSvgPathData("M80 120c0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8ZM256 120v64c0 8.837-7.163 16-16 16h-17c-3.625 14.159-16.384 24.063-31 24.063-14.616 0-27.375-9.903-31-24.063h-50c-3.625 14.159-16.384 24.063-31 24.063C65.384 224.063 52.625 214.159 49 200h-17c-8.837 0-16-7.163-16-16v-112C16 63.163 23.163 56 32 56h152c4.418 0 8 3.582 8 8v8h34.58c6.551-.021 12.446 3.97 14.86 10.06l14 35c.372 .936 .562 1.933 .56 2.94ZM192 88v24h44.18L226.58 88ZM32 184h17c3.625-14.159 16.384-24.063 31-24.063 14.616 0 27.375 9.903 31 24.063h50c2.168-8.304 7.57-15.395 15-19.69v-92.31h-144ZM96 192c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16ZM208 192c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16ZM240 184v-56h-48v32c14.591 .014 27.332 9.878 31 24Z"),
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
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
