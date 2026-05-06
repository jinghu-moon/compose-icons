package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorLightIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170 56c0-3.314 2.686-6 6-6h18v-18c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v18h18c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-3.314 0-6-2.686-6-6ZM228.59 111c7.351 43.711-14.398 87.16-53.795 107.471C135.397 238.782 87.389 231.295 56.047 199.953 24.705 168.611 17.218 120.603 37.529 81.205 57.84 41.808 101.289 20.059 145 27.41c2.147 .321 3.952 1.777 4.722 3.807 .77 2.03 .383 4.316-1.011 5.98-1.394 1.664-3.578 2.445-5.711 2.043C138.042 38.416 133.026 38.001 128 38 92.095 37.981 59.618 59.317 45.379 92.277c-14.239 32.961-7.513 71.232 17.111 97.363 9.427-14.659 23.519-25.713 40-31.38C85.616 147.021 78.09 126.06 83.961 106.654 89.832 87.249 107.716 73.975 127.99 73.975c20.274 0 38.158 13.274 44.029 32.679 5.871 19.406-1.655 40.367-18.529 51.606 16.481 5.667 30.573 16.721 40 31.38C209.241 172.983 218.012 150.925 218 128c-.002-5.026-.417-10.042-1.24-15-.402-2.133 .379-4.317 2.043-5.711 1.664-1.394 3.951-1.781 5.98-1.011 2.03 .769 3.485 2.575 3.807 4.722ZM128 154c18.778 0 34-15.222 34-34C162 101.222 146.778 86 128 86c-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34ZM128 218c20.592 .032 40.566-7.031 56.56-20C172.624 178.153 151.159 166.014 128 166.014c-23.159 0-44.624 12.139-56.56 31.986 15.994 12.969 35.968 20.032 56.56 20Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
