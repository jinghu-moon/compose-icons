package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JoinStraight: ImageVector
    get() {
        if (_joinStraight != null) return _joinStraight!!
        _joinStraight = tablerOutlineIcon(
            name = "JoinStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 4h3c1.105 0 2 .895 2 2v6c0 .552 .448 1 1 1h6c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4"),
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
        return _joinStraight!!
    }

private var _joinStraight: ImageVector? = null
