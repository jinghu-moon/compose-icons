package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = tablerOutlineIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c.132 0 .263 0 .393 0C9.742 5.463 9.228 9.468 11.171 12.521c1.943 3.053 5.788 4.283 9.142 2.925-1.733 4.169-6.286 6.409-10.646 5.238C5.306 19.512 2.489 15.291 3.079 10.815 3.67 6.339 7.485 2.993 12 2.992v.008"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
