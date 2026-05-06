package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaypalLine: ImageVector
    get() {
        if (_paypalLine != null) return _paypalLine!!
        _paypalLine = remixIcon(
            name = "PaypalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.496 20.667h1.551l.538-3.375c.216-1.361 1.389-2.366 2.769-2.366h.5c2.678 0 4.061-.983 4.551-3.503 .208-1.066 .117-1.731-.172-2.102-1.207 3.054-3.789 4.159-6.961 4.159h-.885c-.384 0-.793 .21-.852 .581L8.496 20.667ZM3.552 20.373c-.339 0-.597-.302-.545-.637L5.682 2.776C5.753 2.329 6.138 2 6.59 2h6.423c2.213 0 3.942 .467 4.899 1.558 .87 .991 1.123 2.084 .872 3.692 .359 .191 .667 .425 .915 .706 .819 .933 .979 2.26 .669 3.849-.741 3.805-3.276 5.12-6.514 5.12h-.5c-.395 0-.732 .289-.794 .679l-.703 4.383c-.062 .391-.399 .679-.794 .679h-4.343c-.297 0-.523-.265-.477-.557l.274-1.736h-2.965ZM10.388 11.479h.885c3.189 0 4.895-1.213 5.482-4.229 .02-.102 .037-.203 .054-.309 .166-1.059 .05-1.553-.398-2.063C15.945 4.348 14.807 4 13.014 4h-5.5L5.247 18.373h1.561l.73-4.628 .007 .001c.301-1.317 1.471-2.267 2.842-2.267Z"),
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
        return _paypalLine!!
    }

private var _paypalLine: ImageVector? = null
