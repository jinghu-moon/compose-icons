package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VoiceRecognitionLine: ImageVector
    get() {
        if (_voiceRecognitionLine != null) return _voiceRecognitionLine!!
        _voiceRecognitionLine = remixIcon(
            name = "VoiceRecognitionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.998 15v4h4v2h-6v-6h2ZM20.998 15v6h-6v-2h4v-4h2ZM12.998 6v12h-2v-12h2ZM8.998 9v6h-2v-6h2ZM16.998 9v6h-2v-6h2ZM8.998 3v2h-4v4h-2v-6h6ZM20.998 3v6h-2v-4h-4v-2h6Z"),
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
        return _voiceRecognitionLine!!
    }

private var _voiceRecognitionLine: ImageVector? = null
