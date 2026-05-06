package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorThinIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243 109.32 209.36 72c-2.275-2.533-5.515-3.986-8.92-4h-68.44v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36h-84C33.373 68 28 73.373 28 80v64c0 6.627 5.373 12 12 12h84v68c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-68h68.44c3.405-.014 6.645-1.467 8.92-4L243 114.68c1.374-1.522 1.374-3.838 0-5.36ZM203.44 146.68c-.766 .848-1.857 1.329-3 1.32h-160.44c-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4h160.44c1.143-.009 2.234 .472 3 1.32L234.62 112Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
