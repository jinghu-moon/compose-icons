package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BaseballLine: ImageVector
    get() {
        if (_baseballLine != null) return _baseballLine!!
        _baseballLine = remixIcon(
            name = "BaseballLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.204 2.399 C 11.728 1.664 14.541 1.920 17.000 3.339 C 19.458 4.759 21.086 7.067 21.712 9.621 C 22.304 12.035 22.001 14.676 20.660 17.000 C 19.318 19.323 17.182 20.906 14.795 21.601 C 12.271 22.336 9.458 22.079 6.999 20.660 C 4.541 19.240 2.913 16.933 2.287 14.379 C 1.695 11.965 1.998 9.323 3.339 6.999 C 4.681 4.676 6.817 3.094 9.204 2.399 ZM 16.000 5.072 C 14.314 4.099 12.423 3.809 10.644 4.116 C 10.943 6.247 10.561 8.491 9.402 10.500 C 8.243 12.507 6.489 13.960 4.495 14.766 C 5.118 16.461 6.314 17.955 7.999 18.928 C 9.685 19.901 11.576 20.190 13.355 19.882 C 13.056 17.752 13.439 15.507 14.598 13.500 C 15.757 11.492 17.510 10.038 19.504 9.232 C 18.881 7.537 17.685 6.045 16.000 5.072 ZM 19.961 11.210 C 18.487 11.875 17.200 12.991 16.330 14.500 C 15.459 16.007 15.135 17.679 15.296 19.289 C 16.771 18.623 18.058 17.507 18.928 16.000 C 19.799 14.491 20.123 12.819 19.961 11.210 ZM 8.703 4.709 C 7.228 5.375 5.942 6.492 5.072 7.999 C 4.201 9.507 3.878 11.179 4.039 12.789 C 5.513 12.123 6.799 11.007 7.669 9.500 C 8.540 7.991 8.864 6.319 8.703 4.709 Z"),
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
        return _baseballLine!!
    }

private var _baseballLine: ImageVector? = null
