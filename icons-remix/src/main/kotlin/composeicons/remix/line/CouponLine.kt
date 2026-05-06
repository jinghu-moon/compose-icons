package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CouponLine: ImageVector
    get() {
        if (_couponLine != null) return _couponLine!!
        _couponLine = remixIcon(
            name = "CouponLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.005 9.5v-5.5c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v5.5c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5v5.5c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-5.5c1.381 0 2.5-1.119 2.5-2.5C4.505 10.619 3.386 9.5 2.005 9.5ZM4.005 7.968c1.482 .736 2.5 2.265 2.5 4.032 0 1.767-1.018 3.296-2.5 4.032v2.968h16v-2.968c-1.482-.736-2.5-2.265-2.5-4.032 0-1.767 1.018-3.296 2.5-4.032v-2.968h-16v2.968ZM9.005 9h6v2h-6v-2ZM9.005 13h6v2h-6v-2Z"),
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
        return _couponLine!!
    }

private var _couponLine: ImageVector? = null
