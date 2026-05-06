package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorThinIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-160C41.373 44 36 49.373 36 56v56c0 51.16 24.73 82.12 45.47 99.1 22.4 18.32 44.55 24.5 45.48 24.76 .688 .187 1.412 .187 2.1 0 .93-.26 23.08-6.44 45.48-24.76C195.27 194.1 220 163.16 220 112v-56c0-6.627-5.373-12-12-12ZM169.71 204.71C157.319 214.873 143.187 222.703 128 227.82 112.811 222.708 98.678 214.877 86.29 204.71 75.408 195.877 66.23 185.131 59.21 173L128 124.88 196.79 173c-7.02 12.131-16.198 22.877-27.08 31.71ZM212 112c0 20-3.85 38-11.46 53.89L130.29 116.72c-1.376-.961-3.204-.961-4.58 0L55.46 165.89C47.85 150 44 132 44 112v-56c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
