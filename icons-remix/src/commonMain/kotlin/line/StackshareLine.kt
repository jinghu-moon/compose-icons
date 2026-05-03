package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StackshareLine: ImageVector
    get() {
        if (_stackshareLine != null) return _stackshareLine!!
        _stackshareLine = remixIcon(
            name = "StackshareLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.537 13.000 L 7.330 13.001 C 6.918 14.166 5.807 15.000 4.501 15.000 C 2.844 15.000 1.501 13.657 1.501 12.000 C 1.501 10.343 2.844 9.000 4.501 9.000 C 5.807 9.000 6.918 9.835 7.330 11.000 L 9.537 11.000 L 13.001 5.000 L 16.172 5.000 C 16.583 3.835 17.695 3.000 19.001 3.000 C 20.658 3.000 22.001 4.343 22.001 6.000 C 22.001 7.657 20.658 9.000 19.001 9.000 C 17.695 9.000 16.584 8.166 16.172 7.001 L 14.155 7.000 L 11.269 11.999 L 14.156 17.000 L 16.172 17.000 C 16.583 15.835 17.695 15.000 19.001 15.000 C 20.658 15.000 22.001 16.343 22.001 18.000 C 22.001 19.657 20.658 21.000 19.001 21.000 C 17.695 21.000 16.584 20.166 16.172 19.001 L 13.001 19.000 L 9.537 13.000 ZM 19.001 17.000 C 18.449 17.000 18.001 17.448 18.001 18.000 C 18.001 18.552 18.449 19.000 19.001 19.000 C 19.553 19.000 20.001 18.552 20.001 18.000 C 20.001 17.448 19.553 17.000 19.001 17.000 ZM 4.501 11.000 C 3.949 11.000 3.501 11.448 3.501 12.000 C 3.501 12.552 3.949 13.000 4.501 13.000 C 5.053 13.000 5.501 12.552 5.501 12.000 C 5.501 11.448 5.053 11.000 4.501 11.000 ZM 19.001 5.000 C 18.449 5.000 18.001 5.448 18.001 6.000 C 18.001 6.552 18.449 7.000 19.001 7.000 C 19.553 7.000 20.001 6.552 20.001 6.000 C 20.001 5.448 19.553 5.000 19.001 5.000 Z"),
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
        return _stackshareLine!!
    }

private var _stackshareLine: ImageVector? = null
