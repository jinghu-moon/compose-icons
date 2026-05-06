package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorBoldIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 124c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM160 152h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM220 40v160c0 19.882-16.118 36-36 36h-112C52.118 236 36 219.882 36 200v-160C36 33.373 41.373 28 48 28h24v-4C72 17.373 77.373 12 84 12c6.627 0 12 5.373 12 12v4h20v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h20v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4h24c6.627 0 12 5.373 12 12ZM196 52h-12v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-20v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-20v4c0 6.627-5.373 12-12 12C77.373 68 72 62.627 72 56v-4h-12v148c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
