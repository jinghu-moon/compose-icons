package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MixerVertical: ImageVector
    get() {
        if (_mixerVertical != null) return _mixerVertical!!
        _mixerVertical = radixIcon(
            name = "MixerVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.500 1.000 C 4.742 1.000 4.944 1.171 4.990 1.399 L 5.000 1.500 L 5.000 7.000 C 5.000 7.017 4.997 7.033 4.995 7.049 C 6.139 7.279 7.000 8.289 7.000 9.500 C 7.000 10.711 6.139 11.720 4.995 11.950 L 5.000 12.000 L 5.000 13.500 L 4.990 13.601 C 4.944 13.829 4.742 14.000 4.500 14.000 C 4.258 14.000 4.056 13.829 4.010 13.601 L 4.000 13.500 L 4.000 12.000 C 4.000 11.983 4.002 11.967 4.004 11.950 C 2.861 11.720 2.000 10.711 2.000 9.500 C 2.000 8.289 2.861 7.279 4.004 7.049 L 4.000 7.000 L 4.000 1.500 C 4.000 1.224 4.224 1.000 4.500 1.000 ZM 10.500 1.000 C 10.742 1.000 10.944 1.171 10.990 1.399 L 11.000 1.500 L 11.000 3.000 L 10.995 3.049 C 12.139 3.279 13.000 4.289 13.000 5.500 C 13.000 6.711 12.139 7.720 10.995 7.950 L 11.000 8.000 L 11.000 13.500 C 11.000 13.776 10.776 14.000 10.500 14.000 C 10.258 14.000 10.056 13.829 10.010 13.601 L 10.000 13.500 L 10.000 8.000 C 10.000 7.983 10.002 7.967 10.004 7.950 C 8.861 7.720 8.000 6.711 8.000 5.500 C 8.000 4.289 8.861 3.279 10.004 3.049 L 10.000 3.000 L 10.000 1.500 C 10.000 1.224 10.224 1.000 10.500 1.000 ZM 4.500 8.000 C 3.672 8.000 3.000 8.672 3.000 9.500 C 3.000 10.328 3.672 11.000 4.500 11.000 C 5.328 11.000 6.000 10.328 6.000 9.500 C 6.000 8.672 5.328 8.000 4.500 8.000 ZM 10.500 4.000 C 9.672 4.000 9.000 4.672 9.000 5.500 C 9.000 6.328 9.672 7.000 10.500 7.000 C 11.328 7.000 12.000 6.328 12.000 5.500 C 12.000 4.672 11.328 4.000 10.500 4.000 Z"),
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
        return _mixerVertical!!
    }

private var _mixerVertical: ImageVector? = null
