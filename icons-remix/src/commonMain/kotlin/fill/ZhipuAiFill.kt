package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ZhipuAiFill: ImageVector
    get() {
        if (_zhipuAiFill != null) return _zhipuAiFill!!
        _zhipuAiFill = remixIcon(
            name = "ZhipuAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.250 3.000 C 19.769 3.000 21.000 4.231 21.000 5.750 L 21.000 18.250 C 21.000 19.769 19.769 21.000 18.250 21.000 L 5.750 21.000 C 4.231 21.000 3.000 19.769 3.000 18.250 L 3.000 5.750 C 3.000 4.231 4.231 3.000 5.750 3.000 L 18.250 3.000 ZM 13.240 6.739 L 5.809 17.268 L 10.763 17.268 L 18.194 6.739 L 13.240 6.739 ZM 13.160 15.717 C 12.921 15.717 12.695 15.836 12.561 16.029 L 11.689 17.268 L 17.882 17.268 L 17.882 15.717 L 13.160 15.717 ZM 6.121 8.284 L 10.850 8.284 C 11.089 8.284 11.316 8.165 11.449 7.972 L 12.314 6.739 C 12.306 6.739 6.133 6.740 6.121 6.733 L 6.121 8.284 Z"),
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
        return _zhipuAiFill!!
    }

private var _zhipuAiFill: ImageVector? = null
