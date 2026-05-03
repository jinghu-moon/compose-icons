package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorBoldIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 128.000 C 244.000 134.627 238.627 140.000 232.000 140.000 L 207.420 140.000 L 170.730 213.370 C 168.697 217.433 164.543 219.999 160.000 220.000 L 159.400 220.000 C 154.645 219.759 150.482 216.730 148.790 212.280 L 95.000 71.150 L 66.920 133.000 C 64.963 137.269 60.696 140.004 56.000 140.000 L 24.000 140.000 C 17.373 140.000 12.000 134.627 12.000 128.000 C 12.000 121.373 17.373 116.000 24.000 116.000 L 48.270 116.000 L 85.080 35.000 C 87.087 30.598 91.542 27.831 96.378 27.984 C 101.214 28.137 105.485 31.180 107.210 35.700 L 161.490 178.160 L 189.270 122.600 C 191.312 118.549 195.463 115.995 200.000 116.000 L 232.000 116.000 C 238.627 116.000 244.000 121.373 244.000 128.000 Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
