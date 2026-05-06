package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorLightIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 208c0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6v-160c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v13.52l58 58L123.76 91.77c2.343-2.34 6.137-2.34 8.48 0L194 153.52v-25.52c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v40c-0 .369-.037 .738-.11 1.1v.06c-.077 .357-.181 .708-.31 1.05v.07c-.142 .349-.316 .683-.52 1v.06c-.447 .662-1.018 1.233-1.68 1.68h-.06c-.317 .204-.651 .378-1 .52h-.07c-.342 .129-.693 .233-1.05 .31h-.06c-.362 .073-.731 .11-1.1 .11h-40.04c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h25.52L128 104.49l-27.76 27.75c-2.343 2.34-6.137 2.34-8.48 0L38 78.48v123.52h186c3.314 0 6 2.686 6 6Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
