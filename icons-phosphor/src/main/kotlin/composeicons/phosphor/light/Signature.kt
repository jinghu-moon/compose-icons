package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorLightIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 170h-171.4c3.34-6.54 6.73-13.35 10.06-20.29 1.422 .233 2.86 .35 4.3 .35 14.23 0 31.09-11.12 50.33-33.22 1 3 2.2 6.25 3.68 9.56 6.89 15.45 15.68 23.39 26.14 23.6h.39c8.81 0 17.71-5.77 27-17.58C188.33 140.68 201.62 150 232 150c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6-39.69 0-41.88-16.61-42-18.06 .098-2.653-1.608-5.037-4.15-5.8-2.615-.774-5.425 .284-6.88 2.59C166.81 135.4 158.9 138.06 155.34 138c-10.78-.21-19.11-23.68-21.46-35-.469-2.281-2.216-4.085-4.48-4.627-2.265-.542-4.639 .275-6.09 2.097C104.64 123.86 88 137 76.18 137.92 100 85.84 107.23 52.7 98.23 36.78 95.44 31.86 89.66 26 77.91 26 62.91 26 50.91 40.62 45.09 66.1 38.28 95.94 42.12 132 59.62 145c-4.15 8.64-8.4 17.08-12.52 25h-23.1c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16.76C28.65 204.58 19 220.66 18.86 220.91c-1.182 1.839-1.27 4.176-.23 6.099 1.04 1.923 3.045 3.128 5.231 3.145 2.186 .017 4.209-1.157 5.279-3.064 .16-.26 11.56-19.27 25.21-45.09h177.65c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM56.79 68.77C61.05 50.08 69.34 38 77.91 38c6.4 0 8.64 2.51 9.87 4.69 4 7 6 28.15-22.88 91C54.59 123.39 50.73 95.3 56.79 68.77Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
