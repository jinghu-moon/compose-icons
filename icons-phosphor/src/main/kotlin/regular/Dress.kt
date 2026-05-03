package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorRegularIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.700 209.700 C 214.669 209.614 214.633 209.531 214.590 209.450 L 169.110 112.590 L 189.610 80.410 C 189.650 80.352 189.687 80.292 189.720 80.230 C 192.759 75.164 192.759 68.836 189.720 63.770 C 189.630 63.610 189.520 63.450 189.420 63.300 L 168.000 32.700 L 168.000 8.000 C 168.000 3.582 164.418 0.000 160.000 0.000 C 155.582 0.000 152.000 3.582 152.000 8.000 L 152.000 32.420 L 146.740 39.000 C 142.185 44.693 135.290 48.006 128.000 48.006 C 120.710 48.006 113.815 44.693 109.260 39.000 L 104.000 32.420 L 104.000 8.000 C 104.000 3.582 100.418 0.000 96.000 0.000 C 91.582 0.000 88.000 3.582 88.000 8.000 L 88.000 32.700 L 66.580 63.300 C 66.480 63.450 66.370 63.610 66.280 63.770 C 63.241 68.836 63.241 75.164 66.280 80.230 C 66.313 80.292 66.350 80.352 66.390 80.410 L 86.890 112.590 L 41.410 209.450 C 41.367 209.531 41.331 209.614 41.300 209.700 C 39.183 214.642 39.690 220.317 42.649 224.806 C 45.608 229.295 50.624 231.997 56.000 232.000 L 200.000 232.000 C 205.378 232.001 210.397 229.300 213.358 224.810 C 216.320 220.321 216.828 214.644 214.710 209.700 ZM 80.000 72.000 L 96.430 48.570 L 96.760 48.990 C 104.351 58.483 115.846 64.009 128.000 64.009 C 140.154 64.009 151.649 58.483 159.240 48.990 L 159.570 48.570 L 176.000 72.000 L 155.620 104.000 L 100.390 104.000 ZM 56.000 216.000 L 101.070 120.000 L 154.910 120.000 L 200.000 216.000 Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
