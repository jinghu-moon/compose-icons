package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorThinIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 83.310 36.000 C 80.130 36.000 77.080 37.263 74.830 39.510 L 39.520 74.830 C 37.260 77.072 35.992 80.126 36.000 83.310 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 84.000 44.000 L 172.000 44.000 L 172.000 80.000 C 172.000 82.209 170.209 84.000 168.000 84.000 L 88.000 84.000 C 85.791 84.000 84.000 82.209 84.000 80.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 83.310 C 44.002 82.252 44.422 81.238 45.170 80.490 L 76.000 49.660 L 76.000 80.000 C 76.000 86.627 81.373 92.000 88.000 92.000 L 168.000 92.000 C 174.627 92.000 180.000 86.627 180.000 80.000 L 180.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 128.000 116.000 C 108.118 116.000 92.000 132.118 92.000 152.000 C 92.000 171.882 108.118 188.000 128.000 188.000 C 147.882 188.000 164.000 171.882 164.000 152.000 C 164.000 132.118 147.882 116.000 128.000 116.000 ZM 128.000 180.000 C 112.536 180.000 100.000 167.464 100.000 152.000 C 100.000 136.536 112.536 124.000 128.000 124.000 C 143.464 124.000 156.000 136.536 156.000 152.000 C 156.000 167.464 143.464 180.000 128.000 180.000 Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
