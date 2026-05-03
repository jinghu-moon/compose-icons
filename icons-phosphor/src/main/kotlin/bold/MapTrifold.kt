package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorBoldIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.380 46.540 C 228.468 44.269 224.673 43.465 221.090 44.360 L 161.400 59.280 L 101.400 29.280 C 98.837 27.998 95.900 27.675 93.120 28.370 L 29.120 44.370 C 23.770 45.693 20.009 50.489 20.000 56.000 L 20.000 200.000 C 20.001 203.695 21.703 207.183 24.616 209.457 C 27.528 211.731 31.325 212.536 34.910 211.640 L 94.600 196.720 L 154.600 226.720 C 157.163 228.002 160.100 228.325 162.880 227.630 L 226.880 211.630 C 232.230 210.307 235.991 205.511 236.000 200.000 L 236.000 56.000 C 235.999 52.303 234.295 48.813 231.380 46.540 ZM 108.000 59.420 L 148.000 79.420 L 148.000 196.580 L 108.000 176.580 ZM 44.000 65.420 L 84.000 55.420 L 84.000 174.630 L 44.000 184.630 ZM 212.000 190.630 L 172.000 200.630 L 172.000 81.370 L 212.000 71.370 Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
