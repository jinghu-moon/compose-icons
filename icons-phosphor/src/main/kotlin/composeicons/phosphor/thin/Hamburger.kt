package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorThinIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48.07 100h159.86c3.643 .022 7.099-1.611 9.394-4.441 2.295-2.83 3.18-6.549 2.406-10.109-3.39-16-14.56-30.68-31.46-41.23C171.37 33.67 150.11 28 128 28 105.89 28 84.49 33.76 67.73 44.22 50.97 54.68 39.66 69.41 36.27 85.45c-.774 3.56 .111 7.279 2.406 10.109 2.295 2.83 5.751 4.464 9.394 4.441ZM44.07 87.11C50.26 58 86.33 36 128 36c41.67 0 77.74 22 83.91 51.11 .26 1.196-.042 2.445-.82 3.39-.767 .958-1.932 1.511-3.16 1.5h-159.86c-1.228 .011-2.393-.542-3.16-1.5-.778-.945-1.08-2.194-.82-3.39ZM230.61 156.24l-42.56 15.48L149.47 156.29c-.962-.389-2.038-.389-3 0L108 171.69 69.49 156.29c-.921-.352-1.939-.352-2.86 0l-44 16c-1.757 .706-2.779 2.547-2.448 4.412 .331 1.865 1.925 3.241 3.818 3.298 .467-.001 .93-.082 1.37-.24L44 173v11c0 19.882 16.118 36 36 36h96c19.882 0 36-16.118 36-36v-12.47l21.37-7.77c2.077-.757 3.147-3.053 2.39-5.13-.757-2.077-3.053-3.147-5.13-2.39ZM204 184c0 15.464-12.536 28-28 28h-96C64.536 212 52 199.464 52 184v-13.93l15.93-5.79 38.58 15.43c.962 .389 2.038 .389 3 0L148 164.31l38.51 15.4c.921 .352 1.939 .352 2.86 0L204 174.44ZM20 128c0-2.209 1.791-4 4-4h208c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-208c-2.209 0-4-1.791-4-4Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
