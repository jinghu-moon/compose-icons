package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorThinIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 48v48c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h38.34L184.89 70.54C152.357 38.011 99.711 37.703 66.8 69.85c-1.58 1.546-4.114 1.52-5.66-.06-1.546-1.58-1.52-4.114 .06-5.66 36.046-35.21 93.71-34.871 129.34 .76L212 86.34v-38.34c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM189.2 186.15c-15.655 15.376-36.737 23.966-58.68 23.91h-.47c-22.13-.068-43.328-8.915-58.94-24.6L49.66 164h38.34c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-38.34l21.46 21.45c17.091 17.182 40.305 26.875 64.54 26.95h.51c24.036 .057 47.128-9.352 64.28-26.19 1.58-1.546 1.606-4.08 .06-5.66-1.546-1.58-4.08-1.606-5.66-.06Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
