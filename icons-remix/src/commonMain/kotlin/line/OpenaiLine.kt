package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OpenaiLine: ImageVector
    get() {
        if (_openaiLine != null) return _openaiLine!!
        _openaiLine = remixIcon(
            name = "OpenaiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 4.000 C 11.649 4.000 12.250 4.206 12.741 4.556 C 11.449 5.229 10.260 6.076 9.000 6.804 L 10.000 8.536 C 11.575 7.627 13.052 6.485 14.761 5.830 C 16.113 5.312 17.681 5.840 18.428 7.134 C 18.753 7.696 18.875 8.319 18.817 8.920 C 17.588 8.137 16.260 7.531 15.000 6.804 L 14.000 8.536 C 15.575 9.445 17.302 10.154 18.723 11.306 C 19.849 12.218 20.175 13.840 19.428 15.134 C 19.104 15.696 18.625 16.114 18.075 16.364 C 18.139 14.908 18.000 13.455 18.000 12.000 L 16.000 12.000 C 16.000 13.818 16.250 15.668 15.963 17.476 C 15.735 18.906 14.494 20.000 13.000 20.000 C 12.351 20.000 11.750 19.794 11.258 19.443 C 12.551 18.770 13.740 17.924 15.000 17.196 L 14.000 15.464 C 12.425 16.373 10.948 17.515 9.239 18.170 C 7.887 18.688 6.319 18.160 5.572 16.866 C 5.247 16.304 5.125 15.681 5.183 15.079 C 6.412 15.862 7.740 16.469 9.000 17.196 L 10.000 15.464 C 8.425 14.555 6.698 13.846 5.276 12.694 C 4.151 11.782 3.825 10.160 4.572 8.866 C 4.896 8.304 5.375 7.886 5.925 7.636 C 5.861 9.092 6.000 10.545 6.000 12.000 L 8.000 12.000 C 8.000 10.182 7.750 8.331 8.037 6.524 C 8.265 5.094 9.506 4.000 11.000 4.000 ZM 14.792 3.742 C 13.877 2.677 12.518 2.000 11.000 2.000 C 8.778 2.000 6.896 3.448 6.244 5.452 C 4.864 5.713 3.599 6.552 2.840 7.866 C 1.729 9.790 2.042 12.144 3.452 13.711 C 2.987 15.037 3.081 16.552 3.840 17.866 C 4.951 19.790 7.146 20.696 9.207 20.258 C 10.123 21.323 11.482 22.000 13.000 22.000 C 15.222 22.000 17.104 20.552 17.756 18.548 C 19.136 18.287 20.401 17.448 21.160 16.134 C 22.271 14.210 21.958 11.856 20.548 10.289 C 21.013 8.963 20.919 7.448 20.160 6.134 C 19.049 4.210 16.854 3.304 14.792 3.742 Z"),
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
        return _openaiLine!!
    }

private var _openaiLine: ImageVector? = null
