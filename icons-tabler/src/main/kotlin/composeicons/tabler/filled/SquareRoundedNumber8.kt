package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedNumber8: ImageVector
    get() {
        if (_squareRoundedNumber8 != null) return _squareRoundedNumber8!!
        _squareRoundedNumber8 = tablerFilledIcon(
            name = "SquareRoundedNumber8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.642 .005 .616 .017 .299 .013 .579 .034 .553 .046c4.687 .455 6.65 2.333 7.166 6.906l.03 .29 .046 .553 .041 .727 .006 .15 .017 .617L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.455 4.687-2.333 6.65-6.906 7.166l-.29 .03-.553 .046-.727 .041-.15 .006-.617 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.624 21.43 2.661 19.552 2.145 14.979l-.03-.29-.046-.553-.041-.727-.006-.15-.017-.617-.004-.318v-.648l.004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.57 4.624 4.448 2.661 9.021 2.145l.29-.03 .553-.046 .727-.041 .15-.006 .617-.017C11.568 2.002 11.782 2 12 2ZM13 7h-2l-.15 .005C9.866 7.079 9.083 7.859 9.006 8.843L9 9v2l.005 .15c.018 .236 .077 .46 .17 .667l.075 .152 .018 .03-.018 .032c-.133 .24-.218 .509-.243 .795L9 13v2l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 17h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 15v-2l-.005-.15c-.017-.231-.075-.456-.17-.667l-.075-.152-.019-.032 .02-.03c.135-.245 .218-.516 .242-.795L15 11v-2l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7ZM13 13v2h-2v-2h2ZM13 9v2h-2v-2h2Z"),
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
        return _squareRoundedNumber8!!
    }

private var _squareRoundedNumber8: ImageVector? = null
