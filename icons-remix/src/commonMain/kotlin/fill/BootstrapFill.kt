package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BootstrapFill: ImageVector
    get() {
        if (_bootstrapFill != null) return _bootstrapFill!!
        _bootstrapFill = remixIcon(
            name = "BootstrapFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.423 3.038 C 4.139 3.038 3.190 4.162 3.232 5.380 C 3.273 6.551 3.220 8.068 2.838 9.304 C 2.455 10.544 1.808 11.330 0.750 11.431 L 0.750 12.569 C 1.808 12.670 2.455 13.456 2.838 14.696 C 3.220 15.933 3.273 17.449 3.232 18.620 C 3.190 19.838 4.139 20.962 5.424 20.962 L 18.578 20.962 C 19.862 20.962 20.812 19.838 20.770 18.620 C 20.729 17.449 20.782 15.933 21.163 14.696 C 21.546 13.456 22.192 12.670 23.250 12.569 L 23.250 11.431 C 22.192 11.330 21.546 10.544 21.163 9.304 C 20.782 8.068 20.729 6.551 20.770 5.380 C 20.812 4.162 19.862 3.038 18.578 3.038 L 5.423 3.038 L 5.423 3.038 ZM 16.004 14.071 C 16.004 15.749 14.753 16.767 12.676 16.767 L 9.140 16.767 C 9.039 16.767 8.942 16.727 8.870 16.655 C 8.799 16.584 8.758 16.487 8.758 16.386 L 8.758 7.614 C 8.758 7.513 8.799 7.416 8.870 7.345 C 8.942 7.273 9.039 7.233 9.140 7.233 L 12.655 7.233 C 14.387 7.233 15.524 8.171 15.524 9.612 C 15.524 10.623 14.759 11.528 13.785 11.686 L 13.785 11.739 C 15.111 11.884 16.004 12.803 16.004 14.071 ZM 12.290 8.442 L 10.274 8.442 L 10.274 11.290 L 11.972 11.290 C 13.285 11.290 14.008 10.761 14.008 9.816 C 14.008 8.931 13.386 8.442 12.290 8.442 ZM 10.274 12.420 L 10.274 15.558 L 12.364 15.558 C 13.731 15.558 14.455 15.009 14.455 13.979 C 14.455 12.948 13.711 12.419 12.276 12.419 L 10.274 12.420 Z"),
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
        return _bootstrapFill!!
    }

private var _bootstrapFill: ImageVector? = null
