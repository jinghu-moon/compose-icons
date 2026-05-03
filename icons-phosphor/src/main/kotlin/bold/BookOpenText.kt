package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorBoldIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 44.000 L 160.000 44.000 C 147.878 43.996 136.294 49.010 128.000 57.850 C 119.706 49.010 108.122 43.996 96.000 44.000 L 24.000 44.000 C 17.373 44.000 12.000 49.373 12.000 56.000 L 12.000 200.000 C 12.000 206.627 17.373 212.000 24.000 212.000 L 96.000 212.000 C 107.046 212.000 116.000 220.954 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 C 140.000 220.954 148.954 212.000 160.000 212.000 L 232.000 212.000 C 238.627 212.000 244.000 206.627 244.000 200.000 L 244.000 56.000 C 244.000 49.373 238.627 44.000 232.000 44.000 ZM 96.000 188.000 L 36.000 188.000 L 36.000 68.000 L 96.000 68.000 C 107.046 68.000 116.000 76.954 116.000 88.000 L 116.000 192.810 C 109.810 189.641 102.954 187.993 96.000 188.000 ZM 220.000 188.000 L 160.000 188.000 C 153.044 187.996 146.187 189.652 140.000 192.830 L 140.000 88.000 C 140.000 76.954 148.954 68.000 160.000 68.000 L 220.000 68.000 ZM 164.000 96.000 L 196.000 96.000 C 202.627 96.000 208.000 101.373 208.000 108.000 C 208.000 114.627 202.627 120.000 196.000 120.000 L 164.000 120.000 C 157.373 120.000 152.000 114.627 152.000 108.000 C 152.000 101.373 157.373 96.000 164.000 96.000 ZM 208.000 148.000 C 208.000 154.627 202.627 160.000 196.000 160.000 L 164.000 160.000 C 157.373 160.000 152.000 154.627 152.000 148.000 C 152.000 141.373 157.373 136.000 164.000 136.000 L 196.000 136.000 C 202.627 136.000 208.000 141.373 208.000 148.000 Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
