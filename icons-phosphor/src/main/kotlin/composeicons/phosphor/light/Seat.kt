package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorLightIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 232c0 3.314-2.686 6-6 6h-104c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h104c3.314 0 6 2.686 6 6ZM222 160v32c0 7.732-6.268 14-14 14h-93.89c-5.31 .017-10.168-2.984-12.53-7.74L43.47 82.26c-1.961-3.943-1.961-8.577 0-12.52L65.59 25.74c3.422-6.833 11.692-9.659 18.58-6.35l33.74 14.24 .34 .17c3.322 1.659 5.849 4.57 7.024 8.091 1.176 3.522 .904 7.367-.754 10.689l-.09 .16L110.18 79.16c-.262 .547-.262 1.183 0 1.73l31.78 64c.342 .669 1.029 1.09 1.78 1.09h64.26c3.716 0 7.28 1.478 9.907 4.108 2.626 2.63 4.099 6.196 4.093 9.912ZM210 160c0-1.105-.895-2-2-2h-64.23c-5.306 .013-10.16-2.987-12.52-7.74L99.47 86.26c-1.963-3.935-1.963-8.565 0-12.5l.09-.17L113.81 47.17c.213-.462 .241-.988 .08-1.47-.153-.463-.469-.854-.89-1.1L79.35 30.37 79 30.21c-.276-.138-.581-.21-.89-.21-.757-.001-1.449 .424-1.79 1.1L54.2 75.1c-.279 .561-.279 1.219 0 1.78l58.12 116c.338 .68 1.031 1.11 1.79 1.11h93.89c1.105 0 2-.895 2-2Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
