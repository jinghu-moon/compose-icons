package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MixerHorizontal: ImageVector
    get() {
        if (_mixerHorizontal != null) return _mixerHorizontal!!
        _mixerHorizontal = radixIcon(
            name = "MixerHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.500 8.000 C 10.711 8.000 11.720 8.861 11.950 10.004 C 11.967 10.002 11.983 10.000 12.000 10.000 L 13.500 10.000 C 13.776 10.000 14.000 10.224 14.000 10.500 C 14.000 10.776 13.776 11.000 13.500 11.000 L 12.000 11.000 C 11.983 11.000 11.967 10.997 11.950 10.995 C 11.720 12.139 10.711 13.000 9.500 13.000 C 8.289 13.000 7.279 12.139 7.049 10.995 C 7.033 10.997 7.017 11.000 7.000 11.000 L 1.500 11.000 C 1.224 11.000 1.000 10.776 1.000 10.500 C 1.000 10.224 1.224 10.000 1.500 10.000 L 7.000 10.000 C 7.017 10.000 7.033 10.002 7.049 10.004 C 7.279 8.861 8.289 8.000 9.500 8.000 ZM 9.500 9.000 C 8.672 9.000 8.000 9.672 8.000 10.500 C 8.000 11.328 8.672 12.000 9.500 12.000 C 10.328 12.000 11.000 11.328 11.000 10.500 C 11.000 9.672 10.328 9.000 9.500 9.000 ZM 5.500 2.000 C 6.711 2.000 7.720 2.861 7.950 4.004 C 7.967 4.002 7.983 4.000 8.000 4.000 L 13.500 4.000 L 13.601 4.010 C 13.829 4.056 14.000 4.258 14.000 4.500 C 14.000 4.742 13.829 4.944 13.601 4.990 L 13.500 5.000 L 8.000 5.000 C 7.983 5.000 7.967 4.997 7.950 4.995 C 7.720 6.139 6.711 7.000 5.500 7.000 C 4.289 7.000 3.279 6.139 3.049 4.995 C 3.033 4.997 3.017 5.000 3.000 5.000 L 1.500 5.000 C 1.224 5.000 1.000 4.776 1.000 4.500 C 1.000 4.224 1.224 4.000 1.500 4.000 L 3.000 4.000 C 3.017 4.000 3.033 4.002 3.049 4.004 C 3.279 2.861 4.289 2.000 5.500 2.000 ZM 5.500 3.000 C 4.672 3.000 4.000 3.672 4.000 4.500 C 4.000 5.328 4.672 6.000 5.500 6.000 C 6.328 6.000 7.000 5.328 7.000 4.500 C 7.000 3.672 6.328 3.000 5.500 3.000 Z"),
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
        return _mixerHorizontal!!
    }

private var _mixerHorizontal: ImageVector? = null
