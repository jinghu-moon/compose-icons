package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.IdCardLine: ImageVector
    get() {
        if (_idCardLine != null) return _idCardLine!!
        _idCardLine = remixIcon(
            name = "IdCardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 6.000 L 21.000 6.000 L 21.000 18.000 L 3.000 18.000 L 3.000 6.000 ZM 2.000 4.000 C 1.448 4.000 1.000 4.448 1.000 5.000 L 1.000 19.000 C 1.000 19.552 1.448 20.000 2.000 20.000 L 22.000 20.000 C 22.552 20.000 23.000 19.552 23.000 19.000 L 23.000 5.000 C 23.000 4.448 22.552 4.000 22.000 4.000 L 2.000 4.000 ZM 13.000 8.000 L 19.000 8.000 L 19.000 10.000 L 13.000 10.000 L 13.000 8.000 ZM 18.000 12.000 L 13.000 12.000 L 13.000 14.000 L 18.000 14.000 L 18.000 12.000 ZM 10.500 10.000 C 10.500 11.381 9.381 12.500 8.000 12.500 C 6.619 12.500 5.500 11.381 5.500 10.000 C 5.500 8.619 6.619 7.500 8.000 7.500 C 9.381 7.500 10.500 8.619 10.500 10.000 ZM 8.000 13.500 C 6.067 13.500 4.500 15.067 4.500 17.000 L 11.500 17.000 C 11.500 15.067 9.933 13.500 8.000 13.500 Z"),
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
        return _idCardLine!!
    }

private var _idCardLine: ImageVector? = null
