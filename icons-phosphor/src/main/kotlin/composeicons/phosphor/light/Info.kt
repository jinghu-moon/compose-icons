package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorLightIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142 176c0 3.314-2.686 6-6 6-7.732 0-14-6.268-14-14v-40c0-1.105-.895-2-2-2-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 7.732 0 14 6.268 14 14v40c0 1.105 .895 2 2 2 3.314 0 6 2.686 6 6ZM124 94c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10ZM230 128c0 56.333-45.667 102-102 102C71.667 230 26 184.333 26 128 26 71.667 71.667 26 128 26c56.306 .066 101.934 45.694 102 102ZM218 128C218 78.294 177.706 38 128 38 78.294 38 38 78.294 38 128c0 49.706 40.294 90 90 90 49.683-.055 89.945-40.317 90-90Z"),
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
        return _info!!
    }

private var _info: ImageVector? = null
