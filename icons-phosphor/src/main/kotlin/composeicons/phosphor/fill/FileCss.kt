package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCss: ImageVector
    get() {
        if (_fileCss != null) return _fileCss!!
        _fileCss = phosphorFillIcon(
            name = "FileCss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 180c0 11 7.18 20 16 20 3.823-.082 7.451-1.705 10.06-4.5 2.871-3.036 7.566-3.428 10.9-.91 1.767 1.399 2.863 3.478 3.017 5.726 .154 2.248-.647 4.457-2.207 6.084C80.147 212.464 72.27 215.937 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.073 .062 15.78 3.375 21.38 9.19 3.069 2.953 3.389 7.755 .74 11.09-1.463 1.738-3.595 2.772-5.865 2.844-2.27 .072-4.464-.823-6.035-2.464C71.599 161.768 67.902 160.083 64 160c-8.82 0-16 9-16 20ZM127.6 171.31c-4-1.16-8.14-2.35-10.45-3.84-1.26-.81-1.23-1-1.12-1.9 .03-1.476 .776-2.845 2-3.67 4.6-3.12 15.35-1.73 19.83-.56 4.275 1.124 8.651-1.43 9.775-5.705 1.124-4.275-1.43-8.651-5.705-9.775-2.12-.55-21-5.22-32.83 2.76-5.072 3.399-8.37 8.877-9 14.95-2 15.88 13.64 20.41 23 23.11 12.07 3.49 13.13 4.92 12.78 7.59-.31 2.41-1.26 3.34-2.14 3.93-4.6 3.06-15.17 1.56-19.55 .36-4.232-1.123-8.58 1.365-9.757 5.582-1.177 4.217 1.255 8.597 5.457 9.828 4.956 1.299 10.056 1.971 15.18 2 5.83 0 12.3-1 17.49-4.46 5.187-3.447 8.559-9.034 9.19-15.23C154 179 137.48 174.17 127.6 171.31ZM191.6 171.31c-4-1.16-8.14-2.35-10.45-3.84-1.25-.81-1.23-1-1.12-1.9 .03-1.476 .776-2.845 2-3.67 4.6-3.12 15.34-1.73 19.82-.56 4.275 1.124 8.651-1.43 9.775-5.705 1.124-4.275-1.43-8.651-5.705-9.775-2.11-.55-21-5.22-32.83 2.76-5.05 3.412-8.327 8.887-8.95 14.95-2 15.88 13.65 20.41 23 23.11 12.06 3.49 13.12 4.92 12.78 7.59-.31 2.41-1.26 3.34-2.15 3.93-4.6 3.06-15.16 1.56-19.54 .36-4.264-1.187-8.683 1.306-9.87 5.57-1.187 4.264 1.306 8.683 5.57 9.87 4.96 1.299 10.063 1.971 15.19 2 5.82 0 12.3-1 17.49-4.46 5.184-3.448 8.552-9.036 9.18-15.23C218 179 201.48 174.17 191.59 171.31ZM40 116v-76C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66v28c0 2.209-1.791 4-4 4h-168c-2.209 0-4-1.791-4-4ZM152 88h44L152 44Z"),
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
