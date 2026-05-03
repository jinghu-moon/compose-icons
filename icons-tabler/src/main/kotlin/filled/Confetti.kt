package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = tablerFilledIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 C 4.001 3.471 4.413 3.034 4.941 3.003 C 5.470 2.972 5.931 3.358 5.993 3.883 L 6.000 4.000 C 6.529 4.001 6.966 4.413 6.997 4.941 C 7.028 5.470 6.642 5.931 6.117 5.993 L 6.000 6.000 C 6.000 6.552 5.552 7.000 5.000 7.000 C 4.448 7.000 4.000 6.552 4.000 6.000 C 3.448 6.000 3.000 5.552 3.000 5.000M 10.530 3.757 C 10.615 3.408 10.880 3.132 11.225 3.032 C 11.570 2.933 11.942 3.026 12.199 3.276 C 12.456 3.526 12.560 3.895 12.470 4.243 L 11.970 6.243 C 11.885 6.592 11.620 6.868 11.275 6.968 C 10.930 7.067 10.558 6.974 10.301 6.724 C 10.044 6.474 9.940 6.105 10.030 5.757 ZM 17.000 5.000 C 17.000 4.448 17.448 4.000 18.000 4.000 C 18.001 3.471 18.413 3.034 18.941 3.003 C 19.470 2.972 19.931 3.358 19.993 3.883 L 20.000 4.000 C 20.529 4.001 20.966 4.413 20.997 4.941 C 21.028 5.470 20.642 5.931 20.117 5.993 L 20.000 6.000 C 20.000 6.552 19.552 7.000 19.000 7.000 C 18.448 7.000 18.000 6.552 18.000 6.000 C 17.448 6.000 17.000 5.552 17.000 5.000M 8.190 9.293 L 14.707 15.811 C 14.939 16.042 15.043 16.373 14.985 16.695 C 14.927 17.018 14.715 17.292 14.417 17.428 L 4.844 21.815 C 4.083 22.170 3.181 22.012 2.586 21.419 C 1.992 20.826 1.830 19.925 2.183 19.163 L 6.573 9.583 C 6.710 9.285 6.983 9.074 7.305 9.016 C 7.627 8.958 7.958 9.062 8.189 9.293M 15.706 8.293 C 16.096 8.684 16.096 9.316 15.706 9.707 L 14.706 10.707 C 14.314 11.086 13.690 11.081 13.304 10.695 C 12.918 10.309 12.913 9.685 13.292 9.293 L 14.292 8.293 C 14.682 7.903 15.316 7.903 15.706 8.293M 19.756 11.530 C 20.290 11.400 20.829 11.726 20.962 12.259 C 21.096 12.792 20.774 13.333 20.242 13.470 L 18.242 13.970 C 17.708 14.100 17.169 13.774 17.036 13.241 C 16.902 12.708 17.224 12.167 17.756 12.030 ZM 17.000 19.000 C 17.000 18.448 17.448 18.000 18.000 18.000 C 18.001 17.471 18.413 17.034 18.941 17.003 C 19.470 16.972 19.931 17.358 19.993 17.883 L 20.000 18.000 C 20.529 18.001 20.966 18.413 20.997 18.941 C 21.028 19.470 20.642 19.931 20.117 19.993 L 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 C 18.448 21.000 18.000 20.552 18.000 20.000 C 17.448 20.000 17.000 19.552 17.000 19.000"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
