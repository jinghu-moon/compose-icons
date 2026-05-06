package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) return _personSimpleRun!!
        _personSimpleRun = phosphorDuotoneIcon(
            name = "PersonSimpleRun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 56c0 13.255-10.745 24-24 24C138.745 80 128 69.255 128 56c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24Z"),
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
                pathData = parseSvgPathData("M152 88c17.673 0 32-14.327 32-32C184 38.327 169.673 24 152 24c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM152 40c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM219.31 140.68c-.61 .28-7.49 3.28-19.67 3.28-13.85 0-34.55-3.88-60.69-20-3.979 11.295-9.144 22.135-15.41 32.34 11.254 3.465 21.841 8.81 31.31 15.81C173.92 186.65 184 207.35 184 232c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-41.7-34.69-56.71-54.14-61.85-.55 .7-1.12 1.41-1.69 2.1C92.53 196.05 67.92 208.43 40.54 208.43c-3.119 .015-6.236-.129-9.34-.43-4.418-.442-7.642-4.382-7.2-8.8 .442-4.418 4.382-7.642 8.8-7.2 25.92 2.59 48.47-7.49 67-30 12.49-15.14 21-33.61 25.25-47C86.13 92.34 61.27 111.63 61 111.84c-2.219 1.895-5.293 2.431-8.023 1.4-2.729-1.031-4.681-3.467-5.092-6.355-.412-2.889 .782-5.772 3.115-7.525 1.5-1.2 37.22-29 89.51 6.57 45.47 30.91 71.93 20.31 72.18 20.19 2.608-1.232 5.678-.964 8.034 .701 2.356 1.665 3.633 4.469 3.342 7.339-.291 2.87-2.104 5.361-4.746 6.52Z"),
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
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
