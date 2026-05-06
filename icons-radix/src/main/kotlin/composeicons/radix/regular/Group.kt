package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Group: ImageVector
    get() {
        if (_group != null) return _group!!
        _group = radixIcon(
            name = "Group",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.45 10.95c.276 0 .5 .224 .5 .5v1.5h1.5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-2c-.276 0-.5-.224-.5-.5v-2c0-.276 .224-.5 .5-.5ZM8.95 12.95c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-3c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h3ZM13.45 10.95c.276 0 .5 .224 .5 .5v2c-0 .276-.224 .5-.5 .5h-2c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h1.499l.001-1.5c0-.276 .224-.5 .5-.5ZM1.45 5.45c.276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-3c0-.276 .224-.5 .5-.5ZM13.45 5.45c.276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-3c0-.276 .224-.5 .5-.5ZM3.45 .95c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-1.5v1.5c0 .276-.224 .5-.5 .5C1.174 3.95 .95 3.726 .95 3.45v-2c0-.133 .053-.26 .146-.354 .094-.094 .221-.146 .354-.146h2ZM13.449 .95c.276 0 .501 .224 .501 .5v2c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-1.5h-1.5c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h1.999ZM8.95 .95c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-3c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h3Z"),
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
        return _group!!
    }

private var _group: ImageVector? = null
