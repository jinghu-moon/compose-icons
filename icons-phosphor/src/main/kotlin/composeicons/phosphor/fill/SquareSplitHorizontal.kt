package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SquareSplitHorizontal: ImageVector
    get() {
        if (_squareSplitHorizontal != null) return _squareSplitHorizontal!!
        _squareSplitHorizontal = phosphorFillIcon(
            name = "SquareSplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 44v168c0 2.209-1.791 4-4 4h-60c-8.837 0-16-7.163-16-16v-144C40 47.163 47.163 40 56 40h60c2.209 0 4 1.791 4 4ZM200 40h-60c-2.209 0-4 1.791-4 4v168c0 2.209 1.791 4 4 4h60c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16Z"),
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
        return _squareSplitHorizontal!!
    }

private var _squareSplitHorizontal: ImageVector? = null
