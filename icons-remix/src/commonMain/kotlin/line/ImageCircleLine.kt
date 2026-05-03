package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ImageCircleLine: ImageVector
    get() {
        if (_imageCircleLine != null) return _imageCircleLine!!
        _imageCircleLine = remixIcon(
            name = "ImageCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.576 14.576 L 15.707 10.707 C 15.316 10.316 14.683 10.316 14.292 10.707 L 6.865 18.135 C 5.114 16.667 4.000 14.464 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 12.901 19.851 13.768 19.576 14.576 ZM 8.589 19.239 L 15.000 12.828 L 18.638 16.467 C 17.199 18.600 14.761 20.000 12.000 20.000 C 10.778 20.000 9.623 19.727 8.589 19.239 ZM 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 11.000 10.000 C 11.000 11.105 10.105 12.000 9.000 12.000 C 7.895 12.000 7.000 11.105 7.000 10.000 C 7.000 8.895 7.895 8.000 9.000 8.000 C 10.105 8.000 11.000 8.895 11.000 10.000 Z"),
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
        return _imageCircleLine!!
    }

private var _imageCircleLine: ImageVector? = null
