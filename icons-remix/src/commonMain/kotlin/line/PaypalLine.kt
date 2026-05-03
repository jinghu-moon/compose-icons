package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaypalLine: ImageVector
    get() {
        if (_paypalLine != null) return _paypalLine!!
        _paypalLine = remixIcon(
            name = "PaypalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.496 20.667 L 10.047 20.667 L 10.585 17.291 C 10.801 15.930 11.975 14.925 13.354 14.925 L 13.854 14.925 C 16.532 14.925 17.915 13.942 18.406 11.422 C 18.613 10.356 18.522 9.692 18.234 9.320 C 17.027 12.374 14.445 13.479 11.273 13.479 L 10.388 13.479 C 10.004 13.479 9.595 13.689 9.536 14.060 L 8.496 20.667 ZM 3.552 20.373 C 3.214 20.373 2.955 20.071 3.008 19.736 L 5.682 2.776 C 5.753 2.329 6.138 2.000 6.590 2.000 L 13.014 2.000 C 15.226 2.000 16.956 2.467 17.913 3.558 C 18.783 4.549 19.036 5.642 18.785 7.250 C 19.144 7.441 19.452 7.675 19.700 7.956 C 20.518 8.889 20.678 10.216 20.368 11.805 C 19.628 15.611 17.093 16.925 13.854 16.925 L 13.354 16.925 C 12.959 16.925 12.623 17.214 12.561 17.605 L 11.858 21.988 C 11.796 22.379 11.459 22.667 11.064 22.667 L 6.721 22.667 C 6.424 22.667 6.198 22.402 6.244 22.109 L 6.518 20.373 L 3.552 20.373 ZM 10.388 11.479 L 11.273 11.479 C 14.462 11.479 16.167 10.267 16.755 7.250 C 16.774 7.149 16.792 7.047 16.809 6.941 C 16.975 5.882 16.859 5.388 16.410 4.878 C 15.945 4.348 14.807 4.000 13.014 4.000 L 7.514 4.000 L 5.247 18.373 L 6.808 18.373 L 7.538 13.745 L 7.546 13.746 C 7.846 12.430 9.017 11.479 10.388 11.479 Z"),
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
        return _paypalLine!!
    }

private var _paypalLine: ImageVector? = null
