package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandVimeo: ImageVector
    get() {
        if (_brandVimeo != null) return _brandVimeo!!
        _brandVimeo = tablerFilledIcon(
            name = "BrandVimeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.5 3c2.38 0 3.985 2.174 3.486 5.164-.535 3.21-2.25 6.074-4.808 8.675-1.277 1.298-2.211 2.061-4.112 3.485-2.323 1.597-4.408 .365-5.47-1.897C7.304 17.809 7.01 16.703 6.348 13.95l-.03-.126C5.835 11.814 5.499 10.505 5.336 9.946L5.32 9.894l-.031 .013-.13 .06-.137 .07c-.149 .08-.293 .17-.43 .269-.398 .293-.951 .251-1.3-.099l-1-1C1.955 8.87 1.903 8.341 2.168 7.945 2.746 7.103 3.387 6.307 4.086 5.563 5.066 4.526 6.041 3.747 7.014 3.33 7.514 3.116 8.01 3 8.5 3c2.237 0 3.02 1.588 3.567 4.963 .03 .183 .057 .359 .112 .709 .123 .784 .197 1.198 .292 1.588 .292 1.185 .528 1.984 .735 2.483l-.016-.039 .096-.107c.354-.411 .757-1.014 1.172-1.771l.157-.291c.391-.745 .505-1.528 .363-1.9-.028-.073 .007-.065-.456 .218-.333 .205-.755 .196-1.08-.022-.325-.218-.493-.605-.43-.991C13.508 4.787 15.757 3 18.5 3"),
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
        return _brandVimeo!!
    }

private var _brandVimeo: ImageVector? = null
