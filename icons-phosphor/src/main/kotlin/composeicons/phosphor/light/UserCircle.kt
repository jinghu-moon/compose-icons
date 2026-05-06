package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorLightIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM71.44 198C83.376 178.153 104.841 166.014 128 166.014c23.159 0 44.624 12.139 56.56 31.986-32.968 26.734-80.152 26.734-113.12 0ZM94 120c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34C109.222 154 94 138.778 94 120ZM193.51 189.64c-9.427-14.659-23.519-25.713-40-31.38 16.874-11.239 24.4-32.2 18.529-51.606C166.168 87.249 148.284 73.975 128.01 73.975c-20.274 0-38.158 13.274-44.029 32.679-5.871 19.406 1.655 40.367 18.529 51.606-16.481 5.667-30.573 16.721-40 31.38C28.897 153.97 30.005 97.963 65.003 63.651c34.998-34.312 91.016-34.312 126.014 0 34.998 34.312 36.106 90.32 2.493 125.989Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
