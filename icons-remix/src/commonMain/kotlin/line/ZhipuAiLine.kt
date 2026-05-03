package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZhipuAiLine: ImageVector
    get() {
        if (_zhipuAiLine != null) return _zhipuAiLine!!
        _zhipuAiLine = remixIcon(
            name = "ZhipuAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.531 3.015 C 19.918 3.156 21.000 4.326 21.000 5.750 L 21.000 18.250 L 20.985 18.531 C 20.844 19.918 19.674 21.000 18.250 21.000 L 5.750 21.000 C 4.231 21.000 3.000 19.769 3.000 18.250 L 3.000 5.750 C 3.000 4.326 4.082 3.156 5.469 3.015 L 5.750 3.000 L 18.250 3.000 L 18.531 3.015 ZM 5.750 5.000 C 5.336 5.000 5.000 5.336 5.000 5.750 L 5.000 18.250 C 5.000 18.664 5.336 19.000 5.750 19.000 L 18.250 19.000 C 18.664 19.000 19.000 18.664 19.000 18.250 L 19.000 5.750 C 19.000 5.336 18.664 5.000 18.250 5.000 L 5.750 5.000 ZM 10.763 17.268 L 5.809 17.268 L 13.240 6.739 L 18.194 6.739 L 10.763 17.268 ZM 17.882 17.268 L 11.689 17.268 L 12.561 16.029 C 12.695 15.836 12.921 15.717 13.160 15.717 L 17.882 15.717 L 17.882 17.268 ZM 12.314 6.739 L 11.449 7.972 C 11.316 8.165 11.089 8.284 10.850 8.284 L 6.121 8.284 L 6.121 6.733 C 6.133 6.740 12.306 6.739 12.314 6.739 Z"),
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
        return _zhipuAiLine!!
    }

private var _zhipuAiLine: ImageVector? = null
