package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.File2Line: ImageVector
    get() {
        if (_file2Line != null) return _file2Line!!
        _file2Line = remixIcon(
            name = "File2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 8 9.003 2h10.995C20.551 2 21 2.455 21 2.992v18.016c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.55 3 20.993v-12.993ZM10 4v5h-5v11h14v-16h-9Z"),
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
        return _file2Line!!
    }

private var _file2Line: ImageVector? = null
