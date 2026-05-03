package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorThinIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 67.790 62.740 C 67.241 61.114 65.716 60.019 64.000 60.019 C 62.284 60.019 60.759 61.114 60.210 62.740 L 20.210 182.740 C 19.806 183.958 20.011 185.297 20.761 186.338 C 21.512 187.380 22.716 187.998 24.000 188.000 L 104.000 188.000 C 105.284 187.998 106.488 187.380 107.239 186.338 C 107.989 185.297 108.194 183.958 107.790 182.740 ZM 29.550 180.000 L 64.000 76.650 L 98.450 180.000 ZM 204.000 76.000 C 204.000 49.490 182.510 28.000 156.000 28.000 C 129.490 28.000 108.000 49.490 108.000 76.000 C 108.000 102.510 129.490 124.000 156.000 124.000 C 182.498 123.972 203.972 102.498 204.000 76.000 ZM 116.000 76.000 C 116.000 53.909 133.909 36.000 156.000 36.000 C 178.091 36.000 196.000 53.909 196.000 76.000 C 196.000 98.091 178.091 116.000 156.000 116.000 C 133.909 116.000 116.000 98.091 116.000 76.000 ZM 224.000 148.000 L 136.000 148.000 C 133.791 148.000 132.000 149.791 132.000 152.000 L 132.000 208.000 C 132.000 210.209 133.791 212.000 136.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 L 228.000 152.000 C 228.000 149.791 226.209 148.000 224.000 148.000 ZM 220.000 204.000 L 140.000 204.000 L 140.000 156.000 L 220.000 156.000 Z"),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
