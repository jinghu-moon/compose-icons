package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorLightIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.24 132.24l-24 24c-2.343 2.34-6.137 2.34-8.48 0l-24-24c-1.605-1.496-2.266-3.748-1.723-5.874 .543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723L218 137.51v-9.51C218.018 88.902 192.79 54.265 155.572 42.287 118.354 30.309 77.66 43.731 54.87 75.5c-1.222 1.814-3.334 2.819-5.512 2.624-2.178-.195-4.078-1.56-4.957-3.563-.88-2.002-.6-4.325 .729-6.061C70.961 32.504 117.075 17.3 159.25 30.874 201.424 44.448 230.013 83.695 230 128v9.51l13.76-13.75c1.496-1.605 3.748-2.266 5.874-1.723 2.126 .543 3.786 2.203 4.329 4.329 .543 2.126-.118 4.379-1.723 5.874ZM210.85 187.5c-25.837 35.978-71.94 51.169-114.103 37.597C54.584 211.526 25.999 172.294 26 128v-9.51L12.24 132.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l24-24c2.343-2.34 6.137-2.34 8.48 0l24 24c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L38 118.49v9.51c-.017 22.922 8.747 44.98 24.49 61.64 9.427-14.659 23.519-25.713 40-31.38C85.616 147.021 78.09 126.06 83.961 106.654 89.832 87.249 107.716 73.975 127.99 73.975c20.274 0 38.158 13.274 44.029 32.679 5.871 19.406-1.655 40.367-18.529 51.606 16.487 5.672 30.58 16.738 40 31.41 2.728-2.885 5.26-5.948 7.58-9.17 1.222-1.814 3.334-2.819 5.512-2.624 2.178 .195 4.078 1.56 4.957 3.563 .88 2.002 .6 4.325-.729 6.061ZM128 154c18.778 0 34-15.222 34-34C162 101.222 146.778 86 128 86c-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34ZM128 218c20.586-.019 40.547-7.076 56.57-20C172.636 178.148 151.168 166.006 128.005 166.006c-23.163 0-44.631 12.142-56.565 31.994 15.994 12.969 35.968 20.032 56.56 20Z"),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
