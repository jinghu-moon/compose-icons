package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SoundcloudFill: ImageVector
    get() {
        if (_soundcloudFill != null) return _soundcloudFill!!
        _soundcloudFill = remixIcon(
            name = "SoundcloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.464 8.596 C 10.729 8.596 10.944 10.702 10.944 13.300 L 10.943 13.651 C 10.924 16.085 10.717 18.004 10.464 18.004 C 10.208 18.004 9.999 16.039 9.985 13.564 L 9.984 13.212 C 9.989 10.655 10.202 8.596 10.464 8.596 ZM 8.800 9.556 C 9.059 9.556 9.269 11.356 9.280 13.610 L 9.280 13.950 C 9.269 16.204 9.059 18.004 8.800 18.004 C 8.545 18.004 8.336 16.249 8.321 14.034 L 8.320 13.695 L 8.322 13.354 C 8.347 11.221 8.551 9.556 8.800 9.556 ZM 7.136 9.556 C 7.391 9.556 7.600 11.311 7.615 13.526 L 7.616 13.865 L 7.614 14.206 C 7.589 16.339 7.385 18.004 7.136 18.004 C 6.877 18.004 6.667 16.204 6.656 13.950 L 6.656 13.610 C 6.667 11.356 6.877 9.556 7.136 9.556 ZM 5.472 10.132 C 5.737 10.132 5.952 11.894 5.952 14.068 L 5.950 14.403 C 5.930 16.420 5.723 18.004 5.472 18.004 C 5.210 18.004 4.998 16.287 4.992 14.153 L 4.992 13.984 C 4.998 11.849 5.210 10.132 5.472 10.132 ZM 3.808 11.860 C 4.073 11.860 4.288 13.235 4.288 14.932 L 4.287 15.090 C 4.275 16.713 4.065 18.004 3.808 18.004 C 3.543 18.004 3.328 16.629 3.328 14.932 L 3.329 14.774 C 3.341 13.151 3.551 11.860 3.808 11.860 ZM 14.592 7.060 C 17.173 7.060 19.313 8.946 19.710 11.415 C 20.005 11.330 20.317 11.284 20.640 11.284 C 22.496 11.284 24.000 12.788 24.000 14.644 C 24.000 16.479 22.530 17.970 20.703 18.003 L 20.640 18.004 L 12.480 18.004 C 12.056 18.004 11.712 17.660 11.712 17.236 L 11.712 7.933 C 12.536 7.382 13.526 7.060 14.592 7.060 ZM 2.144 11.668 C 2.409 11.668 2.624 13.000 2.624 14.644 L 2.623 14.800 C 2.610 16.371 2.401 17.620 2.144 17.620 C 1.883 17.620 1.671 16.330 1.664 14.722 L 1.664 14.644 C 1.664 13.000 1.879 11.668 2.144 11.668 ZM 0.480 12.628 C 0.745 12.628 0.960 13.574 0.960 14.740 L 0.959 14.871 C 0.944 15.976 0.735 16.852 0.480 16.852 C 0.215 16.852 0.000 15.906 0.000 14.740 L 0.001 14.609 C 0.016 13.504 0.225 12.628 0.480 12.628 Z"),
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
        return _soundcloudFill!!
    }

private var _soundcloudFill: ImageVector? = null
