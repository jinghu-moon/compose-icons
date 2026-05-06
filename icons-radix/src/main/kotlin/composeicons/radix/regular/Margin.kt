package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Margin: ImageVector
    get() {
        if (_margin != null) return _margin!!
        _margin = radixIcon(
            name = "Margin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 13c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM4.5 13c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM7.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM10.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM13.5 13c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM1.5 10c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM10 4c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5l-.103-.005c-.504-.051-.897-.477-.897-.995v-5c0-.552 .448-1 1-1h5ZM13.5 10c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM5 10h5v-5h-5v5ZM1.5 7c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM13.5 7c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM1.5 4c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM13.5 4c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM1.5 1c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM4.5 1c.276 0 .5 .224 .5 .5-0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM7.5 1c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM10.5 1c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5ZM13.5 1c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5Z"),
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
        return _margin!!
    }

private var _margin: ImageVector? = null
