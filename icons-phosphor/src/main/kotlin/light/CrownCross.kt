package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorLightIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 58.000 C 160.850 58.000 144.430 65.790 134.000 78.320 L 134.000 38.000 L 152.000 38.000 C 155.314 38.000 158.000 35.314 158.000 32.000 C 158.000 28.686 155.314 26.000 152.000 26.000 L 134.000 26.000 L 134.000 8.000 C 134.000 4.686 131.314 2.000 128.000 2.000 C 124.686 2.000 122.000 4.686 122.000 8.000 L 122.000 26.000 L 104.000 26.000 C 100.686 26.000 98.000 28.686 98.000 32.000 C 98.000 35.314 100.686 38.000 104.000 38.000 L 122.000 38.000 L 122.000 78.320 C 111.570 65.790 95.150 58.000 76.000 58.000 C 43.983 58.039 18.039 83.983 18.000 116.000 C 18.000 145.110 32.170 163.620 44.050 174.000 C 50.645 179.736 58.060 184.455 66.050 188.000 L 66.050 208.000 C 66.050 215.732 72.318 222.000 80.050 222.000 L 176.050 222.000 C 183.782 222.000 190.050 215.732 190.050 208.000 L 190.050 188.050 C 198.025 184.485 205.424 179.750 212.000 174.000 C 223.880 163.610 238.050 145.100 238.050 116.000 C 238.011 83.964 212.036 58.011 180.000 58.000 ZM 182.100 178.310 C 179.652 179.127 178.001 181.419 178.000 184.000 L 178.000 208.000 C 178.000 209.105 177.105 210.000 176.000 210.000 L 80.000 210.000 C 78.895 210.000 78.000 209.105 78.000 208.000 L 78.000 184.000 C 77.999 181.419 76.348 179.127 73.900 178.310 C 73.460 178.160 30.000 163.130 30.000 116.000 C 30.033 90.609 50.609 70.033 76.000 70.000 C 102.650 70.000 122.000 87.660 122.000 112.000 L 122.000 176.000 C 122.000 179.314 124.686 182.000 128.000 182.000 C 131.314 182.000 134.000 179.314 134.000 176.000 L 134.000 112.000 C 134.000 87.660 153.350 70.000 180.000 70.000 C 205.391 70.033 225.967 90.609 226.000 116.000 C 226.000 162.900 183.880 177.710 182.100 178.310 Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
