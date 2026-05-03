package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorThinIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 242.720 122.630 L 202.720 42.630 C 200.701 38.559 196.544 35.988 192.000 36.000 L 64.000 36.000 C 59.452 35.984 55.290 38.555 53.270 42.630 L 13.270 122.630 C 11.409 126.350 11.606 130.768 13.792 134.307 C 15.978 137.845 19.841 140.000 24.000 140.000 L 124.000 140.000 L 124.000 212.000 L 96.000 212.000 C 93.791 212.000 92.000 213.791 92.000 216.000 C 92.000 218.209 93.791 220.000 96.000 220.000 L 160.000 220.000 C 162.209 220.000 164.000 218.209 164.000 216.000 C 164.000 213.791 162.209 212.000 160.000 212.000 L 132.000 212.000 L 132.000 140.000 L 232.000 140.000 C 236.159 140.000 240.022 137.845 242.208 134.307 C 244.394 130.768 244.591 126.350 242.730 122.630 ZM 235.390 130.100 C 234.673 131.285 233.385 132.007 232.000 132.000 L 24.000 132.000 C 22.613 132.001 21.324 131.283 20.595 130.104 C 19.865 128.924 19.799 127.450 20.420 126.210 L 60.420 46.210 C 61.098 44.855 62.484 43.999 64.000 44.000 L 192.000 44.000 C 193.516 43.999 194.902 44.855 195.580 46.210 L 235.580 126.210 C 236.207 127.450 236.135 128.927 235.390 130.100 ZM 188.000 104.000 C 188.000 106.209 186.209 108.000 184.000 108.000 L 72.000 108.000 C 69.791 108.000 68.000 106.209 68.000 104.000 C 68.000 101.791 69.791 100.000 72.000 100.000 L 184.000 100.000 C 186.209 100.000 188.000 101.791 188.000 104.000 Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
