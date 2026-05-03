package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorBoldIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 96.000 C 188.000 62.863 161.137 36.000 128.000 36.000 C 94.863 36.000 68.000 62.863 68.000 96.000 C 68.000 129.137 94.863 156.000 128.000 156.000 C 130.612 155.996 133.221 155.819 135.810 155.470 L 109.540 202.110 C 106.287 207.887 108.333 215.207 114.110 218.460 C 119.887 221.713 127.207 219.667 130.460 213.890 L 180.000 125.890 C 185.253 116.805 188.013 106.494 188.000 96.000 ZM 92.000 96.000 C 92.000 76.118 108.118 60.000 128.000 60.000 C 147.882 60.000 164.000 76.118 164.000 96.000 C 164.000 115.882 147.882 132.000 128.000 132.000 C 108.118 132.000 92.000 115.882 92.000 96.000 Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
