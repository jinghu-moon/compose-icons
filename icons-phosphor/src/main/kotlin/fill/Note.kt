package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorFillIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 156.690 224.000 C 160.934 224.007 165.006 222.319 168.000 219.310 L 219.310 168.000 C 222.319 165.006 224.007 160.934 224.000 156.690 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 96.000 88.000 L 160.000 88.000 C 164.418 88.000 168.000 91.582 168.000 96.000 C 168.000 100.418 164.418 104.000 160.000 104.000 L 96.000 104.000 C 91.582 104.000 88.000 100.418 88.000 96.000 C 88.000 91.582 91.582 88.000 96.000 88.000 ZM 128.000 168.000 L 96.000 168.000 C 91.582 168.000 88.000 164.418 88.000 160.000 C 88.000 155.582 91.582 152.000 96.000 152.000 L 128.000 152.000 C 132.418 152.000 136.000 155.582 136.000 160.000 C 136.000 164.418 132.418 168.000 128.000 168.000 ZM 96.000 136.000 C 91.582 136.000 88.000 132.418 88.000 128.000 C 88.000 123.582 91.582 120.000 96.000 120.000 L 160.000 120.000 C 164.418 120.000 168.000 123.582 168.000 128.000 C 168.000 132.418 164.418 136.000 160.000 136.000 ZM 160.000 204.690 L 160.000 160.000 L 204.700 160.000 Z"),
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
        return _note!!
    }

private var _note: ImageVector? = null
