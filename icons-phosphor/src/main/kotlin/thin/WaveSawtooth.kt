package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorThinIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.100 131.410 L 130.100 195.410 C 129.468 195.797 128.741 196.002 128.000 196.000 C 125.791 196.000 124.000 194.209 124.000 192.000 L 124.000 71.160 L 26.100 131.410 C 24.217 132.570 21.750 131.983 20.590 130.100 C 19.430 128.217 20.017 125.750 21.900 124.590 L 125.900 60.590 C 127.135 59.828 128.685 59.795 129.952 60.503 C 131.218 61.211 132.002 62.549 132.000 64.000 L 132.000 184.840 L 229.900 124.590 C 231.783 123.430 234.250 124.017 235.410 125.900 C 236.570 127.783 235.983 130.250 234.100 131.410 Z"),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
