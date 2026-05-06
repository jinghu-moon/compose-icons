package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorThinIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 80v88c0 33.137-26.863 60-60 60C110.863 228 84 201.137 84 168v-126.34L42.83 82.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l48-48c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l48 48c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L92 41.66v126.34c0 28.719 23.281 52 52 52 28.719 0 52-23.281 52-52v-88c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
