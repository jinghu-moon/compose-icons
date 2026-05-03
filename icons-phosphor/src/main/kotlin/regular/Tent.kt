package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorRegularIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 255.310 188.750 L 191.310 44.750 C 190.026 41.861 187.161 40.000 184.000 40.000 L 72.000 40.000 C 68.867 40.005 66.026 41.838 64.730 44.690 C 64.727 44.710 64.727 44.730 64.730 44.750 L 64.730 44.870 L 64.730 44.870 L 0.690 188.750 C -0.410 191.225 -0.184 194.088 1.292 196.359 C 2.767 198.630 5.292 200.000 8.000 200.000 L 248.000 200.000 C 250.708 200.000 253.233 198.630 254.708 196.359 C 256.184 194.088 256.410 191.225 255.310 188.750 ZM 64.000 184.000 L 20.310 184.000 L 64.000 85.700 ZM 80.000 184.000 L 80.000 85.700 L 123.690 184.000 ZM 141.200 184.000 L 84.310 56.000 L 178.800 56.000 L 235.690 184.000 Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
