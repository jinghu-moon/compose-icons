package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FourK: ImageVector
    get() {
        if (_fourK != null) return _fourK!!
        _fourK = phosphorThinIcon(
            name = "FourK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 48c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4ZM224 204h-192c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM144 76c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-30.5l17.75-20.28L196.54 178c.681 1.302 2.021 2.126 3.49 2.146 1.469 .02 2.831-.767 3.547-2.05 .716-1.283 .671-2.855-.117-4.095L171.3 118.87 203 82.63c1.066-1.052 1.455-2.612 1.007-4.042-.448-1.43-1.656-2.489-3.132-2.746-1.476-.257-2.971 .333-3.875 1.528l-49 56v-53.37c0-2.209-1.791-4-4-4ZM92 176v-20h-52c-1.53 .002-2.927-.868-3.599-2.242-.672-1.374-.502-3.011 .439-4.218L92.84 77.54c1.049-1.352 2.842-1.886 4.46-1.331 1.618 .556 2.704 2.08 2.7 3.791v68h12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-12v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM92 148v-56.34L48.18 148Z"),
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
        return _fourK!!
    }

private var _fourK: ImageVector? = null
