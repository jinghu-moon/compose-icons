package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Restaurant2Line: ImageVector
    get() {
        if (_restaurant2Line != null) return _restaurant2Line!!
        _restaurant2Line = remixIcon(
            name = "Restaurant2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.268 12.147 L 13.415 13.000 L 20.486 20.071 L 19.072 21.485 L 12.000 14.414 L 4.929 21.485 L 3.515 20.071 L 12.854 10.732 C 12.266 9.275 12.874 7.177 14.475 5.576 C 16.428 3.623 19.119 3.148 20.486 4.515 C 21.853 5.882 21.378 8.573 19.425 10.525 C 17.823 12.127 15.725 12.734 14.268 12.147 ZM 4.222 3.808 L 10.940 10.525 L 8.111 13.354 L 4.222 9.465 C 2.660 7.903 2.660 5.370 4.222 3.808 ZM 18.011 9.111 C 19.268 7.854 19.527 6.385 19.072 5.929 C 18.616 5.473 17.147 5.733 15.890 6.990 C 14.632 8.247 14.373 9.716 14.829 10.172 C 15.285 10.627 16.754 10.368 18.011 9.111 Z"),
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
        return _restaurant2Line!!
    }

private var _restaurant2Line: ImageVector? = null
