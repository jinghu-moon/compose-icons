package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SkewY: ImageVector
    get() {
        if (_skewY != null) return _skewY!!
        _skewY = tablerOutlineIcon(
            name = "SkewY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.326 19h15.348c.314 0 .61-.147 .799-.398 .189-.251 .25-.575 .163-.877L17.207 5.725C17.084 5.296 16.692 5 16.246 5h-8.492c-.446 0-.838 .296-.961 .725L3.364 17.725c-.086 .302-.026 .627 .163 .877 .189 .251 .485 .398 .799 .398"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _skewY!!
    }

private var _skewY: ImageVector? = null
