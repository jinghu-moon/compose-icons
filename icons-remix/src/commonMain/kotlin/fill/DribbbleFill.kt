package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DribbbleFill: ImageVector
    get() {
        if (_dribbbleFill != null) return _dribbbleFill!!
        _dribbbleFill = remixIcon(
            name = "DribbbleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 6.479 2.000 2.000 6.479 2.000 12.000 C 2.000 17.521 6.479 22.000 12.000 22.000 C 17.510 22.000 22.000 17.521 22.000 12.000 C 22.000 6.479 17.510 2.000 12.000 2.000 ZM 18.605 6.610 C 19.798 8.063 20.514 9.918 20.536 11.924 C 20.254 11.870 17.434 11.295 14.592 11.653 C 14.527 11.512 14.473 11.360 14.408 11.208 C 14.234 10.796 14.039 10.373 13.844 9.972 C 16.989 8.692 18.421 6.848 18.605 6.610 ZM 12.000 3.475 C 14.169 3.475 16.154 4.289 17.662 5.623 C 17.510 5.839 16.219 7.564 13.182 8.703 C 11.783 6.132 10.232 4.028 9.993 3.703 C 10.633 3.551 11.306 3.475 12.000 3.475 ZM 8.367 4.278 C 8.594 4.581 10.113 6.696 11.534 9.213 C 7.542 10.276 4.017 10.254 3.638 10.254 C 4.191 7.607 5.980 5.406 8.367 4.278 ZM 3.453 12.011 C 3.453 11.924 3.453 11.837 3.453 11.751 C 3.822 11.761 7.965 11.816 12.228 10.536 C 12.477 11.013 12.705 11.501 12.922 11.989 C 12.813 12.022 12.694 12.054 12.586 12.087 C 8.182 13.508 5.839 17.390 5.644 17.716 C 4.288 16.208 3.453 14.202 3.453 12.011 ZM 12.000 20.547 C 10.026 20.547 8.204 19.874 6.761 18.746 C 6.913 18.432 8.649 15.091 13.464 13.410 C 13.486 13.399 13.497 13.399 13.518 13.388 C 14.722 16.501 15.210 19.115 15.341 19.863 C 14.310 20.308 13.182 20.547 12.000 20.547 ZM 16.761 19.082 C 16.675 18.562 16.219 16.067 15.102 12.998 C 17.781 12.575 20.124 13.269 20.417 13.367 C 20.048 15.742 18.681 17.792 16.761 19.082 Z"),
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
        return _dribbbleFill!!
    }

private var _dribbbleFill: ImageVector? = null
