package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsThreeOutlineVertical: ImageVector
    get() {
        if (_dotsThreeOutlineVertical != null) return _dotsThreeOutlineVertical!!
        _dotsThreeOutlineVertical = phosphorThinIcon(
            name = "DotsThreeOutlineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 100.000 C 112.536 100.000 100.000 112.536 100.000 128.000 C 100.000 143.464 112.536 156.000 128.000 156.000 C 143.464 156.000 156.000 143.464 156.000 128.000 C 156.000 112.536 143.464 100.000 128.000 100.000 ZM 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 ZM 128.000 76.000 C 143.464 76.000 156.000 63.464 156.000 48.000 C 156.000 32.536 143.464 20.000 128.000 20.000 C 112.536 20.000 100.000 32.536 100.000 48.000 C 100.000 63.464 112.536 76.000 128.000 76.000 ZM 128.000 28.000 C 139.046 28.000 148.000 36.954 148.000 48.000 C 148.000 59.046 139.046 68.000 128.000 68.000 C 116.954 68.000 108.000 59.046 108.000 48.000 C 108.000 36.954 116.954 28.000 128.000 28.000 ZM 128.000 180.000 C 112.536 180.000 100.000 192.536 100.000 208.000 C 100.000 223.464 112.536 236.000 128.000 236.000 C 143.464 236.000 156.000 223.464 156.000 208.000 C 156.000 192.536 143.464 180.000 128.000 180.000 ZM 128.000 228.000 C 116.954 228.000 108.000 219.046 108.000 208.000 C 108.000 196.954 116.954 188.000 128.000 188.000 C 139.046 188.000 148.000 196.954 148.000 208.000 C 148.000 219.046 139.046 228.000 128.000 228.000 Z"),
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
        return _dotsThreeOutlineVertical!!
    }

private var _dotsThreeOutlineVertical: ImageVector? = null
