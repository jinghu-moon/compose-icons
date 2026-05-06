package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareNumber4: ImageVector
    get() {
        if (_squareNumber4 != null) return _squareNumber4!!
        _squareNumber4 = tablerFilledIcon(
            name = "SquareNumber4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM14 7c-.507 0-.934 .38-.993 .883L13 8v3h-2v-3l-.007-.117C10.933 7.38 10.507 7.001 10 7.001c-.507 0-.933 .379-.993 .882L9 8v3l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 13h2v3l.007 .117c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L15 16v-8l-.007-.117C14.934 7.38 14.507 7 14 7Z"),
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
        return _squareNumber4!!
    }

private var _squareNumber4: ImageVector? = null
