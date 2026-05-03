package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TrainLine: ImageVector
    get() {
        if (_trainLine != null) return _trainLine!!
        _trainLine = remixIcon(
            name = "TrainLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.200 20.000 L 19.000 21.500 L 19.000 22.000 L 5.000 22.000 L 5.000 21.500 L 6.800 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 L 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 L 21.000 18.000 C 21.000 19.105 20.105 20.000 19.000 20.000 L 17.200 20.000 ZM 7.000 5.000 C 5.895 5.000 5.000 5.895 5.000 7.000 L 5.000 18.000 L 19.000 18.000 L 19.000 7.000 C 19.000 5.895 18.105 5.000 17.000 5.000 L 7.000 5.000 ZM 12.000 17.000 C 10.895 17.000 10.000 16.105 10.000 15.000 C 10.000 13.895 10.895 13.000 12.000 13.000 C 13.105 13.000 14.000 13.895 14.000 15.000 C 14.000 16.105 13.105 17.000 12.000 17.000 ZM 6.000 7.000 L 18.000 7.000 L 18.000 11.000 L 6.000 11.000 L 6.000 7.000 Z"),
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
        return _trainLine!!
    }

private var _trainLine: ImageVector? = null
