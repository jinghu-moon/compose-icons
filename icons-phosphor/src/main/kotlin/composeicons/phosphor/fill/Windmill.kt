package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = phosphorFillIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 231.47c-.367-4.268-3.967-7.528-8.25-7.47h-40.81l-6.3-44.12 3.24 1.91c3.657 2.154 8.02 2.767 12.13 1.704 4.109-1.063 7.627-3.716 9.78-7.374l11.81-20c2.082-3.444 2.832-7.531 2.11-11.49-.866-4.508-3.637-8.423-7.6-10.74L148.93 99c-3.724-2.123-5.177-6.761-3.33-10.63 .994-1.979 2.765-3.457 4.889-4.082 2.124-.625 4.413-.342 6.321 .782l20.95 12.33c1.9 1.126 4.353 .5 5.48-1.4L213.79 44.1c2.158-3.658 2.772-8.024 1.709-12.135-1.064-4.112-3.718-7.632-7.379-9.785l-20.34-12C184.123 8.026 179.76 7.413 175.65 8.476c-4.109 1.063-7.627 3.716-9.78 7.374l-35 59.42c-1.165 1.98-3.126 3.364-5.382 3.798-2.256 .434-4.59-.122-6.408-1.528C115.905 74.991 115.106 70.486 117.21 67L129.44 46.22c1.106-1.906 .462-4.347-1.44-5.46L76.12 10.22C72.463 8.066 68.1 7.453 63.99 8.516c-4.109 1.063-7.627 3.716-9.78 7.374L42.4 35.89c-2.081 3.441-2.832 7.524-2.11 11.48 .873 4.508 3.642 8.423 7.6 10.75L107.08 93c3.608 2.051 5.101 6.484 3.47 10.3-.931 2.077-2.703 3.658-4.871 4.349-2.168 .691-4.528 .426-6.489-.729l-21-12.34C76.296 93.491 73.878 94.123 72.76 96L42.21 147.9c-2.154 3.657-2.767 8.02-1.704 12.13 1.063 4.109 3.716 7.627 7.374 9.78l20.34 12c3.177 1.904 6.928 2.613 10.58 2L73.06 224h-40.79c-4.291-.068-7.903 3.195-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h192c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003ZM89.22 224 98 162.8l12.77-21.7h0L125 116.93c2.123-3.718 6.754-5.171 10.62-3.33 1.979 .994 3.457 2.765 4.082 4.889 .625 2.124 .342 4.413-.782 6.321l-12.33 21c-1.116 1.903-.481 4.35 1.42 5.47l31 18.25L166.78 224Z"),
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
        return _windmill!!
    }

private var _windmill: ImageVector? = null
