package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileSvg: ImageVector
    get() {
        if (_fileSvg != null) return _fileSvg!!
        _fileSvg = phosphorLightIcon(
            name = "FileSvg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.75l-56-56C155.114 26.628 153.589 25.999 152 26h-96C48.268 26 42 32.268 42 40v72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-72c0-1.105 .895-2 2-2h90v50c0 3.314 2.686 6 6 6h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c.001-1.594-.632-3.123-1.76-4.25ZM158 46.48 193.52 82h-35.52ZM85.83 196.05c-.561 5.613-3.606 10.681-8.3 13.81C72.71 213.05 66.66 214 61.16 214c-4.954-.052-9.883-.724-14.67-2-3.192-.892-5.057-4.203-4.165-7.395 .892-3.192 4.203-5.057 7.395-4.165 3.71 1 15.58 3.11 21.19-.62 1.784-1.209 2.896-3.187 3-5.34 .57-4.43-2.08-6.26-14.2-9.76C50.4 182.03 36.34 177.97 38.14 163.78c.554-5.488 3.513-10.447 8.08-13.54 11.11-7.49 29.18-3 31.2-2.48 3.035 .967 4.785 4.136 3.988 7.219-.797 3.083-3.865 5.007-6.988 4.381-3.79-1-15.85-2.95-21.45 .84-1.699 1.152-2.764 3.031-2.88 5.08-.41 3.22 2.14 4.78 13 7.91 9.84 2.89 24.76 7.2 22.74 22.86ZM149.65 154.05l-20 56c-.853 2.387-3.115 3.981-5.65 3.981-2.535 0-4.797-1.593-5.65-3.981l-20-56c-.833-2.047-.474-4.386 .935-6.089 1.409-1.702 3.64-2.492 5.807-2.056 2.167 .437 3.918 2.029 4.558 4.144L124 190.15 138.35 150c1.209-2.969 4.538-4.463 7.559-3.394 3.022 1.07 4.669 4.326 3.741 7.394ZM214 184v16.87c-.001 1.547-.599 3.034-1.67 4.15-5.252 5.664-12.606 8.912-20.33 8.98-16.54 0-30-15.25-30-34 0-18.75 13.46-34 30-34 5.482 .02 10.832 1.681 15.36 4.77 2.761 1.856 3.496 5.599 1.64 8.36-1.856 2.761-5.599 3.496-8.36 1.64C198.108 158.991 195.094 158.025 192 158c-9.92 0-18 9.87-18 22 0 12.13 8.08 22 18 22 3.668-.04 7.206-1.363 10-3.74v-8.26h-2c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h8c3.314 0 6 2.686 6 6Z"),
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
        return _fileSvg!!
    }

private var _fileSvg: ImageVector? = null
