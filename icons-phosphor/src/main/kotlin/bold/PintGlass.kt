package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorBoldIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.000 24.000 C 206.711 21.440 203.434 19.984 200.000 20.000 L 56.000 20.000 C 52.569 20.001 49.303 21.471 47.026 24.038 C 44.750 26.605 43.681 30.024 44.090 33.430 L 67.240 226.430 C 68.468 236.464 76.991 244.004 87.100 244.000 L 168.900 244.000 C 179.026 244.001 187.555 236.434 188.760 226.380 L 211.910 33.430 C 212.337 30.015 211.277 26.581 209.000 24.000 ZM 186.470 44.000 L 184.550 60.000 L 71.450 60.000 L 69.530 44.000 ZM 165.350 220.000 L 90.650 220.000 L 74.330 84.000 L 181.670 84.000 Z"),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
