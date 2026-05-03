package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpTriangle: ImageVector
    get() {
        if (_helpTriangle != null) return _helpTriangle!!
        _helpTriangle = tablerFilledIcon(
            name = "HelpTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.670 C 12.955 1.670 13.845 2.137 14.390 2.917 L 14.495 3.077 L 22.609 16.625 C 23.110 17.493 23.130 18.558 22.661 19.444 C 22.193 20.330 21.302 20.913 20.302 20.988 L 20.107 20.996 L 3.882 20.996 C 2.881 20.985 1.956 20.461 1.432 19.608 C 0.908 18.756 0.858 17.694 1.300 16.796 L 1.399 16.611 L 9.509 3.073 C 10.037 2.202 10.982 1.670 12.000 1.670 ZM 12.000 15.000 C 11.493 15.000 11.066 15.380 11.007 15.883 L 11.000 16.000 L 11.007 16.127 C 11.067 16.630 11.493 17.009 12.000 17.009 C 12.507 17.009 12.933 16.630 12.993 16.127 L 13.000 16.010 L 12.993 15.883 C 12.934 15.380 12.507 15.000 12.000 15.000 ZM 13.368 8.327 C 12.135 7.697 10.631 7.998 9.737 9.055 C 9.393 9.458 9.423 10.059 9.805 10.426 C 10.187 10.792 10.788 10.798 11.177 10.438 L 11.348 10.258 C 11.650 9.981 12.093 9.921 12.458 10.108 C 12.852 10.308 13.069 10.743 12.991 11.178 C 12.912 11.613 12.557 11.945 12.118 11.994 L 11.886 12.006 C 11.358 12.064 10.967 12.525 10.997 13.056 C 11.026 13.586 11.466 14.001 11.997 14.000 C 13.386 14.004 14.596 13.055 14.922 11.705 C 15.248 10.355 14.605 8.957 13.368 8.327 Z"),
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
        return _helpTriangle!!
    }

private var _helpTriangle: ImageVector? = null
