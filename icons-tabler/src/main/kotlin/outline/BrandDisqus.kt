package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDisqus: ImageVector
    get() {
        if (_brandDisqus != null) return _brandDisqus!!
        _brandDisqus = tablerOutlineIcon(
            name = "BrandDisqus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.847 21.000 C 9.588 21.000 7.524 20.333 5.928 19.000 L 2.000 19.000 L 3.708 15.734 C 3.163 14.560 2.949 13.288 2.950 12.000 C 2.950 7.030 6.790 3.000 11.848 3.000 C 16.900 3.000 21.000 7.030 21.000 12.000 C 21.000 16.972 16.902 21.000 11.847 21.000"),
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
                pathData = parseSvgPathData("M 11.485 15.000 L 10.000 15.000 L 10.000 9.000 L 11.485 9.000 C 13.597 9.000 15.000 9.823 15.000 11.981 L 15.000 12.016 C 15.000 14.196 13.597 15.000 11.485 15.000"),
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
        return _brandDisqus!!
    }

private var _brandDisqus: ImageVector? = null
