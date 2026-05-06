package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorBoldIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 208c0 6.627-5.373 12-12 12h-48c-4.545 0-8.7-2.568-10.733-6.633-2.033-4.065-1.594-8.93 1.133-12.567l43.17-57.56c1.921-2.541 2.753-5.742 2.312-8.897-.441-3.155-2.118-6.005-4.662-7.923-3.054-2.303-7.022-3.013-10.685-1.911-3.663 1.102-6.58 3.885-7.855 7.491-2.209 6.249-9.066 9.524-15.315 7.315-6.249-2.209-9.524-9.066-7.315-15.315 1.233-3.468 2.986-6.729 5.2-9.67 11.968-15.878 34.542-19.048 50.42-7.08 15.878 11.968 19.048 34.542 7.08 50.42L216 196h24c6.627 0 12 5.373 12 12ZM151.86 46.93c-2.405-2.085-5.541-3.129-8.716-2.902-3.175 .227-6.13 1.706-8.214 4.112L92 97.68 49.07 48.14C44.729 43.131 37.149 42.589 32.14 46.93c-5.009 4.341-5.551 11.921-1.21 16.93L76.12 116 30.93 168.14c-4.341 5.009-3.799 12.589 1.21 16.93 5.009 4.341 12.589 3.799 16.93-1.21L92 134.32l42.93 49.54c4.341 5.009 11.921 5.551 16.93 1.21 5.009-4.341 5.551-11.921 1.21-16.93L107.88 116 153.07 63.86c2.085-2.405 3.129-5.541 2.902-8.716-.227-3.175-1.706-6.13-4.112-8.214Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
