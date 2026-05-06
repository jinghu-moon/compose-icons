package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LockUnlockFill: ImageVector
    get() {
        if (_lockUnlockFill != null) return _lockUnlockFill!!
        _lockUnlockFill = remixIcon(
            name = "LockUnlockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 10h13c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-10c0-.552 .448-1 1-1h1v-1C5 5.134 8.134 2 12 2c2.741 0 5.113 1.575 6.262 3.869l-1.789 .895C15.652 5.125 13.958 4 12 4 9.239 4 7 6.239 7 9v1ZM10 15v2h4v-2h-4Z"),
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
        return _lockUnlockFill!!
    }

private var _lockUnlockFill: ImageVector? = null
