package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UbuntuFill: ImageVector
    get() {
        if (_ubuntuFill != null) return _ubuntuFill!!
        _ubuntuFill = remixIcon(
            name = "UbuntuFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.001 12c0 5.522-4.477 10-10 10C6.478 22 2.001 17.522 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10ZM5.201 10.664c-.738 0-1.335 .598-1.335 1.336 0 .737 .598 1.335 1.335 1.335 .737 0 1.335-.598 1.335-1.335 0-.738-.598-1.336-1.335-1.336ZM14.734 16.733c-.638 .369-.857 1.185-.488 1.823 .368 .638 1.184 .858 1.823 .489 .639-.369 .858-1.185 .489-1.824-.369-.638-1.185-.856-1.823-.488h0ZM8.101 12c0-1.319 .655-2.485 1.658-3.191L8.783 7.174C7.615 7.955 6.746 9.149 6.385 10.545c.421 .344 .691 .868 .691 1.455 0 .586-.27 1.11-.691 1.454 .361 1.397 1.23 2.59 2.398 3.372l.976-1.636C8.757 14.485 8.101 13.32 8.101 12h0ZM12.001 8.1c2.037 0 3.709 1.562 3.884 3.554l1.903-.028C17.694 10.155 17.052 8.835 16.065 7.864c-.508 .191-1.094 .162-1.601-.13-.508-.293-.826-.787-.913-1.324-.493-.136-1.013-.21-1.55-.21-.923 0-1.796 .216-2.57 .6l.928 1.662c.5-.232 1.056-.363 1.643-.363ZM12.001 15.899c-.587 0-1.143-.13-1.643-.363l-.928 1.662c.775 .384 1.648 .601 2.57 .601 .537 0 1.056-.075 1.55-.212 .087-.536 .406-1.03 .913-1.324 .507-.293 1.093-.322 1.601-.13 .987-.971 1.63-2.291 1.723-3.762l-1.903-.028c-.175 1.992-1.846 3.554-3.884 3.554l-0-0ZM14.733 7.267c.639 .368 1.455 .15 1.823-.488 .369-.639 .15-1.455-.488-1.823-.639-.369-1.455-.15-1.824 .488-.368 .639-.149 1.455 .489 1.823v0Z"),
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
        return _ubuntuFill!!
    }

private var _ubuntuFill: ImageVector? = null
