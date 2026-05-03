package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorRegularIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 216.000 128.000 C 216.000 134.000 199.000 144.230 167.230 149.170 C 167.740 142.170 168.000 135.090 168.000 128.000 C 168.000 95.760 162.650 63.280 152.260 43.400 C 189.966 54.273 215.948 88.758 216.000 128.000 ZM 128.000 40.000 C 136.150 40.000 152.000 71.060 152.000 128.000 C 152.000 136.240 151.660 143.920 151.070 151.070 C 143.920 151.660 136.240 152.000 128.000 152.000 C 71.060 152.000 40.000 136.150 40.000 128.000 C 40.055 79.422 79.422 40.055 128.000 40.000 ZM 43.400 152.260 C 63.280 162.650 95.760 168.000 128.000 168.000 C 135.090 168.000 142.190 167.740 149.170 167.230 C 144.230 199.000 134.000 216.000 128.000 216.000 C 88.758 215.948 54.273 189.966 43.400 152.260 ZM 152.260 212.600 C 158.550 200.600 162.990 183.930 165.520 165.520 C 183.930 162.990 200.520 158.520 212.600 152.260 C 204.169 181.392 181.392 204.169 152.260 212.600 Z"),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
