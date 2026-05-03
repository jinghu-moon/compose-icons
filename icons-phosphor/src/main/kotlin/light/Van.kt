package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorLightIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.550 108.090 L 207.000 55.000 C 204.336 51.826 200.404 49.995 196.260 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 176.000 C 18.000 183.732 24.268 190.000 32.000 190.000 L 50.600 190.000 C 53.439 203.982 65.733 214.030 80.000 214.030 C 94.267 214.030 106.561 203.982 109.400 190.000 L 162.600 190.000 C 165.439 203.982 177.733 214.030 192.000 214.030 C 206.267 214.030 218.561 203.982 221.400 190.000 L 240.000 190.000 C 247.732 190.000 254.000 183.732 254.000 176.000 L 254.000 112.000 C 254.000 110.565 253.485 109.178 252.550 108.090 ZM 197.850 62.770 L 234.940 106.000 L 174.000 106.000 L 174.000 62.000 L 196.260 62.000 C 196.881 61.996 197.468 62.280 197.850 62.770 ZM 102.000 106.000 L 102.000 62.000 L 162.000 62.000 L 162.000 106.000 ZM 32.000 62.000 L 90.000 62.000 L 90.000 106.000 L 30.000 106.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 ZM 80.000 202.000 C 70.059 202.000 62.000 193.941 62.000 184.000 C 62.000 174.059 70.059 166.000 80.000 166.000 C 89.941 166.000 98.000 174.059 98.000 184.000 C 98.000 193.941 89.941 202.000 80.000 202.000 ZM 192.000 202.000 C 182.059 202.000 174.000 193.941 174.000 184.000 C 174.000 174.059 182.059 166.000 192.000 166.000 C 201.941 166.000 210.000 174.059 210.000 184.000 C 210.000 193.941 201.941 202.000 192.000 202.000 ZM 240.000 178.000 L 221.400 178.000 C 218.561 164.018 206.267 153.970 192.000 153.970 C 177.733 153.970 165.439 164.018 162.600 178.000 L 109.400 178.000 C 106.561 164.018 94.267 153.970 80.000 153.970 C 65.733 153.970 53.439 164.018 50.600 178.000 L 32.000 178.000 C 30.895 178.000 30.000 177.105 30.000 176.000 L 30.000 118.000 L 242.000 118.000 L 242.000 176.000 C 242.000 177.105 241.105 178.000 240.000 178.000 Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
