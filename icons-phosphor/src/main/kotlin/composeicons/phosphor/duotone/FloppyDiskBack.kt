package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorDuotoneIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-32v40c0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8v-39.27c-.87 .393-1.662 .938-2.34 1.61L42.34 77.66C40.843 79.159 40.001 81.191 40 83.31v124.69c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM128 184C110.327 184 96 169.673 96 152c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
                pathData = parseSvgPathData("M208 32h-124.69C79.064 31.986 74.99 33.676 72 36.69L36.69 72C33.676 74.99 31.986 79.064 32 83.31v124.69c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM88 48h80v32h-80ZM208 208h-160v-124.69L72 59.31v20.69c0 8.837 7.163 16 16 16h80c8.837 0 16-7.163 16-16v-32h24ZM128 112c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM128 176c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
