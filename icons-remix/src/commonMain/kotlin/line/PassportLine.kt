package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PassportLine: ImageVector
    get() {
        if (_passportLine != null) return _passportLine!!
        _passportLine = remixIcon(
            name = "PassportLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 ZM 19.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 4.000 ZM 16.000 16.000 L 16.000 18.000 L 8.000 18.000 L 8.000 16.000 L 16.000 16.000 ZM 12.000 6.000 C 14.209 6.000 16.000 7.791 16.000 10.000 C 16.000 12.209 14.209 14.000 12.000 14.000 C 9.791 14.000 8.000 12.209 8.000 10.000 C 8.000 7.791 9.791 6.000 12.000 6.000 ZM 12.000 8.000 C 10.895 8.000 10.000 8.895 10.000 10.000 C 10.000 11.105 10.895 12.000 12.000 12.000 C 13.105 12.000 14.000 11.105 14.000 10.000 C 14.000 8.895 13.105 8.000 12.000 8.000 Z"),
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
        return _passportLine!!
    }

private var _passportLine: ImageVector? = null
