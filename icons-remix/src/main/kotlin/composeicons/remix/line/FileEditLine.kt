package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileEditLine: ImageVector
    get() {
        if (_fileEditLine != null) return _fileEditLine!!
        _fileEditLine = remixIcon(
            name = "FileEditLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 6.757 19 8.757v-4.757h-9v5h-5v11h14v-2.757l2-2v5.766c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.55 3 20.993v-12.993L9.003 2h10.995C20.551 2 21 2.455 21 2.992v3.766ZM21.778 8.808l1.414 1.414L15.414 18l-1.416-.002L14 16.586 21.778 8.808Z"),
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
        return _fileEditLine!!
    }

private var _fileEditLine: ImageVector? = null
