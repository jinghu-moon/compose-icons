package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterQ: ImageVector
    get() {
        if (_squareRoundedLetterQ != null) return _squareRoundedLetterQ!!
        _squareRoundedLetterQ = tablerFilledIcon(
            name = "SquareRoundedLetterQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.676 2.001 12 2c7.752 0 10 2.248 10 10l-.005 .642C21.869 19.877 19.534 22 12 22l-.642-.005C4.228 21.87 2.063 19.6 2 12.325v-.325C2 4.357 4.185 2.064 11.676 2.001M12 7C10.343 7 9 8.343 9 10v4c-0 1.006 .504 1.945 1.342 2.501 .838 .556 1.899 .655 2.826 .263l.125-.057c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402l.057-.125c.156-.37 .236-.767 .236-1.168v-4C15 8.343 13.657 7 12 7M13 14.001h-.059c-.53 .029-.944 .469-.941 1-.265 0-.52-.105-.707-.293C11.105 14.52 11 14.265 11 14v-4c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z"),
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
        return _squareRoundedLetterQ!!
    }

private var _squareRoundedLetterQ: ImageVector? = null
