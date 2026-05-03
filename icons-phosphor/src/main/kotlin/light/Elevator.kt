package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorLightIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 178.000 110.000 L 178.000 210.000 L 134.000 210.000 L 134.000 110.000 ZM 122.000 210.000 L 78.000 210.000 L 78.000 110.000 L 122.000 110.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 190.000 210.000 L 190.000 104.000 C 190.000 100.686 187.314 98.000 184.000 98.000 L 72.000 98.000 C 68.686 98.000 66.000 100.686 66.000 104.000 L 66.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 150.000 72.000 C 150.000 75.314 147.314 78.000 144.000 78.000 L 112.000 78.000 C 108.686 78.000 106.000 75.314 106.000 72.000 C 106.000 68.686 108.686 66.000 112.000 66.000 L 144.000 66.000 C 147.314 66.000 150.000 68.686 150.000 72.000 Z"),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
