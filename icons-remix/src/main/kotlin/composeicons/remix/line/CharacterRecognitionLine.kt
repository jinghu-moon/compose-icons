package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CharacterRecognitionLine: ImageVector
    get() {
        if (_characterRecognitionLine != null) return _characterRecognitionLine!!
        _characterRecognitionLine = remixIcon(
            name = "CharacterRecognitionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.998 15v4h4v2h-6v-6h2ZM20.998 15v6h-6v-2h4v-4h2ZM12.997 6l4.4 11h-2.155L14.041 14h-4.09L8.752 17h-2.154L10.997 6h2ZM11.997 8.885 10.75 12h2.492L11.997 8.885ZM8.998 3v2h-4v4h-2v-6h6ZM20.998 3v6h-2v-4h-4v-2h6Z"),
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
        return _characterRecognitionLine!!
    }

private var _characterRecognitionLine: ImageVector? = null
