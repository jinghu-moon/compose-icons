package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorLightIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 72c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM208 98h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM246 48v160c0 7.732-6.268 14-14 14h-80c-7.732 0-14-6.268-14-14v-18h-44v20h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18v-20h-50C19.85 190 10 180.15 10 168v-72C10 83.85 19.85 74 32 74h106v-26c0-7.732 6.268-14 14-14h80c7.732 0 14 6.268 14 14ZM138 178v-92h-106C26.477 86 22 90.477 22 96v72c0 5.523 4.477 10 10 10ZM234 48c0-1.105-.895-2-2-2h-80c-1.105 0-2 .895-2 2v160c0 1.105 .895 2 2 2h80c1.105 0 2-.895 2-2ZM192 170c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10Z"),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
