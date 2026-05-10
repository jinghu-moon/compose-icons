package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VoiceprintFill: ImageVector
    get() {
        if (_voiceprintFill != null) return _voiceprintFill!!
        _voiceprintFill = remixIcon(
            name = "VoiceprintFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 7h2v10h-2v-10ZM1 10h2v4h-2v-4ZM9 2h2v18h-2v-18ZM13 4h2v18h-2v-18ZM17 7h2v10h-2v-10ZM21 10h2v4h-2v-4Z"),
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
        return _voiceprintFill!!
    }

private var _voiceprintFill: ImageVector? = null
