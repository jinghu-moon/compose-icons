package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorBoldIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 104C168 81.909 150.091 64 128 64 105.909 64 88 81.909 88 104c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40ZM112 104c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM224 196h-84v-8.87c43.606-6.294 74.939-45.209 71.784-89.154C208.629 54.031 172.058 19.992 128 19.992c-44.058 0-80.629 34.04-83.784 77.985-3.155 43.945 28.178 82.86 71.784 89.154v8.87h-84c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM68 104C68 70.863 94.863 44 128 44c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60C94.879 163.961 68.039 137.121 68 104Z"),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
