package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorLightIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 218h-56c45.453-24.242 65.697-78.569 47.19-126.644C204.684 43.282 153.237 16.552 103.261 29.045 53.286 41.539 20.47 89.335 26.764 140.463 33.058 191.59 76.487 230 128 230h104c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM128 38c17.086-.032 33.825 4.826 48.24 14-11.187 4.829-21.954 10.579-32.19 17.19C128.204 58.985 111.115 50.856 93.2 45 104.217 40.371 116.049 37.991 128 38ZM78.2 53.07c19.402 5.165 37.957 13.103 55.09 23.57-8.031 5.872-15.661 12.273-22.84 19.16C92.909 86.296 73.91 79.773 54.23 76.5 60.698 67.271 68.826 59.326 78.2 53.07ZM47.58 87.62c18.862 2.6 37.146 8.386 54.07 17.11C95.101 111.754 89.012 119.193 83.42 127 69.386 120.513 54.378 116.387 39 114.79c1.391-9.457 4.288-18.629 8.58-27.17ZM55.11 180.73C43.969 165.407 37.978 146.945 38 128c0-.42 0-.83 0-1.25 13.327 1.41 26.351 4.895 38.6 10.33-8.752 13.713-15.959 28.352-21.49 43.65ZM64.11 191.37C83.65 131.543 128.846 83.542 187.39 60.44c7.475 6.584 13.813 14.354 18.76 23C148.325 102.786 104.044 149.824 88.22 208.71 79.297 204.295 71.164 198.436 64.15 191.37ZM127.11 217.99c-9.437-.081-18.802-1.65-27.75-4.65 14.546-56.199 56.785-101.078 112-119 3.551 8.743 5.691 17.995 6.34 27.41C173.572 137.063 139.744 173.021 127.15 218ZM217.73 134.46c-3.119 42.532-35.615 77.06-77.88 82.75 11.982-38.031 40.678-68.505 77.92-82.75Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
