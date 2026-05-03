package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LinkedinFill: ImageVector
    get() {
        if (_linkedinFill != null) return _linkedinFill!!
        _linkedinFill = remixIcon(
            name = "LinkedinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.940 5.000 C 6.940 5.814 6.446 6.547 5.691 6.853 C 4.937 7.158 4.072 6.976 3.505 6.392 C 2.938 5.807 2.782 4.937 3.111 4.192 C 3.439 3.447 4.187 2.976 5.000 3.000 C 6.082 3.032 6.941 3.918 6.940 5.000 ZM 7.000 8.480 L 3.000 8.480 L 3.000 21.000 L 7.000 21.000 L 7.000 8.480 ZM 13.321 8.480 L 9.340 8.480 L 9.340 21.000 L 13.281 21.000 L 13.281 14.430 C 13.281 10.770 18.051 10.430 18.051 14.430 L 18.051 21.000 L 22.000 21.000 L 22.000 13.070 C 22.000 6.900 14.941 7.130 13.281 10.160 L 13.321 8.480 Z"),
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
        return _linkedinFill!!
    }

private var _linkedinFill: ImageVector? = null
