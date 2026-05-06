package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SofaLine: ImageVector
    get() {
        if (_sofaLine != null) return _sofaLine!!
        _sofaLine = remixIcon(
            name = "SofaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.001 3C5.687 3 3.001 5.686 3.001 9v.351C1.48 10.097 .633 11.916 1.267 13.658l.312 .859c.279 .767 .421 1.576 .421 2.392v2.591c0 .828 .672 1.5 1.5 1.5h17c.828 0 1.5-.672 1.5-1.5v-2.591c0-.816 .143-1.626 .421-2.392l.312-.859c.633-1.742-.213-3.56-1.734-4.307v-.351c0-3.314-2.686-6-6-6h-6ZM19.001 9.032c-1.694 .23-3 1.682-3 3.44v1.528h-8v-1.528C8.001 10.714 6.695 9.262 5.001 9.032v-.032C5.001 6.791 6.792 5 9.001 5h6c2.209 0 4 1.791 4 4v.032ZM16.001 16v1h2v-4.528c0-.813 .659-1.472 1.471-1.472 1.021 0 1.732 1.015 1.383 1.974l-.312 .859c-.358 .986-.542 2.027-.542 3.076v2.091h-16v-2.091c0-1.049-.183-2.09-.542-3.076l-.312-.859C2.797 12.015 3.508 11 4.529 11c.813 0 1.471 .659 1.471 1.472v4.528h2v-1h8Z"),
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
        return _sofaLine!!
    }

private var _sofaLine: ImageVector? = null
