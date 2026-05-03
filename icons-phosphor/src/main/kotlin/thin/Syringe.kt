package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorThinIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.830 69.170 L 186.830 21.170 C 185.267 19.607 182.733 19.607 181.170 21.170 C 179.607 22.733 179.607 25.267 181.170 26.830 L 202.340 48.000 L 168.000 82.340 L 130.830 45.170 C 129.267 43.607 126.733 43.607 125.170 45.170 C 123.607 46.733 123.607 49.267 125.170 50.830 L 134.340 60.000 L 47.510 146.830 C 45.263 149.080 44.000 152.130 44.000 155.310 L 44.000 206.310 L 21.170 229.170 C 19.607 230.733 19.607 233.267 21.170 234.830 C 22.733 236.393 25.267 236.393 26.830 234.830 L 49.660 212.000 L 100.660 212.000 C 103.842 212.008 106.894 210.744 109.140 208.490 L 196.000 121.660 L 205.170 130.830 C 206.733 132.393 209.267 132.393 210.830 130.830 C 212.393 129.267 212.393 126.733 210.830 125.170 L 173.660 88.000 L 208.000 53.660 L 229.170 74.830 C 230.733 76.393 233.267 76.393 234.830 74.830 C 236.393 73.267 236.393 70.733 234.830 69.170 ZM 103.510 202.830 C 102.762 203.578 101.748 203.998 100.690 204.000 L 52.000 204.000 L 52.000 155.310 C 52.002 154.252 52.422 153.238 53.170 152.490 L 74.000 131.660 L 97.170 154.830 C 98.733 156.393 101.267 156.393 102.830 154.830 C 104.393 153.267 104.393 150.733 102.830 149.170 L 79.660 126.000 L 98.000 107.660 L 121.170 130.830 C 122.733 132.393 125.267 132.393 126.830 130.830 C 128.393 129.267 128.393 126.733 126.830 125.170 L 103.660 102.000 L 140.000 65.660 L 165.170 90.830 L 165.170 90.830 L 190.340 116.000 Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
