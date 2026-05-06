package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorBoldIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 232c0 6.627-5.373 12-12 12h-144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h144c6.627 0 12 5.373 12 12ZM76 184v-144C76 28.954 84.954 20 96 20h64c11.046 0 20 8.954 20 20v144c0 11.046-8.954 20-20 20h-64C84.954 204 76 195.046 76 184ZM100 180h56v-136h-56Z"),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
