package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CashFill: ImageVector
    get() {
        if (_cashFill != null) return _cashFill!!
        _cashFill = remixIcon(
            name = "CashFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.005 4.003 L 21.005 4.003 C 21.557 4.003 22.005 4.451 22.005 5.003 L 22.005 19.003 C 22.005 19.555 21.557 20.003 21.005 20.003 L 3.005 20.003 C 2.453 20.003 2.005 19.555 2.005 19.003 L 2.005 5.003 C 2.005 4.451 2.453 4.003 3.005 4.003 ZM 6.500 6.000 L 4.000 6.000 L 4.000 8.500 C 5.381 8.500 6.500 7.381 6.500 6.000 ZM 17.500 6.000 C 17.500 7.381 18.620 8.500 20.000 8.500 L 20.000 6.000 L 17.500 6.000 ZM 4.000 15.500 L 4.000 18.000 L 6.500 18.000 C 6.500 16.619 5.381 15.500 4.000 15.500 ZM 17.500 18.000 L 20.000 18.000 L 20.000 15.500 C 18.620 15.500 17.500 16.619 17.500 18.000 ZM 12.000 16.000 C 14.210 16.000 16.000 14.209 16.000 12.000 C 16.000 9.791 14.210 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 14.209 9.791 16.000 12.000 16.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cashFill!!
    }

private var _cashFill: ImageVector? = null
