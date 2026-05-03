package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorThinIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.490 74.830 L 181.170 39.510 C 178.924 37.256 175.872 35.992 172.690 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 83.310 C 220.008 80.128 218.744 77.076 216.490 74.830 ZM 172.000 212.000 L 84.000 212.000 L 84.000 152.000 C 84.000 149.791 85.791 148.000 88.000 148.000 L 168.000 148.000 C 170.209 148.000 172.000 149.791 172.000 152.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 180.000 212.000 L 180.000 152.000 C 180.000 145.373 174.627 140.000 168.000 140.000 L 88.000 140.000 C 81.373 140.000 76.000 145.373 76.000 152.000 L 76.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 172.690 44.000 C 173.748 44.002 174.762 44.422 175.510 45.170 L 210.830 80.490 C 211.578 81.238 211.998 82.252 212.000 83.310 ZM 156.000 72.000 C 156.000 74.209 154.209 76.000 152.000 76.000 L 96.000 76.000 C 93.791 76.000 92.000 74.209 92.000 72.000 C 92.000 69.791 93.791 68.000 96.000 68.000 L 152.000 68.000 C 154.209 68.000 156.000 69.791 156.000 72.000 Z"),
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
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
