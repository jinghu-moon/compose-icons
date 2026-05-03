package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorLightIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 190.000 72.000 C 190.000 75.314 187.314 78.000 184.000 78.000 L 160.000 78.000 C 156.686 78.000 154.000 75.314 154.000 72.000 C 154.000 68.686 156.686 66.000 160.000 66.000 L 184.000 66.000 C 187.314 66.000 190.000 68.686 190.000 72.000 ZM 184.000 98.000 L 160.000 98.000 C 156.686 98.000 154.000 100.686 154.000 104.000 C 154.000 107.314 156.686 110.000 160.000 110.000 L 184.000 110.000 C 187.314 110.000 190.000 107.314 190.000 104.000 C 190.000 100.686 187.314 98.000 184.000 98.000 ZM 72.000 78.000 L 96.000 78.000 C 99.314 78.000 102.000 75.314 102.000 72.000 C 102.000 68.686 99.314 66.000 96.000 66.000 L 72.000 66.000 C 68.686 66.000 66.000 68.686 66.000 72.000 C 66.000 75.314 68.686 78.000 72.000 78.000 ZM 96.000 98.000 L 72.000 98.000 C 68.686 98.000 66.000 100.686 66.000 104.000 C 66.000 107.314 68.686 110.000 72.000 110.000 L 96.000 110.000 C 99.314 110.000 102.000 107.314 102.000 104.000 C 102.000 100.686 99.314 98.000 96.000 98.000 ZM 222.000 48.000 L 222.000 224.000 C 222.000 227.314 219.314 230.000 216.000 230.000 C 212.686 230.000 210.000 227.314 210.000 224.000 L 210.000 206.000 L 134.000 206.000 L 134.000 224.000 C 134.000 227.314 131.314 230.000 128.000 230.000 C 124.686 230.000 122.000 227.314 122.000 224.000 L 122.000 206.000 L 46.000 206.000 L 46.000 224.000 C 46.000 227.314 43.314 230.000 40.000 230.000 C 36.686 230.000 34.000 227.314 34.000 224.000 L 34.000 48.000 C 34.000 40.268 40.268 34.000 48.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 122.000 194.000 L 122.000 46.000 L 48.000 46.000 C 46.895 46.000 46.000 46.895 46.000 48.000 L 46.000 194.000 ZM 134.000 194.000 L 210.000 194.000 L 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 134.000 46.000 Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
