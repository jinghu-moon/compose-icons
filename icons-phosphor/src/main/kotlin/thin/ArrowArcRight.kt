package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorThinIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 88.000 L 236.000 152.000 C 236.000 154.209 234.209 156.000 232.000 156.000 L 168.000 156.000 C 165.791 156.000 164.000 154.209 164.000 152.000 C 164.000 149.791 165.791 148.000 168.000 148.000 L 222.300 148.000 L 193.060 119.000 C 166.756 92.691 127.195 84.813 92.819 99.040 C 58.443 113.267 36.019 146.797 36.000 184.000 C 36.000 186.209 34.209 188.000 32.000 188.000 C 29.791 188.000 28.000 186.209 28.000 184.000 C 28.001 143.554 52.365 107.091 89.732 91.613 C 127.099 76.135 170.110 84.691 198.710 113.290 L 228.000 142.390 L 228.000 88.000 C 228.000 85.791 229.791 84.000 232.000 84.000 C 234.209 84.000 236.000 85.791 236.000 88.000 Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
