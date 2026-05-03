package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorLightIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 90.000 96.000 C 90.000 92.686 92.686 90.000 96.000 90.000 L 160.000 90.000 C 163.314 90.000 166.000 92.686 166.000 96.000 C 166.000 99.314 163.314 102.000 160.000 102.000 L 96.000 102.000 C 92.686 102.000 90.000 99.314 90.000 96.000 ZM 96.000 134.000 L 160.000 134.000 C 163.314 134.000 166.000 131.314 166.000 128.000 C 166.000 124.686 163.314 122.000 160.000 122.000 L 96.000 122.000 C 92.686 122.000 90.000 124.686 90.000 128.000 C 90.000 131.314 92.686 134.000 96.000 134.000 ZM 128.000 154.000 L 96.000 154.000 C 92.686 154.000 90.000 156.686 90.000 160.000 C 90.000 163.314 92.686 166.000 96.000 166.000 L 128.000 166.000 C 131.314 166.000 134.000 163.314 134.000 160.000 C 134.000 156.686 131.314 154.000 128.000 154.000 ZM 222.000 48.000 L 222.000 156.690 C 222.007 160.404 220.531 163.968 217.900 166.590 L 166.590 217.900 C 163.968 220.531 160.404 222.007 156.690 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 48.000 C 34.000 40.268 40.268 34.000 48.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 48.000 210.000 L 154.000 210.000 L 154.000 160.000 C 154.000 156.686 156.686 154.000 160.000 154.000 L 210.000 154.000 L 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 48.000 46.000 C 46.895 46.000 46.000 46.895 46.000 48.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 ZM 201.520 166.000 L 166.000 166.000 L 166.000 201.520 Z"),
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
        return _note!!
    }

private var _note: ImageVector? = null
