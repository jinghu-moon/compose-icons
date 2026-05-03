package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = tablerFilledIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.707 8.293 C 16.097 8.684 16.097 9.316 15.707 9.707 L 9.707 15.707 C 9.456 15.967 9.084 16.071 8.734 15.980 C 8.385 15.888 8.112 15.615 8.020 15.266 C 7.929 14.916 8.033 14.544 8.293 14.293 L 14.293 8.293 C 14.684 7.903 15.316 7.903 15.707 8.293"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.242 4.757 C 21.585 7.101 21.584 10.900 19.190 13.291 L 18.656 13.755 C 18.239 14.117 17.607 14.073 17.245 13.656 C 16.883 13.239 16.927 12.607 17.344 12.245 L 17.827 11.829 C 18.577 11.079 18.999 10.061 18.999 9.000 C 18.999 7.940 18.577 6.922 17.827 6.172 C 16.265 4.609 13.732 4.609 12.220 6.118 L 11.757 6.654 C 11.396 7.072 10.764 7.118 10.346 6.757 C 9.928 6.396 9.882 5.764 10.243 5.346 L 10.756 4.756 C 11.881 3.631 13.408 2.999 14.999 2.999 C 16.591 2.999 18.117 3.631 19.242 4.757"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 6.750 10.338 C 7.115 10.752 7.076 11.384 6.662 11.749 L 6.179 12.174 C 5.424 12.920 4.999 13.937 4.999 14.998 C 4.999 16.060 5.424 17.077 6.179 17.823 C 7.747 19.375 10.268 19.392 11.857 17.861 L 12.197 17.403 C 12.527 16.960 13.154 16.867 13.597 17.197 C 14.040 17.527 14.133 18.154 13.803 18.597 L 13.406 19.131 L 13.306 19.245 C 10.942 21.582 7.137 21.582 4.773 19.245 C 3.638 18.123 3.000 16.594 3.000 14.998 C 3.000 13.403 3.638 11.874 4.814 10.714 L 5.338 10.251 C 5.752 9.886 6.383 9.925 6.749 10.338"),
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
        return _link!!
    }

private var _link: ImageVector? = null
