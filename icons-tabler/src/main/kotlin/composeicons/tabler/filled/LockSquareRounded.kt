package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LockSquareRounded: ImageVector
    get() {
        if (_lockSquareRounded != null) return _lockSquareRounded!!
        _lockSquareRounded = tablerFilledIcon(
            name = "LockSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c-.218 0-.432 .002-.642 .005l-.616 .017-.299 .013-.579 .034-.553 .046C4.526 2.579 2.579 4.526 2.115 9.311l-.046 .553-.034 .579c-.005 .098-.01 .198-.013 .299l-.017 .616-.004 .318L2 12c0 .218 .002 .432 .005 .642l.017 .616 .013 .299 .034 .579 .046 .553c.464 4.785 2.411 6.732 7.196 7.196l.553 .046 .579 .034c.098 .005 .198 .01 .299 .013l.616 .017L12 22l.642-.005 .616-.017 .299-.013 .579-.034 .553-.046c4.785-.464 6.732-2.411 7.196-7.196l.046-.553 .034-.579c.005-.098 .01-.198 .013-.299l.017-.616L22 12l-.005-.642-.017-.616-.013-.299-.034-.579-.046-.553C21.421 4.526 19.474 2.579 14.689 2.115l-.553-.046-.579-.034c-.1-.005-.199-.009-.299-.013l-.616-.017-.318-.004L12 2ZM12 6c1.589-0 2.902 1.238 2.995 2.824L15 9v1c1.047-0 1.917 .806 1.995 1.85L17 12v3c0 1.047-.806 1.917-1.85 1.995L15 17h-6C7.953 17 7.083 16.194 7.005 15.15L7 15v-3c-0-1.047 .806-1.917 1.85-1.995L9 10v-1C9 7.343 10.343 6 12 6ZM15 12h-6v3h6v-3ZM12 8c-.507 0-.934 .38-.993 .883L11 9v1h2v-1C13 8.448 12.552 8 12 8Z"),
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
        return _lockSquareRounded!!
    }

private var _lockSquareRounded: ImageVector? = null
