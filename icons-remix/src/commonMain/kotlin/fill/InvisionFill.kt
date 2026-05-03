package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InvisionFill: ImageVector
    get() {
        if (_invisionFill != null) return _invisionFill!!
        _invisionFill = remixIcon(
            name = "InvisionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.001 3.000 L 20.001 3.000 C 20.553 3.000 21.001 3.448 21.001 4.000 L 21.001 20.000 C 21.001 20.552 20.553 21.000 20.001 21.000 L 4.001 21.000 C 3.449 21.000 3.001 20.552 3.001 20.000 L 3.001 4.000 C 3.001 3.448 3.449 3.000 4.001 3.000 ZM 6.989 14.065 C 6.928 14.332 6.898 14.620 6.898 14.855 C 6.898 15.782 7.381 16.397 8.407 16.397 C 9.258 16.397 9.948 15.871 10.445 15.022 L 10.142 16.289 L 11.832 16.289 L 12.798 12.258 C 13.040 11.237 13.507 10.707 14.217 10.707 C 14.775 10.707 15.122 11.069 15.122 11.665 C 15.122 11.838 15.107 12.026 15.047 12.230 L 14.549 14.083 C 14.473 14.350 14.443 14.617 14.443 14.868 C 14.443 15.748 14.941 16.391 15.982 16.391 C 16.873 16.391 17.582 15.795 17.975 14.366 L 17.311 14.099 C 16.979 15.057 16.692 15.230 16.465 15.230 C 16.239 15.230 16.118 15.073 16.118 14.759 C 16.118 14.618 16.149 14.461 16.194 14.272 L 16.677 12.467 C 16.797 12.043 16.843 11.667 16.843 11.322 C 16.843 9.971 16.058 9.267 15.107 9.267 C 14.217 9.267 13.311 10.102 12.858 10.982 L 13.190 9.403 L 10.610 9.403 L 10.248 10.794 L 11.455 10.794 L 10.711 13.891 C 10.127 15.241 9.055 15.263 8.920 15.231 C 8.699 15.180 8.558 15.092 8.558 14.793 C 8.558 14.621 8.588 14.373 8.664 14.075 L 9.796 9.403 L 6.928 9.403 L 6.566 10.794 L 7.758 10.794 L 6.989 14.065 ZM 8.626 8.625 C 9.247 8.625 9.751 8.121 9.751 7.500 C 9.751 6.879 9.247 6.375 8.626 6.375 C 8.005 6.375 7.501 6.879 7.501 7.500 C 7.501 8.121 8.005 8.625 8.626 8.625 Z"),
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
        return _invisionFill!!
    }

private var _invisionFill: ImageVector? = null
