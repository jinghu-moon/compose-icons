package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorFillIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 120v96c0 4.418-3.582 8-8 8h-56c-4.418 0-8-3.582-8-8v-52c0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v52c0 4.418-3.582 8-8 8h-56c-4.418 0-8-3.582-8-8v-96c.002-4.243 1.689-8.311 4.69-11.31L116.69 28.69c6.248-6.243 16.372-6.243 22.62 0l80 80c3.001 2.999 4.688 7.067 4.69 11.31Z"),
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
        return _house!!
    }

private var _house: ImageVector? = null
