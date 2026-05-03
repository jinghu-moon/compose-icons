package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Apps2AddLine: ImageVector
    get() {
        if (_apps2AddLine != null) return _apps2AddLine!!
        _apps2AddLine = remixIcon(
            name = "Apps2AddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.500 7.000 C 2.500 9.485 4.515 11.500 7.000 11.500 C 9.485 11.500 11.500 9.485 11.500 7.000 C 11.500 4.515 9.485 2.500 7.000 2.500 C 4.515 2.500 2.500 4.515 2.500 7.000 ZM 2.500 17.000 C 2.500 19.485 4.515 21.500 7.000 21.500 C 9.485 21.500 11.500 19.485 11.500 17.000 C 11.500 14.515 9.485 12.500 7.000 12.500 C 4.515 12.500 2.500 14.515 2.500 17.000 ZM 12.500 17.000 C 12.500 19.485 14.515 21.500 17.000 21.500 C 19.485 21.500 21.500 19.485 21.500 17.000 C 21.500 14.515 19.485 12.500 17.000 12.500 C 14.515 12.500 12.500 14.515 12.500 17.000 ZM 9.500 7.000 C 9.500 8.381 8.381 9.500 7.000 9.500 C 5.619 9.500 4.500 8.381 4.500 7.000 C 4.500 5.619 5.619 4.500 7.000 4.500 C 8.381 4.500 9.500 5.619 9.500 7.000 ZM 9.500 17.000 C 9.500 18.381 8.381 19.500 7.000 19.500 C 5.619 19.500 4.500 18.381 4.500 17.000 C 4.500 15.619 5.619 14.500 7.000 14.500 C 8.381 14.500 9.500 15.619 9.500 17.000 ZM 19.500 17.000 C 19.500 18.381 18.381 19.500 17.000 19.500 C 15.619 19.500 14.500 18.381 14.500 17.000 C 14.500 15.619 15.619 14.500 17.000 14.500 C 18.381 14.500 19.500 15.619 19.500 17.000 ZM 16.000 11.000 L 16.000 8.000 L 13.000 8.000 L 13.000 6.000 L 16.000 6.000 L 16.000 3.000 L 18.000 3.000 L 18.000 6.000 L 21.000 6.000 L 21.000 8.000 L 18.000 8.000 L 18.000 11.000 L 16.000 11.000 Z"),
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
        return _apps2AddLine!!
    }

private var _apps2AddLine: ImageVector? = null
