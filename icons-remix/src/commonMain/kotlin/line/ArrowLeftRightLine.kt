package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowLeftRightLine: ImageVector
    get() {
        if (_arrowLeftRightLine != null) return _arrowLeftRightLine!!
        _arrowLeftRightLine = remixIcon(
            name = "ArrowLeftRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.050 12.050 L 21.000 17.000 L 16.050 21.949 L 14.636 20.535 L 17.172 17.999 L 4.000 18.000 L 4.000 16.000 L 17.172 15.999 L 14.636 13.464 L 16.050 12.050 ZM 7.950 2.050 L 9.364 3.464 L 6.828 5.999 L 20.000 6.000 L 20.000 8.000 L 6.828 7.999 L 9.364 10.535 L 7.950 11.949 L 3.000 7.000 L 7.950 2.050 Z"),
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
        return _arrowLeftRightLine!!
    }

private var _arrowLeftRightLine: ImageVector? = null
