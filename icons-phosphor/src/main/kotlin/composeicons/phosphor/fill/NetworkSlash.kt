package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorFillIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M98.08 59.41C96.735 57.93 95.993 56 96 54v-14c0-8.837 7.163-16 16-16h32c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-16.39c-2.254-0-4.404-.952-5.92-2.62ZM53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L102.64 112h-78.64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v32h-8c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-8v-32h45.19l84.89 93.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM232 112h-68c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h20v22.83c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-22.83h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
