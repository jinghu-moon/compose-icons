package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorBoldIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 67.24C227.88 56.428 223.364 46.131 215.49 38.72 199.91 24 174.71 24.5 159.29 39.93L142.48 56.84c-11.122-7.63-26.103-6.247-35.64 3.29l-9 9c-7.504 7.516-7.824 19.586-.73 27.49L48.9 144.84C38.274 155.395 33.785 170.652 37 185.28l-7.5 17.19c-2.948 6.687-1.473 14.498 3.71 19.65 5.804 5.847 14.611 7.513 22.15 4.19l16.31-7.13c14.343 2.788 29.132-1.745 39.45-12.09l48.24-48.26c7.901 7.082 19.956 6.761 27.47-.73l9-9c9.54-9.568 10.905-24.577 3.25-35.71L216.32 96.05C223.969 88.434 228.186 78.032 228 67.24ZM142.35 141.9 136.29 148h-56.56l34.34-34.36ZM94.15 190.11c-5.228 5.239-12.922 7.162-20 5-2.74-.849-5.693-.682-8.32 .47L57 199.38 60.69 191c1.193-2.734 1.325-5.814 .37-8.64C59.935 179.024 59.711 175.45 60.41 172h51.88ZM199.29 79.11l-25.37 25.52c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l4.88 4.88c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-6.14 6.15-4.88-4.89h0L122.55 88.14h0l-4.88-4.89 6.14-6.14c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L134.35 82c2.252 2.25 5.306 3.513 8.49 3.51h0c3.187 .005 6.245-1.258 8.5-3.51L176.28 56.92c6.3-6.3 16.48-6.63 22.71-.74 3.156 2.974 4.97 7.101 5.026 11.436 .057 4.336-1.649 8.509-4.726 11.564Z"),
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
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
