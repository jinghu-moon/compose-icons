package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedArrowUp: ImageVector
    get() {
        if (_squareRoundedArrowUp != null) return _squareRoundedArrowUp!!
        _squareRoundedArrowUp = tablerFilledIcon(
            name = "SquareRoundedArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c-.218 0-.432 .002-.642 .005l-.616 .017-.299 .013-.579 .034-.553 .046C4.526 2.579 2.579 4.526 2.115 9.311l-.046 .553-.034 .579c-.005 .098-.01 .198-.013 .299l-.017 .616-.004 .318L2 12c0 .218 .002 .432 .005 .642l.017 .616 .013 .299 .034 .579 .046 .553c.464 4.785 2.411 6.732 7.196 7.196l.553 .046 .579 .034c.098 .005 .198 .01 .299 .013l.616 .017L12 22l.642-.005 .616-.017 .299-.013 .579-.034 .553-.046c4.785-.464 6.732-2.411 7.196-7.196l.046-.553 .034-.579c.005-.098 .01-.198 .013-.299l.017-.616L22 12l-.005-.642-.017-.616-.013-.299-.034-.579-.046-.553C21.421 4.526 19.474 2.579 14.689 2.115l-.553-.046-.579-.034c-.1-.005-.199-.009-.299-.013l-.616-.017-.318-.004L12 2ZM11.852 7.011l.058-.007L12 7l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 4 4c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083L13 10.415v5.585c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 16v-5.585L8.707 12.707c-.356 .356-.922 .392-1.32 .083l-.094-.083c-.356-.356-.392-.922-.083-1.32l.083-.094 4-4c.035-.035 .072-.068 .112-.097l.11-.071 .114-.054 .105-.035 .118-.025Z"),
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
        return _squareRoundedArrowUp!!
    }

private var _squareRoundedArrowUp: ImageVector? = null
