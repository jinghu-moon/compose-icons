package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterQ: ImageVector
    get() {
        if (_circleLetterQ != null) return _circleLetterQ!!
        _circleLetterQ = tablerFilledIcon(
            name = "CircleLetterQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M12 7C10.343 7 9 8.343 9 10v4c-0 1.006 .504 1.945 1.342 2.501 .838 .556 1.899 .655 2.826 .263l.125-.057c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402l.057-.125c.156-.37 .236-.767 .236-1.168v-4C15 8.343 13.657 7 12 7M13 14.001h-.059c-.53 .029-.944 .469-.941 1-.265 0-.52-.105-.707-.293C11.105 14.52 11 14.265 11 14v-4c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z"),
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
        return _circleLetterQ!!
    }

private var _circleLetterQ: ImageVector? = null
