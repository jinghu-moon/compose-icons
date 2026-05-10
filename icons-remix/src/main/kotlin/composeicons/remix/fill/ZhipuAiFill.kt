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
                pathData = parseSvgPathData("M18.25 3C19.769 3 21 4.231 21 5.75v12.5C21 19.769 19.769 21 18.25 21h-12.5C4.231 21 3 19.769 3 18.25v-12.5C3 4.231 4.231 3 5.75 3h12.5ZM13.24 6.739 5.809 17.268h4.954L18.194 6.739h-4.954ZM13.16 15.717c-.24 0-.465 .12-.599 .313l-.873 1.238h6.193v-1.551h-4.722ZM6.121 8.284h4.729c.24-0 .467-.119 .6-.312l.865-1.232c-.008 0-6.182 .001-6.193-.006v1.551Z"),
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
