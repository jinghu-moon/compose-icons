package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorFillIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80.3 120.26C78.977 112.561 79.215 104.675 81 97.07 83.32 87 87.89 80 92.1 80c2.57 0 2.94 .67 3.12 1 .88 1.61 4 10.93-12.63 46.52-1.08-2.308-1.85-4.75-2.29-7.26ZM232 56v144c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-144C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM84 160c2-3.59 3.94-7.32 5.9-11.14 10.34-.32 22.21-7.57 35.47-21.68 5 9.69 11.38 15.25 18.87 16.55 8 1.38 16-2.38 23.94-11.2 6 5.53 16.15 11.47 31.8 11.47 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-17.91 0-24.3-10.88-24.84-11.86-1.199-2.58-3.703-4.306-6.54-4.51-2.89-.201-5.664 1.176-7.25 3.6-6.78 10-11.87 13.16-14.39 12.73-4-.69-9.15-10-11.23-18-.755-2.938-3.106-5.195-6.072-5.831-2.966-.636-6.036 .461-7.928 2.831-8.88 10.94-16.3 17.79-22.13 21.66 15.8-35.65 13.27-48.59 9.6-55.3C107.35 69.84 102.59 64 92.1 64 79.66 64 69.68 75 65.41 93.46c-2.269 9.781-2.552 19.918-.83 29.81 1.7 8.9 5.17 15.73 10.16 20.12-3 5.81-6.09 11.43-9 16.61h-9.74c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h.44c-4.26 7.12-7.11 11.59-7.18 11.69-2.38 3.722-1.292 8.67 2.43 11.05 3.722 2.38 8.67 1.292 11.05-2.43 .36-.55 5.47-8.57 12.29-20.31h124.97c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
