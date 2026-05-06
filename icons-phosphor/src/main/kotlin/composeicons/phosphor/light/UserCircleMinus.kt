package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorLightIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170 56c0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-48c-3.314 0-6-2.686-6-6ZM224.19 94c15.286 43.335-.323 91.54-38.109 117.689C148.295 237.839 97.682 235.463 62.511 205.889 27.341 176.315 16.316 126.86 35.595 85.147 54.873 43.435 99.685 19.786 145 27.41c2.147 .321 3.952 1.777 4.722 3.807 .77 2.03 .383 4.316-1.011 5.98-1.394 1.664-3.578 2.445-5.711 2.043C138.042 38.416 133.026 38.001 128 38 92.095 37.981 59.618 59.317 45.379 92.277c-14.239 32.961-7.513 71.232 17.111 97.363 9.427-14.659 23.519-25.713 40-31.38C85.616 147.021 78.09 126.06 83.961 106.654 89.832 87.249 107.716 73.975 127.99 73.975c20.274 0 38.158 13.274 44.029 32.679 5.871 19.406-1.655 40.367-18.529 51.606 16.481 5.667 30.573 16.721 40 31.38C216.592 165.128 224.074 129.768 212.88 98c-.776-2.035-.387-4.331 1.015-5.998 1.402-1.667 3.597-2.443 5.735-2.028 2.138 .415 3.884 1.956 4.56 4.027ZM128 154c18.778 0 34-15.222 34-34C162 101.222 146.778 86 128 86c-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34ZM128 218c20.592 .032 40.566-7.031 56.56-20C172.624 178.153 151.159 166.014 128 166.014c-23.159 0-44.624 12.139-56.56 31.986 15.994 12.969 35.968 20.032 56.56 20Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
