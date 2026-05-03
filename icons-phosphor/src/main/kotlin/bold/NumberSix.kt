package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorBoldIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 100.000 C 125.388 100.004 122.779 100.181 120.190 100.530 L 146.460 53.890 C 149.713 48.113 147.667 40.793 141.890 37.540 C 136.113 34.287 128.793 36.333 125.540 42.110 L 76.000 130.130 C 62.486 153.673 66.462 183.356 85.696 202.512 C 104.930 221.668 134.629 225.524 158.117 211.915 C 181.605 198.305 193.029 170.621 185.975 144.408 C 178.921 118.195 155.146 99.984 128.000 100.000 ZM 128.000 196.000 C 108.118 196.000 92.000 179.882 92.000 160.000 C 92.000 140.118 108.118 124.000 128.000 124.000 C 147.882 124.000 164.000 140.118 164.000 160.000 C 164.000 179.882 147.882 196.000 128.000 196.000 Z"),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
