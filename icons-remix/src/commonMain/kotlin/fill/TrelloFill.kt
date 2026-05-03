package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TrelloFill: ImageVector
    get() {
        if (_trelloFill != null) return _trelloFill!!
        _trelloFill = remixIcon(
            name = "TrelloFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.251 3.000 L 18.751 3.000 C 19.993 3.000 21.001 4.007 21.001 5.250 L 21.001 18.750 C 21.001 19.992 19.993 21.000 18.751 21.000 L 5.251 21.000 C 4.009 21.000 3.001 19.993 3.001 18.750 L 3.001 5.250 C 3.001 4.008 4.008 3.000 5.251 3.000 ZM 13.171 6.421 L 13.171 12.179 C 13.171 12.776 13.655 13.260 14.251 13.260 L 17.581 13.260 C 18.178 13.260 18.661 12.776 18.661 12.179 L 18.661 6.421 C 18.661 5.824 18.177 5.340 17.581 5.340 L 14.251 5.340 C 13.654 5.340 13.171 5.823 13.171 6.421 ZM 5.341 6.420 L 5.341 16.680 C 5.341 17.276 5.825 17.760 6.421 17.760 L 9.751 17.760 C 10.348 17.760 10.831 17.277 10.831 16.680 L 10.831 6.420 C 10.831 5.824 10.347 5.340 9.751 5.340 L 6.421 5.340 C 5.824 5.340 5.341 5.823 5.341 6.420 Z"),
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
        return _trelloFill!!
    }

private var _trelloFill: ImageVector? = null
