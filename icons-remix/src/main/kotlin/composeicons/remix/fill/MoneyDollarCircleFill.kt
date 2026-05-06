package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyDollarCircleFill: ImageVector
    get() {
        if (_moneyDollarCircleFill != null) return _moneyDollarCircleFill!!
        _moneyDollarCircleFill = remixIcon(
            name = "MoneyDollarCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 22.003C6.482 22.003 2.005 17.526 2.005 12.003 2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM8.505 14.003v2h2.5v2h2v-2h1c1.381 0 2.5-1.119 2.5-2.5 0-1.381-1.119-2.5-2.5-2.5h-4c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h5.5v-2h-2.5v-2h-2v2h-1c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5h4c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-5.5Z"),
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
        return _moneyDollarCircleFill!!
    }

private var _moneyDollarCircleFill: ImageVector? = null
