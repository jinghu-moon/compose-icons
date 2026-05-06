package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCsv: ImageVector
    get() {
        if (_fileCsv != null) return _fileCsv!!
        _fileCsv = phosphorDuotoneIcon(
            name = "FileCsv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-56v-56Z"),
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
                pathData = parseSvgPathData("M48 180c0 11 7.18 20 16 20 3.901-.087 7.596-1.772 10.22-4.66 3.067-3.124 8.076-3.202 11.239-.176 3.163 3.027 3.306 8.034 .321 11.236C80.15 212.46 72.272 215.933 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.272 .067 16.15 3.54 21.78 9.6 2.985 3.202 2.842 8.209-.321 11.236-3.163 3.027-8.172 2.948-11.239-.176C71.596 161.772 67.901 160.087 64 160c-8.82 0-16 9-16 20ZM127.6 171.31c-4-1.16-8.14-2.35-10.45-3.84-1.25-.81-1.23-1-1.12-1.9 .035-1.474 .78-2.841 2-3.67 4.6-3.12 15.34-1.73 19.83-.56 4.275 1.143 8.667-1.395 9.81-5.67 1.143-4.275-1.395-8.667-5.67-9.81-2.12-.55-21-5.22-32.84 2.76-5.069 3.402-8.366 8.878-9 14.95-2 15.88 13.65 20.41 23 23.11 12.06 3.49 13.12 4.92 12.78 7.59-.31 2.41-1.26 3.34-2.14 3.93-4.6 3.06-15.17 1.56-19.55 .36-4.264-1.19-8.685 1.301-9.875 5.565-1.19 4.264 1.301 8.685 5.565 9.875 4.96 1.299 10.063 1.971 15.19 2 5.82 0 12.3-1 17.49-4.46 5.187-3.447 8.559-9.034 9.19-15.23C154 179 137.49 174.17 127.6 171.31ZM210.69 144.47c-1.998-.715-4.199-.607-6.118 .3-1.919 .908-3.398 2.541-4.112 4.54L188 184.21 175.53 149.31c-1.486-4.161-6.064-6.331-10.225-4.845-4.161 1.486-6.331 6.064-4.845 10.225l20 56c1.136 3.185 4.153 5.312 7.535 5.312 3.382 0 6.399-2.127 7.535-5.312l20-56c1.483-4.159-.683-8.733-4.84-10.22ZM216 88v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM188.69 80 160 51.31v28.69Z"),
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
        return _fileCsv!!
    }

private var _fileCsv: ImageVector? = null
