package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorDuotoneIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 128c0 17.673-14.327 32-32 32C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M232 120h-8.34C219.696 73.327 182.673 36.304 136 32.34v-8.34c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8.34C73.327 36.304 36.304 73.327 32.34 120h-8.34c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8.34c3.964 46.673 40.987 83.696 87.66 87.66v8.34c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8.34c46.673-3.964 83.696-40.987 87.66-87.66h8.34c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM136 207.6v-7.6c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v7.6C82.17 203.74 52.26 173.83 48.4 136h7.6c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-7.6C52.26 82.17 82.17 52.26 120 48.4v7.6c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-7.6c37.83 3.86 67.74 33.77 71.6 71.6h-7.6c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h7.6c-3.86 37.83-33.77 67.74-71.6 71.6ZM128 88c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 105.909 150.091 88 128 88ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
