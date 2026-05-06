package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorBoldIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 212h-36.17c40.883-33.051 52.007-90.749 26.344-136.631C196.511 29.486 141.525 8.766 91.964 26.302 42.404 43.838 12.685 94.529 21.588 146.341 30.492 198.153 75.428 236.015 128 236h104c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM128 44c12.048-.011 23.955 2.593 34.9 7.63Q153.21 56.45 144 62.14C133.747 55.77 123.003 50.226 111.87 45.56 117.184 44.524 122.586 44.002 128 44ZM79.33 59.6c15.027 4.212 29.514 10.156 43.17 17.71q-6.73 5.35-13 11.2C95.411 81.293 80.456 75.909 65 72.49c4.272-4.826 9.08-9.151 14.33-12.89ZM51.11 94.23c14.073 2.326 27.775 6.505 40.75 12.43q-5.44 6.25-10.44 12.9C70.095 114.776 58.211 111.443 46.05 109.64c1.18-5.29 2.874-10.451 5.06-15.41ZM53.87 167.46C48.284 156.997 44.991 145.465 44.21 133.63c8.053 1.33 15.953 3.464 23.58 6.37-5.251 8.83-9.902 18.004-13.92 27.46ZM71 189.67C90.196 134.382 132.067 89.909 186.1 67.42c4.084 3.912 7.768 8.22 11 12.86C143.227 100.765 101.737 144.846 84.55 199.86 79.702 196.929 75.162 193.515 71 189.67ZM122.67 211.82c-5.403-.333-10.761-1.187-16-2.55 14.767-49.794 52.264-89.639 101.07-107.4 1.681 5.134 2.86 10.418 3.52 15.78-42.325 16.256-74.926 50.926-88.55 94.17ZM149.07 209.31c11.682-28.548 33.523-51.758 61.31-65.15-6.26 31.659-30.054 56.96-61.27 65.15Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
