package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorLightIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.370 69.320 L 205.370 37.320 C 204.354 35.285 202.275 33.999 200.000 34.000 L 56.000 34.000 C 53.725 33.999 51.646 35.285 50.630 37.320 L 34.630 69.320 C 34.218 70.153 34.002 71.070 34.000 72.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 72.000 C 221.998 71.070 221.782 70.153 221.370 69.320 ZM 59.710 46.000 L 196.290 46.000 L 206.290 66.000 L 49.710 66.000 ZM 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 78.000 L 210.000 78.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 164.240 147.760 C 166.580 150.103 166.580 153.897 164.240 156.240 L 132.240 188.240 C 129.897 190.580 126.103 190.580 123.760 188.240 L 91.760 156.240 C 89.557 153.876 89.622 150.192 91.907 147.907 C 94.192 145.622 97.876 145.557 100.240 147.760 L 122.000 169.510 L 122.000 104.000 C 122.000 100.686 124.686 98.000 128.000 98.000 C 131.314 98.000 134.000 100.686 134.000 104.000 L 134.000 169.510 L 155.760 147.760 C 158.103 145.420 161.897 145.420 164.240 147.760 Z"),
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
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
