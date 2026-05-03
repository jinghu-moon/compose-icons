package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorFillIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 56.000 L 80.000 56.000 C 40.235 56.000 8.000 88.235 8.000 128.000 C 8.000 167.764 40.235 200.000 80.000 200.000 L 176.000 200.000 C 215.764 200.000 248.000 167.764 248.000 128.000 C 248.000 88.235 215.764 56.000 176.000 56.000 ZM 176.000 168.000 C 153.909 168.000 136.000 150.091 136.000 128.000 C 136.000 105.909 153.909 88.000 176.000 88.000 C 198.091 88.000 216.000 105.909 216.000 128.000 C 216.000 150.091 198.091 168.000 176.000 168.000 Z"),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
