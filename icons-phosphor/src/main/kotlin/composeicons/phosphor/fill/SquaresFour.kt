package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorFillIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 56v48c0 8.837-7.163 16-16 16h-48c-8.837 0-16-7.163-16-16v-48C40 47.163 47.163 40 56 40h48c8.837 0 16 7.163 16 16ZM200 40h-48c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM104 136h-48c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM200 136h-48c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16Z"),
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
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
