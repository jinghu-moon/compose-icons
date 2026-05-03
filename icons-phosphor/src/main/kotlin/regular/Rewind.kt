package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorRegularIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.770 58.000 C 218.660 55.206 212.437 55.409 207.520 58.530 L 128.000 109.140 L 128.000 71.840 C 127.976 66.039 124.797 60.710 119.703 57.934 C 114.609 55.158 108.408 55.375 103.520 58.500 L 15.330 114.660 C 10.763 117.558 7.997 122.591 7.997 128.000 C 7.997 133.409 10.763 138.442 15.330 141.340 L 103.520 197.500 C 108.408 200.625 114.609 200.842 119.703 198.066 C 124.797 195.290 127.976 189.961 128.000 184.160 L 128.000 146.860 L 207.520 197.500 C 212.408 200.625 218.609 200.842 223.703 198.066 C 228.797 195.290 231.976 189.961 232.000 184.160 L 232.000 71.840 C 231.983 66.072 228.830 60.769 223.770 58.000 ZM 112.000 183.930 L 24.180 128.000 L 112.000 72.060 ZM 216.000 183.930 L 128.180 128.000 L 216.000 72.060 Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
