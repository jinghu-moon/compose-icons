package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartAddLine: ImageVector
    get() {
        if (_heartAddLine != null) return _heartAddLine!!
        _heartAddLine = remixIcon(
            name = "HeartAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 14v3h3v2h-3.001l.001 3h-2l-.001-3h-2.999v-2h3v-3h2ZM20.243 4.757c2.262 2.267 2.34 5.879 .237 8.235L19.06 11.574c1.33-1.524 1.26-3.914-.233-5.404C17.324 4.671 14.908 4.607 13.337 6.017L12.002 7.215 10.666 6.018C9.091 4.606 6.675 4.668 5.172 6.172 3.682 7.661 3.607 10.047 4.98 11.623l8.432 8.446-1.412 1.416L3.521 12.993C1.417 10.637 1.496 7.019 3.757 4.757 6.022 2.493 9.645 2.417 12.001 4.529c2.349-2.109 5.979-2.039 8.242 .229Z"),
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
        return _heartAddLine!!
    }

private var _heartAddLine: ImageVector? = null
