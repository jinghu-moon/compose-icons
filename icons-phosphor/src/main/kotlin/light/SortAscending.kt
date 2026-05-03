package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SortAscending: ImageVector
    get() {
        if (_sortAscending != null) return _sortAscending!!
        _sortAscending = phosphorLightIcon(
            name = "SortAscending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 126.000 128.000 C 126.000 131.314 123.314 134.000 120.000 134.000 L 48.000 134.000 C 44.686 134.000 42.000 131.314 42.000 128.000 C 42.000 124.686 44.686 122.000 48.000 122.000 L 120.000 122.000 C 123.314 122.000 126.000 124.686 126.000 128.000 ZM 48.000 70.000 L 184.000 70.000 C 187.314 70.000 190.000 67.314 190.000 64.000 C 190.000 60.686 187.314 58.000 184.000 58.000 L 48.000 58.000 C 44.686 58.000 42.000 60.686 42.000 64.000 C 42.000 67.314 44.686 70.000 48.000 70.000 ZM 104.000 186.000 L 48.000 186.000 C 44.686 186.000 42.000 188.686 42.000 192.000 C 42.000 195.314 44.686 198.000 48.000 198.000 L 104.000 198.000 C 107.314 198.000 110.000 195.314 110.000 192.000 C 110.000 188.686 107.314 186.000 104.000 186.000 ZM 228.240 163.760 C 225.897 161.420 222.103 161.420 219.760 163.760 L 190.000 193.510 L 190.000 112.000 C 190.000 108.686 187.314 106.000 184.000 106.000 C 180.686 106.000 178.000 108.686 178.000 112.000 L 178.000 193.510 L 148.240 163.760 C 145.876 161.557 142.192 161.622 139.907 163.907 C 137.622 166.192 137.557 169.876 139.760 172.240 L 179.760 212.240 C 182.103 214.580 185.897 214.580 188.240 212.240 L 228.240 172.240 C 230.580 169.897 230.580 166.103 228.240 163.760 Z"),
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
        return _sortAscending!!
    }

private var _sortAscending: ImageVector? = null
