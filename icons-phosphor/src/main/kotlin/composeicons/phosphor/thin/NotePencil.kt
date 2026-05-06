package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorThinIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.83 61.17l-32-32c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-96 96c-.75 .751-1.171 1.769-1.17 2.83v32c0 2.209 1.791 4 4 4h32c1.061 .001 2.079-.42 2.83-1.17l96-96c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM126.34 156h-26.34v-26.34L168 61.66 194.34 88ZM200 82.34 173.66 56 192 37.66 218.34 64ZM220 128v80c0 6.627-5.373 12-12 12h-160c-6.627 0-12-5.373-12-12v-160C36 41.373 41.373 36 48 36h80c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-80c-2.209 0-4 1.791-4 4v160c0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
