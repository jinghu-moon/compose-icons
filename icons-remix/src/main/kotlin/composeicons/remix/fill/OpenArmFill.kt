package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.OpenArmFill: ImageVector
    get() {
        if (_openArmFill != null) return _openArmFill!!
        _openArmFill = remixIcon(
            name = "OpenArmFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 12C9.239 12 7 9.761 7 7c0-2.761 2.239-5 5-5 2.762 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM18 17v5h-2v-5c0-4.451 2.644-8.285 6.447-10.016l.828 1.821C20.164 10.221 18 13.358 18 17ZM8 17v5h-2v-5C6 13.358 3.837 10.221 .726 8.805L1.553 6.984C5.357 8.715 8 12.549 8 17Z"),
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
        return _openArmFill!!
    }

private var _openArmFill: ImageVector? = null
