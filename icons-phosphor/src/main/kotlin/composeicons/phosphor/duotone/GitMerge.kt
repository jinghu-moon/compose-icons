package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorDuotoneIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 56C104 69.255 93.255 80 80 80 66.745 80 56 69.255 56 56 56 42.745 66.745 32 80 32c13.255 0 24 10.745 24 24Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 112c-14.194 .025-26.682 9.383-30.69 23l-42.21-6c-1.924-.272-3.684-1.235-4.95-2.71L94.43 84.55c13.791-6.99 20.613-22.841 16.207-37.661C106.231 32.068 91.859 22.517 76.489 24.196 61.119 25.875 49.147 38.303 48.045 53.725 46.943 69.148 57.025 83.152 72 87v82c-15.602 4.029-25.775 19.03-23.745 35.016 2.03 15.986 15.631 27.968 31.745 27.968 16.114 0 29.715-11.982 31.745-27.968C113.775 188.03 103.602 173.029 88 169v-67.37l30 35c3.791 4.423 9.063 7.317 14.83 8.14l44 6.28c3.693 16.349 19.374 27.078 35.95 24.598 16.576-2.481 28.429-17.331 27.174-34.044C238.699 124.89 224.76 111.977 208 112ZM64 56C64 47.163 71.163 40 80 40c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C71.163 72 64 64.837 64 56ZM96 200c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM208 160c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
