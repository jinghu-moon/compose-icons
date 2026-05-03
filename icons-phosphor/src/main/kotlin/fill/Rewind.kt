package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorFillIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 71.840 L 232.000 184.160 C 231.970 189.958 228.790 195.282 223.698 198.056 C 218.606 200.831 212.409 200.618 207.520 197.500 L 128.000 146.860 L 128.000 184.160 C 127.970 189.958 124.790 195.282 119.698 198.056 C 114.606 200.831 108.409 200.618 103.520 197.500 L 15.330 141.340 C 10.763 138.442 7.997 133.409 7.997 128.000 C 7.997 122.591 10.763 117.558 15.330 114.660 L 103.520 58.500 C 108.408 55.375 114.609 55.158 119.703 57.934 C 124.797 60.710 127.976 66.039 128.000 71.840 L 128.000 109.140 L 207.520 58.500 C 212.408 55.375 218.609 55.158 223.703 57.934 C 228.797 60.710 231.976 66.039 232.000 71.840 Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
