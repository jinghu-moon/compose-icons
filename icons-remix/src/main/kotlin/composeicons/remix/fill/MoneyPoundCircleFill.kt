package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoneyPoundCircleFill: ImageVector
    get() {
        if (_moneyPoundCircleFill != null) return _moneyPoundCircleFill!!
        _moneyPoundCircleFill = remixIcon(
            name = "MoneyPoundCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 22.003C6.482 22.003 2.005 17.526 2.005 12.003 2.005 6.48 6.482 2.003 12.005 2.003c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM9.005 13.003v2h-1v2h8v-2h-5v-2h3v-2h-3v-1c0-.828 .672-1.5 1.5-1.5 .528 0 .992 .273 1.259 .685l1.987-.497C15.232 7.408 13.974 6.503 12.505 6.503c-1.933 0-3.5 1.567-3.5 3.5v1h-1v2h1Z"),
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
        return _moneyPoundCircleFill!!
    }

private var _moneyPoundCircleFill: ImageVector? = null
