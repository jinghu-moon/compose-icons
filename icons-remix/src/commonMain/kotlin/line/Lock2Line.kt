package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Lock2Line: ImageVector
    get() {
        if (_lock2Line != null) return _lock2Line!!
        _lock2Line = remixIcon(
            name = "Lock2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 8.000 L 6.000 7.000 C 6.000 3.686 8.686 1.000 12.000 1.000 C 15.314 1.000 18.000 3.686 18.000 7.000 L 18.000 8.000 L 20.000 8.000 C 20.552 8.000 21.000 8.448 21.000 9.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 9.000 C 3.000 8.448 3.448 8.000 4.000 8.000 L 6.000 8.000 ZM 19.000 10.000 L 5.000 10.000 L 5.000 20.000 L 19.000 20.000 L 19.000 10.000 ZM 11.000 15.732 C 10.402 15.387 10.000 14.740 10.000 14.000 C 10.000 12.895 10.895 12.000 12.000 12.000 C 13.105 12.000 14.000 12.895 14.000 14.000 C 14.000 14.740 13.598 15.387 13.000 15.732 L 13.000 18.000 L 11.000 18.000 L 11.000 15.732 ZM 8.000 8.000 L 16.000 8.000 L 16.000 7.000 C 16.000 4.791 14.209 3.000 12.000 3.000 C 9.791 3.000 8.000 4.791 8.000 7.000 L 8.000 8.000 Z"),
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
        return _lock2Line!!
    }

private var _lock2Line: ImageVector? = null
