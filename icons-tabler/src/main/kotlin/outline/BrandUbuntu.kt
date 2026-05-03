package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandUbuntu: ImageVector
    get() {
        if (_brandUbuntu != null) return _brandUbuntu!!
        _brandUbuntu = tablerOutlineIcon(
            name = "BrandUbuntu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 5.000 C 10.000 6.105 10.895 7.000 12.000 7.000 C 13.105 7.000 14.000 6.105 14.000 5.000 C 14.000 3.895 13.105 3.000 12.000 3.000 C 10.895 3.000 10.000 3.895 10.000 5.000"),
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
                pathData = parseSvgPathData("M 17.723 7.410 C 16.698 6.360 15.404 5.612 13.983 5.248M 10.012 5.248 C 8.567 5.619 7.254 6.386 6.223 7.464M 4.342 10.679 C 4.115 11.431 3.999 12.213 4.000 12.999 C 4.000 13.737 4.100 14.452 4.287 15.131M 6.247 18.559 C 7.273 19.623 8.575 20.381 10.006 20.749M 14.006 20.749 C 15.433 20.380 16.729 19.623 17.753 18.563M 19.715 15.133 C 19.906 14.439 20.003 13.722 20.002 13.002 C 20.002 12.238 19.895 11.499 19.695 10.799"),
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
                pathData = parseSvgPathData("M 3.000 17.000 C 3.000 18.105 3.895 19.000 5.000 19.000 C 6.105 19.000 7.000 18.105 7.000 17.000 C 7.000 15.895 6.105 15.000 5.000 15.000 C 3.895 15.000 3.000 15.895 3.000 17.000"),
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
                pathData = parseSvgPathData("M 17.000 17.000 C 17.000 18.105 17.895 19.000 19.000 19.000 C 20.105 19.000 21.000 18.105 21.000 17.000 C 21.000 15.895 20.105 15.000 19.000 15.000 C 17.895 15.000 17.000 15.895 17.000 17.000"),
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
        return _brandUbuntu!!
    }

private var _brandUbuntu: ImageVector? = null
