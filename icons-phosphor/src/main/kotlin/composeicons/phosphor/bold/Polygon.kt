package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Polygon: ImageVector
    get() {
        if (_polygon != null) return _polygon!!
        _polygon = phosphorBoldIcon(
            name = "Polygon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.47 97.45c14.061-14.061 14.061-36.859 0-50.92-14.061-14.061-36.859-14.061-50.92 0h0c-1.518 1.524-2.897 3.181-4.12 4.95L155.88 45.33C154.835 31.298 145.711 19.16 132.522 14.258 119.333 9.356 104.496 12.587 94.54 22.53h0C84.255 32.835 81.178 48.315 86.74 61.77L57.19 88.37C43.169 80.773 25.824 83.282 14.53 94.54h0C1.377 107.674 .385 128.663 12.243 142.978c11.857 14.315 32.664 17.249 48.017 6.772l65.28 47.87c-5.223 17.325 3.225 35.835 19.735 43.24 16.511 7.405 35.952 1.404 45.416-14.019 9.464-15.423 6.009-35.474-8.071-46.84L208 108c9.556 .012 18.722-3.785 25.47-10.55ZM139.73 178.26 74.45 130.39c2.382-7.957 1.955-16.491-1.21-24.17L102.8 79.61c14.014 7.627 31.376 5.12 42.66-6.16 1.523-1.537 2.902-3.211 4.12-5l22.55 6.15c.617 8.606 4.317 16.701 10.42 22.8 .905 .914 1.857 1.782 2.85 2.6L160 172c-7.232 .003-14.296 2.185-20.27 6.26ZM216.5 63.5c4.674 4.691 4.666 12.281-.02 16.961-4.685 4.68-12.276 4.68-16.961 0-4.685-4.68-4.694-12.27-.02-16.961 2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM111.5 39.5c4.691-4.674 12.281-4.666 16.961 .02 4.68 4.685 4.68 12.276 0 16.961-4.68 4.685-12.27 4.694-16.961 .02-2.258-2.253-3.526-5.312-3.524-8.502 .002-3.19 1.274-6.248 3.534-8.498ZM31.5 128.5c-4.674-4.691-4.666-12.281 .02-16.961 4.685-4.68 12.276-4.68 16.961 0 4.685 4.68 4.694 12.27 .02 16.961-2.253 2.258-5.312 3.526-8.502 3.524-3.19-.002-6.248-1.274-8.498-3.534ZM168.5 216.5c-4.691 4.674-12.281 4.666-16.961-.02-4.68-4.685-4.68-12.276 0-16.961 4.68-4.685 12.27-4.694 16.961-.02 2.258 2.253 3.526 5.312 3.524 8.502-.002 3.19-1.274 6.248-3.534 8.498Z"),
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
        return _polygon!!
    }

private var _polygon: ImageVector? = null
