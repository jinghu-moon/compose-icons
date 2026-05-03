package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpeakerQuiet: ImageVector
    get() {
        if (_speakerQuiet != null) return _speakerQuiet!!
        _speakerQuiet = radixIcon(
            name = "SpeakerQuiet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.259 1.062 C 7.401 0.983 7.575 0.979 7.724 1.053 C 7.893 1.138 8.000 1.311 8.000 1.500 L 8.000 13.500 C 8.000 13.690 7.893 13.863 7.724 13.948 C 7.554 14.032 7.352 14.014 7.200 13.901 L 3.333 11.000 L 1.500 11.000 C 0.723 11.000 0.085 10.410 0.008 9.654 L 0.000 9.500 L 0.000 5.500 C 0.000 4.672 0.672 4.000 1.500 4.000 L 3.333 4.000 L 7.200 1.100 L 7.259 1.062 ZM 3.800 4.901 C 3.713 4.965 3.608 5.000 3.500 5.000 L 1.500 5.000 C 1.224 5.000 1.000 5.224 1.000 5.500 L 1.000 9.500 L 1.010 9.601 C 1.056 9.829 1.258 10.000 1.500 10.000 L 3.500 10.000 C 3.608 10.000 3.713 10.035 3.800 10.100 L 7.000 12.499 L 7.000 2.500 L 3.800 4.901 ZM 9.528 4.944 C 9.689 4.837 9.899 4.863 10.031 4.993 L 10.084 5.056 L 10.256 5.338 C 11.008 6.677 11.008 8.323 10.256 9.662 L 10.083 9.945 L 10.031 10.007 C 9.899 10.138 9.689 10.162 9.528 10.055 C 9.368 9.948 9.309 9.746 9.379 9.573 L 9.417 9.501 L 9.558 9.270 C 10.173 8.174 10.174 6.825 9.559 5.730 L 9.416 5.499 L 9.379 5.427 C 9.309 5.255 9.368 5.051 9.528 4.944 Z"),
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
        return _speakerQuiet!!
    }

private var _speakerQuiet: ImageVector? = null
