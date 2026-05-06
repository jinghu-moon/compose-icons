package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tilde: ImageVector
    get() {
        if (_tilde != null) return _tilde!!
        _tilde = phosphorRegularIcon(
            name = "Tilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.23 130.59c-14.51 18-28.84 27.6-43.8 29.17-1.495 .159-2.997 .239-4.5 .24-19.3 0-35.39-13.1-51-25.8-14.91-12.14-29-23.61-43.7-22-10.51 1.1-21.31 8.72-33 23.28-2.836 3.166-7.652 3.562-10.967 .902-3.315-2.66-3.971-7.448-1.493-10.902 14.51-18 28.84-27.6 43.8-29.17 21.32-2.25 38.69 11.89 55.48 25.56 14.91 12.14 29 23.62 43.7 22 10.51-1.1 21.31-8.72 33-23.28 1.726-2.406 4.64-3.663 7.575-3.265 2.935 .398 5.41 2.384 6.433 5.163 1.023 2.779 .428 5.896-1.548 8.102Z"),
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
        return _tilde!!
    }

private var _tilde: ImageVector? = null
