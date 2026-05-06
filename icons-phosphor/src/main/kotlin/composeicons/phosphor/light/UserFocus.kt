package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorLightIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 40v36c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-30h-30c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h36c3.314 0 6 2.686 6 6ZM216 174c-3.314 0-6 2.686-6 6v30h-30c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h36c3.314 0 6-2.686 6-6v-36c0-3.314-2.686-6-6-6ZM76 210h-30v-30c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v36c0 3.314 2.686 6 6 6h36c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM40 82c3.314 0 6-2.686 6-6v-30h30c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-36c-3.314 0-6 2.686-6 6v36c0 3.314 2.686 6 6 6ZM176 174c-1.889 0-3.667-.889-4.8-2.4C161.002 158.002 144.997 150 128 150c-16.997 0-33.002 8.002-43.2 21.6-1.988 2.651-5.749 3.188-8.4 1.2-2.651-1.988-3.188-5.749-1.2-8.4 7.55-10.121 17.859-17.85 29.69-22.26C91.963 132.236 86.783 115.197 92.012 99.774 97.241 84.351 111.715 73.975 128 73.975c16.285 0 30.759 10.376 35.988 25.799 5.229 15.423 .049 32.462-12.878 42.366 11.831 4.41 22.14 12.139 29.69 22.26 1.364 1.818 1.583 4.251 .567 6.283C180.35 172.716 178.273 174 176 174ZM128 138c14.359 0 26-11.641 26-26C154 97.641 142.359 86 128 86c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26Z"),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
