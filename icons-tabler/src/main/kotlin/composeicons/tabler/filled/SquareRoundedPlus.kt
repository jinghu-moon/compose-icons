package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedPlus: ImageVector
    get() {
        if (_squareRoundedPlus != null) return _squareRoundedPlus!!
        _squareRoundedPlus = tablerFilledIcon(
            name = "SquareRoundedPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.324 .001 .318 .004 .616 .017 .299 .013 .579 .034 .553 .046c4.785 .464 6.732 2.411 7.196 7.196l.046 .553 .034 .579c.005 .098 .01 .198 .013 .299l.017 .616L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.464 4.785-2.411 6.732-7.196 7.196l-.553 .046-.579 .034c-.098 .005-.198 .01-.299 .013l-.616 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.526 21.421 2.579 19.474 2.115 14.689l-.046-.553-.034-.579c-.005-.1-.009-.199-.013-.299l-.017-.616C2.002 12.432 2 12.218 2 12l.001-.324 .004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.579 4.526 4.526 2.579 9.311 2.115l.553-.046 .579-.034c.098-.005 .198-.01 .299-.013l.616-.017C11.568 2.002 11.782 2 12 2ZM12 8c-.552 0-1 .448-1 1v2h-2l-.117 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941h2v2l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-2h2l.117-.007c.525-.062 .911-.523 .88-1.052C15.966 11.413 15.529 11.001 15 11h-2v-2l-.007-.117C12.934 8.38 12.507 8 12 8Z"),
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
        return _squareRoundedPlus!!
    }

private var _squareRoundedPlus: ImageVector? = null
