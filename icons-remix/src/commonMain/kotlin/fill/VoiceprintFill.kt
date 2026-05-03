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
                pathData = parseSvgPathData("M 5.000 7.000 L 7.000 7.000 L 7.000 17.000 L 5.000 17.000 L 5.000 7.000 ZM 1.000 10.000 L 3.000 10.000 L 3.000 14.000 L 1.000 14.000 L 1.000 10.000 ZM 9.000 2.000 L 11.000 2.000 L 11.000 20.000 L 9.000 20.000 L 9.000 2.000 ZM 13.000 4.000 L 15.000 4.000 L 15.000 22.000 L 13.000 22.000 L 13.000 4.000 ZM 17.000 7.000 L 19.000 7.000 L 19.000 17.000 L 17.000 17.000 L 17.000 7.000 ZM 21.000 10.000 L 23.000 10.000 L 23.000 14.000 L 21.000 14.000 L 21.000 10.000 Z"),
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
