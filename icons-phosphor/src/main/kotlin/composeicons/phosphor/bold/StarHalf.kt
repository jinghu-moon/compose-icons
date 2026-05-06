package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorBoldIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.9 117.88l-5.06 4.36c-4.769 4.157-11.946 3.897-16.403-.593-4.456-4.491-4.661-11.67-.467-16.407-6.605-.552-11.512-6.355-10.96-12.96 .552-6.605 6.355-11.512 12.96-10.96l8.27 .67c8.21 .681 15.21 6.223 17.757 14.058 2.547 7.835 .144 16.433-6.097 21.812ZM172.53 141.7c-3.394 2.926-4.875 7.5-3.84 11.86l4.08 17.22c.946 4.217 4.087 7.6 8.223 8.855 4.136 1.255 8.627 .19 11.758-2.79 3.131-2.98 4.418-7.413 3.369-11.605l-2.4-10.12 6.12-5.28c4.839-4.37 5.303-11.805 1.044-16.743-4.258-4.938-11.68-5.572-16.714-1.427ZM205.6 205.25c-1.403-5.965-7.074-9.915-13.155-9.162-6.081 .752-10.619 5.966-10.525 12.092-5.688-3.179-12.874-1.238-16.188 4.373-3.313 5.611-1.543 12.841 3.988 16.287l6.71 4.13c7.033 4.317 15.974 3.969 22.651-.881 6.676-4.85 9.771-13.246 7.839-21.269ZM175 102l-15.64-1.26c-4.495-.361-8.408-3.212-10.13-7.38L140 70.94v111.45l5.53 3.4c5.374 3.574 6.958 10.758 3.587 16.261-3.372 5.503-10.492 7.354-16.117 4.189l-5-3.05L79.57 233c-7.033 4.317-15.974 3.969-22.651-.881-6.676-4.85-9.771-13.246-7.839-21.269L62.28 155.15 19.1 117.88C12.853 112.504 10.444 103.903 12.99 96.065 15.535 88.226 22.537 82.681 30.75 82L87.35 77.43 109.17 24.61C112.309 16.976 119.746 11.993 128 11.993c8.254 0 15.691 4.983 18.83 12.617l21.82 52.82 8.32 .67c6.394 .784 11.029 6.476 10.499 12.897C186.94 97.417 181.436 102.274 175 102ZM116 182.36v-111.42l-9.27 22.45c-1.722 4.168-5.635 7.019-10.13 7.38l-55.4 4.47 42.27 36.46c3.394 2.926 4.875 7.5 3.84 11.86L74.42 208Z"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
