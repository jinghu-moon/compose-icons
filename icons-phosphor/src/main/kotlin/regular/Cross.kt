package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorRegularIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 72.000 L 160.000 72.000 L 160.000 32.000 C 160.000 23.163 152.837 16.000 144.000 16.000 L 112.000 16.000 C 103.163 16.000 96.000 23.163 96.000 32.000 L 96.000 72.000 L 56.000 72.000 C 47.163 72.000 40.000 79.163 40.000 88.000 L 40.000 120.000 C 40.000 128.837 47.163 136.000 56.000 136.000 L 96.000 136.000 L 96.000 224.000 C 96.000 232.837 103.163 240.000 112.000 240.000 L 144.000 240.000 C 152.837 240.000 160.000 232.837 160.000 224.000 L 160.000 136.000 L 200.000 136.000 C 208.837 136.000 216.000 128.837 216.000 120.000 L 216.000 88.000 C 216.000 79.163 208.837 72.000 200.000 72.000 ZM 200.000 120.000 L 152.000 120.000 C 147.582 120.000 144.000 123.582 144.000 128.000 L 144.000 224.000 L 112.000 224.000 L 112.000 128.000 C 112.000 123.582 108.418 120.000 104.000 120.000 L 56.000 120.000 L 56.000 88.000 L 104.000 88.000 C 108.418 88.000 112.000 84.418 112.000 80.000 L 112.000 32.000 L 144.000 32.000 L 144.000 80.000 C 144.000 84.418 147.582 88.000 152.000 88.000 L 200.000 88.000 Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
