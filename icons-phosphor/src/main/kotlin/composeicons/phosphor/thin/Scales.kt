package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorThinIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.71 134.51l-32-80h0c-.731-1.811-2.663-2.83-4.57-2.41L132 67v-27c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28.79L55.13 84.1c-1.286 .287-2.348 1.188-2.84 2.41h0 0 0l-32 80c-.191 .474-.289 .979-.29 1.49 0 20.4 22.08 28 36 28 13.92 0 36-7.6 36-28-.001-.511-.099-1.016-.29-1.49L61.46 90.88 124 77v135h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-136.79L193.47 61.55l-29.18 73c-.186 .461-.284 .953-.29 1.45 0 20.4 22.08 28 36 28 13.92 0 36-7.6 36-28-.001-.511-.099-1.016-.29-1.49ZM56 188c-7.15 0-27.37-3.56-28-19.27L56 98.73l28 70C83.37 184.44 63.15 188 56 188ZM200 156c-7.15 0-27.37-3.56-28-19.27L200 66.73l28 70C227.37 152.44 207.15 156 200 156Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
