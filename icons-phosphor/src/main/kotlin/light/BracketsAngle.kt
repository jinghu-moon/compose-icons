package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorLightIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 85.060 43.220 L 31.110 128.000 L 85.110 212.780 C 86.887 215.575 86.063 219.281 83.270 221.060 C 80.475 222.837 76.769 222.013 74.990 219.220 L 18.990 131.220 C 17.740 129.255 17.740 126.745 18.990 124.780 L 74.990 36.780 C 76.810 34.089 80.441 33.335 83.181 35.079 C 85.922 36.823 86.777 40.432 85.110 43.220 ZM 237.060 124.780 L 181.060 36.780 C 179.940 34.906 177.889 33.788 175.707 33.862 C 173.525 33.936 171.555 35.190 170.564 37.135 C 169.573 39.081 169.717 41.411 170.940 43.220 L 224.890 128.000 L 170.940 212.780 C 169.163 215.575 169.987 219.281 172.780 221.060 C 175.575 222.837 179.281 222.013 181.060 219.220 L 237.060 131.220 C 238.310 129.255 238.310 126.745 237.060 124.780 Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
