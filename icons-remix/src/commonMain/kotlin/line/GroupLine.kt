package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GroupLine: ImageVector
    get() {
        if (_groupLine != null) return _groupLine!!
        _groupLine = remixIcon(
            name = "GroupLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 22.000 C 2.000 17.582 5.582 14.000 10.000 14.000 C 14.418 14.000 18.000 17.582 18.000 22.000 L 16.000 22.000 C 16.000 18.686 13.314 16.000 10.000 16.000 C 6.686 16.000 4.000 18.686 4.000 22.000 L 2.000 22.000 ZM 10.000 13.000 C 6.685 13.000 4.000 10.315 4.000 7.000 C 4.000 3.685 6.685 1.000 10.000 1.000 C 13.315 1.000 16.000 3.685 16.000 7.000 C 16.000 10.315 13.315 13.000 10.000 13.000 ZM 10.000 11.000 C 12.210 11.000 14.000 9.210 14.000 7.000 C 14.000 4.790 12.210 3.000 10.000 3.000 C 7.790 3.000 6.000 4.790 6.000 7.000 C 6.000 9.210 7.790 11.000 10.000 11.000 ZM 18.284 14.703 C 21.064 15.956 23.000 18.752 23.000 22.000 L 21.000 22.000 C 21.000 19.564 19.548 17.467 17.463 16.527 L 18.284 14.703 ZM 17.596 3.413 C 19.594 4.237 21.000 6.204 21.000 8.500 C 21.000 11.370 18.804 13.725 16.000 13.978 L 16.000 11.965 C 17.697 11.722 19.000 10.264 19.000 8.500 C 19.000 7.119 18.202 5.926 17.041 5.356 L 17.596 3.413 Z"),
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
        return _groupLine!!
    }

private var _groupLine: ImageVector? = null
