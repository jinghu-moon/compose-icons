package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpHexagon: ImageVector
    get() {
        if (_helpHexagon != null) return _helpHexagon!!
        _helpHexagon = tablerFilledIcon(
            name = "HelpHexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.425 1.414 C 11.360 0.899 12.485 0.862 13.451 1.317 L 13.641 1.414 L 20.416 5.409 L 20.512 5.472 L 20.604 5.549 L 20.711 5.624 C 21.413 6.151 21.870 6.941 21.977 7.812 L 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.608 21.430 17.631 20.546 18.195 L 20.376 18.295 L 13.573 22.597 C 12.655 23.101 11.554 23.132 10.569 22.665 L 10.373 22.565 L 3.678 18.328 C 2.710 17.798 2.079 16.810 2.007 15.709 L 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 ZM 12.000 15.000 C 11.493 15.000 11.066 15.380 11.007 15.883 L 11.000 16.000 L 11.007 16.127 C 11.067 16.630 11.493 17.009 12.000 17.009 C 12.507 17.009 12.933 16.630 12.993 16.127 L 13.000 16.010 L 12.993 15.883 C 12.934 15.380 12.507 15.000 12.000 15.000 ZM 13.368 8.327 C 12.135 7.697 10.631 7.998 9.737 9.055 C 9.393 9.458 9.423 10.059 9.805 10.426 C 10.187 10.792 10.788 10.798 11.177 10.438 L 11.348 10.258 C 11.650 9.981 12.093 9.921 12.458 10.108 C 12.852 10.308 13.069 10.743 12.991 11.178 C 12.912 11.613 12.557 11.945 12.118 11.994 L 11.886 12.006 C 11.358 12.064 10.967 12.525 10.997 13.056 C 11.026 13.586 11.466 14.001 11.997 14.000 C 13.386 14.004 14.596 13.055 14.922 11.705 C 15.248 10.355 14.605 8.957 13.368 8.327 Z"),
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
        return _helpHexagon!!
    }

private var _helpHexagon: ImageVector? = null
