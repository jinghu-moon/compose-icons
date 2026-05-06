package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MacbookLine: ImageVector
    get() {
        if (_macbookLine != null) return _macbookLine!!
        _macbookLine = remixIcon(
            name = "MacbookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5v11h16v-11h-16ZM2 4.007C2 3.451 2.455 3 2.992 3h18.016c.548 0 .992 .449 .992 1.007v13.993h-20v-13.993ZM1 19h22v2h-22v-2Z"),
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
        return _macbookLine!!
    }

private var _macbookLine: ImageVector? = null
