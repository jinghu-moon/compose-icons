package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionPlus: ImageVector
    get() {
        if (_selectionPlus != null) return _selectionPlus!!
        _selectionPlus = phosphorFillIcon(
            name = "SelectionPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 56.000 72.000 C 56.000 63.163 63.163 56.000 72.000 56.000 L 96.000 56.000 C 100.418 56.000 104.000 59.582 104.000 64.000 C 104.000 68.418 100.418 72.000 96.000 72.000 L 72.000 72.000 L 72.000 96.000 C 72.000 100.418 68.418 104.000 64.000 104.000 C 59.582 104.000 56.000 100.418 56.000 96.000 ZM 112.000 184.000 L 72.000 184.000 C 63.163 184.000 56.000 176.837 56.000 168.000 L 56.000 136.000 C 56.000 131.582 59.582 128.000 64.000 128.000 C 68.418 128.000 72.000 131.582 72.000 136.000 L 72.000 168.000 L 112.000 168.000 C 116.418 168.000 120.000 171.582 120.000 176.000 C 120.000 180.418 116.418 184.000 112.000 184.000 ZM 128.000 64.000 C 128.000 59.582 131.582 56.000 136.000 56.000 L 168.000 56.000 C 176.837 56.000 184.000 63.163 184.000 72.000 L 184.000 112.000 C 184.000 116.418 180.418 120.000 176.000 120.000 C 171.582 120.000 168.000 116.418 168.000 112.000 L 168.000 72.000 L 136.000 72.000 C 131.582 72.000 128.000 68.418 128.000 64.000 ZM 200.000 184.000 L 184.000 184.000 L 184.000 200.000 C 184.000 204.418 180.418 208.000 176.000 208.000 C 171.582 208.000 168.000 204.418 168.000 200.000 L 168.000 184.000 L 152.000 184.000 C 147.582 184.000 144.000 180.418 144.000 176.000 C 144.000 171.582 147.582 168.000 152.000 168.000 L 168.000 168.000 L 168.000 152.000 C 168.000 147.582 171.582 144.000 176.000 144.000 C 180.418 144.000 184.000 147.582 184.000 152.000 L 184.000 168.000 L 200.000 168.000 C 204.418 168.000 208.000 171.582 208.000 176.000 C 208.000 180.418 204.418 184.000 200.000 184.000 Z"),
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
        return _selectionPlus!!
    }

private var _selectionPlus: ImageVector? = null
