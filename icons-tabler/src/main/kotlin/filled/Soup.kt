package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Soup: ImageVector
    get() {
        if (_soup != null) return _soup!!
        _soup = tablerFilledIcon(
            name = "Soup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 10.000 C 21.105 10.000 22.000 10.895 22.000 12.000 L 22.000 12.500 C 22.000 14.194 19.753 17.990 18.017 19.483 L 18.000 19.496 L 18.000 20.000 C 18.000 21.047 17.194 21.917 16.150 21.995 L 16.000 22.000 L 8.000 22.000 C 6.895 22.000 6.000 21.105 6.000 20.000 L 6.000 19.504 L 5.935 19.451 C 4.175 17.955 2.141 14.486 2.007 12.681 L 2.000 12.500 L 2.000 12.000 C 2.000 10.895 2.895 10.000 4.000 10.000 Z"),
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
                pathData = parseSvgPathData("M 11.417 3.188 C 11.707 2.968 12.093 2.922 12.426 3.069 C 12.759 3.216 12.986 3.532 13.018 3.894 C 13.051 4.257 12.884 4.608 12.583 4.812 C 12.208 5.082 11.990 5.518 12.000 6.021 C 11.990 6.482 12.208 6.919 12.583 7.188 C 12.884 7.392 13.051 7.743 13.018 8.106 C 12.986 8.468 12.759 8.784 12.426 8.931 C 12.093 9.078 11.707 9.032 11.417 8.812 C 10.516 8.170 9.987 7.127 10.000 6.021 C 9.977 4.901 10.507 3.841 11.417 3.188"),
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
                pathData = parseSvgPathData("M 15.417 3.188 C 15.707 2.968 16.093 2.922 16.426 3.069 C 16.759 3.216 16.986 3.532 17.018 3.894 C 17.051 4.257 16.884 4.608 16.583 4.812 C 16.208 5.082 15.990 5.518 16.000 6.021 C 15.990 6.482 16.208 6.919 16.583 7.188 C 16.884 7.392 17.051 7.743 17.018 8.106 C 16.986 8.468 16.759 8.784 16.426 8.931 C 16.093 9.078 15.707 9.032 15.417 8.812 C 14.516 8.170 13.987 7.127 14.000 6.021 C 13.977 4.901 14.507 3.841 15.417 3.188"),
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
                pathData = parseSvgPathData("M 7.417 3.188 C 7.707 2.968 8.093 2.922 8.426 3.069 C 8.759 3.216 8.986 3.532 9.018 3.894 C 9.051 4.257 8.884 4.608 8.583 4.812 C 8.208 5.082 7.990 5.518 8.000 6.021 C 7.990 6.482 8.208 6.919 8.583 7.188 C 8.884 7.392 9.051 7.743 9.018 8.106 C 8.986 8.468 8.759 8.784 8.426 8.931 C 8.093 9.078 7.707 9.032 7.417 8.812 C 6.516 8.170 5.987 7.127 6.000 6.021 C 5.977 4.901 6.507 3.841 7.417 3.188"),
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
        return _soup!!
    }

private var _soup: ImageVector? = null
