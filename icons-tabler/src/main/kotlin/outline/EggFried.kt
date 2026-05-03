package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = tablerOutlineIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 3.000 C 15.525 3.000 16.967 3.695 17.916 4.889 C 18.865 6.083 19.217 7.644 18.872 9.130 C 20.103 9.504 20.959 10.621 20.999 11.907 C 21.039 13.193 20.255 14.361 19.050 14.811 C 19.917 15.622 20.224 16.868 19.833 17.988 C 19.443 19.109 18.429 19.895 17.246 19.992 C 16.063 20.089 14.934 19.479 14.366 18.437 C 12.985 20.829 9.927 21.649 7.535 20.268 C 5.143 18.887 4.323 15.829 5.704 13.437 C 3.258 12.154 2.316 9.132 3.599 6.687 C 4.881 4.241 7.903 3.298 10.349 4.581 C 11.293 3.568 12.616 2.994 14.000 2.996 L 14.000 3.000"),
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
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
