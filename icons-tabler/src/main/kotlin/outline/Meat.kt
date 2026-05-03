package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meat: ImageVector
    get() {
        if (_meat != null) return _meat!!
        _meat = tablerOutlineIcon(
            name = "Meat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.620 8.382 L 15.586 6.415 C 14.946 5.775 14.815 4.785 15.268 4.001 C 15.720 3.217 16.643 2.835 17.517 3.069 C 18.392 3.303 19.000 4.095 19.000 5.000 C 19.905 4.999 20.698 5.607 20.933 6.482 C 21.168 7.356 20.786 8.279 20.002 8.732 C 19.218 9.185 18.227 9.054 17.587 8.414 L 15.767 10.235"),
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
                pathData = parseSvgPathData("M 5.904 18.596 C 8.637 21.330 11.804 22.596 12.974 21.425 C 14.146 20.253 12.880 17.087 10.146 14.354 C 7.413 11.620 4.246 10.354 3.076 11.525 C 1.904 12.697 3.170 15.863 5.904 18.596"),
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
                pathData = parseSvgPathData("M 7.500 16.000 L 8.500 17.000"),
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
                pathData = parseSvgPathData("M 12.975 21.425 C 16.880 17.519 17.830 12.137 15.096 9.404 C 12.363 6.670 6.981 7.620 3.076 11.525"),
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
        return _meat!!
    }

private var _meat: ImageVector? = null
