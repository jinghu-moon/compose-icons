package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Coupon3Line: ImageVector
    get() {
        if (_coupon3Line != null) return _coupon3Line!!
        _coupon3Line = remixIcon(
            name = "Coupon3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.005 4c0-.552 .448-1 1-1h18c.552 0 1 .448 1 1v5.5c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5v5.5c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16ZM8.09 19c.206-.583 .762-1 1.415-1 .653 0 1.209 .417 1.415 1h9.085v-2.968c-1.482-.736-2.5-2.265-2.5-4.032 0-1.767 1.018-3.296 2.5-4.032v-2.968h-9.085c-.206 .583-.762 1-1.415 1-.653 0-1.209-.417-1.415-1h-4.085v14h4.085ZM9.505 11c-.828 0-1.5-.672-1.5-1.5 0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5ZM9.505 16c-.828 0-1.5-.672-1.5-1.5 0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5Z"),
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
        return _coupon3Line!!
    }

private var _coupon3Line: ImageVector? = null
