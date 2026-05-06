package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorLightIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.68 106.08c-3.266 .55-5.468 3.643-4.92 6.91 .824 4.961 1.239 9.981 1.24 15.01 .017 22.922-8.747 44.98-24.49 61.64-9.427-14.659-23.519-25.713-40-31.38 16.874-11.239 24.4-32.2 18.529-51.606C166.168 87.249 148.284 73.975 128.01 73.975c-20.274 0-38.158 13.274-44.029 32.679-5.871 19.406 1.655 40.367 18.529 51.606-16.481 5.667-30.573 16.721-40 31.38C37.888 163.512 31.16 125.245 45.395 92.286 59.629 59.327 92.099 37.989 128 38c5.026 .001 10.042 .416 15 1.24 2.133 .402 4.317-.379 5.711-2.043 1.394-1.664 1.781-3.951 1.011-5.98-.77-2.03-2.575-3.485-4.722-3.807C101.29 20.063 57.844 41.814 37.535 81.211 17.227 120.607 24.714 168.613 56.055 199.955c31.341 31.341 79.347 38.828 118.744 18.52 39.397-20.309 61.147-63.755 53.801-107.465-.262-1.572-1.139-2.976-2.437-3.901-1.298-.925-2.911-1.295-4.483-1.029ZM94 120c0-18.778 15.222-34 34-34 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34C109.222 154 94 138.778 94 120ZM71.44 198C83.376 178.153 104.841 166.014 128 166.014c23.159 0 44.624 12.139 56.56 31.986-32.968 26.734-80.152 26.734-113.12 0ZM236.24 44.24l-32 32c-2.343 2.34-6.137 2.34-8.48 0l-16-16c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L200 63.51 227.76 35.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
