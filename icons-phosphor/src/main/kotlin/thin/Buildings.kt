package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorThinIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 212.000 L 220.000 212.000 L 220.000 96.000 C 220.000 89.373 214.627 84.000 208.000 84.000 L 140.000 84.000 L 140.000 32.000 C 140.007 27.570 137.572 23.498 133.668 21.405 C 129.764 19.313 125.025 19.542 121.340 22.000 L 41.340 75.330 C 37.998 77.559 35.994 81.313 36.000 85.330 L 36.000 212.000 L 16.000 212.000 C 13.791 212.000 12.000 213.791 12.000 216.000 C 12.000 218.209 13.791 220.000 16.000 220.000 L 240.000 220.000 C 242.209 220.000 244.000 218.209 244.000 216.000 C 244.000 213.791 242.209 212.000 240.000 212.000 ZM 208.000 92.000 C 210.209 92.000 212.000 93.791 212.000 96.000 L 212.000 212.000 L 140.000 212.000 L 140.000 92.000 ZM 44.000 85.340 C 43.996 83.999 44.664 82.744 45.780 82.000 L 125.780 28.670 C 127.008 27.851 128.587 27.774 129.888 28.471 C 131.189 29.168 132.001 30.524 132.000 32.000 L 132.000 212.000 L 44.000 212.000 ZM 108.000 112.000 L 108.000 128.000 C 108.000 130.209 106.209 132.000 104.000 132.000 C 101.791 132.000 100.000 130.209 100.000 128.000 L 100.000 112.000 C 100.000 109.791 101.791 108.000 104.000 108.000 C 106.209 108.000 108.000 109.791 108.000 112.000 ZM 76.000 112.000 L 76.000 128.000 C 76.000 130.209 74.209 132.000 72.000 132.000 C 69.791 132.000 68.000 130.209 68.000 128.000 L 68.000 112.000 C 68.000 109.791 69.791 108.000 72.000 108.000 C 74.209 108.000 76.000 109.791 76.000 112.000 ZM 76.000 168.000 L 76.000 184.000 C 76.000 186.209 74.209 188.000 72.000 188.000 C 69.791 188.000 68.000 186.209 68.000 184.000 L 68.000 168.000 C 68.000 165.791 69.791 164.000 72.000 164.000 C 74.209 164.000 76.000 165.791 76.000 168.000 ZM 108.000 168.000 L 108.000 184.000 C 108.000 186.209 106.209 188.000 104.000 188.000 C 101.791 188.000 100.000 186.209 100.000 184.000 L 100.000 168.000 C 100.000 165.791 101.791 164.000 104.000 164.000 C 106.209 164.000 108.000 165.791 108.000 168.000 Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
