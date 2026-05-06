package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileXls: ImageVector
    get() {
        if (_fileXls != null) return _fileXls!!
        _fileXls = phosphorDuotoneIcon(
            name = "FileXls",
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
                pathData = parseSvgPathData("M156 208c0 4.418-3.582 8-8 8h-28c-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48h20c4.418 0 8 3.582 8 8ZM92.65 145.49c-1.727-1.233-3.872-1.73-5.965-1.381-2.093 .349-3.962 1.515-5.195 3.241L68 166.24 54.51 147.35c-1.604-2.468-4.434-3.856-7.367-3.613-2.933 .243-5.497 2.076-6.673 4.774-1.177 2.698-.777 5.824 1.04 8.139L58.17 180 41.49 203.35c-2.332 3.588-1.427 8.376 2.053 10.866 3.48 2.49 8.304 1.8 10.947-1.566L68 193.76l13.49 18.89c2.643 3.366 7.466 4.056 10.947 1.566 3.48-2.49 4.385-7.278 2.053-10.866L77.83 180 94.51 156.65c1.233-1.727 1.73-3.872 1.381-5.965-.349-2.093-1.515-3.962-3.241-5.195ZM191.59 171.31c-4-1.16-8.14-2.35-10.45-3.84-1.25-.82-1.23-1-1.12-1.9 .03-1.476 .776-2.845 2-3.67 4.6-3.12 15.34-1.73 19.82-.56 4.275 1.124 8.651-1.43 9.775-5.705 1.124-4.275-1.43-8.651-5.705-9.775-2.11-.55-21-5.22-32.83 2.76-5.047 3.41-8.325 8.881-8.95 14.94-2 15.89 13.65 20.42 23 23.12 12.06 3.49 13.12 4.92 12.78 7.59-.31 2.41-1.26 3.33-2.15 3.93-4.6 3.06-15.16 1.56-19.54 .35-4.266-1.185-8.685 1.314-9.87 5.58-1.185 4.266 1.314 8.685 5.58 9.87 4.958 1.306 10.062 1.978 15.19 2 5.82 0 12.3-1 17.49-4.46 5.184-3.448 8.552-9.036 9.18-15.23C218 179 201.48 174.17 191.59 171.31ZM40 112v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM160 80h28.68L160 51.31Z"),
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
        return _fileXls!!
    }

private var _fileXls: ImageVector? = null
