package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpeakerModerate: ImageVector
    get() {
        if (_speakerModerate != null) return _speakerModerate!!
        _speakerModerate = radixIcon(
            name = "SpeakerModerate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.259 1.062 C 7.401 0.983 7.575 0.979 7.724 1.053 C 7.893 1.138 8.000 1.311 8.000 1.500 L 8.000 13.500 C 8.000 13.690 7.893 13.863 7.724 13.948 C 7.554 14.032 7.352 14.014 7.200 13.901 L 3.333 11.000 L 1.500 11.000 C 0.723 11.000 0.085 10.410 0.008 9.654 L 0.000 9.500 L 0.000 5.500 C 0.000 4.672 0.672 4.000 1.500 4.000 L 3.333 4.000 L 7.200 1.100 L 7.259 1.062 ZM 3.800 4.901 C 3.713 4.965 3.608 5.000 3.500 5.000 L 1.500 5.000 C 1.224 5.000 1.000 5.224 1.000 5.500 L 1.000 9.500 L 1.010 9.601 C 1.056 9.829 1.258 10.000 1.500 10.000 L 3.500 10.000 C 3.608 10.000 3.713 10.035 3.800 10.100 L 7.000 12.499 L 7.000 2.500 L 3.800 4.901 ZM 10.278 3.848 C 10.439 3.741 10.649 3.766 10.781 3.897 L 10.833 3.959 L 10.963 4.162 C 12.255 6.273 12.211 8.970 10.833 11.041 C 10.711 11.225 10.462 11.275 10.278 11.153 C 10.094 11.030 10.045 10.782 10.167 10.598 C 11.372 8.786 11.409 6.425 10.279 4.579 L 10.166 4.403 L 10.129 4.331 C 10.059 4.159 10.117 3.955 10.278 3.848 Z"),
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
        return _speakerModerate!!
    }

private var _speakerModerate: ImageVector? = null
