package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorDuotoneIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 48c0 13.255-10.745 24-24 24C90.745 72 80 61.255 80 48 80 34.745 90.745 24 104 24c13.255 0 24 10.745 24 24Z"),
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
                pathData = parseSvgPathData("M255.59 189.47c-.671-2.013-2.114-3.677-4.012-4.626-1.898-.949-4.095-1.105-6.108-.434l-17.42 5.81L199.15 132.42C197.795 129.712 195.028 128.002 192 128h-80v-24h56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-56v-9c15.602-4.029 25.775-19.03 23.745-35.016C133.714 27.998 120.114 16.016 104 16.016c-16.114 0-29.715 11.982-31.745 27.968C70.225 59.97 80.398 74.971 96 79v10.81C60.288 97.972 36.398 131.648 40.494 168.051 44.59 204.454 75.367 231.978 112 232c33.52 0 63.69-22.71 71.75-54 1.105-4.28-1.47-8.645-5.75-9.75-4.28-1.105-8.645 1.47-9.75 5.75-6.16 24-30.34 42-56.25 42C84.202 215.991 60.619 195.592 56.606 168.085 52.592 140.579 69.364 114.292 96 106.34v29.66c0 4.418 3.582 8 8 8h83.05l29.79 59.58c1.785 3.559 5.915 5.263 9.69 4l24-8c4.187-1.397 6.451-5.921 5.06-10.11ZM88 48c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C95.163 64 88 56.837 88 48Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
