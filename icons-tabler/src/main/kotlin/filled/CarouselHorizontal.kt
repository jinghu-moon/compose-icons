package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarouselHorizontal: ImageVector
    get() {
        if (_carouselHorizontal != null) return _carouselHorizontal!!
        _carouselHorizontal = tablerFilledIcon(
            name = "CarouselHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 4.000 L 8.000 4.000 C 6.895 4.000 6.000 4.895 6.000 6.000 L 6.000 18.000 C 6.000 19.105 6.895 20.000 8.000 20.000 L 16.000 20.000 C 17.105 20.000 18.000 19.105 18.000 18.000 L 18.000 6.000 C 18.000 4.895 17.105 4.000 16.000 4.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 22.000 6.000 C 22.529 6.001 22.966 6.413 22.997 6.941 C 23.028 7.470 22.642 7.931 22.117 7.993 L 22.000 8.000 L 21.000 8.000 L 21.000 16.000 L 22.000 16.000 C 22.529 16.001 22.966 16.413 22.997 16.941 C 23.028 17.470 22.642 17.931 22.117 17.993 L 22.000 18.000 L 21.000 18.000 C 19.953 18.000 19.083 17.194 19.005 16.150 L 19.000 16.000 L 19.000 8.000 C 19.000 6.953 19.806 6.083 20.850 6.005 L 21.000 6.000 L 22.000 6.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 6.000 C 4.047 6.000 4.917 6.806 4.995 7.850 L 5.000 8.000 L 5.000 16.000 C 5.000 17.047 4.194 17.917 3.150 17.995 L 3.000 18.000 L 2.000 18.000 C 1.471 17.999 1.034 17.587 1.003 17.059 C 0.972 16.530 1.358 16.069 1.883 16.007 L 2.000 16.000 L 3.000 16.000 L 3.000 8.000 L 2.000 8.000 C 1.471 7.999 1.034 7.587 1.003 7.059 C 0.972 6.530 1.358 6.069 1.883 6.007 L 2.000 6.000 L 3.000 6.000 Z"),
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
        return _carouselHorizontal!!
    }

private var _carouselHorizontal: ImageVector? = null
