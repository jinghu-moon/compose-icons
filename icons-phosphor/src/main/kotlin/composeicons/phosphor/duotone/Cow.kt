package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cow: ImageVector
    get() {
        if (_cow != null) return _cow!!
        _cow = phosphorDuotoneIcon(
            name = "Cow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 192h0c0 17.673-14.327 32-32 32h-96C62.327 224 48 209.673 48 192h0c0-17.673 14.327-32 32-32h96c17.673 0 32 14.327 32 32ZM64 104C64 86.327 78.327 72 96 72h-32.78C40.356 71.994 20.661 88.115 16.15 110.53c-.437 2.336 .188 4.746 1.705 6.575 1.517 1.83 3.769 2.89 6.145 2.895h40ZM239.85 110.53C235.339 88.115 215.644 71.994 192.78 72h-32.78c17.673 0 32 14.327 32 32v16h40c2.377-.004 4.629-1.065 6.145-2.895 1.517-1.83 2.141-4.239 1.705-6.575Z"),
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
                pathData = parseSvgPathData("M104 192c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8ZM176 184h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM100 112c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM156 112c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM244.39 122.12c-3.038 3.72-7.587 5.879-12.39 5.88h-32v32c13.774 10.33 19.392 28.315 13.947 44.649C208.503 220.983 193.217 232 176 232h-96C62.783 232 47.497 220.983 42.053 204.649 36.608 188.315 42.226 170.33 56 160v-32h-32c-4.764-.008-9.277-2.138-12.311-5.812C8.655 118.514 7.417 113.68 8.31 109 13.598 82.86 36.55 64.05 63.22 64h1.64C54.075 53.487 47.994 39.062 48 24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 22.091 17.909 40 40 40h48c22.091 0 40-17.909 40-40 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 .006 15.062-6.075 29.487-16.86 40h1.64c26.67 .05 49.622 18.86 54.91 45 .92 4.647-.291 9.461-3.3 13.12ZM56 112v-8c-.014-8.657 2.795-17.083 8-24h-.8C44.202 80.031 27.834 93.392 24 112ZM200 192c0-13.255-10.745-24-24-24h-96c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24h96c13.255 0 24-10.745 24-24ZM184 152.8v-48.8C184 90.745 173.255 80 160 80h-64C82.745 80 72 90.745 72 104v48.8c2.634-.531 5.313-.799 8-.8h96c2.687 .001 5.366 .269 8 .8ZM232 112C228.17 93.39 211.8 80.027 192.8 80h-.8c5.205 6.917 8.014 15.343 8 24v8Z"),
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
        return _cow!!
    }

private var _cow: ImageVector? = null
