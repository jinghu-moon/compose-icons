package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPicsart: ImageVector
    get() {
        if (_brandPicsart != null) return _brandPicsart!!
        _brandPicsart = tablerOutlineIcon(
            name = "BrandPicsart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 9.000 C 5.000 12.866 8.134 16.000 12.000 16.000 C 15.866 16.000 19.000 12.866 19.000 9.000 C 19.000 5.134 15.866 2.000 12.000 2.000 C 8.134 2.000 5.000 5.134 5.000 9.000"),
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
                pathData = parseSvgPathData("M 9.000 9.000 C 9.000 10.657 10.343 12.000 12.000 12.000 C 13.657 12.000 15.000 10.657 15.000 9.000 C 15.000 7.343 13.657 6.000 12.000 6.000 C 10.343 6.000 9.000 7.343 9.000 9.000"),
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
                pathData = parseSvgPathData("M 5.000 9.000 L 5.000 20.000 C 5.000 21.105 5.895 22.000 7.000 22.000 C 8.105 22.000 9.000 21.105 9.000 20.000 L 9.000 15.500"),
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
        return _brandPicsart!!
    }

private var _brandPicsart: ImageVector? = null
