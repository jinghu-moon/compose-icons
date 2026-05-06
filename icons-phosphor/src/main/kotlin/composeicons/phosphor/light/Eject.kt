package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorLightIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 154h-160c-7.732 0-14 6.268-14 14v24c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-24c0-7.732-6.268-14-14-14ZM210 192c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-24c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM48.24 134h159.52c5.685 .032 10.84-3.333 13.1-8.55 2.241-5.086 1.165-11.025-2.72-15L144.41 33C140.119 28.535 134.193 26.011 128 26.011c-6.193 0-12.119 2.524-16.41 6.989L37.86 110.5c-3.885 3.975-4.961 9.914-2.72 15 2.275 5.197 7.427 8.54 13.1 8.5ZM46.55 118.77 120.28 41.26c2.028-2.084 4.812-3.26 7.72-3.26 2.908 0 5.692 1.176 7.72 3.26l73.73 77.51c.565 .503 .721 1.324 .38 2-.353 .818-1.181 1.326-2.07 1.27h-159.52c-.889 .056-1.717-.452-2.07-1.27-.341-.676-.185-1.497 .38-2Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
