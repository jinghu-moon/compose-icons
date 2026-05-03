package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPaypal: ImageVector
    get() {
        if (_brandPaypal != null) return _brandPaypal!!
        _brandPaypal = tablerOutlineIcon(
            name = "BrandPaypal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 13.000 L 12.500 13.000 C 15.000 13.000 17.500 10.500 17.500 8.000 C 17.500 5.000 15.600 3.000 12.500 3.000 L 7.000 3.000 C 6.500 3.000 6.000 3.500 6.000 4.000 L 4.000 18.000 C 4.000 18.500 4.500 19.000 5.000 19.000 L 7.800 19.000 L 9.000 14.000 C 9.100 13.400 9.400 13.000 10.000 13.000M 17.500 7.200 C 19.200 8.200 20.000 10.000 20.000 12.000 C 20.000 14.500 17.500 16.500 15.000 16.500 L 12.400 16.500 L 11.800 20.100 C 11.704 20.573 11.283 20.910 10.800 20.900 L 8.100 20.900 C 7.948 20.903 7.803 20.837 7.706 20.720 C 7.608 20.603 7.570 20.449 7.600 20.300 L 7.800 18.900"),
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
        return _brandPaypal!!
    }

private var _brandPaypal: ImageVector? = null
