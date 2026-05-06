package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Notification2Fill: ImageVector
    get() {
        if (_notification2Fill != null) return _notification2Fill!!
        _notification2Fill = remixIcon(
            name = "Notification2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 20h-20v-2h1v-6.969C3 6.043 7.029 2 12 2c4.971 0 9 4.043 9 9.031v6.969h1v2ZM9.5 21h5c0 1.381-1.119 2.5-2.5 2.5C10.619 23.5 9.5 22.381 9.5 21Z"),
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
        return _notification2Fill!!
    }

private var _notification2Fill: ImageVector? = null
