package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tray: ImageVector
    get() {
        if (_tray != null) return _tray!!
        _tray = phosphorThinIcon(
            name = "Tray",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 156.000 L 179.310 156.000 C 176.130 156.000 173.080 157.263 170.830 159.510 L 151.510 178.830 C 150.762 179.578 149.748 179.998 148.690 180.000 L 107.310 180.000 C 106.252 179.998 105.238 179.578 104.490 178.830 L 85.170 159.510 C 82.920 157.263 79.870 156.000 76.690 156.000 L 44.000 156.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 ZM 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 164.000 L 76.690 164.000 C 77.748 164.002 78.762 164.422 79.510 165.170 L 98.830 184.490 C 101.080 186.737 104.130 188.000 107.310 188.000 L 148.690 188.000 C 151.870 188.000 154.920 186.737 157.170 184.490 L 176.490 165.170 C 177.238 164.422 178.252 164.002 179.310 164.000 L 212.000 164.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 Z"),
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
        return _tray!!
    }

private var _tray: ImageVector? = null
