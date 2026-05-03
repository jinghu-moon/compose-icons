package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailOpenLine: ImageVector
    get() {
        if (_mailOpenLine != null) return _mailOpenLine!!
        _mailOpenLine = remixIcon(
            name = "MailOpenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.243 6.854 L 11.490 1.309 C 11.806 1.119 12.202 1.119 12.519 1.309 L 21.757 6.854 C 21.908 6.945 22.000 7.107 22.000 7.283 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 7.283 C 2.000 7.107 2.092 6.945 2.243 6.854 ZM 4.000 8.133 L 4.000 19.000 L 20.000 19.000 L 20.000 8.132 L 12.004 3.332 L 4.000 8.133 ZM 12.060 13.698 L 17.356 9.235 L 18.644 10.765 L 12.074 16.302 L 5.364 10.772 L 6.636 9.228 L 12.060 13.698 Z"),
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
        return _mailOpenLine!!
    }

private var _mailOpenLine: ImageVector? = null
