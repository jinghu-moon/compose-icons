package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoHexagon: ImageVector
    get() {
        if (_infoHexagon != null) return _infoHexagon!!
        _infoHexagon = tablerFilledIcon(
            name = "InfoHexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.425 1.414 C 11.360 0.899 12.485 0.862 13.451 1.317 L 13.641 1.414 L 20.416 5.409 L 20.512 5.472 L 20.604 5.549 L 20.711 5.624 C 21.413 6.151 21.870 6.941 21.977 7.812 L 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.608 21.430 17.631 20.546 18.195 L 20.376 18.295 L 13.573 22.597 C 12.655 23.101 11.554 23.132 10.569 22.665 L 10.373 22.565 L 3.678 18.328 C 2.710 17.798 2.079 16.810 2.007 15.709 L 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 ZM 12.000 11.000 L 11.000 11.000 L 10.883 11.007 C 10.380 11.067 10.001 11.493 10.001 12.000 C 10.001 12.507 10.380 12.933 10.883 12.993 L 11.000 13.000 L 11.000 16.000 L 11.007 16.117 C 11.061 16.576 11.424 16.939 11.883 16.993 L 12.000 17.000 L 13.000 17.000 L 13.117 16.993 C 13.576 16.939 13.939 16.576 13.993 16.117 L 14.000 16.000 L 13.993 15.883 C 13.944 15.465 13.639 15.122 13.229 15.026 L 13.117 15.006 L 13.000 15.000 L 13.000 12.000 L 12.993 11.883 C 12.939 11.424 12.576 11.061 12.117 11.007 L 12.000 11.000 ZM 12.010 8.000 L 11.883 8.007 C 11.380 8.067 11.001 8.493 11.001 9.000 C 11.001 9.507 11.380 9.933 11.883 9.993 L 12.000 10.000 L 12.127 9.993 C 12.630 9.933 13.009 9.507 13.009 9.000 C 13.009 8.493 12.630 8.067 12.127 8.007 L 12.010 8.000 Z"),
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
        return _infoHexagon!!
    }

private var _infoHexagon: ImageVector? = null
