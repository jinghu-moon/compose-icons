package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PokerHeartsLine: ImageVector
    get() {
        if (_pokerHeartsLine != null) return _pokerHeartsLine!!
        _pokerHeartsLine = remixIcon(
            name = "PokerHeartsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 8.811 13.635 6.488C14.272 5.584 15.318 5 16.5 5 18.433 5 20 6.567 20 8.5c0 2.879-1.959 5.622-4.357 7.836-1.155 1.067-2.319 1.924-3.198 2.516-.159 .107-.308 .205-.445 .293-.137-.088-.286-.186-.445-.293C10.676 18.26 9.512 17.403 8.357 16.336 5.959 14.122 4 11.379 4 8.5 4 6.567 5.567 5 7.5 5c1.182 0 2.228 .584 2.865 1.488L12 8.811ZM10.556 3.926C9.682 3.341 8.631 3 7.5 3 4.462 3 2 5.462 2 8.5 2 16 12 21.485 12 21.485 12 21.485 22 16 22 8.5 22 5.462 19.538 3 16.5 3c-1.131 0-2.182 .341-3.056 .926C12.88 4.304 12.39 4.783 12 5.337 11.61 4.783 11.12 4.304 10.556 3.926Z"),
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
        return _pokerHeartsLine!!
    }

private var _pokerHeartsLine: ImageVector? = null
