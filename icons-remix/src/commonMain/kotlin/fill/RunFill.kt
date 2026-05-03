package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RunFill: ImageVector
    get() {
        if (_runFill != null) return _runFill!!
        _runFill = remixIcon(
            name = "RunFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.830 8.790 L 8.000 9.456 L 8.000 13.000 L 6.000 13.000 L 6.000 8.050 L 6.015 8.050 L 11.283 6.132 C 11.527 6.039 11.792 5.992 12.065 6.001 C 13.176 6.028 14.152 6.757 14.492 7.820 C 14.678 8.404 14.848 8.798 15.002 9.002 C 15.914 10.215 17.365 11.000 19.000 11.000 L 19.000 13.000 C 16.825 13.000 14.882 12.008 13.598 10.453 L 13.017 13.750 L 15.000 15.670 L 15.000 23.000 L 13.000 23.000 L 13.000 17.014 L 10.951 15.027 L 10.003 19.325 L 3.109 18.110 L 3.457 16.140 L 8.381 17.008 L 9.830 8.790 ZM 13.500 5.500 C 12.395 5.500 11.500 4.605 11.500 3.500 C 11.500 2.395 12.395 1.500 13.500 1.500 C 14.605 1.500 15.500 2.395 15.500 3.500 C 15.500 4.605 14.605 5.500 13.500 5.500 Z"),
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
        return _runFill!!
    }

private var _runFill: ImageVector? = null
