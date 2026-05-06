package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorRegularIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 56c-10.898-0-21.699 2.035-31.85 6C161.83 32.3 132.9 17.54 131.58 16.88c-2.253-1.128-4.907-1.128-7.16 0C123.09 17.54 94.17 32.3 79.85 62 69.699 58.035 58.898 56 48 56c-4.418 0-8 3.582-8 8v80c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88v-80c0-4.418-3.582-8-8-8ZM120 215.56C83.578 211.442 56.042 180.654 56 144v-15.56c36.422 4.118 63.958 34.906 64 71.56ZM120 149.46C105.151 128.295 81.746 114.732 56 112.37v-39.93c36.422 4.118 63.958 34.906 64 71.56ZM94.15 69.11C103.37 49.9 120.56 37.78 128 33.21c7.44 4.58 24.63 16.7 33.84 35.9C147.051 78.263 135.282 91.565 128 107.36 120.718 91.563 108.945 78.259 94.15 69.11ZM200 144c-.042 36.654-27.578 67.442-64 71.56v-15.56c.042-36.654 27.578-67.442 64-71.56ZM200 112.37c-25.746 2.362-49.151 15.925-64 37.09v-5.46c.042-36.654 27.578-67.442 64-71.56Z"),
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
