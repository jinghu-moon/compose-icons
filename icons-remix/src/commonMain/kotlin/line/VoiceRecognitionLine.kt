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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.998 15.000 L 4.998 19.000 L 8.998 19.000 L 8.998 21.000 L 2.998 21.000 L 2.998 15.000 L 4.998 15.000 ZM 20.998 15.000 L 20.998 21.000 L 14.998 21.000 L 14.998 19.000 L 18.998 19.000 L 18.998 15.000 L 20.998 15.000 ZM 12.998 6.000 L 12.998 18.000 L 10.998 18.000 L 10.998 6.000 L 12.998 6.000 ZM 8.998 9.000 L 8.998 15.000 L 6.998 15.000 L 6.998 9.000 L 8.998 9.000 ZM 16.998 9.000 L 16.998 15.000 L 14.998 15.000 L 14.998 9.000 L 16.998 9.000 ZM 8.998 3.000 L 8.998 5.000 L 4.998 5.000 L 4.998 9.000 L 2.998 9.000 L 2.998 3.000 L 8.998 3.000 ZM 20.998 3.000 L 20.998 9.000 L 18.998 9.000 L 18.998 5.000 L 14.998 5.000 L 14.998 3.000 L 20.998 3.000 Z"),
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
        return _voiceRecognitionLine!!
    }

private var _voiceRecognitionLine: ImageVector? = null
