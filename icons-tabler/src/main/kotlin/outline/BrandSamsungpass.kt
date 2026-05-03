package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSamsungpass: ImageVector
    get() {
        if (_brandSamsungpass != null) return _brandSamsungpass!!
        _brandSamsungpass = tablerOutlineIcon(
            name = "BrandSamsungpass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 12.000 C 4.000 10.895 4.895 10.000 6.000 10.000 L 18.000 10.000 C 19.105 10.000 20.000 10.895 20.000 12.000 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 L 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 L 4.000 12.000"),
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
                pathData = parseSvgPathData("M 7.000 10.000 L 7.000 8.138 C 7.000 5.300 9.239 3.000 12.000 3.000 C 14.761 3.000 17.000 5.300 17.000 8.138 L 17.000 10.000"),
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
                pathData = parseSvgPathData("M 10.485 17.577 C 10.822 17.867 11.185 18.000 12.000 18.000 L 12.413 18.000 C 12.736 18.000 13.046 17.867 13.275 17.632 C 13.504 17.394 13.632 17.076 13.631 16.746 C 13.631 16.414 13.503 16.096 13.275 15.860 C 13.049 15.626 12.738 15.493 12.413 15.492 L 11.587 15.492 C 11.262 15.491 10.951 15.359 10.726 15.125 C 10.497 14.887 10.369 14.569 10.370 14.239 C 10.370 13.907 10.498 13.588 10.726 13.353 C 10.951 13.119 11.262 12.986 11.587 12.985 L 12.000 12.985 C 12.816 12.985 13.178 13.118 13.515 13.408"),
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
        return _brandSamsungpass!!
    }

private var _brandSamsungpass: ImageVector? = null
