package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorLightIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 128v80c0 7.732-6.268 14-14 14h-152c-7.732 0-14-6.268-14-14v-152C34 48.268 40.268 42 48 42h80c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-80c-1.105 0-2 .895-2 2v152c0 1.105 .895 2 2 2h152c1.105 0 2-.895 2-2v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM230 60c0 18.778-15.222 34-34 34C177.222 94 162 78.778 162 60c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34ZM218 60C218 47.85 208.15 38 196 38c-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
