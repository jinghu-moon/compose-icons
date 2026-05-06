package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TwitterLine: ImageVector
    get() {
        if (_twitterLine != null) return _twitterLine!!
        _twitterLine = remixIcon(
            name = "TwitterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.35 5.55c-1.582 0-2.871 1.268-2.899 2.847l-.028 1.575c-.006 .331-.279 .595-.611 .589-.024-0-.047-.002-.07-.005l-1.561-.213C8.127 10.062 6.159 9.117 4.271 7.544c-.598 3.31 .569 5.603 3.383 7.372l1.747 1.098c.281 .176 .365 .547 .189 .827-.04 .064-.093 .12-.154 .165L7.843 18.17c.946 .059 1.846 .018 2.592-.131 4.718-.941 7.855-4.492 7.855-10.348 0-.478-1.012-2.141-2.94-2.141ZM10.451 8.361c.048-2.665 2.223-4.811 4.899-4.811 1.363 0 2.597 .557 3.485 1.455 .711-.005 1.317 .175 2.669-.646-.334 1.64-.5 2.352-1.214 3.331 0 7.642-4.697 11.358-9.463 12.309C7.559 20.652 2.806 19.581 1.445 18.159c.693-.053 3.514-.357 5.144-1.55C5.21 15.699-.279 12.468 3.328 3.786 5.021 5.763 6.738 7.109 8.478 7.823c1.157 .475 1.442 .466 1.973 .538Z"),
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
        return _twitterLine!!
    }

private var _twitterLine: ImageVector? = null
