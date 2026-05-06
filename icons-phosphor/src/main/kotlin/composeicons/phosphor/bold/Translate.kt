package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorBoldIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.73 210.63l-56-112C192.696 94.568 188.543 92.003 184 92.003c-4.543 0-8.696 2.565-10.73 6.627l-20.52 41C138.926 138.422 125.614 133.815 114 126.22 128.114 109.807 136.942 89.515 139.33 68h20.67c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-52v-12C108 25.373 102.627 20 96 20 89.373 20 84 25.373 84 32v12h-52C25.373 44 20 49.373 20 56c0 6.627 5.373 12 12 12h83.13C112.879 83.639 106.247 98.322 96 110.35 91 104.499 86.827 97.988 83.6 91 81.879 86.999 78.126 84.245 73.793 83.803c-4.333-.442-8.564 1.499-11.057 5.07-2.493 3.571-2.855 8.212-.946 12.127 4.198 9.129 9.654 17.625 16.21 25.24C64.343 135.229 48.349 140.013 32 140c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 23.04 .019 45.477-7.368 64-21.07 13.433 9.886 28.966 16.538 45.39 19.44l-24.13 48.26c-2.042 3.848-1.837 8.501 .533 12.155 2.371 3.655 6.536 5.737 10.882 5.441 4.346-.296 8.191-2.924 10.044-6.866L151.41 196h65.17l12.68 25.36c2.963 5.929 10.171 8.333 16.1 5.37 5.929-2.963 8.333-10.171 5.37-16.1ZM163.41 172 184 130.83 204.58 172Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
