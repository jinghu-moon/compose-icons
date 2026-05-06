package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorBoldIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.87 119.06l-40-80C206.506 32.27 199.577 27.982 192 28h-128C56.423 27.982 49.494 32.27 46.13 39.06L6.13 119.06c-3.096 6.196-2.766 13.554 .873 19.448 3.639 5.894 10.07 9.485 16.997 9.492h92v56h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20v-56h92c6.931-0 13.367-3.589 17.011-9.484 3.644-5.895 3.977-13.257 .879-19.456ZM30.49 124 66.49 52h123l36 72ZM192 100c0 6.627-5.373 12-12 12h-104c-6.627 0-12-5.373-12-12C64 93.373 69.373 88 76 88h104c6.627 0 12 5.373 12 12Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
