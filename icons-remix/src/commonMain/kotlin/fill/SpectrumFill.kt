package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpectrumFill: ImageVector
    get() {
        if (_spectrumFill != null) return _spectrumFill!!
        _spectrumFill = remixIcon(
            name = "SpectrumFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.200 2.006 C 21.241 2.093 22.001 3.250 22.001 12.000 L 21.995 13.199 C 21.908 21.241 20.751 22.000 12.001 22.000 L 10.802 21.994 C 3.143 21.911 2.089 20.858 2.007 13.199 L 2.001 11.691 L 2.007 10.801 C 2.092 2.951 3.196 2.040 11.389 2.001 L 13.200 2.006 ZM 8.251 7.000 L 7.667 7.000 C 7.333 7.000 7.056 7.247 7.008 7.568 L 7.001 7.667 L 7.001 11.333 C 7.001 11.668 7.247 11.945 7.569 11.993 L 7.667 12.000 L 8.251 12.000 C 10.255 12.000 11.892 13.573 11.995 15.551 L 12.001 15.750 L 12.001 16.333 C 12.001 16.668 12.247 16.945 12.569 16.993 L 12.667 17.000 L 16.334 17.000 C 16.669 17.000 16.946 16.753 16.993 16.432 L 17.001 16.333 L 17.001 15.750 C 17.001 11.004 13.222 7.140 8.509 7.004 L 8.251 7.000 Z"),
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
        return _spectrumFill!!
    }

private var _spectrumFill: ImageVector? = null
