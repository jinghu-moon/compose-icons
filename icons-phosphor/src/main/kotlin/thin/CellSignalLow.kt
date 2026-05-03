package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalLow: ImageVector
    get() {
        if (_cellSignalLow != null) return _cellSignalLow!!
        _cellSignalLow = phosphorThinIcon(
            name = "CellSignalLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.000 152.000 L 84.000 200.000 C 84.000 202.209 82.209 204.000 80.000 204.000 C 77.791 204.000 76.000 202.209 76.000 200.000 L 76.000 152.000 C 76.000 149.791 77.791 148.000 80.000 148.000 C 82.209 148.000 84.000 149.791 84.000 152.000 ZM 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 C 42.209 204.000 44.000 202.209 44.000 200.000 L 44.000 192.000 C 44.000 189.791 42.209 188.000 40.000 188.000 Z"),
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
        return _cellSignalLow!!
    }

private var _cellSignalLow: ImageVector? = null
