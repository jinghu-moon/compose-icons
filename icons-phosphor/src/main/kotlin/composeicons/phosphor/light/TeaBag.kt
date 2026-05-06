package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorLightIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 162c-9.941 0-18-8.059-18-18v-80C206 34.177 181.823 10 152 10 122.177 10 98 34.177 98 64v10h-21.47c-4.913 .016-9.462 2.594-12 6.8L44 115c-1.308 2.177-2 4.67-2 7.21v93.79c0 7.732 6.268 14 14 14h96c7.732 0 14-6.268 14-14v-93.78c-0-2.54-.692-5.033-2-7.21L143.48 80.8c-2.538-4.206-7.087-6.784-12-6.8h-21.48v-10c0-23.196 18.804-42 42-42 23.196 0 42 18.804 42 42v80c0 16.569 13.431 30 30 30 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM131.47 86c.71 .004 1.365 .385 1.72 1l20.53 34.22c.18 .303 .276 .648 .28 1v93.78c0 1.105-.895 2-2 2h-96c-1.105 0-2-.895-2-2v-93.78c.007-.353 .107-.698 .29-1L74.81 87c.355-.615 1.01-.996 1.72-1h21.47v50c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
