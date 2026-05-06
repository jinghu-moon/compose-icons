package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorThinIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-160C41.373 44 36 49.373 36 56v56c0 51.16 24.73 82.12 45.47 99.1 22.4 18.32 44.55 24.5 45.48 24.76 .688 .187 1.412 .187 2.1 0 .93-.26 23.08-6.44 45.48-24.76C195.27 194.1 220 163.16 220 112v-56c0-6.627-5.373-12-12-12ZM212 112c0 38.44-14.23 69.63-42.29 92.71C157.319 214.873 143.187 222.703 128 227.82 112.811 222.708 98.678 214.877 86.29 204.71 58.23 181.63 44 150.44 44 112v-56c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM170.83 101.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-56 56c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-24-24c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L112 154.34l53.17-53.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173Z"),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
