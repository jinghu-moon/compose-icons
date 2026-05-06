package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorLightIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 182h208c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-10v-18C221.946 102.438 183.458 61.413 134 58.2v-20.2h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v20.2C72.542 61.413 34.054 102.438 34 152v18h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM46 152C46 106.713 82.713 70 128 70c45.287 0 82 36.713 82 82v18h-164ZM238 208c0 3.314-2.686 6-6 6h-208c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h208c3.314 0 6 2.686 6 6Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
