package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorThinIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 72.000 C 188.000 74.209 186.209 76.000 184.000 76.000 L 160.000 76.000 C 157.791 76.000 156.000 74.209 156.000 72.000 C 156.000 69.791 157.791 68.000 160.000 68.000 L 184.000 68.000 C 186.209 68.000 188.000 69.791 188.000 72.000 ZM 184.000 100.000 L 160.000 100.000 C 157.791 100.000 156.000 101.791 156.000 104.000 C 156.000 106.209 157.791 108.000 160.000 108.000 L 184.000 108.000 C 186.209 108.000 188.000 106.209 188.000 104.000 C 188.000 101.791 186.209 100.000 184.000 100.000 ZM 72.000 76.000 L 96.000 76.000 C 98.209 76.000 100.000 74.209 100.000 72.000 C 100.000 69.791 98.209 68.000 96.000 68.000 L 72.000 68.000 C 69.791 68.000 68.000 69.791 68.000 72.000 C 68.000 74.209 69.791 76.000 72.000 76.000 ZM 96.000 100.000 L 72.000 100.000 C 69.791 100.000 68.000 101.791 68.000 104.000 C 68.000 106.209 69.791 108.000 72.000 108.000 L 96.000 108.000 C 98.209 108.000 100.000 106.209 100.000 104.000 C 100.000 101.791 98.209 100.000 96.000 100.000 ZM 220.000 48.000 L 220.000 224.000 C 220.000 226.209 218.209 228.000 216.000 228.000 C 213.791 228.000 212.000 226.209 212.000 224.000 L 212.000 204.000 L 132.000 204.000 L 132.000 224.000 C 132.000 226.209 130.209 228.000 128.000 228.000 C 125.791 228.000 124.000 226.209 124.000 224.000 L 124.000 204.000 L 44.000 204.000 L 44.000 224.000 C 44.000 226.209 42.209 228.000 40.000 228.000 C 37.791 228.000 36.000 226.209 36.000 224.000 L 36.000 48.000 C 36.000 41.373 41.373 36.000 48.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 124.000 196.000 L 124.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 196.000 ZM 132.000 196.000 L 212.000 196.000 L 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 132.000 44.000 Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
