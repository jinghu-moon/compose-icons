package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorThinIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 156.000 L 179.310 156.000 C 176.128 155.992 173.076 157.256 170.830 159.510 L 151.510 178.830 C 150.762 179.578 149.748 179.998 148.690 180.000 L 107.310 180.000 C 106.252 179.998 105.238 179.578 104.490 178.830 L 85.170 159.520 C 82.928 157.260 79.874 155.992 76.690 156.000 L 44.000 156.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 164.000 L 76.690 164.000 C 77.748 164.002 78.762 164.422 79.510 165.170 L 98.830 184.480 C 101.072 186.740 104.126 188.008 107.310 188.000 L 148.690 188.000 C 151.872 188.008 154.924 186.744 157.170 184.490 L 176.490 165.170 C 177.238 164.422 178.252 164.002 179.310 164.000 L 212.000 164.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 93.170 106.830 C 92.419 106.080 91.997 105.062 91.997 104.000 C 91.997 102.938 92.419 101.920 93.170 101.170 L 125.170 69.170 C 125.920 68.419 126.938 67.997 128.000 67.997 C 129.062 67.997 130.080 68.419 130.830 69.170 L 162.830 101.170 C 164.393 102.733 164.393 105.267 162.830 106.830 C 161.267 108.393 158.733 108.393 157.170 106.830 L 132.000 81.660 L 132.000 152.000 C 132.000 154.209 130.209 156.000 128.000 156.000 C 125.791 156.000 124.000 154.209 124.000 152.000 L 124.000 81.660 L 98.830 106.830 C 98.080 107.581 97.062 108.003 96.000 108.003 C 94.938 108.003 93.920 107.581 93.170 106.830 Z"),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
