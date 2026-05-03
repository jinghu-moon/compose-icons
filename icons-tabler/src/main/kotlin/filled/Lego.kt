package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = tablerFilledIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 2.000 C 16.552 2.000 17.000 2.448 17.000 3.000 L 17.000 4.000 L 17.200 4.005 C 19.252 4.108 20.892 5.748 20.995 7.800 L 21.000 8.000 L 21.000 17.000 C 21.000 18.764 19.844 20.321 18.155 20.830 L 18.000 20.873 L 18.000 21.000 C 18.000 21.507 17.620 21.934 17.117 21.993 L 17.000 22.000 L 7.000 22.000 C 6.448 22.000 6.000 21.552 6.000 21.000 L 6.000 20.873 L 5.845 20.831 C 4.226 20.343 3.089 18.889 3.005 17.200 L 3.000 17.000 L 3.000 8.000 C 3.000 5.791 4.791 4.000 7.000 4.000 L 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 ZM 15.200 14.286 C 14.806 13.899 14.173 13.906 13.786 14.300 C 13.316 14.780 12.672 15.051 12.000 15.051 C 11.328 15.051 10.684 14.780 10.214 14.300 C 9.826 13.915 9.200 13.913 8.810 14.296 C 8.420 14.679 8.409 15.304 8.786 15.700 C 9.632 16.564 10.791 17.050 12.000 17.050 C 13.209 17.050 14.368 16.564 15.214 15.700 C 15.601 15.306 15.594 14.673 15.200 14.286M 9.510 10.000 L 9.500 10.000 C 8.948 10.000 8.500 10.448 8.500 11.000 C 8.500 11.552 8.948 12.000 9.500 12.000 L 9.510 12.000 C 10.062 12.000 10.510 11.552 10.510 11.000 C 10.510 10.448 10.062 10.000 9.510 10.000M 14.510 10.000 L 14.500 10.000 C 13.948 10.000 13.500 10.448 13.500 11.000 C 13.500 11.552 13.948 12.000 14.500 12.000 L 14.510 12.000 C 15.062 12.000 15.510 11.552 15.510 11.000 C 15.510 10.448 15.062 10.000 14.510 10.000"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
