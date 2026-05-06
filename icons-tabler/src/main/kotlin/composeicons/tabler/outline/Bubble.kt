package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bubble: ImageVector
    get() {
        if (_bubble != null) return _bubble!!
        _bubble = tablerOutlineIcon(
            name = "Bubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.4 3c2.136 .001 4.066 1.275 4.906 3.239 2.927 .33 5.032 2.97 4.702 5.898-.33 2.927-2.97 5.032-5.897 4.703-1.047 1.853-3.302 2.648-5.28 1.863L7 21v-3.134C6.207 17.683 5.541 17.148 5.192 16.413c-.35-.735-.345-1.589 .013-2.32C3.237 12.961 2.332 10.605 3.034 8.447 3.737 6.288 5.856 4.917 8.113 5.16 9.119 3.801 10.709 2.999 12.4 3"),
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
        return _bubble!!
    }

private var _bubble: ImageVector? = null
