package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CharacterRecognitionFill: ImageVector
    get() {
        if (_characterRecognitionFill != null) return _characterRecognitionFill!!
        _characterRecognitionFill = remixIcon(
            name = "CharacterRecognitionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.998 3.000 L 20.998 21.000 L 2.998 21.000 L 2.998 3.000 L 20.998 3.000 ZM 12.997 6.000 L 10.997 6.000 L 6.598 17.000 L 8.752 17.000 L 9.951 14.000 L 14.041 14.000 L 15.242 17.000 L 17.397 17.000 L 12.997 6.000 ZM 11.997 8.885 L 13.242 12.000 L 10.750 12.000 L 11.997 8.885 Z"),
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
        return _characterRecognitionFill!!
    }

private var _characterRecognitionFill: ImageVector? = null
