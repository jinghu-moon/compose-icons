package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileSettingsLine: ImageVector
    get() {
        if (_fileSettingsLine != null) return _fileSettingsLine!!
        _fileSettingsLine = remixIcon(
            name = "FileSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.595 12.811C8.533 12.551 8.5 12.279 8.5 12c0-.279 .033-.551 .095-.811l-.992-.572 1-1.732 .992 .573c.393-.372 .872-.654 1.405-.812v-1.145h2v1.145c.532 .158 1.012 .44 1.405 .812l.992-.573 1 1.732-.992 .573c.062 .26 .095 .532 .095 .811 0 .279-.033 .551-.094 .811l.992 .572-1 1.732-.992-.573c-.393 .372-.872 .654-1.405 .812v1.145h-2v-1.145c-.532-.158-1.012-.44-1.405-.812l-.992 .573L7.603 13.384l.992-.573ZM12 13.5c.828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5-.828 0-1.5 .672-1.5 1.5 0 .828 .672 1.5 1.5 1.5ZM15 4h-10v16h14v-12h-4v-4ZM3 2.992C3 2.444 3.447 2 3.999 2h12.001l5 5L21 20.993c0 .556-.445 1.007-.993 1.007h-16.013C3.445 22 3 21.545 3 21.008v-18.016Z"),
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
        return _fileSettingsLine!!
    }

private var _fileSettingsLine: ImageVector? = null
