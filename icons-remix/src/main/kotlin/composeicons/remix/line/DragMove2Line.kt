package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DragMove2Line: ImageVector
    get() {
        if (_dragMove2Line != null) return _dragMove2Line!!
        _dragMove2Line = remixIcon(
            name = "DragMove2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 11v-5.172L9.172 7.657 7.757 6.243 12 2l4.243 4.243L14.828 7.657 13 5.828v5.172h5.172L16.343 9.172 17.757 7.757 22 12l-4.243 4.243L16.343 14.828 18.172 13h-5.172v5.172l1.828-1.829 1.414 1.414L12 22 7.757 17.757 9.172 16.343 11 18.172v-5.172h-5.172l1.828 1.828L6.243 16.243 2 12 6.243 7.757 7.657 9.172 5.828 11h5.172Z"),
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
        return _dragMove2Line!!
    }

private var _dragMove2Line: ImageVector? = null
