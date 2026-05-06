package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorThinIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 100h-48c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v38.34L65.46 64.89C82.549 47.704 105.764 38.01 130 37.94h.51c24.04-.061 47.136 9.348 64.29 26.19 1.58 1.546 1.606 4.08 .06 5.66-1.546 1.58-4.08 1.606-5.66 .06C173.545 54.474 152.463 45.884 130.52 45.94h-.47c-22.13 .068-43.328 8.915-58.94 24.6L49.66 92h38.34c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM216 156h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h38.34l-21.45 21.46C169.291 201.133 148.113 209.979 126 210.06h-.47c-21.96 .069-43.063-8.522-58.73-23.91-1.58-1.546-4.114-1.52-5.66 .06-1.546 1.58-1.52 4.114 .06 5.66 17.151 16.84 40.244 26.249 64.28 26.19h.52c24.239-.068 47.459-9.762 64.55-26.95L212 169.66v38.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
