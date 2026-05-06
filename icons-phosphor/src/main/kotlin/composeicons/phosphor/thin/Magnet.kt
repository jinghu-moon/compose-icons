package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorThinIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.13 53.06C188.455 37.048 166.997 28.017 144.59 28h-.32c-22.3-.061-43.698 8.804-59.42 24.62L23.46 114.8c-4.653 4.68-4.653 12.24 0 16.92l28.67 28.66c2.243 2.258 5.297 3.522 8.48 3.51h.07c3.208-.016 6.277-1.316 8.52-3.61L130.09 97.86c7.725-7.646 20.129-7.765 28-.27 3.811 3.663 5.976 8.714 6 14 .057 5.554-2.102 10.903-6 14.86L95.76 186.75c-2.303 2.239-3.612 5.308-3.635 8.52-.023 3.212 1.244 6.299 3.515 8.57l28.66 28.66c4.655 4.655 12.191 4.691 16.89 .08L203 172.12c32.88-32.91 33.4-86.32 1.13-119.06ZM63.51 154.69c-.741 .768-1.763 1.201-2.83 1.2h0c-1.061 .001-2.079-.42-2.83-1.17L29.16 126.06c-1.551-1.56-1.551-4.08 0-5.64l26.63-27 34.15 34.18ZM135.59 226.87c-1.559 1.544-4.071 1.544-5.63 0L101.29 198.21c-.76-.751-1.188-1.776-1.188-2.845 0-1.069 .428-2.094 1.188-2.845l27.2-26.3 34.16 34.15ZM197.35 166.43l-28.94 28.32L134.29 160.63l29.41-28.44c5.437-5.487 8.461-12.916 8.4-20.64-.021-7.44-3.055-14.554-8.41-19.72C152.655 81.313 135.253 81.495 124.44 92.24L95.53 121.87 61.4 87.75 90.52 58.26C104.744 43.959 124.099 35.943 144.27 36h.29c20.271 .021 39.683 8.191 53.87 22.67 29.2 29.63 28.7 77.98-1.08 107.76Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
