package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorThinIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 60.000 66.070 C 74.558 81.952 83.024 102.474 83.900 124.000 L 36.090 124.000 C 37.009 102.481 45.474 81.973 60.000 66.070 ZM 132.000 124.000 L 132.000 36.090 C 153.706 37.020 174.376 45.632 190.320 60.390 C 174.271 77.787 164.968 100.347 164.090 124.000 ZM 124.000 124.000 L 91.910 124.000 C 91.032 100.347 81.729 77.787 65.680 60.390 C 81.624 45.632 102.294 37.020 124.000 36.090 ZM 83.900 132.000 C 83.024 153.526 74.558 174.048 60.000 189.930 C 45.474 174.027 37.009 153.519 36.090 132.000 ZM 91.900 132.000 L 124.000 132.000 L 124.000 219.910 C 102.294 218.980 81.624 210.368 65.680 195.610 C 81.729 178.213 91.032 155.653 91.910 132.000 ZM 132.000 132.000 L 164.090 132.000 C 164.968 155.653 174.271 178.213 190.320 195.610 C 174.376 210.368 153.706 218.980 132.000 219.910 ZM 172.100 132.000 L 219.910 132.000 C 218.991 153.519 210.526 174.027 196.000 189.930 C 181.442 174.048 172.976 153.526 172.100 132.000 ZM 172.100 124.000 C 172.976 102.474 181.442 81.952 196.000 66.070 C 210.526 81.973 218.991 102.481 219.910 124.000 Z"),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
