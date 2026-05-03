package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FingerprintLine: ImageVector
    get() {
        if (_fingerprintLine != null) return _fingerprintLine!!
        _fingerprintLine = remixIcon(
            name = "FingerprintLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 13.000 L 17.000 14.000 C 17.000 16.770 16.336 19.445 15.085 21.846 L 14.858 22.266 L 13.112 21.292 C 14.272 19.212 14.921 16.882 14.993 14.456 L 15.000 14.000 L 15.000 13.000 L 17.000 13.000 ZM 11.000 10.000 L 13.000 10.000 L 13.000 14.000 L 12.995 14.379 C 12.915 17.149 11.965 19.773 10.304 21.928 L 10.073 22.219 L 8.524 20.954 C 10.041 19.097 10.915 16.802 10.994 14.366 L 11.000 14.000 L 11.000 10.000 ZM 12.000 6.000 C 14.762 6.000 17.000 8.239 17.000 11.000 L 15.000 11.000 C 15.000 9.343 13.657 8.000 12.000 8.000 C 10.343 8.000 9.000 9.343 9.000 11.000 L 9.000 14.000 C 9.000 16.235 8.181 18.344 6.729 19.977 L 6.518 20.207 L 5.070 18.827 C 6.233 17.606 6.921 16.012 6.994 14.303 L 7.000 14.000 L 7.000 11.000 C 7.000 8.239 9.239 6.000 12.000 6.000 ZM 12.000 2.000 C 16.971 2.000 21.000 6.029 21.000 11.000 L 21.000 14.000 C 21.000 15.698 20.799 17.370 20.403 18.990 L 20.265 19.528 L 18.335 19.003 C 18.726 17.566 18.948 16.081 18.992 14.568 L 19.000 14.000 L 19.000 11.000 C 19.000 7.134 15.866 4.000 12.000 4.000 C 10.428 4.000 8.977 4.518 7.808 5.394 L 6.383 3.968 C 7.923 2.736 9.875 2.000 12.000 2.000 ZM 4.968 5.383 L 6.394 6.808 C 5.563 7.917 5.054 9.280 5.004 10.759 L 5.000 10.999 L 5.004 13.000 C 5.004 14.120 4.740 15.203 4.243 16.177 L 4.086 16.466 L 2.350 15.475 C 2.729 14.810 2.951 14.068 2.995 13.292 L 3.004 13.000 L 3.004 11.000 C 3.000 8.875 3.737 6.922 4.968 5.383 Z"),
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
        return _fingerprintLine!!
    }

private var _fingerprintLine: ImageVector? = null
