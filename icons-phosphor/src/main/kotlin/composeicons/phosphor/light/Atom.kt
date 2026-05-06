package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorLightIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M193.83 128c7.74-10.524 14.406-21.797 19.9-33.65 10.74-23.88 11-42.66 .8-52.88-10.2-10.22-29-9.94-52.88 .8C149.797 47.764 138.524 54.43 128 62.17 117.476 54.43 106.203 47.764 94.35 42.27 70.47 31.53 51.69 31.27 41.47 41.47c-10.22 10.2-9.94 29 .8 52.88 5.494 11.853 12.16 23.126 19.9 33.65-7.74 10.524-14.406 21.797-19.9 33.65-10.74 23.88-11 42.66-.8 52.88h0c5 5 12 7.47 20.63 7.47 9.1 0 20-2.76 32.25-8.27 11.853-5.494 23.126-12.16 33.65-19.9 10.524 7.74 21.797 14.406 33.65 19.9 12.25 5.51 23.15 8.27 32.25 8.27 8.64 0 15.65-2.49 20.63-7.47h0c10.23-10.22 9.94-29-.8-52.88C208.236 149.797 201.57 138.524 193.83 128ZM206 50c9.28 9.28 2.36 36.29-19.8 68-7.114-8.901-14.719-17.397-22.78-25.45C155.377 84.487 146.891 76.878 138 69.76 169.75 47.61 196.77 40.68 206 50ZM178.81 128c-7.368 9.486-15.32 18.503-23.81 27-8.495 8.514-17.512 16.489-27 23.88C118.512 171.489 109.495 163.514 101 155 92.489 146.503 84.514 137.485 77.12 128 91.957 109.048 109.042 91.969 128 77.14c9.485 7.387 18.502 15.356 27 23.86 8.503 8.496 16.469 17.513 23.85 27ZM50 50c2.68-2.69 6.84-4 12.17-4 13.11 0 33.3 8 55.87 23.81-8.921 7.091-17.434 14.68-25.5 22.73C84.479 100.596 76.874 109.096 69.76 118 47.6 86.25 40.68 59.24 50 50ZM50 206h0c-9.28-9.28-2.35-36.29 19.8-68 7.114 8.901 14.719 17.397 22.78 25.45 8.043 8.064 16.529 15.672 25.42 22.79C86.25 208.4 59.24 215.32 50 206ZM206 206c-9.28 9.28-36.29 2.35-68-19.81 8.903-7.108 17.4-14.71 25.45-22.77 8.064-8.043 15.672-16.529 22.79-25.42 22.16 31.75 29.08 58.76 19.76 68ZM138 128c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
