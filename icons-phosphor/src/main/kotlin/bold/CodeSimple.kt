package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorBoldIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 96.000 73.000 L 34.060 128.000 L 96.000 183.000 C 100.971 187.418 101.418 195.029 97.000 200.000 C 92.582 204.971 84.971 205.418 80.000 201.000 L 8.000 137.000 C 5.417 134.722 3.937 131.444 3.937 128.000 C 3.937 124.556 5.417 121.278 8.000 119.000 L 80.000 55.000 C 84.971 50.582 92.582 51.029 97.000 56.000 C 101.418 60.971 100.971 68.582 96.000 73.000 ZM 248.000 119.000 L 176.000 55.000 C 171.029 50.582 163.418 51.029 159.000 56.000 C 154.582 60.971 155.029 68.582 160.000 73.000 L 221.910 128.000 L 160.000 183.000 C 155.029 187.418 154.582 195.029 159.000 200.000 C 163.418 204.971 171.029 205.418 176.000 201.000 L 248.000 137.000 C 250.583 134.722 252.063 131.444 252.063 128.000 C 252.063 124.556 250.583 121.278 248.000 119.000 Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
