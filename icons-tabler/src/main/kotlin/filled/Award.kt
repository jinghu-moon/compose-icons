package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Award: ImageVector
    get() {
        if (_award != null) return _award!!
        _award = tablerFilledIcon(
            name = "Award",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.496 13.983 L 21.462 17.389 C 21.626 17.674 21.640 18.021 21.500 18.318 C 21.359 18.615 21.081 18.824 20.757 18.877 L 20.644 18.888 L 20.532 18.887 L 17.599 18.697 L 16.296 21.333 C 16.152 21.623 15.878 21.825 15.559 21.877 C 15.240 21.928 14.915 21.823 14.688 21.593 L 14.606 21.499 L 14.534 21.389 L 12.566 17.982 C 15.374 17.806 17.939 16.327 19.496 13.983 Z"),
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
                pathData = parseSvgPathData("M 11.430 17.982 L 9.464 21.390 C 9.302 21.670 9.015 21.855 8.693 21.886 C 8.372 21.917 8.054 21.791 7.842 21.547 L 7.766 21.447 L 7.702 21.333 L 6.398 18.698 L 3.467 18.888 C 3.139 18.909 2.822 18.768 2.618 18.511 C 2.414 18.253 2.350 17.912 2.445 17.598 L 2.485 17.491 L 2.535 17.391 L 4.503 13.982 C 6.059 16.326 8.622 17.806 11.430 17.983 Z"),
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
                pathData = parseSvgPathData("M 12.000 2.000 L 12.240 2.004 C 16.010 2.133 19.000 5.227 19.000 9.000 L 18.997 9.193 L 18.990 9.385 L 18.972 9.630 L 18.946 9.872 L 18.922 10.050 C 18.856 10.482 18.750 10.906 18.605 11.318 L 18.489 11.626 L 18.336 11.974 C 17.180 14.436 14.703 16.006 11.983 16.000 C 9.263 15.994 6.793 14.413 5.648 11.946 L 5.518 11.649 L 5.466 11.516 L 5.386 11.299 L 5.291 11.005 C 5.257 10.891 5.226 10.776 5.198 10.661 L 5.138 10.390 L 5.089 10.119 L 5.069 9.980 L 5.030 9.657 L 5.006 9.292 L 5.000 9.000 C 5.000 5.227 7.990 2.133 11.760 2.004 L 12.000 2.000 Z"),
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
        return _award!!
    }

private var _award: ImageVector? = null
