package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorLightIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c.005 51.427-41.318 93.311-92.74 94h-1.26c-23.996 .05-47.092-9.134-64.5-25.65-1.611-1.459-2.307-3.676-1.819-5.794 .488-2.118 2.084-3.807 4.171-4.414 2.087-.607 4.34-.038 5.888 1.488 32.723 30.856 84.194 29.594 115.366-2.828 31.172-32.422 30.411-83.903-1.707-115.388C153.282 37.928 101.796 38.19 70 70l-.19 .19L39.44 98h32.56c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v34.34L61.63 61.4C88.54 34.569 128.958 26.58 164.052 41.154 199.146 55.729 222.014 90 222 128Z"),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
