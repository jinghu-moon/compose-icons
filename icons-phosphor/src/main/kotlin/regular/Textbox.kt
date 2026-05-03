package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorRegularIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.000 40.000 C 107.582 40.000 104.000 43.582 104.000 48.000 L 104.000 64.000 L 24.000 64.000 C 15.163 64.000 8.000 71.163 8.000 80.000 L 8.000 176.000 C 8.000 184.837 15.163 192.000 24.000 192.000 L 104.000 192.000 L 104.000 208.000 C 104.000 212.418 107.582 216.000 112.000 216.000 C 116.418 216.000 120.000 212.418 120.000 208.000 L 120.000 48.000 C 120.000 43.582 116.418 40.000 112.000 40.000 ZM 24.000 176.000 L 24.000 80.000 L 104.000 80.000 L 104.000 176.000 ZM 248.000 80.000 L 248.000 176.000 C 248.000 184.837 240.837 192.000 232.000 192.000 L 144.000 192.000 C 139.582 192.000 136.000 188.418 136.000 184.000 C 136.000 179.582 139.582 176.000 144.000 176.000 L 232.000 176.000 L 232.000 80.000 L 144.000 80.000 C 139.582 80.000 136.000 76.418 136.000 72.000 C 136.000 67.582 139.582 64.000 144.000 64.000 L 232.000 64.000 C 240.837 64.000 248.000 71.163 248.000 80.000 ZM 88.000 112.000 C 88.000 116.418 84.418 120.000 80.000 120.000 L 72.000 120.000 L 72.000 144.000 C 72.000 148.418 68.418 152.000 64.000 152.000 C 59.582 152.000 56.000 148.418 56.000 144.000 L 56.000 120.000 L 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 C 40.000 107.582 43.582 104.000 48.000 104.000 L 80.000 104.000 C 84.418 104.000 88.000 107.582 88.000 112.000 Z"),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
