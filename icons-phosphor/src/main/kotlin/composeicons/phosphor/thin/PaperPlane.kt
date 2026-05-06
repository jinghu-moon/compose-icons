package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorThinIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.43 202.08 138.35 34.14c-2.125-3.78-6.124-6.119-10.46-6.119-4.336 0-8.335 2.339-10.46 6.119l-95.88 168c-2.422 4.354-1.902 9.752 1.308 13.563 3.209 3.811 8.44 5.243 13.142 3.597l92-31.08 91.94 31.06c4.719 1.688 9.99 .265 13.219-3.568 3.229-3.833 3.736-9.269 1.271-13.632ZM227 210.56c-1.083 1.311-2.886 1.779-4.47 1.16L132 181.13v-61.13c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v61.13L33.37 211.74c-1.564 .557-3.309 .09-4.386-1.173-1.077-1.263-1.261-3.061-.464-4.517L124.39 38.05c.704-1.273 2.045-2.064 3.5-2.064 1.455 0 2.796 .79 3.5 2.064L227.47 206c.844 1.462 .655 3.301-.47 4.56Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
