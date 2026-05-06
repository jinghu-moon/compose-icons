package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedX: ImageVector
    get() {
        if (_squareRoundedX != null) return _squareRoundedX!!
        _squareRoundedX = tablerFilledIcon(
            name = "SquareRoundedX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.324 .001 .318 .004 .616 .017 .299 .013 .579 .034 .553 .046c4.785 .464 6.732 2.411 7.196 7.196l.046 .553 .034 .579c.005 .098 .01 .198 .013 .299l.017 .616L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.464 4.785-2.411 6.732-7.196 7.196l-.553 .046-.579 .034c-.098 .005-.198 .01-.299 .013l-.616 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.526 21.421 2.579 19.474 2.115 14.689l-.046-.553-.034-.579c-.005-.1-.009-.199-.013-.299l-.017-.616C2.002 12.432 2 12.218 2 12l.001-.324 .004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.579 4.526 4.526 2.579 9.311 2.115l.553-.046 .579-.034c.098-.005 .198-.01 .299-.013l.616-.017C11.568 2.002 11.782 2 12 2ZM10.511 9.14c-.434-.258-.991-.153-1.301 .246-.31 .398-.274 .965 .083 1.321L10.585 12 9.293 13.293l-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042L12 13.415l1.293 1.292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367L13.415 12l1.292-1.293 .083-.094c.323-.417 .266-1.013-.13-1.362-.395-.349-.994-.33-1.367 .042L12 10.585 10.707 9.293l-.094-.083Z"),
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
        return _squareRoundedX!!
    }

private var _squareRoundedX: ImageVector? = null
