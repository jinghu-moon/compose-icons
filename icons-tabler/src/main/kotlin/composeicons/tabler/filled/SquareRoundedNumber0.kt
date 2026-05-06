package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedNumber0: ImageVector
    get() {
        if (_squareRoundedNumber0 != null) return _squareRoundedNumber0!!
        _squareRoundedNumber0 = tablerFilledIcon(
            name = "SquareRoundedNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.642 .005 .616 .017 .299 .013 .579 .034 .553 .046c4.687 .455 6.65 2.333 7.166 6.906l.03 .29 .046 .553 .041 .727 .006 .15 .017 .617L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.455 4.687-2.333 6.65-6.906 7.166l-.29 .03-.553 .046-.727 .041-.15 .006-.617 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.624 21.43 2.661 19.552 2.145 14.979l-.03-.29-.046-.553-.041-.727-.006-.15-.017-.617-.004-.318v-.648l.004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.57 4.624 4.448 2.661 9.021 2.145l.29-.03 .553-.046 .727-.041 .15-.006 .617-.017C11.568 2.002 11.782 2 12 2ZM12 7C10.343 7 9 8.343 9 10v4c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-4C15 8.343 13.657 7 12 7ZM12 9c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1Z"),
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
        return _squareRoundedNumber0!!
    }

private var _squareRoundedNumber0: ImageVector? = null
