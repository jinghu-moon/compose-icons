package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorThinIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 48.000 L 212.000 88.000 C 212.000 90.209 210.209 92.000 208.000 92.000 C 205.791 92.000 204.000 90.209 204.000 88.000 L 204.000 57.660 L 153.460 108.200 C 151.897 109.763 149.363 109.763 147.800 108.200 C 146.237 106.637 146.237 104.103 147.800 102.540 L 198.340 52.000 L 168.000 52.000 C 165.791 52.000 164.000 50.209 164.000 48.000 C 164.000 45.791 165.791 44.000 168.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 208.000 164.000 C 205.791 164.000 204.000 165.791 204.000 168.000 L 204.000 198.340 L 50.830 45.170 C 49.267 43.607 46.733 43.607 45.170 45.170 C 43.607 46.733 43.607 49.267 45.170 50.830 L 198.340 204.000 L 168.000 204.000 C 165.791 204.000 164.000 205.791 164.000 208.000 C 164.000 210.209 165.791 212.000 168.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 L 212.000 168.000 C 212.000 165.791 210.209 164.000 208.000 164.000 ZM 102.540 147.800 L 45.170 205.170 C 43.607 206.733 43.607 209.267 45.170 210.830 C 46.733 212.393 49.267 212.393 50.830 210.830 L 108.200 153.460 C 109.763 151.897 109.763 149.363 108.200 147.800 C 106.637 146.237 104.103 146.237 102.540 147.800 Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
