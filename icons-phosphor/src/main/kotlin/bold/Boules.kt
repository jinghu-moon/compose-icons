package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorBoldIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 178.280 60.750 L 60.750 178.280 C 57.537 173.988 54.738 169.400 52.390 164.580 L 164.580 52.390 C 169.400 54.738 173.988 57.537 178.280 60.750 ZM 195.280 77.750 C 198.493 82.042 201.292 86.630 203.640 91.450 L 91.420 203.610 C 86.600 201.262 82.012 198.463 77.720 195.250 ZM 128.000 44.000 C 131.467 44.007 134.930 44.228 138.370 44.660 L 44.660 138.370 C 41.643 114.463 49.055 90.414 65.005 72.353 C 80.956 54.291 103.904 43.963 128.000 44.000 ZM 128.000 212.000 C 124.533 211.993 121.070 211.772 117.630 211.340 L 211.340 117.630 C 214.357 141.537 206.945 165.586 190.995 183.647 C 175.044 201.709 152.096 212.037 128.000 212.000 Z"),
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
        return _boules!!
    }

private var _boules: ImageVector? = null
