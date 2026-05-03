package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNextcloud: ImageVector
    get() {
        if (_brandNextcloud != null) return _brandNextcloud!!
        _brandNextcloud = tablerOutlineIcon(
            name = "BrandNextcloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 C 14.761 17.000 17.000 14.761 17.000 12.000 C 17.000 9.239 14.761 7.000 12.000 7.000 C 9.239 7.000 7.000 9.239 7.000 12.000"),
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
                pathData = parseSvgPathData("M 2.000 12.500 C 2.000 13.881 3.119 15.000 4.500 15.000 C 5.881 15.000 7.000 13.881 7.000 12.500 C 7.000 11.119 5.881 10.000 4.500 10.000 C 3.119 10.000 2.000 11.119 2.000 12.500"),
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
                pathData = parseSvgPathData("M 17.000 12.500 C 17.000 13.881 18.119 15.000 19.500 15.000 C 20.881 15.000 22.000 13.881 22.000 12.500 C 22.000 11.119 20.881 10.000 19.500 10.000 C 18.119 10.000 17.000 11.119 17.000 12.500"),
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
        return _brandNextcloud!!
    }

private var _brandNextcloud: ImageVector? = null
