package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NeteaseCloudMusicFill: ImageVector
    get() {
        if (_neteaseCloudMusicFill != null) return _neteaseCloudMusicFill!!
        _neteaseCloudMusicFill = remixIcon(
            name = "NeteaseCloudMusicFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 ZM 10.915 11.568 C 11.156 10.727 11.990 10.027 12.905 9.920 C 13.092 10.614 13.293 11.293 13.450 11.983 C 13.503 12.213 13.487 12.478 13.432 12.710 C 13.219 13.602 12.184 13.952 11.454 13.395 C 10.923 12.990 10.712 12.276 10.915 11.568 ZM 14.732 11.371 C 14.607 10.906 14.476 10.444 14.339 9.951 C 14.839 10.081 15.247 10.311 15.594 10.649 C 16.851 11.870 16.979 13.949 15.888 15.380 C 14.753 16.870 12.733 17.514 10.860 16.985 C 8.558 16.334 7.052 14.033 7.419 11.669 C 7.693 9.901 8.689 8.665 10.319 7.936 C 10.726 7.754 10.899 7.376 10.739 7.006 C 10.582 6.642 10.198 6.502 9.795 6.663 C 7.074 7.752 5.474 10.797 6.126 13.650 C 6.838 16.768 9.620 18.812 12.800 18.509 C 14.532 18.344 15.964 17.561 17.016 16.162 C 18.522 14.160 18.313 11.379 16.553 9.663 C 15.887 9.013 15.082 8.645 14.164 8.510 C 14.080 8.497 13.946 8.458 13.931 8.404 C 13.844 8.091 13.751 7.772 13.725 7.450 C 13.696 7.093 14.014 6.809 14.375 6.805 C 14.628 6.802 14.809 6.936 14.978 7.105 C 15.281 7.405 15.682 7.427 15.966 7.167 C 16.255 6.903 16.262 6.489 15.984 6.159 C 15.418 5.487 14.398 5.268 13.554 5.636 C 12.707 6.006 12.233 6.823 12.355 7.729 C 12.392 8.010 12.464 8.286 12.521 8.571 C 12.430 8.596 12.345 8.620 12.260 8.643 C 11.405 8.882 10.700 9.347 10.163 10.057 C 9.242 11.278 9.227 12.885 10.122 14.004 C 11.396 15.598 13.869 15.288 14.645 13.436 C 14.929 12.759 14.920 12.068 14.732 11.371 Z"),
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
        return _neteaseCloudMusicFill!!
    }

private var _neteaseCloudMusicFill: ImageVector? = null
