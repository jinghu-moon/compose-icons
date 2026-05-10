package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderSettingsFill: ImageVector
    get() {
        if (_folderSettingsFill != null) return _folderSettingsFill!!
        _folderSettingsFill = remixIcon(
            name = "FolderSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM8.591 13.809l-.991 .572 1 1.731 .992-.573c.393 .372 .872 .653 1.404 .812v1.144h1.999v-1.144c.532-.158 1.011-.44 1.404-.812l.992 .573 .999-1.731-.991-.572c.062-.26 .095-.532 .095-.811 0-.279-.033-.551-.095-.811l.991-.572L15.39 9.883l-.992 .573c-.393-.372-.872-.653-1.404-.812v-1.144h-1.999v1.144c-.532 .158-1.011 .44-1.404 .812L8.599 9.883l-1 1.731 .991 .572c-.062 .26-.094 .532-.094 .811 0 .279 .033 .551 .095 .811ZM11.995 14.497c-.828 0-1.499-.671-1.499-1.499 0-.828 .671-1.499 1.499-1.499 .828 0 1.499 .671 1.499 1.499 0 .828-.671 1.499-1.499 1.499Z"),
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
        return _folderSettingsFill!!
    }

private var _folderSettingsFill: ImageVector? = null
