package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = phosphorThinIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 60.000 L 172.000 60.000 L 172.000 48.000 C 172.000 36.954 163.046 28.000 152.000 28.000 L 104.000 28.000 C 92.954 28.000 84.000 36.954 84.000 48.000 L 84.000 60.000 L 40.000 60.000 C 33.373 60.000 28.000 65.373 28.000 72.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 72.000 C 228.000 65.373 222.627 60.000 216.000 60.000 ZM 92.000 48.000 C 92.000 41.373 97.373 36.000 104.000 36.000 L 152.000 36.000 C 158.627 36.000 164.000 41.373 164.000 48.000 L 164.000 60.000 L 92.000 60.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 72.000 C 36.000 69.791 37.791 68.000 40.000 68.000 L 216.000 68.000 C 218.209 68.000 220.000 69.791 220.000 72.000 ZM 156.000 136.000 C 156.000 138.209 154.209 140.000 152.000 140.000 L 132.000 140.000 L 132.000 160.000 C 132.000 162.209 130.209 164.000 128.000 164.000 C 125.791 164.000 124.000 162.209 124.000 160.000 L 124.000 140.000 L 104.000 140.000 C 101.791 140.000 100.000 138.209 100.000 136.000 C 100.000 133.791 101.791 132.000 104.000 132.000 L 124.000 132.000 L 124.000 112.000 C 124.000 109.791 125.791 108.000 128.000 108.000 C 130.209 108.000 132.000 109.791 132.000 112.000 L 132.000 132.000 L 152.000 132.000 C 154.209 132.000 156.000 133.791 156.000 136.000 Z"),
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
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
