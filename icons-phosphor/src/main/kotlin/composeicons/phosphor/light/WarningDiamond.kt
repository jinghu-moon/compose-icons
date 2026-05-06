package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorLightIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 136v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM128 162c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM238 128c.012 3.702-1.461 7.254-4.09 9.86l-96 96.06c-5.458 5.415-14.262 5.415-19.72 0h0L22.19 137.86C19.571 135.247 18.1 131.699 18.1 128c0-3.699 1.472-7.247 4.09-9.86L118.24 22.08c5.458-5.415 14.262-5.415 19.72 0l96 96.06c2.611 2.615 4.065 6.165 4.04 9.86ZM226 128c.002-.518-.204-1.014-.57-1.38L129.38 30.56c-.773-.737-1.987-.737-2.76 0L30.57 126.62c-.737 .773-.737 1.987 0 2.76l96.05 96.06h0c.773 .737 1.987 .737 2.76 0l96.05-96.06c.367-.366 .572-.862 .57-1.38Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
