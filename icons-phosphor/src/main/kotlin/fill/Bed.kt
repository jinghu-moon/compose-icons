package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorFillIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 72.000 L 32.000 72.000 L 32.000 48.000 C 32.000 43.582 28.418 40.000 24.000 40.000 C 19.582 40.000 16.000 43.582 16.000 48.000 L 16.000 208.000 C 16.000 212.418 19.582 216.000 24.000 216.000 C 28.418 216.000 32.000 212.418 32.000 208.000 L 32.000 176.000 L 240.000 176.000 L 240.000 208.000 C 240.000 212.418 243.582 216.000 248.000 216.000 C 252.418 216.000 256.000 212.418 256.000 208.000 L 256.000 112.000 C 256.000 89.909 238.091 72.000 216.000 72.000 ZM 32.000 88.000 L 104.000 88.000 L 104.000 160.000 L 32.000 160.000 Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
