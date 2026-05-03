package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorLightIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 166.000 152.000 C 166.000 168.540 148.950 182.000 128.000 182.000 C 107.050 182.000 90.000 168.540 90.000 152.000 C 90.000 148.686 92.686 146.000 96.000 146.000 C 99.314 146.000 102.000 148.686 102.000 152.000 C 102.000 161.760 113.910 170.000 128.000 170.000 C 142.090 170.000 154.000 161.760 154.000 152.000 C 154.000 140.790 143.300 136.900 125.670 131.820 C 109.780 127.240 91.780 122.050 91.780 104.000 C 91.780 86.900 107.350 74.000 128.000 74.000 C 143.000 74.000 155.740 80.880 161.340 92.000 C 162.837 94.957 161.652 98.568 158.695 100.065 C 155.738 101.562 152.127 100.377 150.630 97.420 C 147.080 90.360 138.410 86.000 128.000 86.000 C 114.190 86.000 103.780 93.740 103.780 104.000 C 103.780 112.410 113.300 115.760 128.990 120.290 C 145.480 125.000 166.000 131.000 166.000 152.000 ZM 222.000 48.000 L 222.000 208.000 C 222.000 215.732 215.732 222.000 208.000 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 48.000 C 34.000 40.268 40.268 34.000 48.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 48.000 46.000 C 46.895 46.000 46.000 46.895 46.000 48.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 L 208.000 210.000 C 209.105 210.000 210.000 209.105 210.000 208.000 Z"),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
