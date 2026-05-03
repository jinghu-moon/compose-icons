package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AngularjsLine: ImageVector
    get() {
        if (_angularjsLine != null) return _angularjsLine!!
        _angularjsLine = remixIcon(
            name = "AngularjsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.524 16.651 L 18.013 16.379 L 19.132 6.669 L 12.000 4.124 L 4.869 6.669 L 5.988 16.379 L 6.462 16.642 L 12.000 4.210 L 17.524 16.651 ZM 16.425 17.260 L 15.626 17.260 L 14.458 14.340 L 9.523 14.340 L 8.354 17.260 L 7.576 17.260 L 12.000 19.713 L 16.425 17.260 ZM 12.000 2.000 L 21.300 5.320 L 19.882 17.630 L 12.000 22.000 L 4.119 17.630 L 2.700 5.320 L 12.000 2.000 ZM 13.698 12.540 L 12.000 8.450 L 10.302 12.540 L 13.698 12.540 Z"),
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
        return _angularjsLine!!
    }

private var _angularjsLine: ImageVector? = null
