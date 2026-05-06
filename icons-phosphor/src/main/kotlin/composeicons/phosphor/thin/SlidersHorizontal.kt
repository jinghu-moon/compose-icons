package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorThinIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40 84h36.29c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h84.29c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-84.29C129.713 62.233 117.911 52.019 104 52.019 90.089 52.019 78.287 62.233 76.29 76h-36.29c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM104 60c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C92.954 100 84 91.046 84 80 84 68.954 92.954 60 104 60ZM216 172h-20.29C193.713 158.233 181.911 148.019 168 148.019c-13.911 0-25.713 10.213-27.71 23.981h-100.29c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h100.29c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h20.29c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM168 196c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
