package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FootballFill: ImageVector
    get() {
        if (_footballFill != null) return _footballFill!!
        _footballFill = remixIcon(
            name = "FootballFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 13.670 16.000 L 10.330 16.000 L 8.951 17.897 L 9.504 19.603 C 10.290 19.861 11.129 20.000 12.000 20.000 C 12.871 20.000 13.710 19.861 14.496 19.603 L 15.049 17.897 L 13.670 16.000 ZM 5.294 10.872 L 4.002 11.809 L 4.000 12.000 C 4.000 13.730 4.549 15.331 5.482 16.640 L 7.393 16.640 L 8.715 14.820 L 7.687 11.650 L 5.294 10.872 ZM 18.705 10.872 L 16.312 11.650 L 15.285 14.820 L 16.607 16.640 L 18.518 16.640 C 19.451 15.331 20.000 13.730 20.000 12.000 L 19.997 11.809 L 18.705 10.872 ZM 14.291 4.333 L 13.000 5.273 L 13.000 7.790 L 15.693 9.747 L 17.933 9.020 L 18.487 7.317 C 17.467 5.907 15.999 4.843 14.291 4.333 ZM 9.709 4.333 C 8.001 4.843 6.532 5.907 5.513 7.318 L 6.067 9.020 L 8.306 9.747 L 11.000 7.790 L 11.000 5.273 L 9.709 4.333 Z"),
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
        return _footballFill!!
    }

private var _footballFill: ImageVector? = null
