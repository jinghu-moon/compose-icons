package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GridFour: ImageVector
    get() {
        if (_gridFour != null) return _gridFour!!
        _gridFour = phosphorFillIcon(
            name = "GridFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 56v60c0 2.209-1.791 4-4 4h-76v-76c0-2.209 1.791-4 4-4h60c8.837 0 16 7.163 16 16ZM116 40h-60C47.163 40 40 47.163 40 56v60c0 2.209 1.791 4 4 4h76v-76c0-2.209-1.791-4-4-4ZM212 136h-76v76c0 2.209 1.791 4 4 4h60c8.837 0 16-7.163 16-16v-60c0-2.209-1.791-4-4-4ZM40 140v60c0 8.837 7.163 16 16 16h60c2.209 0 4-1.791 4-4v-76h-76c-2.209 0-4 1.791-4 4Z"),
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
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
