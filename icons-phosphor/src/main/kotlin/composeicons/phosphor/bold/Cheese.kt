package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorBoldIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 28c-1.169-.001-2.331 .171-3.45 .51L20.55 76.51h0C15.476 78.033 12.001 82.703 12 88v24c0 6.627 5.373 12 12 12h8c6.52 .036 11.833 5.242 12 11.76 .039 3.143-1.199 6.167-3.43 8.38-2.402 2.448-5.681 3.837-9.11 3.86h-7.46c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12h200c11.046 0 20-8.954 20-20v-96C243.961 54.879 217.121 28.039 184 28ZM185.64 52c14.644 .69 27.413 10.178 32.3 24h-112.18ZM152 100h32v4c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM96 180c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM220 180h-68c0-22.091-17.909-40-40-40-22.091 0-40 17.909-40 40h-36v-8.29C44.227 170.666 51.867 166.896 57.7 161 64.478 154.19 68.196 144.917 68 135.31 67.564 117.275 53.918 102.312 36 100.22v-.22h92v4c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-4h12Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
