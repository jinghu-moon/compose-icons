package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = tablerFilledIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.498 2.000 22.000 6.002 22.000 11.000 C 22.000 12.351 21.400 13.640 20.346 14.576 C 19.316 15.490 17.934 16.000 16.500 16.000 L 13.984 16.000 C 13.525 15.993 13.120 16.299 13.002 16.742 C 12.883 17.186 13.082 17.653 13.484 17.875 C 13.554 17.914 13.619 17.961 13.678 18.015 C 14.379 18.662 14.608 19.674 14.254 20.560 C 13.899 21.446 13.035 22.020 12.081 22.005 L 11.925 21.996 L 11.993 22.000 L 11.720 21.996 C 6.420 21.850 2.150 17.580 2.004 12.280 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 8.500 8.500 C 7.453 8.500 6.583 9.306 6.505 10.350 L 6.500 10.500 C 6.500 11.605 7.395 12.500 8.500 12.500 C 9.605 12.500 10.500 11.605 10.500 10.500 C 10.500 9.395 9.605 8.500 8.500 8.500M 16.500 8.500 C 15.453 8.500 14.583 9.306 14.505 10.350 L 14.500 10.500 C 14.500 11.605 15.395 12.500 16.500 12.500 C 17.605 12.500 18.500 11.605 18.500 10.500 C 18.500 9.395 17.605 8.500 16.500 8.500M 12.500 5.500 C 11.453 5.500 10.583 6.306 10.505 7.350 L 10.500 7.500 C 10.500 8.605 11.395 9.500 12.500 9.500 C 13.605 9.500 14.500 8.605 14.500 7.500 C 14.500 6.395 13.605 5.500 12.500 5.500"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
