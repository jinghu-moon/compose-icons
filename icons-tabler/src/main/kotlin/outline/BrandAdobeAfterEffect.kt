package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobeAfterEffect: ImageVector
    get() {
        if (_brandAdobeAfterEffect != null) return _brandAdobeAfterEffect!!
        _brandAdobeAfterEffect = tablerOutlineIcon(
            name = "BrandAdobeAfterEffect",
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
                pathData = parseSvgPathData("M 12.000 15.790 L 11.180 13.137M 6.316 15.789 L 7.136 13.137M 7.136 13.137 L 7.822 10.919 C 8.381 9.113 8.660 8.211 9.158 8.211 C 9.656 8.211 9.935 9.113 10.493 10.919 L 11.179 13.137M 7.136 13.137 L 11.179 13.137"),
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
                pathData = parseSvgPathData("M 13.895 12.824 L 13.895 13.894 C 13.894 14.753 14.472 15.506 15.303 15.727 C 16.133 15.948 17.008 15.582 17.435 14.836M 13.895 12.824 L 13.895 12.000 C 13.895 10.953 14.743 10.105 15.790 10.105 C 16.837 10.105 17.685 10.953 17.685 12.000 L 17.685 12.824 L 13.895 12.824"),
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
        return _brandAdobeAfterEffect!!
    }

private var _brandAdobeAfterEffect: ImageVector? = null
