package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber4: ImageVector
    get() {
        if (_circleNumber4 != null) return _circleNumber4!!
        _circleNumber4 = tablerFilledIcon(
            name = "CircleNumber4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM14 7c-.507 0-.934 .38-.993 .883L13 8v3h-2v-3l-.007-.117C10.933 7.38 10.507 7.001 10 7.001c-.507 0-.933 .379-.993 .882L9 8v3l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 13h2v3l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L15 16v-8l-.007-.117C14.934 7.38 14.507 7 14 7Z"),
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
        return _circleNumber4!!
    }

private var _circleNumber4: ImageVector? = null
