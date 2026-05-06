package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = phosphorThinIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.76 77.11c-1.017-.997-2.487-1.377-3.86-1l-3.49 1C217.353 65.337 210.139 55.1 199.744 49.203 189.349 43.305 176.861 42.365 165.7 46.64 160.039 30.676 144.938 20.008 128 20.008c-16.938 0-32.039 10.668-37.7 26.632C79.133 42.365 66.64 43.31 56.243 49.216 45.846 55.122 38.637 65.369 36.59 77.15l-3.49-1c-1.367-.394-2.841-.033-3.87 .949-1.029 .982-1.46 2.437-1.13 3.821L58.66 210.75c1.256 5.432 6.105 9.272 11.68 9.25h115.32c5.576 .022 10.424-3.818 11.68-9.25L227.89 80.92c.325-1.381-.104-2.83-1.13-3.81ZM76 52c5.228-.001 10.378 1.276 15 3.72 1.102 .585 2.415 .623 3.549 .101 1.134-.522 1.959-1.543 2.231-2.761 3.259-14.635 16.242-25.045 31.235-25.045 14.993 0 27.976 10.41 31.235 25.045 .275 1.209 1.095 2.223 2.221 2.744 1.126 .521 2.429 .49 3.529-.084 9.19-4.871 20.174-4.972 29.452-.271 9.278 4.702 15.692 13.619 17.198 23.911L168.22 91.78 132.46 77.47c-2.863-1.146-6.057-1.146-8.92 0L87.78 91.78 44.33 79.36C46.633 63.644 60.116 51.996 76 52ZM70.34 212c-1.857 .003-3.473-1.272-3.9-3.08L37.44 85.72 84.38 99.13 99.43 212ZM107.5 212 92.38 98.56 126.52 84.9c.962-.389 2.038-.389 3 0l34.13 13.66L148.5 212ZM189.56 208.92c-.427 1.808-2.043 3.083-3.9 3.08h-29.09L171.62 99.13 218.54 85.72Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
