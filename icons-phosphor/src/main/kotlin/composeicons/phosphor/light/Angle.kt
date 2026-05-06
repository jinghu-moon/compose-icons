package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorLightIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M98 72c0-3.314 2.686-6 6-6 56.306 .066 101.934 45.694 102 102 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C193.945 118.317 153.683 78.055 104 78c-3.314 0-6-2.686-6-6ZM240 194h-162v-162c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34v122c0 3.314 2.686 6 6 6h168c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
