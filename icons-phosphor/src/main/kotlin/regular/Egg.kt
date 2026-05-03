package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorRegularIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 186.660 59.560 C 168.470 32.290 146.540 16.000 128.000 16.000 C 109.460 16.000 87.530 32.290 69.340 59.560 C 50.700 87.540 40.000 121.230 40.000 152.000 C 40.000 200.601 79.399 240.000 128.000 240.000 C 176.601 240.000 216.000 200.601 216.000 152.000 C 216.000 121.230 205.300 87.540 186.660 59.560 ZM 128.000 224.000 C 88.254 223.956 56.044 191.746 56.000 152.000 C 56.000 124.310 65.720 93.850 82.660 68.440 C 97.190 46.640 115.410 32.000 128.000 32.000 C 140.590 32.000 158.810 46.640 173.340 68.440 C 190.280 93.850 200.000 124.310 200.000 152.000 C 199.956 191.746 167.746 223.956 128.000 224.000 Z"),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
