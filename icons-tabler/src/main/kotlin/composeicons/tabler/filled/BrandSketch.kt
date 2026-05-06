package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSketch: ImageVector
    get() {
        if (_brandSketch != null) return _brandSketch!!
        _brandSketch = tablerFilledIcon(
            name = "BrandSketch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.554 3.004h8.929c.659 .002 1.275 .328 1.647 .873l3.536 5.193c.523 .767 .452 1.793-.173 2.48l-8 8.79c-.38 .418-.92 .657-1.485 .657-.565 0-1.105-.239-1.485-.657L2.523 11.551c-.05-.053-.093-.112-.13-.175l-.012-.026-.051-.072C1.933 10.653 1.911 9.86 2.274 9.215l.09-.146L5.905 3.876c.372-.544 .987-.87 1.649-.872"),
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
        return _brandSketch!!
    }

private var _brandSketch: ImageVector? = null
