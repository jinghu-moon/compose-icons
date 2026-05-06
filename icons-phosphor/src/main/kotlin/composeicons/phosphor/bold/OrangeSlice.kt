package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorBoldIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 76h-232C5.373 76 0 81.373 0 88v4c0 70.692 57.308 128 128 128 70.692 0 128-57.308 128-128v-4c0-6.627-5.373-12-12-12ZM64.52 100h42.69L84.67 139.05C73.546 128.826 66.407 114.99 64.52 100ZM128 112l22.94 39.73c-14.764 5.693-31.116 5.693-45.88 0ZM171.33 139.05 148.79 100h42.69c-1.887 14.99-9.026 28.826-20.15 39.05ZM128 196C73.691 195.932 28.55 154.143 24.3 100h16.07c4.166 45.286 42.152 79.939 87.63 79.939 45.478 0 83.464-34.652 87.63-79.939h16.07C227.45 154.143 182.309 195.932 128 196Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
