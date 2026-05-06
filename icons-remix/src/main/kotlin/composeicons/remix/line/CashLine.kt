package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CashLine: ImageVector
    get() {
        if (_cashLine != null) return _cashLine!!
        _cashLine = remixIcon(
            name = "CashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4ZM21.005 4.003h-18c-.552 0-1 .448-1 1v14c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-14c0-.552-.448-1-1-1ZM4.005 15.646v-7.293C5.131 8.017 6.018 7.129 6.355 6.003h11.292c.337 1.129 1.229 2.019 2.359 2.353v7.287c-1.132 .335-2.025 1.227-2.361 2.359h-11.288C6.021 16.874 5.133 15.984 4.005 15.646Z"),
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
        return _cashLine!!
    }

private var _cashLine: ImageVector? = null
