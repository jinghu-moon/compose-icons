package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorLightIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 162.000 L 190.000 162.000 L 190.000 94.000 L 248.000 94.000 C 251.314 94.000 254.000 91.314 254.000 88.000 C 254.000 84.686 251.314 82.000 248.000 82.000 L 188.630 82.000 C 186.315 77.120 181.401 74.007 176.000 74.000 L 112.000 74.000 C 106.599 74.007 101.685 77.120 99.370 82.000 L 62.000 82.000 L 62.000 80.000 C 62.000 76.686 59.314 74.000 56.000 74.000 C 52.686 74.000 50.000 76.686 50.000 80.000 L 50.000 82.000 L 8.000 82.000 C 4.686 82.000 2.000 84.686 2.000 88.000 C 2.000 91.314 4.686 94.000 8.000 94.000 L 50.000 94.000 L 50.000 162.000 L 8.000 162.000 C 4.686 162.000 2.000 164.686 2.000 168.000 C 2.000 171.314 4.686 174.000 8.000 174.000 L 50.000 174.000 L 50.000 176.000 C 50.000 179.314 52.686 182.000 56.000 182.000 C 59.314 182.000 62.000 179.314 62.000 176.000 L 62.000 174.000 L 99.370 174.000 C 101.685 178.880 106.599 181.993 112.000 182.000 L 176.000 182.000 C 181.401 181.993 186.315 178.880 188.630 174.000 L 248.000 174.000 C 251.314 174.000 254.000 171.314 254.000 168.000 C 254.000 164.686 251.314 162.000 248.000 162.000 ZM 62.000 94.000 L 98.000 94.000 L 98.000 162.000 L 62.000 162.000 ZM 176.000 170.000 L 112.000 170.000 C 110.895 170.000 110.000 169.105 110.000 168.000 L 110.000 88.000 C 110.000 86.895 110.895 86.000 112.000 86.000 L 176.000 86.000 C 177.105 86.000 178.000 86.895 178.000 88.000 L 178.000 122.000 L 144.000 122.000 C 140.686 122.000 138.000 124.686 138.000 128.000 C 138.000 131.314 140.686 134.000 144.000 134.000 L 178.000 134.000 L 178.000 168.000 C 178.000 169.105 177.105 170.000 176.000 170.000 Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
