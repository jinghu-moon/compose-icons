package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Suitcase: ImageVector
    get() {
        if (_suitcase != null) return _suitcase!!
        _suitcase = phosphorThinIcon(
            name = "Suitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 60.000 L 172.000 60.000 L 172.000 48.000 C 172.000 36.954 163.046 28.000 152.000 28.000 L 104.000 28.000 C 92.954 28.000 84.000 36.954 84.000 48.000 L 84.000 60.000 L 40.000 60.000 C 33.373 60.000 28.000 65.373 28.000 72.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 72.000 C 228.000 65.373 222.627 60.000 216.000 60.000 ZM 84.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 72.000 C 36.000 69.791 37.791 68.000 40.000 68.000 L 84.000 68.000 ZM 164.000 204.000 L 92.000 204.000 L 92.000 68.000 L 164.000 68.000 ZM 164.000 60.000 L 92.000 60.000 L 92.000 48.000 C 92.000 41.373 97.373 36.000 104.000 36.000 L 152.000 36.000 C 158.627 36.000 164.000 41.373 164.000 48.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 172.000 204.000 L 172.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 69.791 220.000 72.000 Z"),
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
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
