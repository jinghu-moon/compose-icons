package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorBoldIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M68 102.06v-62.06C68 33.373 62.627 28 56 28 49.373 28 44 33.373 44 40v62.06C29.618 107.146 20.003 120.745 20.003 136c0 15.255 9.615 28.854 23.997 33.94v46.06c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-46.06C82.382 164.854 91.997 151.255 91.997 136 91.997 120.745 82.382 107.146 68 102.06ZM56 148c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM164 88C163.979 72.751 154.37 59.163 140 54.06v-14.06c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v14.06C101.618 59.146 92.003 72.745 92.003 88c0 15.255 9.615 28.854 23.997 33.94v94.06c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-94.06C154.37 116.837 163.979 103.249 164 88ZM128 100c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM236 168c-.021-15.249-9.63-28.837-24-33.94v-94.06c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v94.06c-14.382 5.086-23.997 18.685-23.997 33.94 0 15.255 9.615 28.854 23.997 33.94v14.06c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-14.06c14.37-5.103 23.979-18.691 24-33.94ZM200 180c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _sliders!!
    }

private var _sliders: ImageVector? = null
