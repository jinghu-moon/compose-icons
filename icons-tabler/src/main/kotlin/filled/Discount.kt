package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Discount: ImageVector
    get() {
        if (_discount != null) return _discount!!
        _discount = tablerFilledIcon(
            name = "Discount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 14.500 13.000 C 13.672 13.000 13.000 13.672 13.000 14.500 C 13.000 15.328 13.672 16.000 14.500 16.000 C 15.328 16.000 16.000 15.328 16.000 14.500 C 16.000 13.672 15.328 13.000 14.500 13.000M 15.707 8.293 C 15.316 7.903 14.684 7.903 14.293 8.293 L 8.293 14.293 C 7.914 14.685 7.919 15.309 8.305 15.695 C 8.691 16.081 9.315 16.086 9.707 15.707 L 15.707 9.707 C 16.097 9.316 16.097 8.684 15.707 8.293M 9.500 8.000 C 8.672 8.000 8.000 8.672 8.000 9.500 C 8.000 10.328 8.672 11.000 9.500 11.000 C 10.328 11.000 11.000 10.328 11.000 9.500 C 11.000 8.672 10.328 8.000 9.500 8.000"),
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
        return _discount!!
    }

private var _discount: ImageVector? = null
