package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CapsuleLine: ImageVector
    get() {
        if (_capsuleLine != null) return _capsuleLine!!
        _capsuleLine = remixIcon(
            name = "CapsuleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.779 4.222c2.343 2.343 2.343 6.142 0 8.485l-7.071 7.071c-2.343 2.343-6.142 2.343-8.485 0-2.343-2.343-2.343-6.142 0-8.485L11.293 4.222c2.343-2.343 6.142-2.343 8.485 0ZM14.122 15.535 8.466 9.878 5.636 12.707c-1.562 1.562-1.562 4.095 0 5.657 1.562 1.562 4.095 1.562 5.657 0l2.829-2.829ZM18.364 5.636c-1.562-1.562-4.095-1.562-5.657 0L9.88 8.464l5.657 5.657 2.828-2.828c1.562-1.562 1.562-4.095 0-5.657Z"),
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
        return _capsuleLine!!
    }

private var _capsuleLine: ImageVector? = null
