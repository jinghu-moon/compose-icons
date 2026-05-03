package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorLightIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 88.000 158.000 C 93.523 158.000 98.000 162.477 98.000 168.000 C 98.000 173.523 93.523 178.000 88.000 178.000 C 82.477 178.000 78.000 173.523 78.000 168.000 C 78.000 162.477 82.477 158.000 88.000 158.000 ZM 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 82.000 46.000 L 82.000 146.840 C 71.436 149.835 64.698 160.159 66.209 171.035 C 67.721 181.910 77.020 190.006 88.000 190.006 C 98.980 190.006 108.279 181.910 109.791 171.035 C 111.302 160.159 104.564 149.835 94.000 146.840 L 94.000 110.490 L 146.000 162.490 L 146.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 158.000 210.000 L 158.000 160.000 C 157.999 158.409 157.366 156.884 156.240 155.760 L 94.000 93.510 L 94.000 46.000 L 130.000 46.000 L 130.000 72.000 C 130.001 73.591 130.634 75.116 131.760 76.240 L 148.760 93.240 C 143.406 102.827 145.940 114.894 154.699 121.516 C 163.458 128.139 175.759 127.288 183.524 119.524 C 191.288 111.759 192.139 99.458 185.516 90.699 C 178.894 81.940 166.827 79.406 157.240 84.760 L 142.000 69.510 L 142.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 168.000 94.000 C 173.523 94.000 178.000 98.477 178.000 104.000 C 178.000 109.523 173.523 114.000 168.000 114.000 C 162.477 114.000 158.000 109.523 158.000 104.000 C 158.000 98.477 162.477 94.000 168.000 94.000 Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
