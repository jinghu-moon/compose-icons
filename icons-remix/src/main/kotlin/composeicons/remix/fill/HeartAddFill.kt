package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartAddFill: ImageVector
    get() {
        if (_heartAddFill != null) return _heartAddFill!!
        _heartAddFill = remixIcon(
            name = "HeartAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 14v3h3v2h-3.001l.001 3h-2l-.001-3h-2.999v-2h3v-3h2ZM20.243 4.757c2.161 2.165 2.329 5.557 .507 7.91C19.926 12.24 18.991 12 18 12c-3.314 0-6 2.686-6 6 0 1.009 .249 1.96 .689 2.794l-.689 .691L3.521 12.993C1.417 10.637 1.496 7.019 3.757 4.757 6.022 2.493 9.645 2.417 12.001 4.529c2.349-2.109 5.979-2.039 8.242 .229Z"),
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
        return _heartAddFill!!
    }

private var _heartAddFill: ImageVector? = null
