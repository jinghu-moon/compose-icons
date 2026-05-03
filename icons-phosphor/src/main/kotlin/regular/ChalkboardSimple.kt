package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorRegularIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 192.000 L 232.000 192.000 L 232.000 168.000 C 232.000 163.582 228.418 160.000 224.000 160.000 L 160.000 160.000 C 155.582 160.000 152.000 163.582 152.000 168.000 L 152.000 192.000 L 40.000 192.000 L 40.000 56.000 L 216.000 56.000 L 216.000 136.000 C 216.000 140.418 219.582 144.000 224.000 144.000 C 228.418 144.000 232.000 140.418 232.000 136.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 192.000 L 16.000 192.000 C 11.582 192.000 8.000 195.582 8.000 200.000 C 8.000 204.418 11.582 208.000 16.000 208.000 L 240.000 208.000 C 244.418 208.000 248.000 204.418 248.000 200.000 C 248.000 195.582 244.418 192.000 240.000 192.000 ZM 168.000 176.000 L 216.000 176.000 L 216.000 192.000 L 168.000 192.000 Z"),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
