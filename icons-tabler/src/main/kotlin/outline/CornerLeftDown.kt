package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerLeftDown: ImageVector
    get() {
        if (_cornerLeftDown != null) return _cornerLeftDown!!
        _cornerLeftDown = tablerOutlineIcon(
            name = "CornerLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 6.000 L 12.000 6.000 C 10.343 6.000 9.000 7.343 9.000 9.000 L 9.000 19.000 L 5.000 15.000M 13.000 15.000 L 9.000 19.000"),
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
        return _cornerLeftDown!!
    }

private var _cornerLeftDown: ImageVector? = null
