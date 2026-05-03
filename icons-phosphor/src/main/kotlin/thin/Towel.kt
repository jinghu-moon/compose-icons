package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorThinIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 28.000 L 72.000 28.000 C 60.954 28.000 52.000 36.954 52.000 48.000 L 52.000 216.000 C 52.000 222.627 57.373 228.000 64.000 228.000 L 176.000 228.000 C 182.627 228.000 188.000 222.627 188.000 216.000 L 188.000 48.000 C 188.000 41.373 193.373 36.000 200.000 36.000 C 206.627 36.000 212.000 41.373 212.000 48.000 L 212.000 152.000 C 212.000 154.209 213.791 156.000 216.000 156.000 C 218.209 156.000 220.000 154.209 220.000 152.000 L 220.000 48.000 C 220.000 36.954 211.046 28.000 200.000 28.000 ZM 72.000 36.000 L 184.000 36.000 C 181.394 39.457 179.990 43.671 180.000 48.000 L 180.000 188.000 L 60.000 188.000 L 60.000 48.000 C 60.000 41.373 65.373 36.000 72.000 36.000 ZM 176.000 220.000 L 64.000 220.000 C 61.791 220.000 60.000 218.209 60.000 216.000 L 60.000 196.000 L 180.000 196.000 L 180.000 216.000 C 180.000 218.209 178.209 220.000 176.000 220.000 Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
