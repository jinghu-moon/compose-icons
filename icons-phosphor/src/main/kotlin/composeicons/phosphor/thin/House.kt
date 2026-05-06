package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorThinIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 111.51l-80-80c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L39.49 111.51C37.247 113.766 35.992 116.819 36 120v96c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-60h40v60c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-96c.003-3.184-1.26-6.238-3.51-8.49ZM212 212h-56v-60c0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v60h-56v-92c-.001-1.061 .42-2.079 1.17-2.83l80-80c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l80 80c.75 .751 1.171 1.769 1.17 2.83Z"),
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
        return _house!!
    }

private var _house: ImageVector? = null
