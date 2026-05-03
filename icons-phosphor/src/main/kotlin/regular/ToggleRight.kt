package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorRegularIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 56.000 L 80.000 56.000 C 40.235 56.000 8.000 88.235 8.000 128.000 C 8.000 167.764 40.235 200.000 80.000 200.000 L 176.000 200.000 C 215.764 200.000 248.000 167.764 248.000 128.000 C 248.000 88.235 215.764 56.000 176.000 56.000 ZM 176.000 184.000 L 80.000 184.000 C 49.072 184.000 24.000 158.928 24.000 128.000 C 24.000 97.072 49.072 72.000 80.000 72.000 L 176.000 72.000 C 206.928 72.000 232.000 97.072 232.000 128.000 C 232.000 158.928 206.928 184.000 176.000 184.000 ZM 176.000 88.000 C 153.909 88.000 136.000 105.909 136.000 128.000 C 136.000 150.091 153.909 168.000 176.000 168.000 C 198.091 168.000 216.000 150.091 216.000 128.000 C 216.000 105.909 198.091 88.000 176.000 88.000 ZM 176.000 152.000 C 162.745 152.000 152.000 141.255 152.000 128.000 C 152.000 114.745 162.745 104.000 176.000 104.000 C 189.255 104.000 200.000 114.745 200.000 128.000 C 200.000 141.255 189.255 152.000 176.000 152.000 Z"),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
