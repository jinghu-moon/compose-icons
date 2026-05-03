package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MiniProgramFill: ImageVector
    get() {
        if (_miniProgramFill != null) return _miniProgramFill!!
        _miniProgramFill = remixIcon(
            name = "MiniProgramFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.841 12.691 C 15.818 12.698 15.797 12.704 15.774 12.710 C 15.638 12.749 15.499 12.773 15.360 12.773 C 14.750 12.773 14.406 12.361 14.591 11.852 C 14.726 11.480 15.081 11.166 15.515 11.021 C 16.187 10.776 16.657 10.217 16.657 9.566 C 16.657 8.689 15.804 7.979 14.752 7.979 C 13.700 7.979 12.847 8.689 12.847 9.566 L 12.847 14.434 C 12.847 15.605 12.169 16.631 11.154 17.212 C 10.601 17.528 9.950 17.714 9.250 17.714 C 7.266 17.714 5.652 16.243 5.652 14.434 C 5.652 13.858 5.816 13.317 6.103 12.847 C 6.547 12.118 7.287 11.560 8.173 11.306 C 8.325 11.258 8.480 11.233 8.632 11.233 C 9.245 11.233 9.591 11.647 9.406 12.157 C 9.280 12.503 8.940 12.802 8.545 12.960 C 8.498 12.976 8.452 12.994 8.406 13.012 C 7.778 13.272 7.345 13.810 7.345 14.434 C 7.345 15.311 8.198 16.021 9.250 16.021 C 10.302 16.021 11.154 15.311 11.154 14.434 L 11.154 9.566 C 11.154 8.395 11.833 7.369 12.847 6.788 C 13.401 6.472 14.052 6.286 14.752 6.286 C 16.736 6.286 18.350 7.757 18.350 9.566 C 18.350 10.142 18.185 10.683 17.899 11.153 C 17.457 11.879 16.721 12.435 15.841 12.691 ZM 2.001 12.000 C 2.001 17.523 6.478 22.000 12.001 22.000 C 17.524 22.000 22.001 17.523 22.001 12.000 C 22.001 6.477 17.524 2.000 12.001 2.000 C 6.478 2.000 2.001 6.477 2.001 12.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _miniProgramFill!!
    }

private var _miniProgramFill: ImageVector? = null
