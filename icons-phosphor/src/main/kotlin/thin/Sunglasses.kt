package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorThinIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 44.000 C 197.791 44.000 196.000 45.791 196.000 48.000 C 196.000 50.209 197.791 52.000 200.000 52.000 C 211.046 52.000 220.000 60.954 220.000 72.000 L 220.000 132.000 L 36.000 132.000 L 36.000 72.000 C 36.000 60.954 44.954 52.000 56.000 52.000 C 58.209 52.000 60.000 50.209 60.000 48.000 C 60.000 45.791 58.209 44.000 56.000 44.000 C 40.536 44.000 28.000 56.536 28.000 72.000 L 28.000 164.000 C 28.000 186.091 45.909 204.000 68.000 204.000 C 90.091 204.000 108.000 186.091 108.000 164.000 L 108.000 140.000 L 148.000 140.000 L 148.000 164.000 C 148.000 186.091 165.909 204.000 188.000 204.000 C 210.091 204.000 228.000 186.091 228.000 164.000 L 228.000 72.000 C 228.000 56.536 215.464 44.000 200.000 44.000 ZM 36.000 164.000 L 36.000 140.000 L 38.340 140.000 L 87.610 189.260 C 77.962 196.742 64.898 198.082 53.932 192.715 C 42.967 187.348 36.010 176.209 36.000 164.000 ZM 100.000 164.000 C 100.005 171.106 97.633 178.009 93.260 183.610 L 49.660 140.000 L 100.000 140.000 ZM 156.000 164.000 L 156.000 140.000 L 158.340 140.000 L 207.610 189.260 C 197.962 196.742 184.898 198.082 173.932 192.715 C 162.967 187.348 156.010 176.209 156.000 164.000 ZM 213.260 183.610 L 169.660 140.000 L 220.000 140.000 L 220.000 164.000 C 220.005 171.106 217.633 178.009 213.260 183.610 Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
