package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorThinIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 104.000 132.000 C 101.791 132.000 100.000 130.209 100.000 128.000 C 100.000 125.791 101.791 124.000 104.000 124.000 L 216.000 124.000 C 218.209 124.000 220.000 125.791 220.000 128.000 ZM 104.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 66.209 220.000 64.000 C 220.000 61.791 218.209 60.000 216.000 60.000 L 104.000 60.000 C 101.791 60.000 100.000 61.791 100.000 64.000 C 100.000 66.209 101.791 68.000 104.000 68.000 ZM 216.000 188.000 L 104.000 188.000 C 101.791 188.000 100.000 189.791 100.000 192.000 C 100.000 194.209 101.791 196.000 104.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 C 220.000 189.791 218.209 188.000 216.000 188.000 ZM 41.790 51.580 L 52.000 46.470 L 52.000 104.000 C 52.000 106.209 53.791 108.000 56.000 108.000 C 58.209 108.000 60.000 106.209 60.000 104.000 L 60.000 40.000 C 60.001 38.613 59.283 37.324 58.104 36.595 C 56.924 35.866 55.450 35.799 54.210 36.420 L 38.210 44.420 C 36.233 45.409 35.431 47.813 36.420 49.790 C 37.409 51.767 39.813 52.569 41.790 51.580 ZM 72.000 204.000 L 48.000 204.000 L 71.850 172.080 C 75.144 167.898 76.588 162.552 75.850 157.280 C 75.104 151.948 72.214 147.152 67.850 144.000 C 58.810 137.430 46.198 139.159 39.260 147.920 C 37.986 149.546 36.974 151.361 36.260 153.300 C 35.725 155.307 36.815 157.391 38.770 158.094 C 40.725 158.798 42.893 157.888 43.760 156.000 C 44.186 154.842 44.786 153.756 45.540 152.780 C 49.805 147.414 57.544 146.368 63.080 150.410 C 65.696 152.292 67.433 155.159 67.890 158.350 C 68.331 161.505 67.460 164.704 65.480 167.200 L 36.800 205.610 C 35.897 206.822 35.754 208.440 36.431 209.791 C 37.108 211.143 38.489 211.997 40.000 212.000 L 72.000 212.000 C 74.209 212.000 76.000 210.209 76.000 208.000 C 76.000 205.791 74.209 204.000 72.000 204.000 Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
