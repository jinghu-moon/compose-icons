package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Reload: ImageVector
    get() {
        if (_reload != null) return _reload!!
        _reload = radixIcon(
            name = "Reload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 .85c3.164 0 4.794 2.219 5.499 3.461l.001 .001v-1.812c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v3c-0 .276-.224 .5-.5 .5h-3c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h1.732l-.111-.208C11.48 3.666 10.111 1.85 7.5 1.85 4.06 1.85 1.85 4.665 1.85 7.5c0 2.835 2.21 5.649 5.65 5.649 1.665-0 3.029-.654 4.001-1.643l.191-.204c.433-.487 .779-1.046 1.024-1.643l.048-.09c.13-.193 .381-.274 .604-.183 .255 .105 .377 .397 .273 .652l-.131 .297c-.275 .587-.634 1.139-1.071 1.631l-.226 .24c-1.152 1.172-2.77 1.941-4.714 1.941C3.438 14.15 .85 10.815 .85 7.5 .85 4.186 3.438 .85 7.5 .85Z"),
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
        return _reload!!
    }

private var _reload: ImageVector? = null
