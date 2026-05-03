package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorThinIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 164.000 C 147.882 164.000 164.000 147.882 164.000 128.000 C 164.000 108.118 147.882 92.000 128.000 92.000 C 108.118 92.000 92.000 108.118 92.000 128.000 C 92.000 147.882 108.118 164.000 128.000 164.000 ZM 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 ZM 240.000 60.000 L 16.000 60.000 C 13.791 60.000 12.000 61.791 12.000 64.000 L 12.000 192.000 C 12.000 194.209 13.791 196.000 16.000 196.000 L 240.000 196.000 C 242.209 196.000 244.000 194.209 244.000 192.000 L 244.000 64.000 C 244.000 61.791 242.209 60.000 240.000 60.000 ZM 20.000 107.260 C 39.472 102.676 54.676 87.472 59.260 68.000 L 196.740 68.000 C 201.324 87.472 216.528 102.676 236.000 107.260 L 236.000 148.740 C 216.528 153.324 201.324 168.528 196.740 188.000 L 59.260 188.000 C 54.676 168.528 39.472 153.324 20.000 148.740 ZM 236.000 99.000 C 220.971 94.774 209.226 83.029 205.000 68.000 L 236.000 68.000 ZM 51.000 68.000 C 46.774 83.029 35.029 94.774 20.000 99.000 L 20.000 68.000 ZM 20.000 157.000 C 35.029 161.226 46.774 172.971 51.000 188.000 L 20.000 188.000 ZM 205.000 188.000 C 209.226 172.971 220.971 161.226 236.000 157.000 L 236.000 188.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _money!!
    }

private var _money: ImageVector? = null
