package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartsFill: ImageVector
    get() {
        if (_heartsFill != null) return _heartsFill!!
        _heartsFill = remixIcon(
            name = "HeartsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.363 11.045c1.404-1.394 3.68-1.394 5.084 0 1.404 1.394 1.404 3.653 0 5.047L17 21.5 11.553 16.092c-1.404-1.394-1.404-3.653 0-5.047 1.404-1.394 3.68-1.394 5.084 0l.363 .36 .364-.36ZM19.243 4.757c.941 .942 1.503 2.117 1.689 3.337-1.333-.247-2.739-.009-3.932 .713C14.849 7.505 12.006 7.778 10.144 9.626c-2.131 2.115-2.19 5.515-.178 7.701l.178 .184 2.421 2.404-1.565 1.569L2.521 12.993C.417 10.637 .496 7.019 2.757 4.757 5.022 2.493 8.645 2.417 11.001 4.529c2.349-2.109 5.979-2.039 8.242 .229Z"),
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
        return _heartsFill!!
    }

private var _heartsFill: ImageVector? = null
