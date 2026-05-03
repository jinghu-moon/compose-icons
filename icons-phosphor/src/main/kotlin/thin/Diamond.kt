package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorThinIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.500 119.550 L 136.450 23.490 C 131.772 18.851 124.228 18.851 119.550 23.490 L 23.550 119.550 C 18.911 124.228 18.911 131.772 23.550 136.450 L 119.600 232.510 C 124.278 237.149 131.822 237.149 136.500 232.510 L 232.550 136.450 C 237.189 131.772 237.189 124.228 232.550 119.550 ZM 226.840 130.790 L 130.790 226.850 C 129.237 228.362 126.763 228.362 125.210 226.850 L 29.210 130.790 C 28.469 130.051 28.052 129.047 28.052 128.000 C 28.052 126.953 28.469 125.949 29.210 125.210 L 125.260 29.150 C 126.813 27.638 129.287 27.638 130.840 29.150 L 226.890 125.210 C 227.631 125.949 228.048 126.953 228.048 128.000 C 228.048 129.047 227.631 130.051 226.890 130.790 Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
