package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorRegularIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 128c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM88 168c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM248 120h-24.3C219.456 64.24 171.877 21.818 115.997 23.97 60.117 26.122 15.942 72.078 16 128v24c.044 39.746 32.254 71.956 72 72h40c39.746-.044 71.956-32.254 72-72v-16h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM184 152c-.031 28.77-21.834 52.846-50.46 55.72C150.287 194.068 160.004 173.606 160 152v-16h24ZM152 120c-4.418 0-8 3.582-8 8v24c0 30.928-25.072 56-56 56C57.072 208 32 182.928 32 152v-24C31.974 80.937 68.982 42.184 115.996 40.043c47.014-2.141 87.391 33.087 91.644 79.957Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
