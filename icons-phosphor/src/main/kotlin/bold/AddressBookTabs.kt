package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorBoldIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 188.000 108.000 L 204.000 108.000 L 204.000 148.000 L 188.000 148.000 ZM 204.000 84.000 L 188.000 84.000 L 188.000 52.000 L 204.000 52.000 ZM 52.000 52.000 L 164.000 52.000 L 164.000 204.000 L 52.000 204.000 ZM 188.000 204.000 L 188.000 172.000 L 204.000 172.000 L 204.000 204.000 ZM 151.620 165.000 C 149.211 155.885 143.887 147.808 136.460 142.000 C 147.917 127.210 146.136 106.109 132.362 93.449 C 118.588 80.789 97.412 80.789 83.638 93.449 C 69.864 106.109 68.083 127.210 79.540 142.000 C 72.120 147.814 66.798 155.889 64.380 165.000 C 62.723 171.418 66.582 177.963 73.000 179.620 C 79.418 181.277 85.963 177.418 87.620 171.000 C 89.820 162.460 98.620 156.000 108.000 156.000 C 117.380 156.000 126.190 162.440 128.380 171.000 C 130.037 177.418 136.582 181.277 143.000 179.620 C 149.418 177.963 153.277 171.418 151.620 165.000 ZM 96.000 120.000 C 96.000 113.373 101.373 108.000 108.000 108.000 C 114.627 108.000 120.000 113.373 120.000 120.000 C 120.000 126.627 114.627 132.000 108.000 132.000 C 101.373 132.000 96.000 126.627 96.000 120.000 Z"),
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
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null
