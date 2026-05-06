package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flower: ImageVector
    get() {
        if (_flower != null) return _flower!!
        _flower = tablerFilledIcon(
            name = "Flower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c2.209 0 4 1.791 4 4l-.002 .055 .03-.018c.843-.489 1.836-.651 2.79-.455l.237 .056c1.02 .276 1.888 .947 2.412 1.865 1.098 1.911 .448 4.35-1.455 5.461L19.944 12l.071 .039c1.83 1.07 2.511 3.378 1.555 5.27l-.101 .186c-.524 .919-1.393 1.591-2.415 1.867-1.022 .276-2.111 .132-3.026-.399l-.03-.02L16 19c0 2.131-1.671 3.888-3.8 3.995L12 23C9.791 23 8 21.209 8 19l.001-.056-.029 .019c-.843 .489-1.836 .651-2.79 .456l-.236-.056C3.925 19.087 3.057 18.416 2.533 17.498 1.435 15.588 2.084 13.15 3.986 12.038L4.056 12l-.071-.038C2.155 10.892 1.474 8.584 2.43 6.692l.1-.187C3.054 5.585 3.924 4.912 4.946 4.637c1.022-.276 2.112-.132 3.028 .4L8 5.055v-.055C8 2.869 9.671 1.112 11.8 1.005ZM12 9C10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9"),
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
        return _flower!!
    }

private var _flower: ImageVector? = null
