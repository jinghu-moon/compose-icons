package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GearFine: ImageVector
    get() {
        if (_gearFine != null) return _gearFine!!
        _gearFine = phosphorBoldIcon(
            name = "GearFine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 116h-12.78C218.181 108.023 216.089 100.218 213 92.79l11.08-6.4c3.797-2.101 6.163-6.088 6.189-10.428 .026-4.339-2.293-8.355-6.064-10.501-3.771-2.146-8.408-2.09-12.125 .149L201 72C196.094 65.621 190.379 59.906 184 55l6.41-11.11c2.238-3.718 2.295-8.354 .149-12.125-2.146-3.771-6.162-6.09-10.501-6.064-4.339 .026-8.327 2.393-10.428 6.189L163.21 43C155.782 39.911 147.977 37.819 140 36.78v-12.78c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12.78C108.023 37.819 100.218 39.911 92.79 43L86.39 31.92C83.016 26.315 75.774 24.446 70.108 27.718c-5.665 3.272-7.666 10.478-4.498 16.202L72 55C65.621 59.906 59.906 65.621 55 72L43.93 65.61C38.206 62.442 30.999 64.443 27.728 70.108c-3.272 5.665-1.403 12.907 4.202 16.282L43 92.79c-3.089 7.428-5.181 15.233-6.22 23.21h-12.78c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12.78c1.039 7.977 3.131 15.782 6.22 23.21l-11.08 6.4c-3.797 2.101-6.163 6.088-6.189 10.428-.026 4.339 2.293 8.355 6.064 10.501 3.771 2.146 8.408 2.09 12.125-.149L55 184c4.906 6.379 10.621 12.094 17 17l-6.41 11.11c-2.238 3.718-2.295 8.354-.149 12.125 2.146 3.771 6.162 6.09 10.501 6.064 4.339-.026 8.326-2.393 10.428-6.189L92.79 213c7.428 3.089 15.233 5.181 23.21 6.22v12.78c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12.78c7.977-1.039 15.782-3.131 23.21-6.22l6.4 11.08c3.374 5.605 10.616 7.474 16.282 4.202 5.665-3.272 7.666-10.478 4.498-16.202L184 201c6.379-4.906 12.094-10.621 17-17l11.11 6.41c3.718 2.238 8.354 2.295 12.125 .149 3.771-2.146 6.09-6.162 6.064-10.501-.026-4.339-2.393-8.327-6.189-10.428L213 163.21c3.089-7.428 5.181-15.233 6.22-23.21h12.78c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM128 60c32.907 .047 61.073 23.617 66.92 56h-60l-30-52c7.402-2.666 15.213-4.02 23.08-4ZM60 128c.001-20.026 8.843-39.03 24.16-51.93l30 51.93-30 51.93C68.843 167.03 60.001 148.026 60 128ZM128 196c-7.864 .019-15.671-1.335-23.07-4l30-52h60c-5.848 32.387-34.019 55.958-66.93 56Z"),
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
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null
