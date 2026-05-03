package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorThinIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.000 128.000 C 116.004 129.146 115.516 130.238 114.660 131.000 L 42.660 195.000 C 41.003 196.469 38.469 196.317 37.000 194.660 C 35.531 193.003 35.683 190.469 37.340 189.000 L 106.000 128.000 L 37.340 67.000 C 35.683 65.531 35.531 62.997 37.000 61.340 C 38.469 59.683 41.003 59.531 42.660 61.000 L 114.660 125.000 C 115.516 125.762 116.004 126.854 116.000 128.000 ZM 216.000 188.000 L 120.000 188.000 C 117.791 188.000 116.000 189.791 116.000 192.000 C 116.000 194.209 117.791 196.000 120.000 196.000 L 216.000 196.000 C 218.209 196.000 220.000 194.209 220.000 192.000 C 220.000 189.791 218.209 188.000 216.000 188.000 Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
