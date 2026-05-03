package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Heart2Line: ImageVector
    get() {
        if (_heart2Line != null) return _heart2Line!!
        _heart2Line = remixIcon(
            name = "Heart2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.243 4.757 C 22.505 7.025 22.583 10.637 20.479 12.993 L 12.000 21.485 L 3.521 12.993 C 1.417 10.637 1.496 7.019 3.757 4.757 C 6.022 2.493 9.645 2.417 12.001 4.529 C 14.350 2.420 17.980 2.490 20.243 4.757 ZM 5.172 6.172 C 3.682 7.661 3.607 10.047 4.980 11.623 L 12.000 18.654 L 19.020 11.623 C 20.393 10.047 20.319 7.665 18.827 6.170 C 17.340 4.680 14.946 4.608 13.374 5.984 L 9.172 10.187 L 7.757 8.773 L 10.582 5.946 L 10.500 5.877 C 8.925 4.612 6.623 4.720 5.172 6.172 Z"),
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
        return _heart2Line!!
    }

private var _heart2Line: ImageVector? = null
