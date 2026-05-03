package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorRegularIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 32.000 L 104.000 32.000 C 95.163 32.000 88.000 39.163 88.000 48.000 L 88.000 208.000 C 88.000 216.837 95.163 224.000 104.000 224.000 L 128.000 224.000 C 136.837 224.000 144.000 216.837 144.000 208.000 L 144.000 48.000 C 144.000 39.163 136.837 32.000 128.000 32.000 ZM 128.000 208.000 L 104.000 208.000 L 104.000 48.000 L 128.000 48.000 ZM 200.000 32.000 L 176.000 32.000 C 167.163 32.000 160.000 39.163 160.000 48.000 L 160.000 208.000 C 160.000 216.837 167.163 224.000 176.000 224.000 L 200.000 224.000 C 208.837 224.000 216.000 216.837 216.000 208.000 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 ZM 200.000 208.000 L 176.000 208.000 L 176.000 48.000 L 200.000 48.000 ZM 72.000 128.000 C 72.000 132.418 68.418 136.000 64.000 136.000 L 48.000 136.000 L 48.000 152.000 C 48.000 156.418 44.418 160.000 40.000 160.000 C 35.582 160.000 32.000 156.418 32.000 152.000 L 32.000 136.000 L 16.000 136.000 C 11.582 136.000 8.000 132.418 8.000 128.000 C 8.000 123.582 11.582 120.000 16.000 120.000 L 32.000 120.000 L 32.000 104.000 C 32.000 99.582 35.582 96.000 40.000 96.000 C 44.418 96.000 48.000 99.582 48.000 104.000 L 48.000 120.000 L 64.000 120.000 C 68.418 120.000 72.000 123.582 72.000 128.000 Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
