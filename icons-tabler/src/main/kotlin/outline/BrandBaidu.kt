package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBaidu: ImageVector
    get() {
        if (_brandBaidu != null) return _brandBaidu!!
        _brandBaidu = tablerOutlineIcon(
            name = "BrandBaidu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 9.500 C 4.000 10.328 4.448 11.000 5.000 11.000 C 5.552 11.000 6.000 10.328 6.000 9.500 C 6.000 8.672 5.552 8.000 5.000 8.000 C 4.448 8.000 4.000 8.672 4.000 9.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.463 11.596 C 15.745 13.370 17.939 15.012 17.939 15.012 C 17.939 15.012 19.860 16.586 18.532 18.648 C 17.204 20.711 13.640 19.800 13.640 19.800 C 13.640 19.800 12.224 19.360 10.580 19.712 C 8.936 20.068 7.520 19.932 7.520 19.932 C 7.520 19.932 5.465 19.712 5.050 17.628 C 4.634 15.544 6.968 13.990 7.152 13.770 C 7.334 13.548 8.561 12.804 9.436 11.376 C 10.311 9.948 12.773 9.089 14.463 11.597"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.000 4.500 C 8.000 5.328 8.448 6.000 9.000 6.000 C 9.552 6.000 10.000 5.328 10.000 4.500 C 10.000 3.672 9.552 3.000 9.000 3.000 C 8.448 3.000 8.000 3.672 8.000 4.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 4.500 C 14.000 5.328 14.448 6.000 15.000 6.000 C 15.552 6.000 16.000 5.328 16.000 4.500 C 16.000 3.672 15.552 3.000 15.000 3.000 C 14.448 3.000 14.000 3.672 14.000 4.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 9.500 C 18.000 10.328 18.448 11.000 19.000 11.000 C 19.552 11.000 20.000 10.328 20.000 9.500 C 20.000 8.672 19.552 8.000 19.000 8.000 C 18.448 8.000 18.000 8.672 18.000 9.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandBaidu!!
    }

private var _brandBaidu: ImageVector? = null
