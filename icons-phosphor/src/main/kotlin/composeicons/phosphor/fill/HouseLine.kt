package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorFillIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 208h-16v-72l2.34 2.34c3.131 3.126 8.204 3.121 11.33-.01 3.126-3.131 3.121-8.204-.01-11.33L139.31 28.68c-6.248-6.243-16.372-6.243-22.62 0L18.34 127c-3.123 3.126-3.121 8.192 .005 11.315 3.126 3.123 8.192 3.121 11.315-.005L32 136v72h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM152 208h-48v-48c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4Z"),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
