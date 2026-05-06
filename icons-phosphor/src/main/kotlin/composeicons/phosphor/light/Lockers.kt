package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorLightIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 72c0 3.314-2.686 6-6 6h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c3.314 0 6 2.686 6 6ZM184 98h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM72 78h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM96 98h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM222 48v176c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-76v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-76v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-176C34 40.268 40.268 34 48 34h160c7.732 0 14 6.268 14 14ZM122 194v-148h-74c-1.105 0-2 .895-2 2v146ZM134 194h76v-146c0-1.105-.895-2-2-2h-74Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
