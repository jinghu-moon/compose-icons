package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorLightIcon(
            name = "UserCircleGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.25 64.8l-5.92-3.41c.894-3.538 .894-7.242 0-10.78l5.92-3.41c2.872-1.657 3.857-5.328 2.2-8.2-1.657-2.872-5.328-3.857-8.2-2.2l-5.93 3.43C212.708 37.689 209.505 35.837 206 34.84v-6.84c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v6.84c-3.505 .997-6.708 2.849-9.32 5.39l-5.93-3.43c-2.872-1.657-6.543-.672-8.2 2.2-1.657 2.872-.672 6.543 2.2 8.2l5.92 3.41c-.894 3.538-.894 7.242 0 10.78l-5.92 3.41c-2.872 1.657-3.857 5.328-2.2 8.2 1.657 2.872 5.328 3.857 8.2 2.2l5.93-3.43c2.612 2.541 5.815 4.393 9.32 5.39v6.84c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-6.84c3.505-.997 6.708-2.849 9.32-5.39l5.93 3.43c2.872 1.657 6.543 .672 8.2-2.2 1.657-2.872 .672-6.543-2.2-8.2ZM200 66c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM221.68 106.08c-3.266 .55-5.468 3.643-4.92 6.91 .824 4.961 1.239 9.981 1.24 15.01 .017 22.922-8.747 44.98-24.49 61.64-9.427-14.659-23.519-25.713-40-31.38 16.874-11.239 24.4-32.2 18.529-51.606C166.168 87.249 148.284 73.975 128.01 73.975c-20.274 0-38.158 13.274-44.029 32.679-5.871 19.406 1.655 40.367 18.529 51.606-16.481 5.667-30.573 16.721-40 31.38C37.888 163.512 31.16 125.245 45.395 92.286 59.629 59.327 92.099 37.989 128 38c5.026 .001 10.042 .416 15 1.24 2.133 .402 4.317-.379 5.711-2.043 1.394-1.664 1.781-3.951 1.011-5.98-.77-2.03-2.575-3.485-4.722-3.807C98.238 19.486 52.184 44.84 33.87 88.59c-18.314 43.75-4.055 94.351 34.407 122.103 38.462 27.751 90.978 25.33 126.723-5.843 .65 1.36 1.68 0 2.34-2.11C222.547 179.378 234.294 144.892 228.59 111c-.55-3.266-3.643-5.468-6.91-4.92ZM94 120c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34C109.222 154 94 138.778 94 120ZM71.44 198C83.376 178.153 104.841 166.014 128 166.014c23.159 0 44.624 12.139 56.56 31.986-32.968 26.734-80.152 26.734-113.12 0Z"),
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
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
