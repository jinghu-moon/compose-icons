package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedChevronRight: ImageVector
    get() {
        if (_squareRoundedChevronRight != null) return _squareRoundedChevronRight!!
        _squareRoundedChevronRight = tablerFilledIcon(
            name = "SquareRoundedChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c-.218 0-.432 .002-.642 .005l-.616 .017-.299 .013-.579 .034-.553 .046C4.526 2.579 2.579 4.526 2.115 9.311l-.046 .553-.034 .579c-.005 .098-.01 .198-.013 .299l-.017 .616-.004 .318L2 12c0 .218 .002 .432 .005 .642l.017 .616 .013 .299 .034 .579 .046 .553c.464 4.785 2.411 6.732 7.196 7.196l.553 .046 .579 .034c.098 .005 .198 .01 .299 .013l.616 .017L12 22l.642-.005 .616-.017 .299-.013 .579-.034 .553-.046c4.785-.464 6.732-2.411 7.196-7.196l.046-.553 .034-.579c.005-.098 .01-.198 .013-.299l.017-.616L22 12l-.005-.642-.017-.616-.013-.299-.034-.579-.046-.553C21.421 4.526 19.474 2.579 14.689 2.115l-.553-.046-.579-.034c-.1-.005-.199-.009-.299-.013l-.616-.017-.318-.004L12 2ZM10.293 8.293c.356-.356 .922-.392 1.32-.083l.094 .083 3 3c.356 .356 .392 .922 .083 1.32l-.083 .094-3 3c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L12.585 12 10.293 9.707C9.937 9.351 9.901 8.785 10.21 8.387l.083-.094Z"),
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
        return _squareRoundedChevronRight!!
    }

private var _squareRoundedChevronRight: ImageVector? = null
