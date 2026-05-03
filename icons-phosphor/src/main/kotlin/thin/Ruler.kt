package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorThinIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.490 76.200 L 179.800 23.510 C 177.548 21.251 174.490 19.981 171.300 19.981 C 168.110 19.981 165.052 21.251 162.800 23.510 L 23.510 162.830 C 21.251 165.082 19.981 168.140 19.981 171.330 C 19.981 174.520 21.251 177.578 23.510 179.830 L 76.200 232.490 C 78.452 234.749 81.510 236.019 84.700 236.019 C 87.890 236.019 90.948 234.749 93.200 232.490 L 232.490 93.170 C 237.176 88.484 237.176 80.886 232.490 76.200 ZM 226.830 87.510 L 87.510 226.830 C 85.949 228.388 83.421 228.388 81.860 226.830 L 29.170 174.140 C 27.612 172.579 27.612 170.051 29.170 168.490 L 64.000 133.660 L 93.170 162.830 C 94.733 164.393 97.267 164.393 98.830 162.830 C 100.393 161.267 100.393 158.733 98.830 157.170 L 69.650 128.000 L 96.000 101.660 L 125.170 130.830 C 126.733 132.393 129.267 132.393 130.830 130.830 C 132.393 129.267 132.393 126.733 130.830 125.170 L 101.650 96.000 L 128.000 69.660 L 157.170 98.830 C 158.733 100.393 161.267 100.393 162.830 98.830 C 164.393 97.267 164.393 94.733 162.830 93.170 L 133.660 64.000 L 168.490 29.170 C 170.051 27.612 172.579 27.612 174.140 29.170 L 226.830 81.860 C 228.388 83.421 228.388 85.949 226.830 87.510 Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
