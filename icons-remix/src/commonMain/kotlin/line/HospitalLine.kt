package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HospitalLine: ImageVector
    get() {
        if (_hospitalLine != null) return _hospitalLine!!
        _hospitalLine = remixIcon(
            name = "HospitalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 20.000 L 8.000 14.000 L 16.000 14.000 L 16.000 20.000 L 19.000 20.000 L 19.000 4.000 L 5.000 4.000 L 5.000 20.000 L 8.000 20.000 ZM 10.000 20.000 L 14.000 20.000 L 14.000 16.000 L 10.000 16.000 L 10.000 20.000 ZM 21.000 20.000 L 23.000 20.000 L 23.000 22.000 L 1.000 22.000 L 1.000 20.000 L 3.000 20.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 20.000 ZM 11.000 8.000 L 11.000 6.000 L 13.000 6.000 L 13.000 8.000 L 15.000 8.000 L 15.000 10.000 L 13.000 10.000 L 13.000 12.000 L 11.000 12.000 L 11.000 10.000 L 9.000 10.000 L 9.000 8.000 L 11.000 8.000 Z"),
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
        return _hospitalLine!!
    }

private var _hospitalLine: ImageVector? = null
