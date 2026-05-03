package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Exchange2Line: ImageVector
    get() {
        if (_exchange2Line != null) return _exchange2Line!!
        _exchange2Line = remixIcon(
            name = "Exchange2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 21.500 C 4.515 21.500 2.500 19.485 2.500 17.000 C 2.500 14.515 4.515 12.500 7.000 12.500 C 9.485 12.500 11.500 14.515 11.500 17.000 C 11.500 19.485 9.485 21.500 7.000 21.500 ZM 17.000 11.500 C 14.515 11.500 12.500 9.485 12.500 7.000 C 12.500 4.515 14.515 2.500 17.000 2.500 C 19.485 2.500 21.500 4.515 21.500 7.000 C 21.500 9.485 19.485 11.500 17.000 11.500 ZM 7.000 19.500 C 8.381 19.500 9.500 18.381 9.500 17.000 C 9.500 15.619 8.381 14.500 7.000 14.500 C 5.619 14.500 4.500 15.619 4.500 17.000 C 4.500 18.381 5.619 19.500 7.000 19.500 ZM 17.000 9.500 C 18.381 9.500 19.500 8.381 19.500 7.000 C 19.500 5.619 18.381 4.500 17.000 4.500 C 15.619 4.500 14.500 5.619 14.500 7.000 C 14.500 8.381 15.619 9.500 17.000 9.500 ZM 3.000 8.000 C 3.000 5.239 5.239 3.000 8.000 3.000 L 11.000 3.000 L 11.000 5.000 L 8.000 5.000 C 6.343 5.000 5.000 6.343 5.000 8.000 L 5.000 11.000 L 3.000 11.000 L 3.000 8.000 ZM 21.000 13.000 L 19.000 13.000 L 19.000 16.000 C 19.000 17.657 17.657 19.000 16.000 19.000 L 13.000 19.000 L 13.000 21.000 L 16.000 21.000 C 18.761 21.000 21.000 18.761 21.000 16.000 L 21.000 13.000 Z"),
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
        return _exchange2Line!!
    }

private var _exchange2Line: ImageVector? = null
