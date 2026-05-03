package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorLightIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 74.000 C 140.686 74.000 138.000 76.686 138.000 80.000 L 138.000 176.000 C 138.000 179.314 140.686 182.000 144.000 182.000 L 168.000 182.000 C 197.823 182.000 222.000 157.823 222.000 128.000 C 222.000 98.177 197.823 74.000 168.000 74.000 ZM 210.000 128.000 C 210.000 151.196 191.196 170.000 168.000 170.000 L 150.000 170.000 L 150.000 86.000 L 168.000 86.000 C 191.196 86.000 210.000 104.804 210.000 128.000 ZM 26.000 48.000 C 26.000 44.686 28.686 42.000 32.000 42.000 L 224.000 42.000 C 227.314 42.000 230.000 44.686 230.000 48.000 C 230.000 51.314 227.314 54.000 224.000 54.000 L 32.000 54.000 C 28.686 54.000 26.000 51.314 26.000 48.000 ZM 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 32.000 214.000 C 28.686 214.000 26.000 211.314 26.000 208.000 C 26.000 204.686 28.686 202.000 32.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 ZM 106.000 152.000 C 106.000 140.790 95.300 136.900 77.670 131.820 C 61.780 127.240 43.780 122.050 43.780 104.000 C 43.780 86.900 59.350 74.000 80.000 74.000 C 95.000 74.000 107.740 80.880 113.340 92.000 C 114.837 94.957 113.652 98.568 110.695 100.065 C 107.738 101.562 104.127 100.377 102.630 97.420 C 99.080 90.360 90.410 86.000 80.000 86.000 C 66.190 86.000 55.780 93.740 55.780 104.000 C 55.780 112.410 65.300 115.760 80.990 120.290 C 97.480 125.000 118.000 131.000 118.000 152.000 C 118.000 168.540 101.000 182.000 80.000 182.000 C 59.000 182.000 42.000 168.540 42.000 152.000 C 42.000 148.686 44.686 146.000 48.000 146.000 C 51.314 146.000 54.000 148.686 54.000 152.000 C 54.000 161.760 65.910 170.000 80.000 170.000 C 94.090 170.000 106.000 161.760 106.000 152.000 Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
