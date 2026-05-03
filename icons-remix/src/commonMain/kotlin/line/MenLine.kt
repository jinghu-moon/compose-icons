package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenLine: ImageVector
    get() {
        if (_menLine != null) return _menLine!!
        _menLine = remixIcon(
            name = "MenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.049 8.537 L 18.586 5.000 L 14.000 5.000 L 14.000 3.000 L 22.000 3.000 L 22.000 11.000 L 20.000 11.000 L 20.000 6.414 L 16.463 9.951 C 17.427 11.213 18.000 12.790 18.000 14.500 C 18.000 18.642 14.642 22.000 10.500 22.000 C 6.358 22.000 3.000 18.642 3.000 14.500 C 3.000 10.358 6.358 7.000 10.500 7.000 C 12.210 7.000 13.787 7.573 15.049 8.537 ZM 10.500 20.000 C 13.538 20.000 16.000 17.538 16.000 14.500 C 16.000 11.462 13.538 9.000 10.500 9.000 C 7.462 9.000 5.000 11.462 5.000 14.500 C 5.000 17.538 7.462 20.000 10.500 20.000 Z"),
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
        return _menLine!!
    }

private var _menLine: ImageVector? = null
