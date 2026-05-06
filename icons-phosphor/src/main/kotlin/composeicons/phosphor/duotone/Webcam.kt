package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorDuotoneIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 32C88.235 32 56 64.235 56 104c0 39.764 32.235 72 72 72 39.764 0 72-32.236 72-72C200 64.235 167.764 32 128 32ZM128 136C110.327 136 96 121.673 96 104 96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M168 104C168 81.909 150.091 64 128 64 105.909 64 88 81.909 88 104c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40ZM104 104c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24ZM224 200h-88v-16.4c42.412-4.263 74.034-41.031 71.9-83.604C205.766 57.423 170.626 24.001 128 24.001c-42.626 0-77.766 33.422-79.9 75.995-2.134 42.573 29.487 79.341 71.9 83.604v16.4h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM64 104C64 68.654 92.654 40 128 40c35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64C92.67 167.961 64.039 139.33 64 104Z"),
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
