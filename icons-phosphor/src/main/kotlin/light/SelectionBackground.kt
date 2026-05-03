package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorLightIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 82.000 L 48.000 82.000 C 40.268 82.000 34.000 88.268 34.000 96.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 160.000 222.000 C 167.732 222.000 174.000 215.732 174.000 208.000 L 174.000 96.000 C 174.000 88.268 167.732 82.000 160.000 82.000 ZM 162.000 208.000 C 162.000 209.105 161.105 210.000 160.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 96.000 C 46.000 94.895 46.895 94.000 48.000 94.000 L 160.000 94.000 C 161.105 94.000 162.000 94.895 162.000 96.000 ZM 138.000 40.000 C 138.000 36.686 140.686 34.000 144.000 34.000 L 160.000 34.000 C 163.314 34.000 166.000 36.686 166.000 40.000 C 166.000 43.314 163.314 46.000 160.000 46.000 L 144.000 46.000 C 140.686 46.000 138.000 43.314 138.000 40.000 ZM 222.000 48.000 L 222.000 56.000 C 222.000 59.314 219.314 62.000 216.000 62.000 C 212.686 62.000 210.000 59.314 210.000 56.000 L 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 200.000 46.000 C 196.686 46.000 194.000 43.314 194.000 40.000 C 194.000 36.686 196.686 34.000 200.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 222.000 96.000 L 222.000 112.000 C 222.000 115.314 219.314 118.000 216.000 118.000 C 212.686 118.000 210.000 115.314 210.000 112.000 L 210.000 96.000 C 210.000 92.686 212.686 90.000 216.000 90.000 C 219.314 90.000 222.000 92.686 222.000 96.000 ZM 222.000 152.000 L 222.000 160.000 C 222.000 167.732 215.732 174.000 208.000 174.000 L 200.000 174.000 C 196.686 174.000 194.000 171.314 194.000 168.000 C 194.000 164.686 196.686 162.000 200.000 162.000 L 208.000 162.000 C 209.105 162.000 210.000 161.105 210.000 160.000 L 210.000 152.000 C 210.000 148.686 212.686 146.000 216.000 146.000 C 219.314 146.000 222.000 148.686 222.000 152.000 ZM 82.000 56.000 L 82.000 48.000 C 82.000 40.268 88.268 34.000 96.000 34.000 L 104.000 34.000 C 107.314 34.000 110.000 36.686 110.000 40.000 C 110.000 43.314 107.314 46.000 104.000 46.000 L 96.000 46.000 C 94.895 46.000 94.000 46.895 94.000 48.000 L 94.000 56.000 C 94.000 59.314 91.314 62.000 88.000 62.000 C 84.686 62.000 82.000 59.314 82.000 56.000 Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
