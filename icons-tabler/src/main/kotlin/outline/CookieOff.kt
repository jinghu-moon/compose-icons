package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CookieOff: ImageVector
    get() {
        if (_cookieOff != null) return _cookieOff!!
        _cookieOff = tablerOutlineIcon(
            name = "CookieOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 13.000 L 8.000 13.010"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 17.000 L 12.000 17.010"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 L 12.000 12.010"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.192 18.187 C 17.913 18.466 17.581 18.688 17.216 18.839 C 16.168 19.102 15.429 19.322 15.000 19.500 C 14.525 19.697 13.908 20.038 13.148 20.524 C 12.413 20.828 11.587 20.828 10.852 20.524 C 10.050 20.021 9.433 19.680 9.000 19.500 C 8.529 19.305 7.790 19.085 6.784 18.840 C 6.049 18.535 5.465 17.951 5.161 17.216 C 4.896 16.164 4.676 15.426 4.500 15.000 C 4.302 14.521 3.960 13.904 3.476 13.148 C 3.172 12.413 3.172 11.587 3.476 10.852 C 3.956 10.108 4.296 9.491 4.500 9.000 C 4.671 8.587 4.891 7.848 5.160 6.784 C 5.311 6.421 5.531 6.091 5.809 5.813M 8.630 4.639 C 8.770 4.590 8.893 4.544 9.000 4.500 C 9.458 4.310 10.075 3.969 10.852 3.476 C 11.587 3.172 12.413 3.172 13.148 3.476 L 15.815 4.580 C 14.729 6.009 14.728 7.987 15.812 9.417 C 16.897 10.848 18.802 11.380 20.471 10.720 L 20.524 10.852 C 20.828 11.587 20.828 12.413 20.524 13.148 C 20.027 13.934 19.686 14.552 19.500 15.000 C 19.452 15.119 19.406 15.239 19.365 15.360"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _cookieOff!!
    }

private var _cookieOff: ImageVector? = null
