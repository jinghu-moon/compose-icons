package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorThinIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 64.000 C 220.001 49.056 208.267 36.744 193.339 36.029 C 178.412 35.314 165.554 46.448 164.128 61.325 C 162.701 76.201 173.209 89.575 188.000 91.710 L 188.000 112.000 C 188.000 118.627 182.627 124.000 176.000 124.000 L 80.000 124.000 C 73.373 124.000 68.000 118.627 68.000 112.000 L 68.000 91.710 C 82.535 89.612 92.980 76.640 91.928 61.992 C 90.876 47.344 78.686 35.997 64.000 35.997 C 49.314 35.997 37.124 47.344 36.072 61.992 C 35.020 76.640 45.465 89.612 60.000 91.710 L 60.000 112.000 C 60.000 123.046 68.954 132.000 80.000 132.000 L 124.000 132.000 L 124.000 164.290 C 109.465 166.388 99.020 179.360 100.072 194.008 C 101.124 208.656 113.314 220.003 128.000 220.003 C 142.686 220.003 154.876 208.656 155.928 194.008 C 156.980 179.360 146.535 166.388 132.000 164.290 L 132.000 132.000 L 176.000 132.000 C 187.046 132.000 196.000 123.046 196.000 112.000 L 196.000 91.710 C 209.775 89.722 219.999 77.918 220.000 64.000 ZM 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 C 75.046 44.000 84.000 52.954 84.000 64.000 C 84.000 75.046 75.046 84.000 64.000 84.000 C 52.954 84.000 44.000 75.046 44.000 64.000 ZM 148.000 192.000 C 148.000 203.046 139.046 212.000 128.000 212.000 C 116.954 212.000 108.000 203.046 108.000 192.000 C 108.000 180.954 116.954 172.000 128.000 172.000 C 139.046 172.000 148.000 180.954 148.000 192.000 ZM 192.000 84.000 C 180.954 84.000 172.000 75.046 172.000 64.000 C 172.000 52.954 180.954 44.000 192.000 44.000 C 203.046 44.000 212.000 52.954 212.000 64.000 C 212.000 75.046 203.046 84.000 192.000 84.000 Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
