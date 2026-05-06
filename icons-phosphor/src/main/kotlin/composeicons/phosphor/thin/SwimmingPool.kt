package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SwimmingPool: ImageVector
    get() {
        if (_swimmingPool != null) return _swimmingPool!!
        _swimmingPool = phosphorThinIcon(
            name = "SwimmingPool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 145.39c2.209 0 4-1.791 4-4v-17.39h72v19.29c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-111.29c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-72v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v109.39c0 2.209 1.791 4 4 4ZM92 116v-24h72v24ZM164 60v24h-72v-24ZM28 168c0-2.209 1.791-4 4-4 13.21 0 20.12 4.61 26.22 8.67 5.9 3.93 11 7.33 21.78 7.33 10.78 0 15.88-3.4 21.78-7.33 6.09-4.06 13-8.67 26.21-8.67 13.21 0 20.13 4.61 26.22 8.67 5.9 3.93 11 7.33 21.79 7.33 10.79 0 15.88-3.4 21.78-7.33 6.1-4.06 13-8.67 26.22-8.67 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-10.79 0-15.88 3.4-21.78 7.33-6.1 4.06-13 8.67-26.22 8.67-13.22 0-20.13-4.61-26.22-8.67-5.9-3.93-11-7.33-21.79-7.33-10.79 0-15.88 3.4-21.78 7.33C100.12 183.39 93.21 188 80 188c-13.21 0-20.12-4.61-26.22-8.67C47.88 175.4 42.79 172 32 172c-2.209 0-4-1.791-4-4ZM228 208c0 2.209-1.791 4-4 4-10.79 0-15.88 3.4-21.78 7.33-6.1 4.06-13 8.67-26.22 8.67-13.22 0-20.13-4.61-26.22-8.67-5.9-3.93-11-7.33-21.79-7.33-10.79 0-15.88 3.4-21.78 7.33C100.12 223.39 93.21 228 80 228c-13.21 0-20.12-4.61-26.22-8.67C47.88 215.4 42.79 212 32 212c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 13.21 0 20.12 4.61 26.22 8.67 5.9 3.93 11 7.33 21.78 7.33 10.78 0 15.88-3.4 21.78-7.33 6.09-4.06 13-8.67 26.21-8.67 13.21 0 20.13 4.61 26.22 8.67 5.9 3.93 11 7.33 21.79 7.33 10.79 0 15.88-3.4 21.78-7.33 6.1-4.06 13-8.67 26.22-8.67 2.209 0 4 1.791 4 4Z"),
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
        return _swimmingPool!!
    }

private var _swimmingPool: ImageVector? = null
