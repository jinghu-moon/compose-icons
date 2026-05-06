package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorBoldIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 52c-10.175-.004-20.28 1.686-29.9 5C162.71 28.24 134.7 13.94 133.37 13.28c-3.38-1.691-7.36-1.691-10.74 0C121.3 13.94 93.29 28.28 77.89 57 68.274 53.685 58.172 51.995 48 52 41.373 52 36 57.373 36 64v80c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92v-80c0-6.627-5.373-12-12-12ZM60 77.06c30.097 5.446 52.879 30.277 55.72 60.73C101.13 121.878 81.403 111.611 60 108.79ZM116 210.94C83.614 205.084 60.045 176.911 60 144v-10.94c32.386 5.856 55.955 34.029 56 66.94ZM99.37 67.71c8.2-14.94 21.32-25 28.63-29.77 7.32 4.79 20.43 14.83 28.63 29.77C144.842 75.676 135.045 86.249 128 98.61 120.951 86.252 111.156 75.679 99.37 67.71ZM196 144c-.045 32.911-23.614 61.084-56 66.94v-10.94c.045-32.911 23.614-61.084 56-66.94ZM196 108.78c-21.403 2.821-41.13 13.088-55.72 29C143.126 107.331 165.907 82.505 196 77.06Z"),
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
        return _grains!!
    }

private var _grains: ImageVector? = null
