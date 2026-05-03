package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandVimeo: ImageVector
    get() {
        if (_brandVimeo != null) return _brandVimeo!!
        _brandVimeo = tablerFilledIcon(
            name = "BrandVimeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.500 3.000 C 20.880 3.000 22.485 5.174 21.986 8.164 C 21.451 11.374 19.736 14.238 17.178 16.839 C 15.901 18.137 14.967 18.900 13.066 20.324 C 10.743 21.921 8.658 20.689 7.596 18.427 C 7.304 17.809 7.010 16.703 6.348 13.950 L 6.318 13.824 C 5.835 11.814 5.499 10.505 5.336 9.946 L 5.320 9.894 L 5.289 9.907 L 5.159 9.967 L 5.022 10.037 C 4.873 10.117 4.729 10.207 4.592 10.306 C 4.194 10.599 3.641 10.557 3.292 10.207 L 2.292 9.207 C 1.955 8.870 1.903 8.341 2.168 7.945 C 2.746 7.103 3.387 6.307 4.086 5.563 C 5.066 4.526 6.041 3.747 7.014 3.330 C 7.514 3.116 8.010 3.000 8.500 3.000 C 10.737 3.000 11.520 4.588 12.067 7.963 C 12.097 8.146 12.124 8.322 12.179 8.672 C 12.302 9.456 12.376 9.870 12.471 10.260 C 12.763 11.445 12.999 12.244 13.206 12.743 L 13.190 12.704 L 13.286 12.597 C 13.640 12.186 14.043 11.583 14.458 10.826 L 14.615 10.535 C 15.006 9.790 15.120 9.007 14.978 8.635 C 14.950 8.562 14.985 8.570 14.522 8.853 C 14.189 9.058 13.767 9.049 13.442 8.831 C 13.117 8.613 12.949 8.226 13.012 7.840 C 13.508 4.787 15.757 3.000 18.500 3.000"),
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
        return _brandVimeo!!
    }

private var _brandVimeo: ImageVector? = null
