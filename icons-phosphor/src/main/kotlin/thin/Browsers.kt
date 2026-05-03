package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorThinIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 72.000 44.000 C 65.373 44.000 60.000 49.373 60.000 56.000 L 60.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 81.373 28.000 88.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 184.000 212.000 C 190.627 212.000 196.000 206.627 196.000 200.000 L 196.000 180.000 L 216.000 180.000 C 222.627 180.000 228.000 174.627 228.000 168.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 40.000 84.000 L 184.000 84.000 C 186.209 84.000 188.000 85.791 188.000 88.000 L 188.000 108.000 L 36.000 108.000 L 36.000 88.000 C 36.000 85.791 37.791 84.000 40.000 84.000 ZM 188.000 200.000 C 188.000 202.209 186.209 204.000 184.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 116.000 L 188.000 116.000 ZM 220.000 168.000 C 220.000 170.209 218.209 172.000 216.000 172.000 L 196.000 172.000 L 196.000 88.000 C 196.000 81.373 190.627 76.000 184.000 76.000 L 68.000 76.000 L 68.000 56.000 C 68.000 53.791 69.791 52.000 72.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 Z"),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
