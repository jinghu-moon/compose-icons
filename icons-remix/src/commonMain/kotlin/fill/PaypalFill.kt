package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PaypalFill: ImageVector
    get() {
        if (_paypalFill != null) return _paypalFill!!
        _paypalFill = remixIcon(
            name = "PaypalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.067 8.478 C 20.559 9.358 20.624 10.492 20.368 11.805 C 19.627 15.611 17.092 16.925 13.854 16.925 L 13.354 16.925 C 12.958 16.925 12.622 17.214 12.560 17.605 L 12.519 17.825 L 11.890 21.818 L 11.857 21.988 C 11.795 22.379 11.458 22.667 11.063 22.667 L 7.720 22.667 C 7.424 22.667 7.197 22.402 7.243 22.109 L 7.418 21.000 L 8.937 21.000 L 9.886 14.979 L 11.272 14.979 C 15.950 14.979 19.021 12.777 20.067 8.478 ZM 17.107 3.388 C 17.869 4.256 18.091 5.199 17.860 6.673 C 17.840 6.796 17.820 6.914 17.797 7.033 C 17.062 10.806 14.709 12.479 10.842 12.479 L 8.957 12.479 C 8.326 12.479 7.784 12.893 7.604 13.481 L 7.589 13.479 L 6.660 19.373 L 3.122 19.373 C 3.090 19.373 3.066 19.345 3.071 19.314 L 5.669 2.802 C 5.742 2.340 6.140 2.000 6.608 2.000 L 12.583 2.000 C 14.766 2.000 16.300 2.469 17.107 3.388 Z"),
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
        return _paypalFill!!
    }

private var _paypalFill: ImageVector? = null
