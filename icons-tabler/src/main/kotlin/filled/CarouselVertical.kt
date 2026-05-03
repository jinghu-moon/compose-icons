package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarouselVertical: ImageVector
    get() {
        if (_carouselVertical != null) return _carouselVertical!!
        _carouselVertical = tablerFilledIcon(
            name = "CarouselVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 6.000 L 6.000 6.000 C 4.895 6.000 4.000 6.895 4.000 8.000 L 4.000 16.000 C 4.000 17.105 4.895 18.000 6.000 18.000 L 18.000 18.000 C 19.105 18.000 20.000 17.105 20.000 16.000 L 20.000 8.000 C 20.000 6.895 19.105 6.000 18.000 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 19.000 C 17.047 19.000 17.917 19.806 17.995 20.850 L 18.000 21.000 L 18.000 22.000 C 17.999 22.529 17.587 22.966 17.059 22.997 C 16.530 23.028 16.069 22.642 16.007 22.117 L 16.000 22.000 L 16.000 21.000 L 8.000 21.000 L 8.000 22.000 C 7.999 22.529 7.587 22.966 7.059 22.997 C 6.530 23.028 6.069 22.642 6.007 22.117 L 6.000 22.000 L 6.000 21.000 C 6.000 19.953 6.806 19.083 7.850 19.005 L 8.000 19.000 L 16.000 19.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 17.000 1.000 C 17.507 1.000 17.934 1.380 17.993 1.883 L 18.000 2.000 L 18.000 3.000 C 18.000 4.047 17.194 4.917 16.150 4.995 L 16.000 5.000 L 8.000 5.000 C 6.953 5.000 6.083 4.194 6.005 3.150 L 6.000 3.000 L 6.000 2.000 C 6.001 1.471 6.413 1.034 6.941 1.003 C 7.470 0.972 7.931 1.358 7.993 1.883 L 8.000 2.000 L 8.000 3.000 L 16.000 3.000 L 16.000 2.000 C 16.000 1.448 16.448 1.000 17.000 1.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _carouselVertical!!
    }

private var _carouselVertical: ImageVector? = null
