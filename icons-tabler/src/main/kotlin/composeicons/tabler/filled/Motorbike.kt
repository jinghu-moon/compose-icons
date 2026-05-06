package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = tablerFilledIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 5c.379 0 .725 .214 .894 .553l3.225 6.449 .08 .003c2.181 .109 3.871 1.946 3.799 4.128-.072 2.182-1.881 3.903-4.064 3.867C16.751 19.963 15 18.183 15 16l.005-.2c.07-1.404 .871-2.668 2.111-3.33l-.557-1.115-3.352 3.352c-.187 .188-.442 .293-.707 .293h-3.626q.124 .481 .126 1c0 2.209-1.791 4-4 4C2.791 20 1 18.209 1 16l.005-.2c.073-1.463 .939-2.769 2.259-3.405 1.32-.636 2.881-.499 4.071 .356L9.084 11h-3.084c-.507-0-.934-.38-.993-.883L5 10C5 9.448 5.448 9 6 9h9.381l-1-2h-1.381c-.507-0-.934-.38-.993-.883L12 6c0-.552 .448-1 1-1Z"),
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
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
