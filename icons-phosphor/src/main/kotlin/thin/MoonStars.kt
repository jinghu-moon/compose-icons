package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorThinIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 96.000 C 236.000 98.209 234.209 100.000 232.000 100.000 L 212.000 100.000 L 212.000 120.000 C 212.000 122.209 210.209 124.000 208.000 124.000 C 205.791 124.000 204.000 122.209 204.000 120.000 L 204.000 100.000 L 184.000 100.000 C 181.791 100.000 180.000 98.209 180.000 96.000 C 180.000 93.791 181.791 92.000 184.000 92.000 L 204.000 92.000 L 204.000 72.000 C 204.000 69.791 205.791 68.000 208.000 68.000 C 210.209 68.000 212.000 69.791 212.000 72.000 L 212.000 92.000 L 232.000 92.000 C 234.209 92.000 236.000 93.791 236.000 96.000 ZM 144.000 52.000 L 156.000 52.000 L 156.000 64.000 C 156.000 66.209 157.791 68.000 160.000 68.000 C 162.209 68.000 164.000 66.209 164.000 64.000 L 164.000 52.000 L 176.000 52.000 C 178.209 52.000 180.000 50.209 180.000 48.000 C 180.000 45.791 178.209 44.000 176.000 44.000 L 164.000 44.000 L 164.000 32.000 C 164.000 29.791 162.209 28.000 160.000 28.000 C 157.791 28.000 156.000 29.791 156.000 32.000 L 156.000 44.000 L 144.000 44.000 C 141.791 44.000 140.000 45.791 140.000 48.000 C 140.000 50.209 141.791 52.000 144.000 52.000 ZM 213.730 155.580 C 214.677 156.685 214.948 158.217 214.440 159.580 C 199.809 199.591 159.621 224.324 117.309 219.357 C 74.997 214.390 41.630 181.023 36.663 138.711 C 31.696 96.399 56.429 56.211 96.440 41.580 C 97.798 41.086 99.316 41.363 100.412 42.304 C 101.508 43.245 102.012 44.703 101.730 46.120 C 100.579 52.010 99.999 57.998 100.000 64.000 C 100.055 114.787 141.213 155.945 192.000 156.000 C 198.012 155.999 204.010 155.416 209.910 154.260 C 211.328 153.977 212.789 154.482 213.730 155.580 ZM 204.270 163.250 C 173.689 167.033 143.072 156.506 121.283 134.717 C 99.494 112.928 88.967 82.311 92.750 51.730 C 59.022 67.347 39.567 103.274 44.921 140.055 C 50.275 176.836 79.164 205.725 115.945 211.079 C 152.726 216.433 188.653 196.978 204.270 163.250 Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
