package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorLightIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 34.000 L 88.000 34.000 C 84.686 34.000 82.000 36.686 82.000 40.000 L 82.000 82.000 L 40.000 82.000 C 36.686 82.000 34.000 84.686 34.000 88.000 L 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 168.000 222.000 C 171.314 222.000 174.000 219.314 174.000 216.000 L 174.000 174.000 L 216.000 174.000 C 219.314 174.000 222.000 171.314 222.000 168.000 L 222.000 40.000 C 222.000 36.686 219.314 34.000 216.000 34.000 ZM 162.000 210.000 L 46.000 210.000 L 46.000 94.000 L 162.000 94.000 ZM 210.000 162.000 L 174.000 162.000 L 174.000 88.000 C 174.000 84.686 171.314 82.000 168.000 82.000 L 94.000 82.000 L 94.000 46.000 L 210.000 46.000 Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
