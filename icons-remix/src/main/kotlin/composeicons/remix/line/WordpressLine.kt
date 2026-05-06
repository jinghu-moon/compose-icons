package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WordpressLine: ImageVector
    get() {
        if (_wordpressLine != null) return _wordpressLine!!
        _wordpressLine = remixIcon(
            name = "WordpressLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10ZM14.606 19.566 12.451 13.581l-2.181 6.232c.557 .123 1.136 .188 1.73 .188 .912 0 1.789-.153 2.606-.434ZM17.074 18.185C18.861 16.718 20 14.492 20 12c0-1.026-.193-2.006-.545-2.908-.25 1.454-.692 3.349-.976 4.315l-1.405 4.778ZM16.873 5.655C15.523 4.617 13.834 4 12 4 9.474 4 7.221 5.171 5.755 7h1.39v2h-.75l2.755 7.958 2.227-6.362L10.802 9h-2.157L8.645 7h5l-0 2h-.717l2.621 7.282 1.011-3.439c.524-1.833 .092-2.632-.338-3.43-.289-.535-.577-1.069-.577-1.913 0-.831 .507-1.543 1.228-1.845ZM4.425 9.421C4.149 10.23 4 11.098 4 12c0 2.81 1.449 5.281 3.64 6.708L4.425 9.421Z"),
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
        return _wordpressLine!!
    }

private var _wordpressLine: ImageVector? = null
