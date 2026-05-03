package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CellSignalMedium: ImageVector
    get() {
        if (_cellSignalMedium != null) return _cellSignalMedium!!
        _cellSignalMedium = phosphorRegularIcon(
            name = "CellSignalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 112.000 L 128.000 200.000 C 128.000 204.418 124.418 208.000 120.000 208.000 C 115.582 208.000 112.000 204.418 112.000 200.000 L 112.000 112.000 C 112.000 107.582 115.582 104.000 120.000 104.000 C 124.418 104.000 128.000 107.582 128.000 112.000 ZM 80.000 144.000 C 75.582 144.000 72.000 147.582 72.000 152.000 L 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 C 84.418 208.000 88.000 204.418 88.000 200.000 L 88.000 152.000 C 88.000 147.582 84.418 144.000 80.000 144.000 ZM 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 L 32.000 200.000 C 32.000 204.418 35.582 208.000 40.000 208.000 C 44.418 208.000 48.000 204.418 48.000 200.000 L 48.000 192.000 C 48.000 187.582 44.418 184.000 40.000 184.000 Z"),
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
        return _cellSignalMedium!!
    }

private var _cellSignalMedium: ImageVector? = null
