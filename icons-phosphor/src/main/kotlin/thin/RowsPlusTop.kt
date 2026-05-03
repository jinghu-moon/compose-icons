package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorThinIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 164.000 L 48.000 164.000 C 41.373 164.000 36.000 169.373 36.000 176.000 L 36.000 200.000 C 36.000 206.627 41.373 212.000 48.000 212.000 L 208.000 212.000 C 214.627 212.000 220.000 206.627 220.000 200.000 L 220.000 176.000 C 220.000 169.373 214.627 164.000 208.000 164.000 ZM 212.000 200.000 C 212.000 202.209 210.209 204.000 208.000 204.000 L 48.000 204.000 C 45.791 204.000 44.000 202.209 44.000 200.000 L 44.000 176.000 C 44.000 173.791 45.791 172.000 48.000 172.000 L 208.000 172.000 C 210.209 172.000 212.000 173.791 212.000 176.000 ZM 208.000 92.000 L 48.000 92.000 C 41.373 92.000 36.000 97.373 36.000 104.000 L 36.000 128.000 C 36.000 134.627 41.373 140.000 48.000 140.000 L 208.000 140.000 C 214.627 140.000 220.000 134.627 220.000 128.000 L 220.000 104.000 C 220.000 97.373 214.627 92.000 208.000 92.000 ZM 212.000 128.000 C 212.000 130.209 210.209 132.000 208.000 132.000 L 48.000 132.000 C 45.791 132.000 44.000 130.209 44.000 128.000 L 44.000 104.000 C 44.000 101.791 45.791 100.000 48.000 100.000 L 208.000 100.000 C 210.209 100.000 212.000 101.791 212.000 104.000 ZM 100.000 40.000 C 100.000 37.791 101.791 36.000 104.000 36.000 L 124.000 36.000 L 124.000 16.000 C 124.000 13.791 125.791 12.000 128.000 12.000 C 130.209 12.000 132.000 13.791 132.000 16.000 L 132.000 36.000 L 152.000 36.000 C 154.209 36.000 156.000 37.791 156.000 40.000 C 156.000 42.209 154.209 44.000 152.000 44.000 L 132.000 44.000 L 132.000 64.000 C 132.000 66.209 130.209 68.000 128.000 68.000 C 125.791 68.000 124.000 66.209 124.000 64.000 L 124.000 44.000 L 104.000 44.000 C 101.791 44.000 100.000 42.209 100.000 40.000 Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
