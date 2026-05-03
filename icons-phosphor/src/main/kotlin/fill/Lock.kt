package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = phosphorFillIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 80.000 L 176.000 80.000 L 176.000 56.000 C 176.000 29.490 154.510 8.000 128.000 8.000 C 101.490 8.000 80.000 29.490 80.000 56.000 L 80.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 ZM 128.000 164.000 C 121.373 164.000 116.000 158.627 116.000 152.000 C 116.000 145.373 121.373 140.000 128.000 140.000 C 134.627 140.000 140.000 145.373 140.000 152.000 C 140.000 158.627 134.627 164.000 128.000 164.000 ZM 160.000 80.000 L 96.000 80.000 L 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 C 145.673 24.000 160.000 38.327 160.000 56.000 Z"),
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
        return _lock!!
    }

private var _lock: ImageVector? = null
