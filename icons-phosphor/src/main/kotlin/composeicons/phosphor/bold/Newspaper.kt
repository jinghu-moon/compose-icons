package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorBoldIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 108c0-6.627 5.373-12 12-12h72c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-72c-6.627 0-12-5.373-12-12ZM104 160h72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-72c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM236 64v120c0 15.464-12.536 28-28 28h-172C18.327 212 4 197.673 4 180v-92C4 81.373 9.373 76 16 76c6.627 0 12 5.373 12 12v92c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-116C44 52.954 52.954 44 64 44h152c11.046 0 20 8.954 20 20ZM212 68h-144v112c.005 2.698-.331 5.386-1 8h141c2.209 0 4-1.791 4-4Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
