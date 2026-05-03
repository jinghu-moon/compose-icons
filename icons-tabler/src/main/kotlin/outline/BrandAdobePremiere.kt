package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobePremiere: ImageVector
    get() {
        if (_brandAdobePremiere != null) return _brandAdobePremiere!!
        _brandAdobePremiere = tablerOutlineIcon(
            name = "BrandAdobePremiere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 C 3.000 7.757 3.000 5.636 4.318 4.318 C 5.636 3.000 7.758 3.000 12.000 3.000 C 16.242 3.000 18.364 3.000 19.682 4.318 C 21.000 5.636 21.000 7.758 21.000 12.000 C 21.000 16.242 21.000 18.364 19.682 19.682 C 18.364 21.000 16.242 21.000 12.000 21.000 C 7.758 21.000 5.636 21.000 4.318 19.682 C 3.000 18.364 3.000 16.242 3.000 12.000"),
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
                pathData = parseSvgPathData("M 7.263 15.790 L 7.263 12.000M 7.263 12.000 L 7.263 8.752 C 7.263 8.417 7.485 8.211 7.805 8.211 L 9.158 8.211 C 9.845 8.195 10.487 8.553 10.835 9.145 C 11.184 9.738 11.184 10.473 10.835 11.066 C 10.487 11.658 9.845 12.016 9.158 12.000 L 7.263 12.000"),
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
                pathData = parseSvgPathData("M 13.895 10.579 L 13.895 12.474M 13.895 12.474 L 13.895 15.789M 13.895 12.474 C 14.426 11.765 14.921 10.882 15.789 10.642 Q 16.009 10.580 16.263 10.579"),
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
        return _brandAdobePremiere!!
    }

private var _brandAdobePremiere: ImageVector? = null
