package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.IdCardFill: ImageVector
    get() {
        if (_idCardFill != null) return _idCardFill!!
        _idCardFill = remixIcon(
            name = "IdCardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.000 5.000 C 1.000 4.448 1.448 4.000 2.000 4.000 L 22.000 4.000 C 22.552 4.000 23.000 4.448 23.000 5.000 L 23.000 19.000 C 23.000 19.552 22.552 20.000 22.000 20.000 L 2.000 20.000 C 1.448 20.000 1.000 19.552 1.000 19.000 L 1.000 5.000 ZM 13.000 8.000 L 13.000 10.000 L 19.000 10.000 L 19.000 8.000 L 13.000 8.000 ZM 18.000 12.000 L 13.000 12.000 L 13.000 14.000 L 18.000 14.000 L 18.000 12.000 ZM 10.500 10.000 C 10.500 8.619 9.381 7.500 8.000 7.500 C 6.619 7.500 5.500 8.619 5.500 10.000 C 5.500 11.381 6.619 12.500 8.000 12.500 C 9.381 12.500 10.500 11.381 10.500 10.000 ZM 8.000 13.500 C 6.067 13.500 4.500 15.067 4.500 17.000 L 11.500 17.000 C 11.500 15.067 9.933 13.500 8.000 13.500 Z"),
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
        return _idCardFill!!
    }

private var _idCardFill: ImageVector? = null
