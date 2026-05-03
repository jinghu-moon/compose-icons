package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrayArrowDown: ImageVector
    get() {
        if (_trayArrowDown != null) return _trayArrowDown!!
        _trayArrowDown = phosphorBoldIcon(
            name = "TrayArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 52.000 L 204.000 144.000 L 179.310 144.000 C 174.003 143.986 168.911 146.096 165.170 149.860 L 147.000 168.000 L 109.000 168.000 L 90.830 149.860 C 87.089 146.096 81.997 143.986 76.690 144.000 L 52.000 144.000 L 52.000 52.000 ZM 52.000 204.000 L 52.000 168.000 L 75.000 168.000 L 93.140 186.140 C 96.888 189.912 101.993 192.022 107.310 192.000 L 148.690 192.000 C 153.997 192.014 159.089 189.904 162.830 186.140 L 181.000 168.000 L 204.000 168.000 L 204.000 204.000 ZM 87.510 116.490 C 82.816 111.796 82.816 104.184 87.510 99.490 C 92.204 94.796 99.816 94.796 104.510 99.490 L 116.000 111.000 L 116.000 76.000 C 116.000 69.373 121.373 64.000 128.000 64.000 C 134.627 64.000 140.000 69.373 140.000 76.000 L 140.000 111.000 L 151.510 99.480 C 156.204 94.786 163.816 94.786 168.510 99.480 C 173.204 104.174 173.204 111.786 168.510 116.480 L 136.510 148.480 C 134.258 150.739 131.200 152.009 128.010 152.009 C 124.820 152.009 121.762 150.739 119.510 148.480 Z"),
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
        return _trayArrowDown!!
    }

private var _trayArrowDown: ImageVector? = null
