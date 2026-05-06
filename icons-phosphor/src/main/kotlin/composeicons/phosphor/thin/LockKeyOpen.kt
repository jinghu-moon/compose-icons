package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) return _lockKeyOpen!!
        _lockKeyOpen = phosphorThinIcon(
            name = "LockKeyOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 84h-116v-28C92 36.118 108.118 20 128 20c17.24 0 32.75 12.38 36.08 28.8 .442 2.165 2.555 3.562 4.72 3.12 2.165-.442 3.562-2.555 3.12-4.72C167.78 26.81 149.31 12 128 12 103.711 12.028 84.028 31.711 84 56v28h-36C41.373 84 36 89.373 36 96v112c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM128 116c-12.467 .013-22.848 9.57-23.891 21.993-1.043 12.423 7.6 23.576 19.891 25.667v20.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20.34c12.29-2.091 20.933-13.244 19.891-25.667C150.848 125.57 140.467 116.013 128 116ZM128 156c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
