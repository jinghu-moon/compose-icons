package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.XboxLine: ImageVector
    get() {
        if (_xboxLine != null) return _xboxLine!!
        _xboxLine = remixIcon(
            name = "XboxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.798 15.485C5.922 12.965 7.998 10.046 9.285 8.523 8.037 7.277 7.123 6.592 6.467 6.223 4.947 7.679 4.001 9.729 4.001 12c0 1.249 .286 2.432 .797 3.485ZM8.849 4.645c1.6 .406 3.152 1.314 3.152 1.314v-.005c0 0 1.552-.905 3.151-1.31C14.185 4.23 13.12 4 12.001 4 10.882 4 9.816 4.23 8.849 4.645ZM17.535 6.223c-.655 .369-1.568 1.055-2.816 2.299 1.286 1.523 3.362 4.442 4.485 6.962 .51-1.053 .796-2.235 .796-3.484 0-2.271-.946-4.321-2.466-5.777ZM17.943 17.357C16.54 15.12 13.853 12.412 12.001 11.013c-1.851 1.399-4.539 4.108-5.941 6.344C7.524 18.98 9.643 20 12.001 20c2.358 0 4.478-1.02 5.942-2.643ZM12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _xboxLine!!
    }

private var _xboxLine: ImageVector? = null
