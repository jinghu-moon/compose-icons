package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorLightIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 48.000 L 222.000 152.000 C 222.000 159.732 215.732 166.000 208.000 166.000 L 94.490 166.000 L 108.240 179.760 C 109.845 181.256 110.506 183.508 109.963 185.634 C 109.420 187.760 107.760 189.420 105.634 189.963 C 103.508 190.506 101.256 189.845 99.760 188.240 L 75.760 164.240 C 73.420 161.897 73.420 158.103 75.760 155.760 L 99.760 131.760 C 102.124 129.557 105.808 129.622 108.093 131.907 C 110.378 134.192 110.443 137.876 108.240 140.240 L 94.490 154.000 L 208.000 154.000 C 209.105 154.000 210.000 153.105 210.000 152.000 L 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 96.000 46.000 C 94.895 46.000 94.000 46.895 94.000 48.000 L 94.000 56.000 C 94.000 59.314 91.314 62.000 88.000 62.000 C 84.686 62.000 82.000 59.314 82.000 56.000 L 82.000 48.000 C 82.000 40.268 88.268 34.000 96.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 168.000 194.000 C 164.686 194.000 162.000 196.686 162.000 200.000 L 162.000 208.000 C 162.000 209.105 161.105 210.000 160.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 104.000 C 46.000 102.895 46.895 102.000 48.000 102.000 L 161.510 102.000 L 147.760 115.760 C 146.155 117.256 145.494 119.508 146.037 121.634 C 146.580 123.760 148.240 125.420 150.366 125.963 C 152.492 126.506 154.744 125.845 156.240 124.240 L 180.240 100.240 C 182.580 97.897 182.580 94.103 180.240 91.760 L 156.240 67.760 C 153.876 65.557 150.192 65.622 147.907 67.907 C 145.622 70.192 145.557 73.876 147.760 76.240 L 161.510 90.000 L 48.000 90.000 C 40.268 90.000 34.000 96.268 34.000 104.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 160.000 222.000 C 167.732 222.000 174.000 215.732 174.000 208.000 L 174.000 200.000 C 174.000 196.686 171.314 194.000 168.000 194.000 Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
