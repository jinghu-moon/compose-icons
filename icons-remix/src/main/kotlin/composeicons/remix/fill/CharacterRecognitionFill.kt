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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.998 3v18h-18v-18h18ZM12.997 6h-2L6.598 17h2.154L9.951 14h4.09l1.201 3h2.155L12.997 6ZM11.997 8.885 13.242 12h-2.492L11.997 8.885Z"),
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
        return _characterRecognitionFill!!
    }

private var _characterRecognitionFill: ImageVector? = null
