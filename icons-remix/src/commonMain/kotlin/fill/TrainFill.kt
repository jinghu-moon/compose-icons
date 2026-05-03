package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TrainFill: ImageVector
    get() {
        if (_trainFill != null) return _trainFill!!
        _trainFill = remixIcon(
            name = "TrainFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.200 20.000 L 19.000 21.500 L 19.000 22.000 L 5.000 22.000 L 5.000 21.500 L 6.800 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 L 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 L 21.000 18.000 C 21.000 19.105 20.105 20.000 19.000 20.000 L 17.200 20.000 ZM 5.000 7.000 L 5.000 11.000 L 19.000 11.000 L 19.000 7.000 L 5.000 7.000 ZM 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 C 14.000 14.895 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 14.895 10.000 16.000 C 10.000 17.105 10.895 18.000 12.000 18.000 Z"),
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
        return _trainFill!!
    }

private var _trainFill: ImageVector? = null
