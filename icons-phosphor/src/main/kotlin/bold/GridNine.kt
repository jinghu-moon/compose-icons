package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorBoldIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 28.954 44.000 20.000 52.954 20.000 64.000 L 20.000 192.000 C 20.000 203.046 28.954 212.000 40.000 212.000 L 216.000 212.000 C 227.046 212.000 236.000 203.046 236.000 192.000 L 236.000 64.000 C 236.000 52.954 227.046 44.000 216.000 44.000 ZM 108.000 140.000 L 108.000 116.000 L 148.000 116.000 L 148.000 140.000 ZM 148.000 164.000 L 148.000 188.000 L 108.000 188.000 L 108.000 164.000 ZM 44.000 116.000 L 84.000 116.000 L 84.000 140.000 L 44.000 140.000 ZM 108.000 92.000 L 108.000 68.000 L 148.000 68.000 L 148.000 92.000 ZM 172.000 116.000 L 212.000 116.000 L 212.000 140.000 L 172.000 140.000 ZM 212.000 92.000 L 172.000 92.000 L 172.000 68.000 L 212.000 68.000 ZM 84.000 68.000 L 84.000 92.000 L 44.000 92.000 L 44.000 68.000 ZM 44.000 164.000 L 84.000 164.000 L 84.000 188.000 L 44.000 188.000 ZM 172.000 188.000 L 172.000 164.000 L 212.000 164.000 L 212.000 188.000 Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
