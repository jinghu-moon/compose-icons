package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileSettingsFill: ImageVector
    get() {
        if (_fileSettingsFill != null) return _fileSettingsFill!!
        _fileSettingsFill = remixIcon(
            name = "FileSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5v14.008c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.445 2 3.993 2h12.007ZM8.595 12.811l-.992 .573 1 1.732 .992-.573c.393 .372 .872 .654 1.405 .812v1.145h2v-1.145c.532-.158 1.012-.44 1.405-.812l.992 .573 1-1.732-.992-.572c.062-.26 .094-.532 .094-.811 0-.279-.033-.551-.095-.811l.992-.573L15.397 8.884l-.992 .573C14.012 9.085 13.532 8.803 13 8.645v-1.145h-2v1.145c-.532 .158-1.012 .44-1.405 .812L8.603 8.884l-1 1.732 .992 .572c-.062 .26-.095 .532-.095 .811 0 .279 .033 .551 .095 .811ZM12 13.5c-.828 0-1.5-.672-1.5-1.5 0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5Z"),
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
        return _fileSettingsFill!!
    }

private var _fileSettingsFill: ImageVector? = null
