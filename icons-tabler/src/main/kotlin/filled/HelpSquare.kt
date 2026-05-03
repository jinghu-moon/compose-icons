package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpSquare: ImageVector
    get() {
        if (_helpSquare != null) return _helpSquare!!
        _helpSquare = tablerFilledIcon(
            name = "HelpSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.589 2.000 21.902 3.238 21.995 4.824 L 22.000 5.000 L 22.000 19.000 C 22.000 20.589 20.762 21.902 19.176 21.995 L 19.000 22.000 L 5.000 22.000 C 3.411 22.000 2.098 20.762 2.005 19.176 L 2.000 19.000 L 2.000 5.000 C 2.000 3.411 3.238 2.098 4.824 2.005 L 5.000 2.000 L 19.000 2.000 ZM 12.000 15.000 C 11.493 15.000 11.066 15.380 11.007 15.883 L 11.000 16.000 L 11.007 16.127 C 11.067 16.630 11.493 17.009 12.000 17.009 C 12.507 17.009 12.933 16.630 12.993 16.127 L 13.000 16.010 L 12.993 15.883 C 12.934 15.380 12.507 15.000 12.000 15.000 ZM 13.368 8.327 C 12.135 7.697 10.631 7.998 9.737 9.055 C 9.393 9.458 9.423 10.059 9.805 10.426 C 10.187 10.792 10.788 10.798 11.177 10.438 L 11.348 10.258 C 11.650 9.981 12.093 9.921 12.458 10.108 C 12.852 10.308 13.069 10.743 12.991 11.178 C 12.912 11.613 12.557 11.945 12.118 11.994 L 11.886 12.006 C 11.358 12.064 10.967 12.525 10.997 13.056 C 11.026 13.586 11.466 14.001 11.997 14.000 C 13.386 14.004 14.596 13.055 14.922 11.705 C 15.248 10.355 14.605 8.957 13.368 8.327 Z"),
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
        return _helpSquare!!
    }

private var _helpSquare: ImageVector? = null
