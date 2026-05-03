package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinktreeLogo: ImageVector
    get() {
        if (_linktreeLogo != null) return _linktreeLogo!!
        _linktreeLogo = phosphorLightIcon(
            name = "LinktreeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 160.000 L 134.000 232.000 C 134.000 235.314 131.314 238.000 128.000 238.000 C 124.686 238.000 122.000 235.314 122.000 232.000 L 122.000 160.000 C 122.000 156.686 124.686 154.000 128.000 154.000 C 131.314 154.000 134.000 156.686 134.000 160.000 ZM 208.000 98.000 L 142.480 98.000 L 188.240 52.240 C 190.443 49.876 190.378 46.192 188.093 43.907 C 185.808 41.622 182.124 41.557 179.760 43.760 L 134.000 89.520 L 134.000 24.000 C 134.000 20.686 131.314 18.000 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 89.520 L 76.240 43.760 C 73.876 41.557 70.192 41.622 67.907 43.907 C 65.622 46.192 65.557 49.876 67.760 52.240 L 113.520 98.000 L 48.000 98.000 C 44.686 98.000 42.000 100.686 42.000 104.000 C 42.000 107.314 44.686 110.000 48.000 110.000 L 113.520 110.000 L 67.760 155.760 C 66.155 157.256 65.494 159.508 66.037 161.634 C 66.580 163.760 68.240 165.420 70.366 165.963 C 72.492 166.506 74.744 165.845 76.240 164.240 L 128.000 112.480 L 179.760 164.240 C 182.124 166.443 185.808 166.378 188.093 164.093 C 190.378 161.808 190.443 158.124 188.240 155.760 L 142.480 110.000 L 208.000 110.000 C 211.314 110.000 214.000 107.314 214.000 104.000 C 214.000 100.686 211.314 98.000 208.000 98.000 Z"),
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
        return _linktreeLogo!!
    }

private var _linktreeLogo: ImageVector? = null
