package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorLightIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.370 69.320 L 205.370 37.320 C 204.354 35.285 202.275 33.999 200.000 34.000 L 56.000 34.000 C 53.725 33.999 51.646 35.285 50.630 37.320 L 34.630 69.320 C 34.218 70.153 34.002 71.070 34.000 72.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 72.000 C 221.998 71.070 221.782 70.153 221.370 69.320 ZM 59.710 46.000 L 196.290 46.000 L 206.290 66.000 L 49.710 66.000 ZM 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 78.000 L 210.000 78.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 164.240 131.760 C 165.845 133.256 166.506 135.508 165.963 137.634 C 165.420 139.760 163.760 141.420 161.634 141.963 C 159.508 142.506 157.256 141.845 155.760 140.240 L 134.000 118.490 L 134.000 184.000 C 134.000 187.314 131.314 190.000 128.000 190.000 C 124.686 190.000 122.000 187.314 122.000 184.000 L 122.000 118.490 L 100.240 140.240 C 97.876 142.443 94.192 142.378 91.907 140.093 C 89.622 137.808 89.557 134.124 91.760 131.760 L 123.760 99.760 C 126.103 97.420 129.897 97.420 132.240 99.760 Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
