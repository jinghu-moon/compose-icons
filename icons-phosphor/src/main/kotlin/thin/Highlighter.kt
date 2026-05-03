package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorThinIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 250.830 109.170 C 250.080 108.419 249.062 107.997 248.000 107.997 C 246.938 107.997 245.920 108.419 245.170 109.170 L 194.830 159.510 C 194.080 160.261 193.062 160.683 192.000 160.683 C 190.938 160.683 189.920 160.261 189.170 159.510 L 104.490 74.830 C 103.739 74.080 103.317 73.062 103.317 72.000 C 103.317 70.938 103.739 69.920 104.490 69.170 L 154.830 18.830 C 156.393 17.267 156.393 14.733 154.830 13.170 C 153.267 11.607 150.733 11.607 149.170 13.170 L 98.830 63.510 C 94.324 68.013 94.122 75.253 98.370 80.000 L 74.830 103.510 C 72.571 105.762 71.301 108.820 71.301 112.010 C 71.301 115.200 72.571 118.258 74.830 120.510 L 82.340 128.000 L 21.170 189.170 C 20.191 190.151 19.791 191.569 20.110 192.917 C 20.430 194.266 21.425 195.353 22.740 195.790 L 94.740 219.790 C 95.146 219.928 95.571 219.999 96.000 220.000 C 97.061 220.001 98.079 219.580 98.830 218.830 L 136.000 181.660 L 143.510 189.170 C 145.762 191.429 148.820 192.699 152.010 192.699 C 155.200 192.699 158.258 191.429 160.510 189.170 L 184.000 165.630 C 188.744 169.865 195.969 169.664 200.470 165.170 L 250.810 114.830 C 251.564 114.082 251.989 113.066 251.993 112.004 C 251.997 110.943 251.578 109.923 250.830 109.170 ZM 94.920 211.420 L 31.400 190.250 L 88.000 133.660 L 130.340 176.000 ZM 154.830 183.510 C 154.080 184.261 153.062 184.683 152.000 184.683 C 150.938 184.683 149.920 184.261 149.170 183.510 L 80.490 114.830 C 79.739 114.080 79.317 113.062 79.317 112.000 C 79.317 110.938 79.739 109.920 80.490 109.170 L 104.000 85.660 L 178.340 160.000 Z"),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
