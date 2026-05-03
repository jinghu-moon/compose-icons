package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalFull: ImageVector
    get() {
        if (_cellSignalFull != null) return _cellSignalFull!!
        _cellSignalFull = phosphorThinIcon(
            name = "CellSignalFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 72.000 L 164.000 200.000 C 164.000 202.209 162.209 204.000 160.000 204.000 C 157.791 204.000 156.000 202.209 156.000 200.000 L 156.000 72.000 C 156.000 69.791 157.791 68.000 160.000 68.000 C 162.209 68.000 164.000 69.791 164.000 72.000 ZM 200.000 28.000 C 197.791 28.000 196.000 29.791 196.000 32.000 L 196.000 200.000 C 196.000 202.209 197.791 204.000 200.000 204.000 C 202.209 204.000 204.000 202.209 204.000 200.000 L 204.000 32.000 C 204.000 29.791 202.209 28.000 200.000 28.000 ZM 120.000 108.000 C 117.791 108.000 116.000 109.791 116.000 112.000 L 116.000 200.000 C 116.000 202.209 117.791 204.000 120.000 204.000 C 122.209 204.000 124.000 202.209 124.000 200.000 L 124.000 112.000 C 124.000 109.791 122.209 108.000 120.000 108.000 ZM 80.000 148.000 C 77.791 148.000 76.000 149.791 76.000 152.000 L 76.000 200.000 C 76.000 202.209 77.791 204.000 80.000 204.000 C 82.209 204.000 84.000 202.209 84.000 200.000 L 84.000 152.000 C 84.000 149.791 82.209 148.000 80.000 148.000 ZM 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 C 42.209 204.000 44.000 202.209 44.000 200.000 L 44.000 192.000 C 44.000 189.791 42.209 188.000 40.000 188.000 Z"),
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
        return _cellSignalFull!!
    }

private var _cellSignalFull: ImageVector? = null
