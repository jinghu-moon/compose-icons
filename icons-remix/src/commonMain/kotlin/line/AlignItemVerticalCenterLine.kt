package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlignItemVerticalCenterLine: ImageVector
    get() {
        if (_alignItemVerticalCenterLine != null) return _alignItemVerticalCenterLine!!
        _alignItemVerticalCenterLine = remixIcon(
            name = "AlignItemVerticalCenterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 18.000 L 9.000 6.000 L 6.000 6.000 L 6.000 18.000 L 9.000 18.000 ZM 5.000 20.000 C 4.448 20.000 4.000 19.552 4.000 19.000 L 4.000 13.000 L 2.000 13.000 L 2.000 11.000 L 4.000 11.000 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000 L 10.000 4.000 C 10.552 4.000 11.000 4.448 11.000 5.000 L 11.000 11.000 L 13.000 11.000 L 13.000 7.000 C 13.000 6.448 13.448 6.000 14.000 6.000 L 19.000 6.000 C 19.552 6.000 20.000 6.448 20.000 7.000 L 20.000 11.000 L 22.000 11.000 L 22.000 13.000 L 20.000 13.000 L 20.000 17.000 C 20.000 17.552 19.552 18.000 19.000 18.000 L 14.000 18.000 C 13.448 18.000 13.000 17.552 13.000 17.000 L 13.000 13.000 L 11.000 13.000 L 11.000 19.000 C 11.000 19.552 10.552 20.000 10.000 20.000 L 5.000 20.000 ZM 15.000 16.000 L 18.000 16.000 L 18.000 8.000 L 15.000 8.000 L 15.000 16.000 Z"),
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
        return _alignItemVerticalCenterLine!!
    }

private var _alignItemVerticalCenterLine: ImageVector? = null
