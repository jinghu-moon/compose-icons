package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorBoldIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 44c0 6.627-5.373 12-12 12h-160C53.373 56 48 50.627 48 44 48 37.373 53.373 32 60 32h160c6.627 0 12 5.373 12 12ZM176 88c0-6.627-5.373-12-12-12h-120C37.373 76 32 81.373 32 88c0 6.627 5.373 12 12 12h120c6.627 0 12-5.373 12-12ZM176 132c0-6.627-5.373-12-12-12h-88c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h88c6.627 0 12-5.373 12-12ZM172 164h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM140 208h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
