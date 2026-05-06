package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sliders: ImageVector
    get() {
        if (_sliders != null) return _sliders!!
        _sliders = phosphorLightIcon(
            name = "Sliders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M62 106.6v-66.6c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v66.6C36.018 109.439 25.97 121.733 25.97 136c0 14.267 10.048 26.561 24.03 29.4v50.6c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50.6C75.982 162.561 86.03 150.267 86.03 136 86.03 121.733 75.982 109.439 62 106.6ZM56 154c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM134 58.6v-18.6c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18.6C108.018 61.439 97.97 73.733 97.97 88c0 14.267 10.048 26.561 24.03 29.4v98.6c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-98.6C147.982 114.561 158.03 102.267 158.03 88 158.03 73.733 147.982 61.439 134 58.6ZM128 106c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM230 168c-.016-14.251-10.041-26.531-24-29.4v-98.6c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v98.6c-13.982 2.839-24.03 15.133-24.03 29.4 0 14.267 10.048 26.561 24.03 29.4v18.6c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18.6c13.959-2.869 23.984-15.149 24-29.4ZM200 186c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
