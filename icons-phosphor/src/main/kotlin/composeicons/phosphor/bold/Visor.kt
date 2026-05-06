package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorBoldIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 104c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12C68 97.373 73.373 92 80 92h96c6.627 0 12 5.373 12 12ZM255.91 131.63c-2.009 39.533-33.921 70.963-73.48 72.37-.56 0-1.13 0-1.69 0-14.44 0-29.37-5.78-45.58-17.64-4.259-3.134-10.061-3.134-14.32 0C104 198.68 88.56 204.44 73.57 204 34.011 202.593 2.099 171.163 .09 131.63-.903 110.868 6.651 90.605 20.994 75.56 35.336 60.515 55.214 52.001 76 52h104c20.786 .001 40.664 8.515 55.006 23.56 14.342 15.045 21.896 35.308 20.904 56.07ZM217.62 92.1C207.838 81.774 194.224 75.948 180 76h-104C61.773 76 48.167 81.829 38.353 92.129c-9.814 10.3-14.98 24.171-14.293 38.381 1.383 27.035 23.207 48.524 50.26 49.49 9.42 .29 20-4 32.35-13 12.689-9.333 29.971-9.333 42.66 0 12.36 9 22.91 13.29 32.35 13 27.049-.965 48.872-22.449 50.26-49.48 .734-14.234-4.448-28.139-14.32-38.42Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
