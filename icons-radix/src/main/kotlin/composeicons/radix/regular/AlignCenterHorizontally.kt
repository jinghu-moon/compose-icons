package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AlignCenterHorizontally: ImageVector
    get() {
        if (_alignCenterHorizontally != null) return _alignCenterHorizontally!!
        _alignCenterHorizontally = radixIcon(
            name = "AlignCenterHorizontally",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 8c0 .552-.448 1-1 1h-5v4.5c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-4.5h-5c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h5v-4.5c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v4.5h5c.552 0 1 .448 1 1v1Z"),
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
        return _alignCenterHorizontally!!
    }

private var _alignCenterHorizontally: ImageVector? = null
