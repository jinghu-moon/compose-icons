package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYarn: ImageVector
    get() {
        if (_brandYarn != null) return _brandYarn!!
        _brandYarn = tablerOutlineIcon(
            name = "BrandYarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.845 19.308 C 16.577 20.122 15.435 20.562 14.000 21.000 C 13.824 21.210 13.355 21.544 13.088 21.588 C 11.597 21.805 10.096 21.943 8.590 22.000 C 7.778 22.006 7.280 21.786 7.143 21.446 C 7.028 21.167 7.479 19.392 7.441 19.482 C 7.284 19.874 6.866 20.769 6.444 21.202 C 5.865 21.802 4.770 21.602 4.122 21.253 C 3.412 20.867 4.052 19.973 3.776 19.986 C 3.500 20.000 3.000 18.500 3.000 17.750 C 3.000 16.922 3.622 16.076 4.235 15.539 C 4.138 14.470 4.296 13.393 4.695 12.396 C 5.217 11.364 5.973 10.469 6.903 9.781 C 6.903 9.781 5.550 8.247 6.054 6.869 C 6.382 5.967 6.514 5.974 6.621 5.934 C 7.001 5.814 7.348 5.604 7.634 5.322 C 8.414 4.442 9.594 3.884 10.750 4.000 C 10.750 4.000 11.531 1.570 12.283 2.064 C 12.698 2.717 12.954 3.282 13.250 4.000 C 13.250 4.000 14.400 3.300 14.500 3.500 C 15.014 4.898 14.987 6.704 14.711 8.170 C 14.387 9.578 13.871 10.861 13.000 12.000 C 12.906 12.160 13.980 12.705 14.722 14.812 C 15.408 16.740 15.000 17.250 15.000 17.500 C 15.000 17.750 15.716 17.644 17.296 16.645 C 18.165 15.994 19.198 15.597 20.280 15.500 C 21.015 15.434 21.268 15.465 21.500 16.500 C 21.732 17.535 21.154 17.906 20.756 18.006 C 20.756 18.006 18.666 18.681 17.845 19.308"),
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
        return _brandYarn!!
    }

private var _brandYarn: ImageVector? = null
