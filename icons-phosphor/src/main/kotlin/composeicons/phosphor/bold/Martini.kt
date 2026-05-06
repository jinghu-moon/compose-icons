package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorBoldIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.09 35.41C241.233 30.924 236.855 27.999 232 28h-208c-4.855 0-9.231 2.925-11.087 7.411-1.856 4.486-.827 9.648 2.607 13.079L116 149v55h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28v-55L240.48 48.49c3.436-3.43 4.466-8.593 2.61-13.08ZM203 52 191 64h-126L53 52ZM128 127 89 88h78Z"),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
