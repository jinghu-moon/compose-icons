package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ImageCircleFill: ImageVector
    get() {
        if (_imageCircleFill != null) return _imageCircleFill!!
        _imageCircleFill = remixIcon(
            name = "ImageCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.576 14.576 15.707 10.707c-.391-.391-1.024-.391-1.414 0L6.865 18.135C5.114 16.667 4 14.464 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 .901-.149 1.768-.424 2.576ZM12 22c5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10ZM11 10c0 1.105-.895 2-2 2C7.895 12 7 11.105 7 10 7 8.895 7.895 8 9 8c1.105 0 2 .895 2 2Z"),
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
        return _imageCircleFill!!
    }

private var _imageCircleFill: ImageVector? = null
