package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNuxt: ImageVector
    get() {
        if (_brandNuxt != null) return _brandNuxt!!
        _brandNuxt = tablerOutlineIcon(
            name = "BrandNuxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.146 8.583 L 10.846 6.493 C 10.653 6.183 10.313 5.997 9.948 6.000 C 9.584 6.004 9.247 6.197 9.060 6.510 L 3.150 16.418 C 2.957 16.741 2.953 17.143 3.138 17.470 C 3.324 17.797 3.671 18.000 4.047 18.000 L 7.960 18.000"),
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
                pathData = parseSvgPathData("M 20.043 18.000 C 20.786 18.000 21.244 17.157 20.863 16.495 L 16.819 9.482 C 16.654 9.184 16.341 8.999 16.000 8.999 C 15.659 8.999 15.346 9.184 15.181 9.482 L 11.138 16.495 C 10.756 17.157 11.214 18.000 11.957 18.000 L 20.043 18.000"),
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
        return _brandNuxt!!
    }

private var _brandNuxt: ImageVector? = null
