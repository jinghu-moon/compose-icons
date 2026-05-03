package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorLightIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 186.000 L 230.000 186.000 L 230.000 56.280 L 241.260 53.870 C 244.502 53.174 246.566 49.982 245.870 46.740 C 245.174 43.498 241.982 41.434 238.740 42.130 L 14.740 90.130 C 11.498 90.826 9.434 94.018 10.130 97.260 C 10.826 100.502 14.018 102.566 17.260 101.870 L 26.000 100.000 L 26.000 186.000 L 16.000 186.000 C 12.686 186.000 10.000 188.686 10.000 192.000 C 10.000 195.314 12.686 198.000 16.000 198.000 L 240.000 198.000 C 243.314 198.000 246.000 195.314 246.000 192.000 C 246.000 188.686 243.314 186.000 240.000 186.000 ZM 38.000 97.420 L 218.000 58.850 L 218.000 186.000 L 190.000 186.000 L 190.000 128.000 C 190.000 124.686 187.314 122.000 184.000 122.000 L 72.000 122.000 C 68.686 122.000 66.000 124.686 66.000 128.000 L 66.000 186.000 L 38.000 186.000 ZM 178.000 154.000 L 78.000 154.000 L 78.000 134.000 L 178.000 134.000 ZM 78.000 166.000 L 178.000 166.000 L 178.000 186.000 L 78.000 186.000 Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
