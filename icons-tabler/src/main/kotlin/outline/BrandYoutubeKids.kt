package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYoutubeKids: ImageVector
    get() {
        if (_brandYoutubeKids != null) return _brandYoutubeKids!!
        _brandYoutubeKids = tablerOutlineIcon(
            name = "BrandYoutubeKids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.608 17.750 L 14.708 18.018 L 14.681 18.018 C 13.408 18.121 12.155 18.399 10.959 18.846 L 8.448 19.754 C 7.370 20.143 6.179 20.065 5.161 19.538 C 4.162 19.027 3.438 18.103 3.181 17.011 L 1.805 10.961 C 1.582 9.975 1.776 8.940 2.341 8.101 C 2.922 7.243 3.815 6.647 4.830 6.440 L 16.080 4.086 C 18.217 3.638 20.327 4.936 20.793 6.986 L 22.196 13.148 C 22.441 14.229 22.185 15.363 21.499 16.234 C 20.794 17.125 19.743 17.675 18.609 17.746 L 18.609 17.748 L 18.608 17.750"),
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
                pathData = parseSvgPathData("M 9.000 10.000 L 10.208 15.000 L 14.500 11.000 L 9.000 10.000"),
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
        return _brandYoutubeKids!!
    }

private var _brandYoutubeKids: ImageVector? = null
