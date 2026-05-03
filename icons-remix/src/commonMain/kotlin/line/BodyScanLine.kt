package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BodyScanLine: ImageVector
    get() {
        if (_bodyScanLine != null) return _bodyScanLine!!
        _bodyScanLine = remixIcon(
            name = "BodyScanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 16.000 L 4.000 20.000 L 8.000 20.000 L 8.000 22.000 L 2.000 22.000 L 2.000 16.000 L 4.000 16.000 ZM 22.000 16.000 L 22.000 22.000 L 16.000 22.000 L 16.000 20.000 L 20.000 20.000 L 20.000 16.000 L 22.000 16.000 ZM 7.500 7.000 C 7.500 9.142 8.996 10.934 11.000 11.389 L 11.000 17.000 L 13.000 17.000 L 13.001 11.388 C 15.005 10.933 16.500 9.141 16.500 7.000 L 18.500 7.000 C 18.500 9.507 17.080 11.683 15.001 12.767 L 15.000 19.000 L 9.000 19.000 L 9.000 12.768 C 6.920 11.684 5.500 9.508 5.500 7.000 L 7.500 7.000 ZM 12.000 5.000 C 13.381 5.000 14.500 6.119 14.500 7.500 C 14.500 8.881 13.381 10.000 12.000 10.000 C 10.619 10.000 9.500 8.881 9.500 7.500 C 9.500 6.119 10.619 5.000 12.000 5.000 ZM 8.000 2.000 L 8.000 4.000 L 4.000 3.999 L 4.000 8.000 L 2.000 8.000 L 2.000 2.000 L 8.000 2.000 ZM 22.000 2.000 L 22.000 8.000 L 20.000 8.000 L 20.000 4.000 L 16.000 4.000 L 16.000 2.000 L 22.000 2.000 Z"),
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
        return _bodyScanLine!!
    }

private var _bodyScanLine: ImageVector? = null
