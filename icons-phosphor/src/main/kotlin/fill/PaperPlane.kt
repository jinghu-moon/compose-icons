package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorFillIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.200 218.310 C 233.178 221.922 228.709 224.006 224.000 224.000 C 222.171 223.998 220.355 223.687 218.630 223.080 L 138.680 196.080 C 137.054 195.531 135.960 194.006 135.960 192.290 L 135.960 120.000 C 135.965 117.783 135.050 115.664 133.433 114.147 C 131.816 112.631 129.642 111.853 127.430 112.000 C 123.163 112.376 119.907 115.977 119.960 120.260 L 119.960 192.260 C 119.960 193.976 118.866 195.501 117.240 196.050 L 37.290 223.050 C 31.010 225.257 24.019 223.344 19.737 218.248 C 15.454 213.152 14.775 205.936 18.030 200.130 L 114.000 32.130 C 116.834 27.092 122.165 23.975 127.945 23.975 C 133.725 23.975 139.056 27.092 141.890 32.130 L 237.900 200.100 C 241.233 205.920 240.553 213.207 236.200 218.310 Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
