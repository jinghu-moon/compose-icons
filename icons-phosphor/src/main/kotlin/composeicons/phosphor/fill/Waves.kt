package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorFillIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM197.2 176.87c-13.07 11.18-24.9 15.1-35.64 15.1-14.26 0-26.62-6.92-37.47-13-18.41-10.31-32.95-18.45-54.89 .31-3.358 2.872-8.408 2.478-11.28-.88-2.872-3.358-2.478-8.408 .88-11.28 30.42-26 54.09-12.76 73.11-2.11 18.41 10.31 33 18.45 54.89-.31 3.358-2.872 8.408-2.478 11.28 .88 2.872 3.358 2.478 8.408-.88 11.28ZM197.2 132.87c-13.07 11.18-24.9 15.1-35.64 15.1-14.26 0-26.62-6.92-37.47-13-18.41-10.31-32.95-18.45-54.89 .31-3.358 2.872-8.408 2.478-11.28-.88-2.872-3.358-2.478-8.408 .88-11.28 30.42-26 54.09-12.76 73.11-2.11 18.41 10.31 33 18.45 54.89-.31 3.358-2.872 8.408-2.478 11.28 .88 2.872 3.358 2.478 8.408-.88 11.28ZM197.2 88.87c-13.07 11.18-24.9 15.1-35.64 15.1-14.26 0-26.62-6.92-37.47-13C105.68 80.66 91.14 72.52 69.2 91.28c-3.368 2.717-8.286 2.263-11.1-1.024-2.814-3.288-2.504-8.217 .7-11.126C89.22 53.13 112.89 66.37 131.91 77.02c18.41 10.31 33 18.45 54.89-.31 3.358-2.872 8.408-2.478 11.28 .88 2.872 3.358 2.478 8.408-.88 11.28Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
