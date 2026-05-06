package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorFillIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.12 128C220.77 93.39 233.34 57.62 215.86 40.14 198.38 22.66 162.61 35.23 128 59.88 93.39 35.23 57.62 22.66 40.14 40.14 22.66 57.62 35.23 93.39 59.88 128 35.23 162.61 22.66 198.38 40.14 215.86h0c5.63 5.63 13.15 8.14 21.91 8.14 18.47 0 42.48-11.17 66-27.88C151.47 212.83 175.47 224 194 224c8.76 0 16.29-2.52 21.91-8.14h0C233.34 198.38 220.77 162.61 196.12 128ZM204.55 51.45c7.64 7.64 2.48 32.4-18.52 63.28C179.386 106.506 172.313 98.638 164.84 91.16 157.358 83.7 149.491 76.637 141.27 70 172.15 49 196.91 43.81 204.55 51.45ZM51.45 51.45c2.2-2.21 5.83-3.35 10.62-3.35C73.89 48.1 92.76 55 114.72 70 106.504 76.639 98.64 83.702 91.16 91.16 83.697 98.639 76.634 106.507 70 114.73 49 83.85 43.81 59.09 51.45 51.45ZM51.45 204.55C43.81 196.91 49 172.15 70 141.27c6.644 8.224 13.717 16.092 21.19 23.57 7.474 7.457 15.331 14.52 23.54 21.16C83.85 207 59.09 212.19 51.45 204.55ZM128 140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM204.55 204.56c-7.64 7.65-32.4 2.48-63.28-18.52 8.22-6.649 16.087-13.722 23.57-21.19 7.463-7.482 14.526-15.353 21.16-23.58 21 30.88 26.19 55.64 18.55 63.28Z"),
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
        return _atom!!
    }

private var _atom: ImageVector? = null
