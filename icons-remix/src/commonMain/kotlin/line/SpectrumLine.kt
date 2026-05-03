package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpectrumLine: ImageVector
    get() {
        if (_spectrumLine != null) return _spectrumLine!!
        _spectrumLine = remixIcon(
            name = "SpectrumLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.389 2.001 L 13.200 2.006 L 14.043 2.020 C 21.205 2.185 21.982 3.532 22.000 11.687 L 21.995 13.199 L 21.981 14.043 C 21.816 21.204 20.469 21.981 12.314 22.000 L 10.802 21.994 L 9.914 21.979 C 3.060 21.816 2.086 20.552 2.007 13.199 L 2.001 11.691 L 2.007 10.801 L 2.021 9.936 C 2.186 2.883 3.507 2.039 11.389 2.001 ZM 14.120 4.009 L 10.883 4.001 L 9.561 4.011 C 4.072 4.093 4.017 4.832 4.002 11.414 L 4.003 13.589 L 4.013 14.630 C 4.101 19.611 4.806 19.972 10.412 19.998 L 13.867 19.997 L 14.643 19.987 C 19.751 19.896 19.989 19.150 20.000 13.110 L 19.998 10.368 L 19.986 9.312 C 19.892 4.516 19.201 4.063 14.120 4.009 ZM 8.251 7.000 C 13.083 7.000 17.001 10.918 17.001 15.750 L 17.001 16.333 C 17.001 16.702 16.702 17.000 16.334 17.000 L 12.667 17.000 C 12.299 17.000 12.001 16.702 12.001 16.333 L 12.001 15.750 C 12.001 13.679 10.322 12.000 8.251 12.000 L 7.667 12.000 C 7.299 12.000 7.001 11.702 7.001 11.333 L 7.001 7.667 C 7.001 7.299 7.299 7.000 7.667 7.000 L 8.251 7.000 Z"),
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
        return _spectrumLine!!
    }

private var _spectrumLine: ImageVector? = null
