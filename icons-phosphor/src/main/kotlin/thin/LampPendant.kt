package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorThinIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 77.340 L 172.000 72.000 C 172.000 65.373 166.627 60.000 160.000 60.000 L 132.000 60.000 L 132.000 16.000 C 132.000 13.791 130.209 12.000 128.000 12.000 C 125.791 12.000 124.000 13.791 124.000 16.000 L 124.000 60.000 L 96.000 60.000 C 89.373 60.000 84.000 65.373 84.000 72.000 L 84.000 77.340 C 45.019 94.660 19.924 133.344 20.000 176.000 C 20.000 178.209 21.791 180.000 24.000 180.000 L 92.000 180.000 L 92.000 184.000 C 92.000 203.882 108.118 220.000 128.000 220.000 C 147.882 220.000 164.000 203.882 164.000 184.000 L 164.000 180.000 L 232.000 180.000 C 234.209 180.000 236.000 178.209 236.000 176.000 C 236.076 133.344 210.981 94.660 172.000 77.340 ZM 156.000 184.000 C 156.000 199.464 143.464 212.000 128.000 212.000 C 112.536 212.000 100.000 199.464 100.000 184.000 L 100.000 180.000 L 156.000 180.000 ZM 28.080 172.000 C 29.568 133.081 53.567 98.587 89.540 83.660 C 91.019 83.043 91.987 81.603 92.000 80.000 L 92.000 72.000 C 92.000 69.791 93.791 68.000 96.000 68.000 L 160.000 68.000 C 162.209 68.000 164.000 69.791 164.000 72.000 L 164.000 80.000 C 164.001 81.614 164.971 83.069 166.460 83.690 C 202.424 98.612 226.420 133.092 227.920 172.000 Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
