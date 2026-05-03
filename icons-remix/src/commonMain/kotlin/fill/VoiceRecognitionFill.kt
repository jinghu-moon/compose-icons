package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VoiceRecognitionFill: ImageVector
    get() {
        if (_voiceRecognitionFill != null) return _voiceRecognitionFill!!
        _voiceRecognitionFill = remixIcon(
            name = "VoiceRecognitionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.998 3.000 L 20.998 21.000 L 2.998 21.000 L 2.998 3.000 L 20.998 3.000 ZM 12.998 6.000 L 10.998 6.000 L 10.998 18.000 L 12.998 18.000 L 12.998 6.000 ZM 8.998 9.000 L 6.998 9.000 L 6.998 15.000 L 8.998 15.000 L 8.998 9.000 ZM 16.998 9.000 L 14.998 9.000 L 14.998 15.000 L 16.998 15.000 L 16.998 9.000 Z"),
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
        return _voiceRecognitionFill!!
    }

private var _voiceRecognitionFill: ImageVector? = null
