package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeSmileLine: ImageVector
    get() {
        if (_homeSmileLine != null) return _homeSmileLine!!
        _homeSmileLine = remixIcon(
            name = "HomeSmileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 19.000 L 18.000 19.000 L 18.000 9.157 L 12.000 3.703 L 6.000 9.157 L 6.000 19.000 ZM 19.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.709 1.265 12.291 1.265 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 ZM 7.500 13.000 L 9.500 13.000 C 9.500 14.381 10.619 15.500 12.000 15.500 C 13.381 15.500 14.500 14.381 14.500 13.000 L 16.500 13.000 C 16.500 15.485 14.485 17.500 12.000 17.500 C 9.515 17.500 7.500 15.485 7.500 13.000 Z"),
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
        return _homeSmileLine!!
    }

private var _homeSmileLine: ImageVector? = null
