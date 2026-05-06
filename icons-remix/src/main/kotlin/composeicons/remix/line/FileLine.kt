package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileLine: ImageVector
    get() {
        if (_fileLine != null) return _fileLine!!
        _fileLine = remixIcon(
            name = "FileLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 2.003v-.003h10.998C20.551 2 21 2.455 21 2.992v18.016c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.55 3 20.993v-12.993L9 2.003ZM5.829 8h3.171v-3.169L5.829 8ZM11 4v5c0 .552-.448 1-1 1h-5v10h14v-16h-8Z"),
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
        return _fileLine!!
    }

private var _fileLine: ImageVector? = null
