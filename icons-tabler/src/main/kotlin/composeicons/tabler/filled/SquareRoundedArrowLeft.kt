package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedArrowLeft: ImageVector
    get() {
        if (_squareRoundedArrowLeft != null) return _squareRoundedArrowLeft!!
        _squareRoundedArrowLeft = tablerFilledIcon(
            name = "SquareRoundedArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.324 .001 .318 .004 .616 .017 .299 .013 .579 .034 .553 .046c4.785 .464 6.732 2.411 7.196 7.196l.046 .553 .034 .579c.005 .098 .01 .198 .013 .299l.017 .616L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.464 4.785-2.411 6.732-7.196 7.196l-.553 .046-.579 .034c-.098 .005-.198 .01-.299 .013l-.616 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.526 21.421 2.579 19.474 2.115 14.689l-.046-.553-.034-.579c-.005-.1-.009-.199-.013-.299l-.017-.616C2.002 12.432 2 12.218 2 12l.001-.324 .004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.579 4.526 4.526 2.579 9.311 2.115l.553-.046 .579-.034c.098-.005 .198-.01 .299-.013l.616-.017C11.568 2.002 11.782 2 12 2ZM12.707 7.293c-.391-.39-1.023-.39-1.414 0l-4 4c-.082 .083-.15 .179-.2 .284l-.022 .052c-.029 .071-.049 .146-.06 .222l-.008 .067-.002 .063v-.035 .073c.003 .121 .026 .24 .07 .352l.023 .052 .03 .061 .022 .037c.016 .025 .032 .05 .05 .074l.024 .03 .073 .082 4 4 .094 .083c.398 .309 .964 .273 1.32-.083l.083-.094c.309-.398 .273-.964-.083-1.32L10.415 13h5.585l.117-.007c.525-.062 .911-.523 .88-1.052C16.966 11.413 16.529 11.001 16 11h-5.585L12.707 8.707l.083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _squareRoundedArrowLeft!!
    }

private var _squareRoundedArrowLeft: ImageVector? = null
