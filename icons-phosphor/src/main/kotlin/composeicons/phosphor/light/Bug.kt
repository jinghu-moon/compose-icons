package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = phosphorLightIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146 92c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM100 82C94.477 82 90 86.477 90 92c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM246 128c0 3.314-2.686 6-6 6h-26v10c-.002 8.15-1.163 16.258-3.45 24.08l23.85 10.42c3.038 1.325 4.425 4.862 3.1 7.9-1.325 3.038-4.862 4.425-7.9 3.1L206.37 179.35C192.454 210.145 161.793 229.936 128 229.936c-33.793 0-64.454-19.791-78.37-50.586L26.4 189.5c-3.038 1.325-6.575-.062-7.9-3.1-1.325-3.038 .062-6.575 3.1-7.9L45.45 168.08C43.163 160.258 42.002 152.15 42 144v-10h-26c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-10c.002-8.15 1.163-16.258 3.45-24.08L21.6 77.5C18.562 76.175 17.175 72.638 18.5 69.6c1.325-3.038 4.862-4.425 7.9-3.1L49.63 76.65C63.546 45.855 94.207 26.064 128 26.064c33.793 0 64.454 19.791 78.37 50.586L229.6 66.5c3.038-1.325 6.575 .062 7.9 3.1 1.325 3.038-.062 6.575-3.1 7.9L210.55 87.92c2.287 7.822 3.448 15.93 3.45 24.08v10h26c3.314 0 6 2.686 6 6ZM54 122h148v-10C202 71.131 168.869 38 128 38 87.131 38 54 71.131 54 112ZM122 217.74v-83.74h-68v10c.052 38.519 29.611 70.574 68 73.74ZM202 134h-68v83.74c38.389-3.166 67.948-35.221 68-73.74Z"),
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
        return _bug!!
    }

private var _bug: ImageVector? = null
