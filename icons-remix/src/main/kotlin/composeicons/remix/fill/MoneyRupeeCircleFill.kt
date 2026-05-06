package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyRupeeCircleFill: ImageVector
    get() {
        if (_moneyRupeeCircleFill != null) return _moneyRupeeCircleFill!!
        _moneyRupeeCircleFill = remixIcon(
            name = "MoneyRupeeCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10ZM13.5 8c.327 .436 .562 .946 .675 1.5h1.825v1.5h-1.825c-.347 1.712-1.861 3-3.675 3h-.189l3.72 3.72-1.061 1.061L8 13.811v-1.311h2.5c.98 0 1.813-.626 2.122-1.5h-4.622v-1.5h4.622C12.313 8.626 11.48 8 10.5 8h-2.5v-1.5h8v1.5h-2.5Z"),
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
        return _moneyRupeeCircleFill!!
    }

private var _moneyRupeeCircleFill: ImageVector? = null
