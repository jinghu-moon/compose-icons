package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorDuotoneIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 112v64c0 4.418-3.582 8-8 8h-24c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24h-64C104 170.745 93.255 160 80 160c-13.255 0-24 10.745-24 24h-24c-4.418 0-8-3.582-8-8v-64Z"),
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
                pathData = parseSvgPathData("M254.07 106.79 208.53 53.73C205.49 50.098 200.997 48 196.26 48h-164.26C23.163 48 16 55.163 16 64v112c0 8.837 7.163 16 16 16h17c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h50c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h17c8.837 0 16-7.163 16-16v-64c-0-1.911-.685-3.76-1.93-5.21ZM230.59 104h-54.59v-40h20.26ZM104 104v-40h56v40ZM88 64v40h-56v-40ZM80 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM192 200c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM223 176c-3.625-14.159-16.384-24.063-31-24.063-14.616 0-27.375 9.903-31 24.063h-50C107.375 161.841 94.616 151.937 80 151.937c-14.616 0-27.375 9.903-31 24.063h-17v-56h208v56Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
