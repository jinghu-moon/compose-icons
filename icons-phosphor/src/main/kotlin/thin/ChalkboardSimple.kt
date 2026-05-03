package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorThinIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 196.000 L 228.000 196.000 L 228.000 168.000 C 228.000 165.791 226.209 164.000 224.000 164.000 L 160.000 164.000 C 157.791 164.000 156.000 165.791 156.000 168.000 L 156.000 196.000 L 36.000 196.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 L 220.000 136.000 C 220.000 138.209 221.791 140.000 224.000 140.000 C 226.209 140.000 228.000 138.209 228.000 136.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 196.000 L 16.000 196.000 C 13.791 196.000 12.000 197.791 12.000 200.000 C 12.000 202.209 13.791 204.000 16.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 202.209 244.000 200.000 C 244.000 197.791 242.209 196.000 240.000 196.000 ZM 164.000 172.000 L 220.000 172.000 L 220.000 196.000 L 164.000 196.000 Z"),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
