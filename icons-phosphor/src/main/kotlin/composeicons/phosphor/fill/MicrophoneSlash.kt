package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) return _microphoneSlash!!
        _microphoneSlash = phosphorFillIcon(
            name = "MicrophoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.38 229.92c-3.27 2.971-8.329 2.729-11.3-.54l-30.92-34c-10.577 6.818-22.633 11.005-35.16 12.21v32.41c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32.4C79.145 203.443 48.05 169.066 48 128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 .039 35.33 28.67 63.961 64 64 11.319 .033 22.44-2.964 32.21-8.68L149.11 171.12c-14.879 7.286-32.463 6.384-46.519-2.385C88.536 159.965 79.996 144.567 80 128v-32.91L42.08 53.38c-2.907-3.277-2.638-8.283 .604-11.229 3.242-2.946 8.251-2.737 11.236 .469l160 176c2.971 3.27 2.729 8.329-.54 11.3ZM189.19 166.79c1.091 .541 2.292 .822 3.51 .82 3.058 0 5.848-1.742 7.19-4.49C205.258 152.193 208.033 140.175 208 128c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .029 9.737-2.189 19.349-6.48 28.09-1.941 3.968-.298 8.758 3.67 10.7ZM161.86 137.57c2.124 2.337 5.423 3.207 8.423 2.219 3-.988 5.137-3.647 5.457-6.789 .171-1.661 .258-3.33 .26-5v-64C175.975 41.277 160.019 21.684 137.772 17.058 115.524 12.432 93.081 24.04 84 44.87c-1.257 2.885-.705 6.239 1.41 8.57Z"),
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
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
