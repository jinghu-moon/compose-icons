package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorDuotoneIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 64v56c-44.183 0-80 35.817-80 80C128 155.817 92.183 120 48 120v-56c12.525-.01 24.876 2.933 36.05 8.59h0C95.62 40.19 128 24 128 24c0 0 32.39 16.19 44 48.58h0C183.159 66.931 195.493 63.992 208 64Z"),
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
                pathData = parseSvgPathData("M208 56c-10.898-0-21.699 2.035-31.85 6C161.83 32.3 132.9 17.54 131.58 16.87c-2.253-1.128-4.907-1.128-7.16 0C123.09 17.54 94.17 32.3 79.85 62 69.699 58.035 58.898 56 48 56c-4.418 0-8 3.582-8 8v80c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88v-80c0-4.418-3.582-8-8-8ZM120 215.56C83.578 211.442 56.042 180.654 56 144v-15.56c36.422 4.118 63.958 34.906 64 71.56ZM120 149.46C105.151 128.295 81.746 114.732 56 112.37v-39.93c36.422 4.118 63.958 34.906 64 71.56ZM94.15 69.11C103.37 49.89 120.58 37.76 128 33.2c7.44 4.54 24.6 16.6 33.84 35.91C147.047 78.258 135.277 91.562 128 107.36 120.721 91.561 108.947 78.257 94.15 69.11ZM200 144c-.042 36.654-27.578 67.442-64 71.56v-15.56c.042-36.654 27.578-67.442 64-71.56ZM200 112.37c-25.746 2.362-49.151 15.925-64 37.09v-5.46c.042-36.654 27.578-67.442 64-71.56Z"),
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
