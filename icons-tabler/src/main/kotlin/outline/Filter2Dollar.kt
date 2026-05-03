package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Dollar: ImageVector
    get() {
        if (_filter2Dollar != null) return _filter2Dollar!!
        _filter2Dollar = tablerOutlineIcon(
            name = "Filter2Dollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 6.000 L 20.000 6.000"),
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
                pathData = parseSvgPathData("M 6.000 12.000 L 16.000 12.000"),
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
                pathData = parseSvgPathData("M 9.000 18.000 L 13.000 18.000"),
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
                pathData = parseSvgPathData("M 21.000 15.000 L 19.000 15.000M 17.000 21.000 L 19.000 21.000M 19.000 21.000 L 19.000 22.000M 19.000 21.000 L 19.500 21.000 C 19.898 21.000 20.279 20.842 20.561 20.561 C 20.842 20.280 21.000 19.898 21.000 19.500 C 21.000 19.102 20.842 18.721 20.561 18.439 C 20.280 18.158 19.898 18.000 19.500 18.000 L 18.500 18.000 C 18.102 18.000 17.721 17.842 17.439 17.561 C 17.158 17.280 17.000 16.898 17.000 16.500 C 17.000 16.102 17.158 15.721 17.439 15.439 C 17.720 15.158 18.102 15.000 18.500 15.000 L 19.000 15.000M 19.000 14.000 L 19.000 15.000"),
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
        return _filter2Dollar!!
    }

private var _filter2Dollar: ImageVector? = null
