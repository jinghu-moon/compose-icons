package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MedalFill: ImageVector
    get() {
        if (_medalFill != null) return _medalFill!!
        _medalFill = remixIcon(
            name = "MedalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 7c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C7.582 23 4 19.418 4 15 4 10.582 7.582 7 12 7ZM12 10.5l-1.323 2.68-2.957 .43 2.14 2.086-.505 2.945L12 17.25l2.645 1.391-.505-2.945 2.14-2.086-2.957-.43L12 10.5ZM13 1.999l5 .001v3L16.637 6.138C15.531 5.558 14.302 5.179 13.001 5.05L13 1.999ZM11 1.999l-0 3.05C9.698 5.179 8.47 5.557 7.364 6.137L6 5v-3l5-.001Z"),
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
        return _medalFill!!
    }

private var _medalFill: ImageVector? = null
