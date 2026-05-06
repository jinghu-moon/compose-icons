package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorThinIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 152.09v63.91c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-63.91c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v59.91h152v-59.91c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM88 180.09h80c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM93.92 127.23l77.27 20.67c.325 .092 .662 .139 1 .14 1.982-.041 3.635-1.527 3.886-3.494 .251-1.967-.977-3.82-2.886-4.356L96 119.47c-1.402-.441-2.933-.077-3.987 .947-1.054 1.024-1.462 2.544-1.061 3.958 .4 1.414 1.544 2.495 2.979 2.815ZM113.33 77.69l69.28 39.95c1.24 .788 2.812 .833 4.095 .117 1.283-.716 2.07-2.078 2.05-3.547-.02-1.469-.844-2.809-2.146-3.49L117.33 70.73c-1.24-.788-2.812-.833-4.095-.117-1.283 .716-2.07 2.078-2.05 3.547 .02 1.469 .844 2.809 2.146 3.49ZM201.49 91.35c1.578 1.435 4.004 1.379 5.515-.126 1.511-1.505 1.575-3.931 .145-5.514L150.58 29.21c-1-1.055-2.494-1.484-3.901-1.121-1.407 .363-2.507 1.461-2.873 2.868-.365 1.407 .061 2.901 1.114 3.903Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
