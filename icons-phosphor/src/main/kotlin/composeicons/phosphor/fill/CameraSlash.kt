package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorFillIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 80v112c-.002 1.561-.152 3.118-.45 4.65-.264 1.504-1.36 2.726-2.826 3.151-1.466 .425-3.047-.022-4.074-1.151L86 46.08c-1.235-1.358-1.388-3.382-.37-4.91l3.74-5.61C90.849 33.343 93.335 32.008 96 32h64c2.676-.002 5.175 1.334 6.66 3.56L180.28 56h27.72c13.255 0 24 10.745 24 24ZM213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L197.19 216h-149.19C34.745 216 24 205.255 24 192v-112C24 66.745 34.745 56 48 56h3.73L42.08 45.38C40.117 43.271 39.439 40.27 40.306 37.522c.867-2.748 3.144-4.817 5.961-5.418 2.818-.601 5.741 .36 7.653 2.515ZM148 161.92 100.12 109.24c-11.23 13.81-10.682 33.754 1.29 46.926 11.972 13.172 31.773 15.618 46.59 5.754Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
