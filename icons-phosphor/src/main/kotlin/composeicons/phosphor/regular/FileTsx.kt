package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileTsx: ImageVector
    get() {
        if (_fileTsx != null) return _fileTsx!!
        _fileTsx = phosphorRegularIcon(
            name = "FileTsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.51 156.65 197.83 180l16.68 23.35c2.332 3.588 1.427 8.376-2.053 10.866-3.48 2.49-8.304 1.8-10.947-1.566L188 193.76l-13.49 18.89c-1.604 2.468-4.434 3.856-7.367 3.613-2.933-.243-5.497-2.076-6.673-4.774-1.177-2.698-.777-5.824 1.04-8.139L178.17 180 161.49 156.65c-2.332-3.588-1.427-8.376 2.053-10.866 3.48-2.49 8.304-1.8 10.947 1.566L188 166.24l13.49-18.89c2.643-3.366 7.466-4.056 10.947-1.566 3.48 2.49 4.385 7.278 2.053 10.866ZM123.6 171.31c-4-1.16-8.14-2.35-10.45-3.84-1.25-.82-1.23-1-1.11-1.9 .03-1.476 .776-2.845 2-3.67 4.6-3.12 15.34-1.73 19.83-.56 4.275 1.14 8.665-1.4 9.805-5.675 1.14-4.275-1.4-8.665-5.675-9.805-2.12-.55-21-5.22-32.84 2.76-5.069 3.402-8.366 8.878-9 14.95-2 15.88 13.65 20.41 23 23.11 12.06 3.49 13.12 4.92 12.78 7.59-.31 2.41-1.26 3.33-2.14 3.93-4.6 3.06-15.17 1.56-19.55 .35-4.266-1.19-8.69 1.304-9.88 5.57-1.19 4.266 1.304 8.69 5.57 9.88 4.958 1.306 10.062 1.978 15.19 2 5.82 0 12.3-1 17.49-4.46 5.187-3.447 8.559-9.034 9.19-15.23C150 179 133.49 174.17 123.6 171.31ZM80 144h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h12v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48h12c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM216 88v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM188.69 80 160 51.31v28.69Z"),
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
        return _fileTsx!!
    }

private var _fileTsx: ImageVector? = null
