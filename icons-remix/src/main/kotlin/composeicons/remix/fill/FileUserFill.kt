package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileUserFill: ImageVector
    get() {
        if (_fileUserFill != null) return _fileUserFill!!
        _fileUserFill = remixIcon(
            name = "FileUserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5v14.008c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.445 2 3.993 2h12.007ZM12 11.5c1.381 0 2.5-1.119 2.5-2.5C14.5 7.619 13.381 6.5 12 6.5 10.619 6.5 9.5 7.619 9.5 9c0 1.381 1.119 2.5 2.5 2.5ZM7.527 17h8.945C16.224 14.75 14.316 13 12 13 9.684 13 7.776 14.75 7.527 17Z"),
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
        return _fileUserFill!!
    }

private var _fileUserFill: ImageVector? = null
