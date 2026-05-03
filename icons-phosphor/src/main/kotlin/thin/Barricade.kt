package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorThinIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 68.000 L 32.000 68.000 C 25.373 68.000 20.000 73.373 20.000 80.000 L 20.000 152.000 C 20.000 158.627 25.373 164.000 32.000 164.000 L 60.000 164.000 L 60.000 200.000 C 60.000 202.209 61.791 204.000 64.000 204.000 C 66.209 204.000 68.000 202.209 68.000 200.000 L 68.000 164.000 L 188.000 164.000 L 188.000 200.000 C 188.000 202.209 189.791 204.000 192.000 204.000 C 194.209 204.000 196.000 202.209 196.000 200.000 L 196.000 164.000 L 224.000 164.000 C 230.627 164.000 236.000 158.627 236.000 152.000 L 236.000 80.000 C 236.000 73.373 230.627 68.000 224.000 68.000 ZM 228.000 80.000 L 228.000 138.340 L 165.660 76.000 L 224.000 76.000 C 226.209 76.000 228.000 77.791 228.000 80.000 ZM 32.000 76.000 L 82.340 76.000 L 162.340 156.000 L 101.660 156.000 L 28.000 82.340 L 28.000 80.000 C 28.000 77.791 29.791 76.000 32.000 76.000 ZM 28.000 152.000 L 28.000 93.660 L 90.340 156.000 L 32.000 156.000 C 29.791 156.000 28.000 154.209 28.000 152.000 ZM 224.000 156.000 L 173.660 156.000 L 93.660 76.000 L 154.340 76.000 L 228.000 149.660 L 228.000 152.000 C 228.000 154.209 226.209 156.000 224.000 156.000 Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
