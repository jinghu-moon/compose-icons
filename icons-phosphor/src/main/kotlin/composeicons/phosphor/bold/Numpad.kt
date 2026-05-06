package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Numpad: ImageVector
    get() {
        if (_numpad != null) return _numpad!!
        _numpad = phosphorBoldIcon(
            name = "Numpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 48C84 59.046 75.046 68 64 68 52.954 68 44 59.046 44 48 44 36.954 52.954 28 64 28c11.046 0 20 8.954 20 20ZM128 28c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20C148 36.954 139.046 28 128 28ZM192 68c11.046 0 20-8.954 20-20C212 36.954 203.046 28 192 28c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20ZM64 84C52.954 84 44 92.954 44 104c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20C84 92.954 75.046 84 64 84ZM128 84c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20C148 92.954 139.046 84 128 84ZM192 84c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20C212 92.954 203.046 84 192 84ZM64 140c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20C84 148.954 75.046 140 64 140ZM128 140c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20ZM128 196c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20ZM192 140c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20Z"),
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
        return _numpad!!
    }

private var _numpad: ImageVector? = null
