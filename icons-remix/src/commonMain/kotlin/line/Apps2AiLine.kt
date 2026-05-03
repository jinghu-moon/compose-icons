package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Apps2AiLine: ImageVector
    get() {
        if (_apps2AiLine != null) return _apps2AiLine!!
        _apps2AiLine = remixIcon(
            name = "Apps2AiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.500 7.000 C 2.500 9.485 4.515 11.500 7.000 11.500 C 9.485 11.500 11.500 9.485 11.500 7.000 C 11.500 4.515 9.485 2.500 7.000 2.500 C 4.515 2.500 2.500 4.515 2.500 7.000 ZM 2.500 17.000 C 2.500 19.485 4.515 21.500 7.000 21.500 C 9.485 21.500 11.500 19.485 11.500 17.000 C 11.500 14.515 9.485 12.500 7.000 12.500 C 4.515 12.500 2.500 14.515 2.500 17.000 ZM 12.500 17.000 C 12.500 19.485 14.515 21.500 17.000 21.500 C 19.485 21.500 21.500 19.485 21.500 17.000 C 21.500 14.515 19.485 12.500 17.000 12.500 C 14.515 12.500 12.500 14.515 12.500 17.000 ZM 9.500 7.000 C 9.500 8.381 8.381 9.500 7.000 9.500 C 5.619 9.500 4.500 8.381 4.500 7.000 C 4.500 5.619 5.619 4.500 7.000 4.500 C 8.381 4.500 9.500 5.619 9.500 7.000 ZM 9.500 17.000 C 9.500 18.381 8.381 19.500 7.000 19.500 C 5.619 19.500 4.500 18.381 4.500 17.000 C 4.500 15.619 5.619 14.500 7.000 14.500 C 8.381 14.500 9.500 15.619 9.500 17.000 ZM 19.500 17.000 C 19.500 18.381 18.381 19.500 17.000 19.500 C 15.619 19.500 14.500 18.381 14.500 17.000 C 14.500 15.619 15.619 14.500 17.000 14.500 C 18.381 14.500 19.500 15.619 19.500 17.000 ZM 17.525 11.155 L 17.803 10.519 C 18.297 9.384 19.188 8.481 20.299 7.986 L 21.153 7.606 C 21.615 7.401 21.615 6.728 21.153 6.523 L 20.347 6.164 C 19.207 5.657 18.300 4.720 17.814 3.547 L 17.529 2.859 C 17.331 2.380 16.669 2.380 16.471 2.859 L 16.186 3.547 C 15.700 4.720 14.793 5.657 13.653 6.164 L 12.847 6.523 C 12.384 6.728 12.384 7.401 12.847 7.606 L 13.701 7.986 C 14.812 8.481 15.703 9.384 16.197 10.519 L 16.475 11.155 C 16.678 11.621 17.322 11.621 17.525 11.155 Z"),
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
        return _apps2AiLine!!
    }

private var _apps2AiLine: ImageVector? = null
