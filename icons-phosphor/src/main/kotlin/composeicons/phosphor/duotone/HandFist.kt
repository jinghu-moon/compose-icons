package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorDuotoneIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 112v16c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128v-40C32 74.745 42.745 64 56 64c13.255 0 24 10.745 24 24v-24C80 50.745 90.745 40 104 40c13.255 0 24 10.745 24 24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24v24h24c13.255 0 24 10.745 24 24Z"),
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
                pathData = parseSvgPathData("M200 80h-16v-16C183.985 50.698 175.742 38.792 163.297 34.096 150.851 29.4 136.798 32.893 128 42.87 119.633 33.387 106.466 29.721 94.402 33.516 82.338 37.311 73.641 47.855 72.21 60.42 62.317 54.608 50.069 54.537 40.11 60.235 30.15 65.932 24.004 76.526 24 88v40c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104v-16C232 94.327 217.673 80 200 80ZM152 48c8.837 0 16 7.163 16 16v16h-32v-16c0-8.837 7.163-16 16-16ZM88 64c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v40c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM40 88C40 79.163 47.163 72 56 72c8.837 0 16 7.163 16 16v16c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM216 128c-.001 47.87-38.266 86.958-86.125 87.979C82.017 216.999 42.121 179.576 40.08 131.75c13.185 7.583 29.889 4.813 39.92-6.62 11.469 13.068 31.287 14.558 44.58 3.35 2.878 4.77 6.944 8.711 11.8 11.44C125.966 149.017 119.994 162.172 120 176c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-17.673 14.327-32 32-32 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16c-8.837 0-16-7.163-16-16v-16h64c8.837 0 16 7.163 16 16Z"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
