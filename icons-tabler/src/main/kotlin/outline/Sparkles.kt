package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sparkles: ImageVector
    get() {
        if (_sparkles != null) return _sparkles!!
        _sparkles = tablerOutlineIcon(
            name = "Sparkles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 18.000 C 17.105 18.000 18.000 18.895 18.000 20.000 C 18.000 18.895 18.895 18.000 20.000 18.000 C 18.895 18.000 18.000 17.105 18.000 16.000 C 18.000 17.105 17.105 18.000 16.000 18.000M 16.000 6.000 C 17.105 6.000 18.000 6.895 18.000 8.000 C 18.000 6.895 18.895 6.000 20.000 6.000 C 18.895 6.000 18.000 5.105 18.000 4.000 C 18.000 5.105 17.105 6.000 16.000 6.000M 9.000 18.000 C 9.000 14.686 11.686 12.000 15.000 12.000 C 11.686 12.000 9.000 9.314 9.000 6.000 C 9.000 9.314 6.314 12.000 3.000 12.000 C 6.314 12.000 9.000 14.686 9.000 18.000"),
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
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
