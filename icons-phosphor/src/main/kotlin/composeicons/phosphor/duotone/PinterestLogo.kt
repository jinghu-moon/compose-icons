package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorDuotoneIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 112c0 44.18-32 72-64 72-32 0-41.63-21.07-41.63-21.07h0L128 88 141.14 32.17h0C183.238 34.88 215.998 69.815 216 112Z"),
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
                pathData = parseSvgPathData("M224 112c0 22.57-7.9 43.2-22.23 58.11C188.39 184 170.25 192 152 192c-17.88 0-29.82-5.86-37.43-12l-10.78 45.82c-.846 3.62-4.073 6.18-7.79 6.18-.619-.001-1.237-.071-1.84-.21-2.074-.476-3.872-1.758-4.998-3.564-1.126-1.805-1.486-3.985-1.002-6.056l32-136c1.011-4.302 5.318-6.971 9.62-5.96 4.302 1.011 6.971 5.318 5.96 9.62l-16.9 71.8C122 166 131.3 176 152 176c27.53 0 56-23.94 56-64C207.988 81.739 189.055 54.714 160.618 44.367 132.181 34.021 100.308 42.56 80.853 65.738 61.397 88.916 58.511 121.786 73.63 148c2.069 3.811 .726 8.576-3.029 10.745-3.755 2.169-8.554 .951-10.821-2.745C41.292 123.961 44.813 83.78 68.593 55.446 92.372 27.112 131.333 16.673 166.093 29.322 200.854 41.972 223.993 75.009 224 112Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
