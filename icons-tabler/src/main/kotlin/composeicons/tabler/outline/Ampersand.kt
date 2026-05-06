package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ampersand: ImageVector
    get() {
        if (_ampersand != null) return _ampersand!!
        _ampersand = tablerOutlineIcon(
            name = "Ampersand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 20 8.597 9.028C7.448 7.877 7.448 6.014 8.597 4.863c.551-.552 1.3-.863 2.08-.863 .781 0 1.529 .31 2.081 .863 1.149 1.151 1.149 3.014 0 4.165L8.078 13.715c-1.436 1.439-1.436 3.768 0 5.207 .689 .69 1.625 1.078 2.6 1.078 .975 0 1.911-.388 2.6-1.078L19 13"),
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
        return _ampersand!!
    }

private var _ampersand: ImageVector? = null
