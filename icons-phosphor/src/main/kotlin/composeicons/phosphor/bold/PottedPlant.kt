package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorBoldIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 144h-71l21.24-21.25c7.555 3.373 15.726 5.15 24 5.22 9.523 .022 18.866-2.588 27-7.54 24-14.57 37-47.79 34.54-88.87-.359-6.069-5.201-10.911-11.27-11.27C183.42 17.88 150.2 30.78 135.64 54.83c-9.24 15.24-10 33.4-2.33 51L120 119 108.86 107.87c4.94-12.89 4-26.12-2.76-37.36C95 52.25 70.12 42.4 39.49 44.21c-6.073 .354-10.92 5.197-11.28 11.27-1.8 30.64 8 55.54 26.32 66.61 6.324 3.861 13.591 5.903 21 5.9 5.582-.036 11.111-1.097 16.31-3.13L103 136l-8 8h-39c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h7.27l11.63 52.34c1.996 9.172 10.133 15.7 19.52 15.66h67.17c9.388 .044 17.527-6.486 19.52-15.66L192.74 168h7.26c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM156.1 67.26C164.8 52.89 185.29 44.5 212 44c-.48 26.69-8.87 47.18-23.25 55.89-9.43 5.71-20.45 5.48-32-.62-6.14-11.56-6.36-22.58-.65-32.01ZM85.51 101.5c-5.23 2.53-12 4-18.54 .07C58.5 96.44 53.16 84.09 52.17 68.17c15.93 1 28.27 6.32 33.4 14.79 3.94 6.52 2.43 13.31-.06 18.54ZM158.38 212h-60.76L87.85 168h80.31Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
