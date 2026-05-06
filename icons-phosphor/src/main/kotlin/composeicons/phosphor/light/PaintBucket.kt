package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorLightIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237 164.67c-1.112-1.676-2.989-2.683-5-2.683-2.011 0-3.888 1.008-5 2.683-.7 1-17 25.72-17 43.33 0 12.15 9.85 22 22 22 12.15 0 22-9.85 22-22 0-17.61-16.31-42.29-17-43.33ZM232 218c-5.523 0-10-4.477-10-10 0-8.17 5.37-19.92 10-28.34 4.63 8.41 10 20.15 10 28.34 0 5.523-4.477 10-10 10ZM233.9 137.18c1.974-.658 3.466-2.292 3.943-4.317 .477-2.025-.13-4.153-1.603-5.623L120.76 11.76c-1.125-1.127-2.653-1.76-4.245-1.76-1.592 0-3.12 .633-4.245 1.76l-42 42L44.27 27.76c-2.347-2.312-6.12-2.299-8.451 .029-2.331 2.328-2.349 6.101-.039 8.451l26 26L16.44 107.59c-8.59 8.591-8.59 22.519 0 31.11l84.86 84.86c8.591 8.59 22.519 8.59 31.11 0l78.83-78.83ZM203.76 135.24l-79.83 79.83c-3.905 3.904-10.235 3.904-14.14 0L24.93 130.21c-3.904-3.905-3.904-10.235 0-14.14L70.25 70.75l31.62 31.61c-6.306 10.249-4.755 23.486 3.75 32 10.153 10.147 26.607 10.147 36.76 0h0c9.268-9.333 10.107-24.116 1.954-34.437C136.181 89.602 121.605 86.995 110.38 93.85L78.74 62.26 116.52 24.49 220.89 128.86l-14.79 4.93c-.881 .298-1.681 .794-2.34 1.45ZM114.1 106.11h0c5.47-5.459 14.329-5.453 19.792 .014 5.463 5.467 5.463 14.325 0 19.792-5.463 5.467-14.322 5.473-19.792 .014-2.654-2.614-4.149-6.184-4.149-9.91 0-3.726 1.495-7.296 4.149-9.91Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
