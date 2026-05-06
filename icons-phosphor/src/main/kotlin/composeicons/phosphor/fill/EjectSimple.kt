package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorFillIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 200c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8ZM40.09 160h175.82c6.2-.013 11.841-3.585 14.505-9.183 2.664-5.598 1.876-12.229-2.025-17.047L146.74 32.94C142.162 27.285 135.276 23.999 128 23.999c-7.276 0-14.162 3.286-18.74 8.941L27.61 133.77c-3.901 4.819-4.688 11.449-2.025 17.047 2.664 5.598 8.305 9.17 14.505 9.183Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
