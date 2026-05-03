package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeIllustrator: ImageVector
    get() {
        if (_brandAdobeIllustrator != null) return _brandAdobeIllustrator!!
        _brandAdobeIllustrator = tablerOutlineIcon(
            name = "BrandAdobeIllustrator",
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
                pathData = parseSvgPathData("M 12.947 15.790 L 12.127 13.137M 7.263 15.789 L 8.083 13.137M 8.083 13.137 L 8.770 10.919 C 9.328 9.113 9.608 8.211 10.105 8.211 C 10.603 8.211 10.882 9.113 11.441 10.919 L 12.127 13.137M 8.084 13.137 L 12.127 13.137"),
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
                pathData = parseSvgPathData("M 15.789 15.789 L 15.789 11.053"),
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
                pathData = parseSvgPathData("M 15.789 8.684 L 15.789 8.211"),
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
        return _brandAdobeIllustrator!!
    }

private var _brandAdobeIllustrator: ImageVector? = null
