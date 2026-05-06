package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CursorAiLine: ImageVector
    get() {
        if (_cursorAiLine != null) return _cursorAiLine!!
        _cursorAiLine = remixIcon(
            name = "CursorAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.55 1.354c.279-.16 .622-.16 .9 0l8.671 4.977c.234 .134 .379 .383 .379 .652v10.036l-.006 .1c-.031 .229-.168 .434-.372 .552l-8.672 4.978-.107 .052c-.256 .105-.55 .088-.793-.052L2.879 17.67c-.205-.117-.341-.322-.372-.552l-.007-.1v-10.036c0-.269 .145-.518 .379-.652L11.55 1.354ZM4.5 7.705v8.589L12 20.599v-8.294c0-.188-.101-.363-.266-.458L4.509 7.699l-.009 .006ZM13.354 19.822l6.146-3.527v-7.056L13.354 19.822ZM5.861 6.924h12.277L11.999 3.401 5.861 6.924Z"),
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
        return _cursorAiLine!!
    }

private var _cursorAiLine: ImageVector? = null
