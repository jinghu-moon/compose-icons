package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorFillIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v48c0 4.418-3.582 8-8 8h-48c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L180.65 72C165.921 57.887 146.329 49.978 125.93 49.91h-.45C104.577 49.869 84.499 58.06 69.59 72.71c-3.178 2.966-8.142 2.852-11.181-.256-3.038-3.109-3.038-8.075 .001-11.184C95.484 25.047 154.618 24.795 192 60.7L210.36 42.34c2.29-2.276 5.724-2.953 8.706-1.715 2.982 1.238 4.928 4.147 4.934 7.375ZM186.41 183.29C155.612 213.371 106.531 213.685 75.35 184L93.66 165.69c2.312-2.285 3.012-5.742 1.77-8.747C94.188 153.939 91.251 151.985 88 152h-48c-4.418 0-8 3.582-8 8v48c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737L64 195.3c17.722 17.103 41.371 26.692 66 26.76h.53c25.081 .065 49.177-9.754 67.07-27.33 3.039-3.109 3.039-8.075 .001-11.184-3.038-3.109-8.003-3.223-11.181-.256Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
