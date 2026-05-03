package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorThinIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 196.000 L 228.000 196.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 196.000 L 16.000 196.000 C 13.791 196.000 12.000 197.791 12.000 200.000 C 12.000 202.209 13.791 204.000 16.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 202.209 244.000 200.000 C 244.000 197.791 242.209 196.000 240.000 196.000 ZM 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 L 220.000 196.000 L 196.000 196.000 L 196.000 168.000 C 196.000 165.791 194.209 164.000 192.000 164.000 L 120.000 164.000 C 117.791 164.000 116.000 165.791 116.000 168.000 L 116.000 196.000 L 68.000 196.000 L 68.000 84.000 L 188.000 84.000 L 188.000 136.000 C 188.000 138.209 189.791 140.000 192.000 140.000 C 194.209 140.000 196.000 138.209 196.000 136.000 L 196.000 80.000 C 196.000 77.791 194.209 76.000 192.000 76.000 L 64.000 76.000 C 61.791 76.000 60.000 77.791 60.000 80.000 L 60.000 196.000 L 36.000 196.000 ZM 188.000 196.000 L 124.000 196.000 L 124.000 172.000 L 188.000 172.000 Z"),
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
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
