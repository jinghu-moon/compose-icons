package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileSearchFill: ImageVector
    get() {
        if (_fileSearchFill != null) return _fileSearchFill!!
        _fileSearchFill = remixIcon(
            name = "FileSearchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5v14.008c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.445 2 3.993 2h12.007ZM13.529 14.446l2.21 2.211 1.414-1.414L14.943 13.032c.906-1.534 .7-3.543-.618-4.861C12.763 6.609 10.231 6.609 8.668 8.172c-1.562 1.562-1.562 4.095 0 5.657 1.318 1.318 3.327 1.524 4.861 .618ZM12.911 12.414c-.781 .781-2.047 .781-2.828 0-.781-.781-.781-2.047 0-2.828 .781-.781 2.047-.781 2.828 0 .781 .781 .781 2.047 0 2.828Z"),
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
        return _fileSearchFill!!
    }

private var _fileSearchFill: ImageVector? = null
