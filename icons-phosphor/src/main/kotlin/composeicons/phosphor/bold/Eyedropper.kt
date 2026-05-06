package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) return _eyedropper!!
        _eyedropper = phosphorBoldIcon(
            name = "Eyedropper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 67.24C227.88 56.428 223.364 46.131 215.49 38.72 199.91 24 174.71 24.5 159.29 39.93L142.48 56.84c-11.122-7.63-26.103-6.247-35.64 3.29l-9 9c-7.504 7.516-7.824 19.586-.73 27.49L48.9 144.84C38.274 155.395 33.785 170.652 37 185.28l-7.5 17.19c-2.948 6.687-1.473 14.498 3.71 19.65 5.804 5.847 14.611 7.513 22.15 4.19l16.31-7.13c14.343 2.79 29.133-1.743 39.45-12.09l48.24-48.26c7.901 7.082 19.956 6.761 27.47-.73l9-9c9.548-9.567 10.918-24.582 3.26-35.72L216.32 96.05C223.969 88.434 228.186 78.032 228 67.24ZM94.15 190.11c-5.228 5.239-12.922 7.162-20 5-2.74-.849-5.693-.682-8.32 .47L57 199.38 60.69 191c1.193-2.734 1.325-5.814 .37-8.64-2.455-7.206-.589-15.182 4.81-20.55l48.2-48.22 28.28 28.3ZM199.29 79.11l-25.37 25.52c-4.673 4.684-4.673 12.266 0 16.95l4.88 4.89c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-6.14 6.15-55-55.05 6.14-6.14c1.561-1.558 4.089-1.558 5.65 0L134.35 82c2.252 2.25 5.306 3.513 8.49 3.51h0c3.187 .005 6.245-1.258 8.5-3.51L176.28 56.92c6.3-6.3 16.48-6.63 22.71-.74 3.156 2.974 4.97 7.101 5.026 11.436 .057 4.336-1.649 8.509-4.726 11.564Z"),
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
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
