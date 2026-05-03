package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorLightIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 40.000 C 230.000 43.314 227.314 46.000 224.000 46.000 L 56.000 46.000 C 52.686 46.000 50.000 43.314 50.000 40.000 C 50.000 36.686 52.686 34.000 56.000 34.000 L 224.000 34.000 C 227.314 34.000 230.000 36.686 230.000 40.000 ZM 182.000 72.000 C 182.000 68.686 179.314 66.000 176.000 66.000 L 32.000 66.000 C 28.686 66.000 26.000 68.686 26.000 72.000 C 26.000 75.314 28.686 78.000 32.000 78.000 L 176.000 78.000 C 179.314 78.000 182.000 75.314 182.000 72.000 ZM 166.000 104.000 C 166.000 100.686 163.314 98.000 160.000 98.000 L 56.000 98.000 C 52.686 98.000 50.000 100.686 50.000 104.000 C 50.000 107.314 52.686 110.000 56.000 110.000 L 160.000 110.000 C 163.314 110.000 166.000 107.314 166.000 104.000 ZM 182.000 136.000 C 182.000 132.686 179.314 130.000 176.000 130.000 L 88.000 130.000 C 84.686 130.000 82.000 132.686 82.000 136.000 C 82.000 139.314 84.686 142.000 88.000 142.000 L 176.000 142.000 C 179.314 142.000 182.000 139.314 182.000 136.000 ZM 184.000 162.000 L 120.000 162.000 C 116.686 162.000 114.000 164.686 114.000 168.000 C 114.000 171.314 116.686 174.000 120.000 174.000 L 184.000 174.000 C 187.314 174.000 190.000 171.314 190.000 168.000 C 190.000 164.686 187.314 162.000 184.000 162.000 ZM 160.000 194.000 L 128.000 194.000 C 124.686 194.000 122.000 196.686 122.000 200.000 C 122.000 203.314 124.686 206.000 128.000 206.000 L 160.000 206.000 C 163.314 206.000 166.000 203.314 166.000 200.000 C 166.000 196.686 163.314 194.000 160.000 194.000 ZM 128.000 226.000 L 112.000 226.000 C 108.686 226.000 106.000 228.686 106.000 232.000 C 106.000 235.314 108.686 238.000 112.000 238.000 L 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 C 134.000 228.686 131.314 226.000 128.000 226.000 Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
