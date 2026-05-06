package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileSql: ImageVector
    get() {
        if (_fileSql != null) return _fileSql!!
        _fileSql = phosphorLightIcon(
            name = "FileSql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 118c3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c.001-1.594-.632-3.123-1.76-4.25l-56-56C155.114 26.628 153.589 25.999 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6ZM158 46.48 193.52 82h-35.52ZM226 208c0 3.314-2.686 6-6 6h-28c-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v50h22c3.314 0 6 2.686 6 6ZM89.83 196c-.558 5.617-3.604 10.688-8.3 13.82C76.71 213.05 70.66 214 65.16 214c-4.955-.047-9.884-.719-14.67-2-3.192-.892-5.057-4.203-4.165-7.395 .892-3.192 4.203-5.057 7.395-4.165 3.71 1 15.58 3.11 21.19-.62 1.784-1.209 2.896-3.187 3-5.34 .57-4.43-2.08-6.26-14.2-9.76C54.4 182.03 40.34 177.97 42.14 163.78c.554-5.488 3.513-10.447 8.08-13.54 11.11-7.49 29.18-3 31.2-2.48 2.117 .507 3.793 2.12 4.381 4.215 .588 2.096-.006 4.345-1.551 5.879-1.545 1.533-3.799 2.11-5.89 1.506-3.79-1-15.85-2.95-21.44 .84-1.699 1.152-2.764 3.031-2.88 5.08-.41 3.22 2.14 4.78 13 7.91 9.89 2.89 24.81 7.2 22.79 22.81ZM136 146c-16.54 0-30 15.25-30 34 0 18.75 13.45 34 30 34 5.818-.025 11.476-1.906 16.15-5.37l3.61 3.61c1.511 1.537 3.73 2.146 5.813 1.595 2.084-.551 3.712-2.177 4.265-4.26 .553-2.083-.053-4.303-1.588-5.815l-3.91-3.91c3.735-5.944 5.698-12.83 5.66-19.85 0-18.76-13.45-34-30-34ZM136 202c-9.92 0-18-9.87-18-22 0-12.13 8.07-22 18-22 9.93 0 18 9.87 18 22 .02 3.823-.817 7.603-2.45 11.06l-3.3-3.3c-2.347-2.312-6.12-2.299-8.451 .029-2.331 2.328-2.349 6.101-.039 8.451l3.75 3.75c-2.289 1.305-4.875 1.997-7.51 2.01Z"),
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
        return _fileSql!!
    }

private var _fileSql: ImageVector? = null
