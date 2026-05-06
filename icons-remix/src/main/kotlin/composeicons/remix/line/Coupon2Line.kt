package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Coupon2Line: ImageVector
    get() {
        if (_coupon2Line != null) return _coupon2Line!!
        _coupon2Line = remixIcon(
            name = "Coupon2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.005 9.5v-5.5c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v5.5c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5v5.5c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-5.5c1.381 0 2.5-1.119 2.5-2.5C4.505 10.619 3.386 9.5 2.005 9.5ZM14.005 5h-10v2.968c1.482 .736 2.5 2.265 2.5 4.032 0 1.767-1.018 3.296-2.5 4.032v2.968h10v-14ZM16.005 5v14h4v-2.968c-1.482-.736-2.5-2.265-2.5-4.032 0-1.767 1.018-3.296 2.5-4.032v-2.968h-4Z"),
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
        return _coupon2Line!!
    }

private var _coupon2Line: ImageVector? = null
