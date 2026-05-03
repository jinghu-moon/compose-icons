package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpeakerLoud: ImageVector
    get() {
        if (_speakerLoud != null) return _speakerLoud!!
        _speakerLoud = radixIcon(
            name = "SpeakerLoud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.002 1.066 C 7.144 0.984 7.320 0.978 7.470 1.051 C 7.641 1.135 7.750 1.309 7.750 1.500 L 7.750 13.500 C 7.750 13.691 7.641 13.866 7.470 13.949 C 7.298 14.033 7.094 14.012 6.943 13.895 L 3.222 11.000 L 1.500 11.000 C 0.723 11.000 0.085 10.410 0.008 9.653 L 0.000 9.500 L 0.000 5.500 C 0.000 4.672 0.672 4.000 1.500 4.000 L 3.222 4.000 L 6.943 1.106 L 7.002 1.066 ZM 12.115 1.384 C 12.284 1.241 12.536 1.262 12.679 1.431 L 12.947 1.763 C 15.551 5.134 15.551 9.866 12.947 13.238 L 12.679 13.569 L 12.620 13.626 C 12.474 13.741 12.263 13.741 12.115 13.616 C 11.968 13.491 11.932 13.282 12.021 13.119 L 12.068 13.053 L 12.314 12.749 C 14.695 9.666 14.696 5.336 12.314 2.252 L 12.068 1.947 L 12.023 1.881 C 11.933 1.718 11.968 1.509 12.115 1.384 ZM 3.700 4.895 C 3.612 4.963 3.504 5.000 3.393 5.000 L 1.500 5.000 C 1.224 5.000 1.000 5.224 1.000 5.500 L 1.000 9.500 L 1.010 9.601 C 1.056 9.829 1.258 10.000 1.500 10.000 L 3.393 10.000 L 3.476 10.007 C 3.557 10.021 3.634 10.054 3.700 10.106 L 6.750 12.478 L 6.750 2.522 L 3.700 4.895 ZM 10.278 3.848 C 10.439 3.741 10.649 3.766 10.781 3.897 L 10.833 3.959 L 10.963 4.162 C 12.255 6.273 12.211 8.970 10.833 11.041 C 10.711 11.225 10.462 11.275 10.278 11.153 C 10.094 11.030 10.045 10.782 10.167 10.598 C 11.372 8.786 11.409 6.425 10.279 4.579 L 10.166 4.403 L 10.129 4.331 C 10.059 4.159 10.117 3.955 10.278 3.848 Z"),
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
        return _speakerLoud!!
    }

private var _speakerLoud: ImageVector? = null
