package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlobalOffLine: ImageVector
    get() {
        if (_globalOffLine != null) return _globalOffLine!!
        _globalOffLine = remixIcon(
            name = "GlobalOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.036 16.379 L 19.914 18.500 L 22.036 20.622 L 20.622 22.036 L 18.500 19.914 L 16.379 22.036 L 14.965 20.622 L 17.086 18.500 L 14.965 16.379 L 16.379 14.965 L 18.500 17.086 L 20.622 14.965 L 22.036 16.379 ZM 12.479 2.012 C 17.780 2.262 22.000 6.638 22.000 12.000 L 22.000 13.000 L 10.033 13.000 C 10.190 15.539 10.936 17.915 12.139 19.996 C 12.221 19.995 12.302 19.995 12.384 19.991 C 12.554 19.983 12.723 19.970 12.890 19.951 L 13.110 21.940 C 12.902 21.962 12.691 21.978 12.479 21.988 C 12.320 21.996 12.160 22.000 12.000 22.000 C 11.840 22.000 11.680 21.996 11.521 21.988 C 6.220 21.738 2.000 17.362 2.000 12.000 C 2.000 6.638 6.220 2.262 11.521 2.012 C 11.680 2.004 11.840 2.000 12.000 2.000 C 12.160 2.000 12.320 2.004 12.479 2.012 ZM 4.064 13.000 C 4.461 16.177 6.718 18.776 9.713 19.668 C 8.750 17.626 8.160 15.374 8.030 13.000 L 4.064 13.000 ZM 9.713 4.331 C 6.718 5.223 4.461 7.823 4.064 11.000 L 8.030 11.000 C 8.160 8.626 8.750 6.374 9.713 4.331 ZM 12.000 4.252 C 10.879 6.273 10.184 8.561 10.033 11.000 L 13.967 11.000 C 13.816 8.561 13.121 6.273 12.000 4.252 ZM 14.286 4.331 C 15.250 6.374 15.840 8.626 15.970 11.000 L 19.935 11.000 C 19.539 7.822 17.281 5.223 14.286 4.331 Z"),
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
        return _globalOffLine!!
    }

private var _globalOffLine: ImageVector? = null
