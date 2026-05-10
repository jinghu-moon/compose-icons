package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CrosshairFill: ImageVector
    get() {
        if (_crosshairFill != null) return _crosshairFill!!
        _crosshairFill = remixIcon(
            name = "CrosshairFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.938 13c-.451 3.619-3.319 6.487-6.938 6.938v-2.938h-2v2.938C7.381 19.487 4.513 16.619 4.062 13h2.938v-2h-2.938C4.513 7.381 7.381 4.513 11 4.062v2.938h2v-2.938c3.619 .451 6.487 3.319 6.938 6.938h-2.938v2h2.938ZM2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12ZM12 15c1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3Z"),
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
        return _crosshairFill!!
    }

private var _crosshairFill: ImageVector? = null
