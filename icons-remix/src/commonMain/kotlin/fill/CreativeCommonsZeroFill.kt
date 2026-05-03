package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CreativeCommonsZeroFill: ImageVector
    get() {
        if (_creativeCommonsZeroFill != null) return _creativeCommonsZeroFill!!
        _creativeCommonsZeroFill = remixIcon(
            name = "CreativeCommonsZeroFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.520 2.000 22.000 6.480 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 ZM 12.000 6.000 C 9.239 6.000 7.000 8.686 7.000 12.000 C 7.000 15.314 9.239 18.000 12.000 18.000 C 14.761 18.000 17.000 15.314 17.000 12.000 C 17.000 8.686 14.761 6.000 12.000 6.000 ZM 14.325 9.472 C 14.747 10.161 15.000 11.041 15.000 12.000 C 15.000 14.209 13.657 16.000 12.000 16.000 C 11.559 16.000 11.140 15.873 10.763 15.645 L 14.325 9.472 ZM 12.000 8.000 C 12.441 8.000 12.860 8.127 13.237 8.355 L 9.675 14.528 C 9.253 13.839 9.000 12.959 9.000 12.000 C 9.000 9.791 10.343 8.000 12.000 8.000 Z"),
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
        return _creativeCommonsZeroFill!!
    }

private var _creativeCommonsZeroFill: ImageVector? = null
