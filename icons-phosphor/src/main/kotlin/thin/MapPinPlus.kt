package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorThinIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 104.000 C 164.000 106.209 162.209 108.000 160.000 108.000 L 132.000 108.000 L 132.000 136.000 C 132.000 138.209 130.209 140.000 128.000 140.000 C 125.791 140.000 124.000 138.209 124.000 136.000 L 124.000 108.000 L 96.000 108.000 C 93.791 108.000 92.000 106.209 92.000 104.000 C 92.000 101.791 93.791 100.000 96.000 100.000 L 124.000 100.000 L 124.000 72.000 C 124.000 69.791 125.791 68.000 128.000 68.000 C 130.209 68.000 132.000 69.791 132.000 72.000 L 132.000 100.000 L 160.000 100.000 C 162.209 100.000 164.000 101.791 164.000 104.000 ZM 212.000 104.000 C 212.000 134.420 197.830 166.790 171.000 197.620 C 158.862 211.645 145.202 224.276 130.270 235.280 C 128.894 236.241 127.066 236.241 125.690 235.280 C 110.772 224.274 97.125 211.643 85.000 197.620 C 58.170 166.790 44.000 134.420 44.000 104.000 C 44.000 57.608 81.608 20.000 128.000 20.000 C 174.392 20.000 212.000 57.608 212.000 104.000 ZM 204.000 104.000 C 204.000 62.026 169.974 28.000 128.000 28.000 C 86.026 28.000 52.000 62.026 52.000 104.000 C 52.000 139.900 73.150 171.800 90.900 192.230 C 102.076 205.029 114.504 216.677 128.000 227.000 C 141.498 216.664 153.926 205.003 165.100 192.190 C 182.850 171.800 204.000 139.900 204.000 104.000 Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
