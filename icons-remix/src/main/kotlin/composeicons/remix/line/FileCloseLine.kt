package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileCloseLine: ImageVector
    get() {
        if (_fileCloseLine != null) return _fileCloseLine!!
        _fileCloseLine = remixIcon(
            name = "FileCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22v-2h-7v-16h10v4h4v5h2v-6L16 2h-12.001C3.447 2 3 2.444 3 2.992v18.016c0 .537 .445 .992 .993 .992h8.007ZM21.536 21.121 19.414 19l2.121-2.121L20.121 15.464l-2.121 2.121L15.879 15.464l-1.414 1.414 2.121 2.121-2.121 2.121 1.414 1.414 2.121-2.121 2.121 2.121 1.414-1.414Z"),
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
        return _fileCloseLine!!
    }

private var _fileCloseLine: ImageVector? = null
