package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HourglassFill: ImageVector
    get() {
        if (_hourglassFill != null) return _hourglassFill!!
        _hourglassFill = remixIcon(
            name = "HourglassFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 4.000 L 4.000 4.000 L 4.000 2.000 L 20.000 2.000 L 20.000 4.000 L 18.000 4.000 L 18.000 6.000 C 18.000 7.615 17.184 8.915 16.156 9.977 C 15.453 10.703 14.598 11.372 13.731 12.000 C 14.598 12.628 15.453 13.297 16.156 14.023 C 17.184 15.085 18.000 16.385 18.000 18.000 L 18.000 20.000 L 20.000 20.000 L 20.000 22.000 L 4.000 22.000 L 4.000 20.000 L 6.000 20.000 L 6.000 18.000 C 6.000 16.385 6.816 15.085 7.844 14.023 C 8.547 13.297 9.402 12.628 10.269 12.000 C 9.402 11.372 8.547 10.703 7.844 9.977 C 6.816 8.915 6.000 7.615 6.000 6.000 L 6.000 4.000 ZM 8.000 4.000 L 8.000 6.000 C 8.000 6.685 8.260 7.335 8.771 8.000 L 15.229 8.000 C 15.740 7.335 16.000 6.685 16.000 6.000 L 16.000 4.000 L 8.000 4.000 ZM 12.000 13.222 C 10.955 13.960 10.008 14.663 9.281 15.414 C 9.090 15.612 8.920 15.806 8.771 16.000 L 15.229 16.000 C 15.080 15.806 14.910 15.612 14.719 15.414 C 13.992 14.663 13.045 13.960 12.000 13.222 Z"),
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
        return _hourglassFill!!
    }

private var _hourglassFill: ImageVector? = null
