package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorThinIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 28.000 128.000 C 28.039 90.461 58.461 60.039 96.000 60.000 L 214.340 60.000 L 197.170 42.830 C 195.607 41.267 195.607 38.733 197.170 37.170 C 198.733 35.607 201.267 35.607 202.830 37.170 L 226.830 61.170 C 227.581 61.920 228.003 62.938 228.003 64.000 C 228.003 65.062 227.581 66.080 226.830 66.830 L 202.830 90.830 C 201.267 92.393 198.733 92.393 197.170 90.830 C 195.607 89.267 195.607 86.733 197.170 85.170 L 214.340 68.000 L 96.000 68.000 C 62.879 68.039 36.039 94.879 36.000 128.000 C 36.000 130.209 34.209 132.000 32.000 132.000 C 29.791 132.000 28.000 130.209 28.000 128.000 ZM 224.000 124.000 C 221.791 124.000 220.000 125.791 220.000 128.000 C 219.961 161.121 193.121 187.961 160.000 188.000 L 41.660 188.000 L 58.830 170.830 C 60.393 169.267 60.393 166.733 58.830 165.170 C 57.267 163.607 54.733 163.607 53.170 165.170 L 29.170 189.170 C 28.419 189.920 27.997 190.938 27.997 192.000 C 27.997 193.062 28.419 194.080 29.170 194.830 L 53.170 218.830 C 54.733 220.393 57.267 220.393 58.830 218.830 C 60.393 217.267 60.393 214.733 58.830 213.170 L 41.660 196.000 L 160.000 196.000 C 197.539 195.961 227.961 165.539 228.000 128.000 C 228.000 125.791 226.209 124.000 224.000 124.000 ZM 136.000 156.000 C 138.209 156.000 140.000 154.209 140.000 152.000 L 140.000 104.000 C 140.001 102.613 139.283 101.324 138.104 100.595 C 136.924 99.866 135.450 99.799 134.210 100.420 L 118.210 108.420 C 116.233 109.409 115.431 111.813 116.420 113.790 C 117.409 115.767 119.813 116.569 121.790 115.580 L 132.000 110.480 L 132.000 152.000 C 132.000 154.209 133.791 156.000 136.000 156.000 Z"),
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
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
