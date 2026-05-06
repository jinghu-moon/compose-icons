package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UserSettingsLine: ImageVector
    get() {
        if (_userSettingsLine != null) return _userSettingsLine!!
        _userSettingsLine = remixIcon(
            name = "UserSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 14v2C8.686 16 6 18.686 6 22h-2c0-4.418 3.582-8 8-8ZM12 13C8.685 13 6 10.315 6 7 6 3.685 8.685 1 12 1c3.315 0 6 2.685 6 6 0 3.315-2.685 6-6 6ZM12 11c2.21 0 4-1.79 4-4C16 4.79 14.21 3 12 3 9.79 3 8 4.79 8 7c0 2.21 1.79 4 4 4ZM14.595 18.812c-.062-.26-.095-.532-.095-.812 0-.279 .033-.551 .094-.811l-.992-.573 1-1.732 .992 .573c.393-.372 .872-.653 1.405-.812v-1.145h2v1.145c.532 .158 1.012 .44 1.405 .812l.992-.573 1 1.732-.992 .573c.062 .26 .094 .532 .094 .812 0 .279-.033 .551-.094 .811l.992 .573-1 1.732-.992-.573c-.393 .372-.872 .654-1.405 .812v1.145h-2v-1.145c-.532-.158-1.012-.44-1.405-.812l-.992 .573L13.603 19.384l.992-.573ZM18 19.5c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5Z"),
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
        return _userSettingsLine!!
    }

private var _userSettingsLine: ImageVector? = null
