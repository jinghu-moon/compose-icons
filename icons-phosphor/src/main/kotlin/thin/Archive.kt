package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorThinIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 88.000 C 20.000 94.627 25.373 100.000 32.000 100.000 L 36.000 100.000 L 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 L 208.000 204.000 C 214.627 204.000 220.000 198.627 220.000 192.000 L 220.000 100.000 L 224.000 100.000 C 230.627 100.000 236.000 94.627 236.000 88.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 212.000 192.000 C 212.000 194.209 210.209 196.000 208.000 196.000 L 48.000 196.000 C 45.791 196.000 44.000 194.209 44.000 192.000 L 44.000 100.000 L 212.000 100.000 ZM 228.000 88.000 C 228.000 90.209 226.209 92.000 224.000 92.000 L 32.000 92.000 C 29.791 92.000 28.000 90.209 28.000 88.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 ZM 100.000 136.000 C 100.000 133.791 101.791 132.000 104.000 132.000 L 152.000 132.000 C 154.209 132.000 156.000 133.791 156.000 136.000 C 156.000 138.209 154.209 140.000 152.000 140.000 L 104.000 140.000 C 101.791 140.000 100.000 138.209 100.000 136.000 Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
