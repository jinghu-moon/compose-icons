package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BallPenLine: ImageVector
    get() {
        if (_ballPenLine != null) return _ballPenLine!!
        _ballPenLine = remixIcon(
            name = "BallPenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.849 11.698 L 17.142 10.991 L 7.243 20.891 L 3.000 20.891 L 3.000 16.648 L 14.314 5.334 L 19.971 10.991 C 20.361 11.382 20.361 12.015 19.971 12.405 L 12.899 19.476 L 11.485 18.062 L 17.849 11.698 ZM 15.728 9.577 L 14.314 8.163 L 5.000 17.476 L 5.000 18.891 L 6.414 18.891 L 15.728 9.577 ZM 18.556 2.506 L 21.385 5.334 C 21.775 5.725 21.775 6.358 21.385 6.749 L 19.971 8.163 L 15.728 3.920 L 17.142 2.506 C 17.533 2.115 18.166 2.115 18.556 2.506 Z"),
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
        return _ballPenLine!!
    }

private var _ballPenLine: ImageVector? = null
