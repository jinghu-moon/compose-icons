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
                pathData = parseSvgPathData("M 4.998 15.000 L 4.998 19.000 L 8.998 19.000 L 8.998 21.000 L 2.998 21.000 L 2.998 15.000 L 4.998 15.000 ZM 20.998 15.000 L 20.998 21.000 L 14.998 21.000 L 14.998 19.000 L 18.998 19.000 L 18.998 15.000 L 20.998 15.000 ZM 12.997 6.000 L 17.397 17.000 L 15.242 17.000 L 14.041 14.000 L 9.951 14.000 L 8.752 17.000 L 6.598 17.000 L 10.997 6.000 L 12.997 6.000 ZM 11.997 8.885 L 10.750 12.000 L 13.242 12.000 L 11.997 8.885 ZM 8.998 3.000 L 8.998 5.000 L 4.998 5.000 L 4.998 9.000 L 2.998 9.000 L 2.998 3.000 L 8.998 3.000 ZM 20.998 3.000 L 20.998 9.000 L 18.998 9.000 L 18.998 5.000 L 14.998 5.000 L 14.998 3.000 L 20.998 3.000 Z"),
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
