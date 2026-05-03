package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpeakerOff: ImageVector
    get() {
        if (_speakerOff != null) return _speakerOff!!
        _speakerOff = radixIcon(
            name = "SpeakerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.259 1.062 C 7.401 0.983 7.575 0.979 7.724 1.053 C 7.893 1.138 8.000 1.311 8.000 1.500 L 8.000 13.500 C 8.000 13.689 7.893 13.863 7.724 13.947 C 7.554 14.032 7.352 14.014 7.200 13.900 L 3.333 11.000 L 1.500 11.000 C 0.723 11.000 0.085 10.410 0.008 9.653 L 0.000 9.500 L 0.000 5.500 C 0.000 4.672 0.672 4.000 1.500 4.000 L 3.333 4.000 L 7.200 1.100 L 7.259 1.062 ZM 3.800 4.901 C 3.713 4.965 3.608 5.000 3.500 5.000 L 1.500 5.000 C 1.224 5.000 1.000 5.224 1.000 5.500 L 1.000 9.500 L 1.010 9.601 C 1.056 9.829 1.258 10.000 1.500 10.000 L 3.500 10.000 C 3.608 10.000 3.713 10.035 3.800 10.100 L 7.000 12.499 L 7.000 2.500 L 3.800 4.901 ZM 14.146 5.147 C 14.342 4.951 14.658 4.951 14.853 5.147 C 15.049 5.342 15.049 5.658 14.853 5.854 L 13.207 7.500 L 14.853 9.147 L 14.918 9.225 C 15.046 9.419 15.024 9.683 14.853 9.854 C 14.682 10.024 14.418 10.046 14.224 9.918 L 14.146 9.854 L 12.500 8.207 L 10.853 9.854 C 10.658 10.049 10.342 10.049 10.146 9.854 C 9.951 9.658 9.951 9.342 10.146 9.147 L 11.793 7.500 L 10.146 5.854 L 10.082 5.775 C 9.954 5.581 9.975 5.317 10.146 5.147 C 10.317 4.976 10.581 4.954 10.775 5.082 L 10.853 5.147 L 12.500 6.793 L 14.146 5.147 Z"),
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
        return _speakerOff!!
    }

private var _speakerOff: ImageVector? = null
