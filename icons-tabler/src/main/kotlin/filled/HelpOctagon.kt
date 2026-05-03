package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpOctagon: ImageVector
    get() {
        if (_helpOctagon != null) return _helpOctagon!!
        _helpOctagon = tablerFilledIcon(
            name = "HelpOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.897 1.000 C 15.880 1.000 16.828 1.362 17.561 2.016 L 17.726 2.172 L 21.826 6.272 C 22.523 6.967 22.938 7.895 22.994 8.877 L 23.000 9.104 L 23.000 14.898 C 23.000 15.881 22.638 16.829 21.984 17.562 L 21.828 17.727 L 17.728 21.827 C 17.033 22.523 16.107 22.939 15.125 22.995 L 14.898 23.001 L 9.103 23.001 C 8.120 23.001 7.172 22.639 6.439 21.984 L 6.274 21.828 L 2.174 17.728 C 1.478 17.033 1.062 16.106 1.006 15.124 L 1.000 14.897 L 1.000 9.103 C 1.000 8.120 1.362 7.172 2.016 6.439 L 2.172 6.274 L 6.272 2.174 C 6.967 1.477 7.895 1.062 8.877 1.006 L 9.104 1.000 L 14.897 1.000 ZM 12.000 15.000 C 11.493 15.000 11.066 15.380 11.007 15.883 L 11.000 16.000 L 11.007 16.127 C 11.067 16.630 11.493 17.009 12.000 17.009 C 12.507 17.009 12.933 16.630 12.993 16.127 L 13.000 16.010 L 12.993 15.883 C 12.934 15.380 12.507 15.000 12.000 15.000 ZM 13.368 8.327 C 12.135 7.697 10.631 7.998 9.737 9.055 C 9.393 9.458 9.423 10.059 9.805 10.426 C 10.187 10.792 10.788 10.798 11.177 10.438 L 11.348 10.258 C 11.650 9.981 12.093 9.921 12.458 10.108 C 12.852 10.308 13.069 10.743 12.991 11.178 C 12.912 11.613 12.557 11.945 12.118 11.994 L 11.886 12.006 C 11.358 12.064 10.967 12.525 10.997 13.056 C 11.026 13.586 11.466 14.001 11.997 14.000 C 13.386 14.004 14.596 13.055 14.922 11.705 C 15.248 10.355 14.605 8.957 13.368 8.327 Z"),
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
        return _helpOctagon!!
    }

private var _helpOctagon: ImageVector? = null
