package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorFillIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 56c-10.894 .001-21.693 2.036-31.84 6C161.84 32.3 132.91 17.54 131.59 16.87c-2.253-1.128-4.907-1.128-7.16 0C123.1 17.51 94.17 32.27 79.85 62 69.699 58.035 58.898 56 48 56c-4.418 0-8 3.582-8 8v80c.054 43.743 32.189 80.825 75.48 87.1 1.148 .151 2.304-.203 3.171-.971 .867-.767 1.359-1.872 1.349-3.029v-50.83c-.053-4.281 3.205-7.879 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v51.14c-.01 1.157 .482 2.262 1.349 3.029 .867 .767 2.023 1.121 3.171 .971C183.834 224.882 215.976 187.766 216 144v-80c0-4.418-3.582-8-8-8ZM120 149.46C105.151 128.295 81.746 114.732 56 112.37v-39.93c36.422 4.118 63.958 34.906 64 71.56ZM128 107.36C120.718 91.565 108.949 78.263 94.16 69.11 103.37 49.9 120.56 37.78 128 33.21c7.45 4.58 24.63 16.7 33.84 35.9C147.051 78.263 135.282 91.565 128 107.36ZM200 112.36c-25.746 2.362-49.151 15.925-64 37.09v-5.45c.042-36.654 27.578-67.442 64-71.56Z"),
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
