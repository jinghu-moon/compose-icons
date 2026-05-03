package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorLightIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 59.760 L 196.240 27.760 C 193.897 25.420 190.103 25.420 187.760 27.760 L 91.760 123.760 C 90.634 124.884 90.001 126.409 90.000 128.000 L 90.000 160.000 C 90.000 163.314 92.686 166.000 96.000 166.000 L 128.000 166.000 C 129.591 165.999 131.116 165.366 132.240 164.240 L 228.240 68.240 C 230.580 65.897 230.580 62.103 228.240 59.760 ZM 125.510 154.000 L 102.000 154.000 L 102.000 130.490 L 168.000 64.490 L 191.510 88.000 ZM 200.000 79.510 L 176.490 56.000 L 192.000 40.490 L 215.510 64.000 ZM 222.000 128.000 L 222.000 208.000 C 222.000 215.732 215.732 222.000 208.000 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 48.000 C 34.000 40.268 40.268 34.000 48.000 34.000 L 128.000 34.000 C 131.314 34.000 134.000 36.686 134.000 40.000 C 134.000 43.314 131.314 46.000 128.000 46.000 L 48.000 46.000 C 46.895 46.000 46.000 46.895 46.000 48.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 L 208.000 210.000 C 209.105 210.000 210.000 209.105 210.000 208.000 L 210.000 128.000 C 210.000 124.686 212.686 122.000 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
