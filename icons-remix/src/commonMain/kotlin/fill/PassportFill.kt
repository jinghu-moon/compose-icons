package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PassportFill: ImageVector
    get() {
        if (_passportFill != null) return _passportFill!!
        _passportFill = remixIcon(
            name = "PassportFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 ZM 16.000 16.000 L 8.000 16.000 L 8.000 18.000 L 16.000 18.000 L 16.000 16.000 ZM 12.000 6.000 C 9.791 6.000 8.000 7.791 8.000 10.000 C 8.000 12.209 9.791 14.000 12.000 14.000 C 14.209 14.000 16.000 12.209 16.000 10.000 C 16.000 7.791 14.209 6.000 12.000 6.000 ZM 12.000 8.000 C 13.105 8.000 14.000 8.895 14.000 10.000 C 14.000 11.105 13.105 12.000 12.000 12.000 C 10.895 12.000 10.000 11.105 10.000 10.000 C 10.000 8.895 10.895 8.000 12.000 8.000 Z"),
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
        return _passportFill!!
    }

private var _passportFill: ImageVector? = null
