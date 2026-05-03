package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SortDescending: ImageVector
    get() {
        if (_sortDescending != null) return _sortDescending!!
        _sortDescending = phosphorLightIcon(
            name = "SortDescending",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 42.000 128.000 C 42.000 124.686 44.686 122.000 48.000 122.000 L 120.000 122.000 C 123.314 122.000 126.000 124.686 126.000 128.000 C 126.000 131.314 123.314 134.000 120.000 134.000 L 48.000 134.000 C 44.686 134.000 42.000 131.314 42.000 128.000 ZM 48.000 70.000 L 104.000 70.000 C 107.314 70.000 110.000 67.314 110.000 64.000 C 110.000 60.686 107.314 58.000 104.000 58.000 L 48.000 58.000 C 44.686 58.000 42.000 60.686 42.000 64.000 C 42.000 67.314 44.686 70.000 48.000 70.000 ZM 184.000 186.000 L 48.000 186.000 C 44.686 186.000 42.000 188.686 42.000 192.000 C 42.000 195.314 44.686 198.000 48.000 198.000 L 184.000 198.000 C 187.314 198.000 190.000 195.314 190.000 192.000 C 190.000 188.686 187.314 186.000 184.000 186.000 ZM 228.240 83.760 L 188.240 43.760 C 185.897 41.420 182.103 41.420 179.760 43.760 L 139.760 83.760 C 137.557 86.124 137.622 89.808 139.907 92.093 C 142.192 94.378 145.876 94.443 148.240 92.240 L 178.000 62.490 L 178.000 144.000 C 178.000 147.314 180.686 150.000 184.000 150.000 C 187.314 150.000 190.000 147.314 190.000 144.000 L 190.000 62.490 L 219.760 92.240 C 222.124 94.443 225.808 94.378 228.093 92.093 C 230.378 89.808 230.443 86.124 228.240 83.760 Z"),
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
        return _sortDescending!!
    }

private var _sortDescending: ImageVector? = null
