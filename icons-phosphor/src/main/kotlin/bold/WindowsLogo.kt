package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorBoldIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 99.690 51.880 C 96.958 49.596 93.353 48.644 89.850 49.280 L 29.850 60.190 C 24.144 61.229 19.998 66.200 20.000 72.000 L 20.000 108.000 C 20.000 114.627 25.373 120.000 32.000 120.000 L 92.000 120.000 C 98.627 120.000 104.000 114.627 104.000 108.000 L 104.000 61.090 C 103.999 57.533 102.421 54.159 99.690 51.880 ZM 80.000 96.000 L 44.000 96.000 L 44.000 82.000 L 80.000 75.460 ZM 215.690 30.790 C 212.958 28.506 209.353 27.554 205.850 28.190 L 129.850 42.000 C 124.140 43.040 119.993 48.017 120.000 53.820 L 120.000 108.000 C 120.000 114.627 125.373 120.000 132.000 120.000 L 208.000 120.000 C 214.627 120.000 220.000 114.627 220.000 108.000 L 220.000 40.000 C 219.999 36.443 218.421 33.069 215.690 30.790 ZM 196.000 96.000 L 144.000 96.000 L 144.000 63.830 L 196.000 54.380 ZM 92.000 136.000 L 32.000 136.000 C 25.373 136.000 20.000 141.373 20.000 148.000 L 20.000 184.000 C 19.998 189.800 24.144 194.771 29.850 195.810 L 89.850 206.720 C 93.352 207.358 96.956 206.408 99.689 204.127 C 102.422 201.846 104.001 198.470 104.000 194.910 L 104.000 148.000 C 104.000 141.373 98.627 136.000 92.000 136.000 ZM 80.000 180.530 L 44.000 174.000 L 44.000 160.000 L 80.000 160.000 ZM 208.000 136.000 L 132.000 136.000 C 125.373 136.000 120.000 141.373 120.000 148.000 L 120.000 202.180 C 119.993 207.983 124.140 212.960 129.850 214.000 L 205.850 227.820 C 209.354 228.458 212.960 227.507 215.693 225.224 C 218.426 222.941 220.004 219.561 220.000 216.000 L 220.000 148.000 C 220.000 141.373 214.627 136.000 208.000 136.000 ZM 196.000 201.620 L 144.000 192.170 L 144.000 160.000 L 196.000 160.000 Z"),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
