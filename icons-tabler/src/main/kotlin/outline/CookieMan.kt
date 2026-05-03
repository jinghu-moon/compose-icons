package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CookieMan: ImageVector
    get() {
        if (_cookieMan != null) return _cookieMan!!
        _cookieMan = tablerOutlineIcon(
            name = "CookieMan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 14.188 2.000 16.121 3.422 16.773 5.510 C 17.425 7.598 16.644 9.867 14.845 11.112 L 14.992 11.481 L 16.747 10.678 C 17.716 10.235 18.867 10.646 19.318 11.596 C 19.741 12.492 19.397 13.562 18.531 14.043 L 18.383 14.119 L 16.000 15.208 L 16.000 17.228 L 17.426 18.653 L 17.540 18.778 C 18.197 19.556 18.148 20.708 17.428 21.428 C 16.708 22.148 15.556 22.197 14.778 21.540 L 14.653 21.426 L 12.574 19.346 L 12.460 19.222 C 12.401 19.152 12.348 19.079 12.299 19.002 L 11.700 19.002 Q 11.629 19.116 11.540 19.222 L 11.425 19.347 L 9.345 21.426 C 8.603 22.171 7.406 22.198 6.631 21.487 C 5.856 20.777 5.780 19.581 6.459 18.778 L 6.573 18.653 L 8.000 17.227 L 8.000 15.208 L 5.617 14.118 L 5.469 14.043 C 4.603 13.562 4.259 12.492 4.682 11.596 C 5.111 10.694 6.171 10.278 7.106 10.618 L 7.253 10.678 L 9.008 11.481 L 9.155 11.112 C 7.868 10.222 7.073 8.780 7.005 7.217 L 7.005 7.000 C 7.005 4.239 9.244 2.000 12.005 2.000 L 12.000 2.000"),
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
                pathData = parseSvgPathData("M 12.000 16.000 L 12.010 16.000"),
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
                pathData = parseSvgPathData("M 12.000 13.000 L 12.010 13.000"),
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
                pathData = parseSvgPathData("M 10.000 7.000 L 10.010 7.000"),
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
                pathData = parseSvgPathData("M 14.000 7.000 L 14.010 7.000"),
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
                pathData = parseSvgPathData("M 12.000 9.000 L 12.010 9.000"),
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
        return _cookieMan!!
    }

private var _cookieMan: ImageVector? = null
