package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCss: ImageVector
    get() {
        if (_fileCss != null) return _fileCss!!
        _fileCss = phosphorDuotoneIcon(
            name = "FileCss",
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
                pathData = parseSvgPathData("M48 180c0 11 7.18 20 16 20 3.902-.083 7.599-1.768 10.22-4.66 1.95-2.174 4.93-3.113 7.774-2.45 2.844 .664 5.101 2.824 5.887 5.637 .786 2.813-.023 5.83-2.111 7.873C80.147 212.464 72.27 215.937 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.27 .063 16.147 3.536 21.77 9.6 2.088 2.042 2.897 5.06 2.111 7.873-.786 2.813-3.043 4.974-5.887 5.637-2.844 .664-5.824-.275-7.774-2.45C71.596 161.772 67.901 160.087 64 160c-8.82 0-16 9-16 20ZM127.6 171.31c-4-1.16-8.14-2.35-10.45-3.84-1.26-.81-1.23-1-1.12-1.9 .03-1.476 .776-2.845 2-3.67 4.6-3.12 15.35-1.73 19.83-.56 4.275 1.124 8.651-1.43 9.775-5.705 1.124-4.275-1.43-8.651-5.705-9.775-2.12-.55-21-5.22-32.83 2.76-5.072 3.399-8.37 8.877-9 14.95-2 15.88 13.64 20.41 23 23.11 12.07 3.49 13.13 4.92 12.78 7.59-.31 2.41-1.26 3.34-2.14 3.93-4.6 3.06-15.17 1.56-19.55 .36-4.232-1.123-8.58 1.365-9.757 5.582-1.177 4.217 1.255 8.597 5.457 9.828 4.956 1.299 10.056 1.971 15.18 2 5.83 0 12.3-1 17.49-4.46 5.187-3.447 8.559-9.034 9.19-15.23C154 179 137.48 174.17 127.6 171.31ZM191.6 171.31c-4-1.16-8.14-2.35-10.45-3.84-1.25-.81-1.23-1-1.12-1.9 .03-1.476 .776-2.845 2-3.67 4.6-3.12 15.34-1.73 19.82-.56 4.275 1.124 8.651-1.43 9.775-5.705 1.124-4.275-1.43-8.651-5.705-9.775-2.11-.55-21-5.22-32.83 2.76-5.05 3.412-8.327 8.887-8.95 14.95-2 15.88 13.65 20.41 23 23.11 12.06 3.49 13.12 4.92 12.78 7.59-.31 2.41-1.26 3.34-2.15 3.93-4.6 3.06-15.16 1.56-19.54 .36-4.264-1.187-8.683 1.306-9.87 5.57-1.187 4.264 1.306 8.683 5.57 9.87 4.96 1.299 10.063 1.971 15.19 2 5.82 0 12.3-1 17.49-4.46 5.184-3.448 8.552-9.036 9.18-15.23C218 179 201.48 174.17 191.59 171.31ZM40 112v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM160 80h28.68L160 51.31Z"),
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
        return _fileCss!!
    }

private var _fileCss: ImageVector? = null
