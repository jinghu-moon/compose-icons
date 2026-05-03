package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFigma: ImageVector
    get() {
        if (_brandFigma != null) return _brandFigma!!
        _brandFigma = tablerOutlineIcon(
            name = "BrandFigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 C 12.000 13.657 13.343 15.000 15.000 15.000 C 16.657 15.000 18.000 13.657 18.000 12.000 C 18.000 10.343 16.657 9.000 15.000 9.000 C 13.343 9.000 12.000 10.343 12.000 12.000"),
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
                pathData = parseSvgPathData("M 6.000 6.000 C 6.000 4.343 7.343 3.000 9.000 3.000 L 15.000 3.000 C 16.657 3.000 18.000 4.343 18.000 6.000 C 18.000 7.657 16.657 9.000 15.000 9.000 L 9.000 9.000 C 7.343 9.000 6.000 7.657 6.000 6.000"),
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
                pathData = parseSvgPathData("M 9.000 9.000 C 7.343 9.000 6.000 10.343 6.000 12.000 C 6.000 13.657 7.343 15.000 9.000 15.000 L 12.000 15.000M 9.000 15.000 C 7.343 15.000 6.000 16.343 6.000 18.000 C 6.000 19.657 7.343 21.000 9.000 21.000 C 10.657 21.000 12.000 19.657 12.000 18.000 L 12.000 3.000"),
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
        return _brandFigma!!
    }

private var _brandFigma: ImageVector? = null
