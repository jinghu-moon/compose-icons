package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedNumber3: ImageVector
    get() {
        if (_squareRoundedNumber3 != null) return _squareRoundedNumber3!!
        _squareRoundedNumber3 = tablerFilledIcon(
            name = "SquareRoundedNumber3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.642 .005 .616 .017 .299 .013 .579 .034 .553 .046c4.687 .455 6.65 2.333 7.166 6.906l.03 .29 .046 .553 .041 .727 .006 .15 .017 .617L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.455 4.687-2.333 6.65-6.906 7.166l-.29 .03-.553 .046-.727 .041-.15 .006-.617 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.624 21.43 2.661 19.552 2.145 14.979l-.03-.29-.046-.553-.041-.727-.006-.15-.017-.617-.004-.318v-.648l.004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.57 4.624 4.448 2.661 9.021 2.145l.29-.03 .553-.046 .727-.041 .15-.006 .617-.017C11.568 2.002 11.782 2 12 2ZM13 7h-2l-.15 .005C9.806 7.083 9 7.953 9 9c-.002 .509 .379 .938 .884 .997 .505 .059 .974-.271 1.09-.767l.02-.113L11 9h2v2h-2l-.133 .007c-1.111 .12-1.154 1.73-.128 1.965l.128 .021L11 13h2v2h-2l-.007-.117c-.062-.525-.523-.911-1.052-.88C9.413 14.034 9.001 14.471 9 15c-0 1.047 .806 1.917 1.85 1.995L11 17h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 15v-2l-.005-.15c-.017-.231-.075-.456-.17-.667l-.075-.152-.019-.032 .02-.03c.135-.245 .218-.516 .242-.795L15 11v-2l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7Z"),
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
        return _squareRoundedNumber3!!
    }

private var _squareRoundedNumber3: ImageVector? = null
