package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AirplayFill: ImageVector
    get() {
        if (_airplayFill != null) return _airplayFill!!
        _airplayFill = remixIcon(
            name = "AirplayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.4 13.533l5 6.667c.166 .221 .121 .534-.1 .7C17.213 20.965 17.108 21 17 21h-10c-.276 0-.5-.224-.5-.5 0-.108 .035-.213 .1-.3l5-6.667c.166-.221 .479-.266 .7-.1 .038 .028 .072 .062 .1 .1ZM18 19v-2h2v-12h-16v12h2v2h-3.008C2.444 19 2 18.555 2 17.999v-13.998C2 3.448 2.455 3 2.992 3h18.016c.548 0 .992 .445 .992 1.001v13.998c0 .553-.455 1.001-.992 1.001h-3.008Z"),
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
        return _airplayFill!!
    }

private var _airplayFill: ImageVector? = null
