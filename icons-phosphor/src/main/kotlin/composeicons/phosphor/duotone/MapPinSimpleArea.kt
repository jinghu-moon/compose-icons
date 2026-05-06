package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorDuotoneIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 64c0 17.673-14.327 32-32 32C110.327 96 96 81.673 96 64 96 46.327 110.327 32 128 32c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M120 103.2v72.8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72.8c20.12-4.107 33.861-22.782 31.797-43.212C165.734 39.557 148.535 24.008 128 24.008c-20.535 0-37.734 15.549-39.797 35.98C86.139 80.418 99.88 99.093 120 103.2ZM128 40c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C114.745 88 104 77.255 104 64c0-13.255 10.745-24 24-24ZM240 176c0 31.18-57.71 48-112 48C73.71 224 16 207.18 16 176c0-7.74 3.81-19.13 22-29.41 12.26-6.94 29.12-12.27 48.77-15.42 4.371-.69 8.475 2.294 9.165 6.665 .69 4.371-2.294 8.475-6.665 9.165-17.54 2.82-33 7.63-43.42 13.55C37.05 165.5 32 171.14 32 176c0 13.36 36.52 32 96 32 59.48 0 96-18.64 96-32 0-4.86-5.05-10.5-13.85-15.49-10.46-5.92-25.88-10.73-43.42-13.55-2.89-.378-5.346-2.297-6.411-5.01-1.065-2.713-.57-5.791 1.292-8.033 1.862-2.242 4.796-3.295 7.659-2.747 19.65 3.15 36.51 8.48 48.77 15.42C236.19 156.87 240 168.26 240 176Z"),
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
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
