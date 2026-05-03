package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TyphoonFill: ImageVector
    get() {
        if (_typhoonFill != null) return _typhoonFill!!
        _typhoonFill = remixIcon(
            name = "TyphoonFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.654 1.700 L 14.872 4.233 C 16.147 4.623 17.345 5.281 18.361 6.206 C 21.874 9.406 21.874 14.594 18.361 17.794 C 15.770 20.154 11.764 21.656 6.346 22.300 L 9.128 19.767 C 7.853 19.377 6.655 18.719 5.639 17.794 C 2.126 14.594 2.105 9.425 5.639 6.206 C 8.230 3.846 12.236 2.344 17.654 1.700 ZM 12.000 8.000 C 9.515 8.000 7.500 9.791 7.500 12.000 C 7.500 14.209 9.515 16.000 12.000 16.000 C 14.485 16.000 16.500 14.209 16.500 12.000 C 16.500 9.791 14.485 8.000 12.000 8.000 Z"),
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
        return _typhoonFill!!
    }

private var _typhoonFill: ImageVector? = null
