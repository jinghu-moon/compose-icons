package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorLightIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 160.000 34.000 C 152.268 34.000 146.000 40.268 146.000 48.000 L 146.000 208.000 C 146.000 215.732 152.268 222.000 160.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 160.000 210.000 C 158.895 210.000 158.000 209.105 158.000 208.000 L 158.000 174.000 L 184.000 174.000 C 187.314 174.000 190.000 171.314 190.000 168.000 C 190.000 164.686 187.314 162.000 184.000 162.000 L 158.000 162.000 L 158.000 134.000 L 184.000 134.000 C 187.314 134.000 190.000 131.314 190.000 128.000 C 190.000 124.686 187.314 122.000 184.000 122.000 L 158.000 122.000 L 158.000 94.000 L 184.000 94.000 C 187.314 94.000 190.000 91.314 190.000 88.000 C 190.000 84.686 187.314 82.000 184.000 82.000 L 158.000 82.000 L 158.000 48.000 C 158.000 46.895 158.895 46.000 160.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 76.240 27.760 C 73.897 25.420 70.103 25.420 67.760 27.760 L 35.760 59.760 C 34.634 60.884 34.001 62.409 34.000 64.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 96.000 222.000 C 103.732 222.000 110.000 215.732 110.000 208.000 L 110.000 64.000 C 109.999 62.409 109.366 60.884 108.240 59.760 ZM 46.000 178.000 L 46.000 78.000 L 66.000 78.000 L 66.000 178.000 ZM 78.000 78.000 L 98.000 78.000 L 98.000 178.000 L 78.000 178.000 ZM 72.000 40.490 L 97.510 66.000 L 46.510 66.000 ZM 96.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 190.000 L 98.000 190.000 L 98.000 208.000 C 98.000 209.105 97.105 210.000 96.000 210.000 Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
