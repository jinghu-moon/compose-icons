package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFiverr: ImageVector
    get() {
        if (_brandFiverr != null) return _brandFiverr!!
        _brandFiverr = tablerOutlineIcon(
            name = "BrandFiverr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 3.000 L 13.000 3.000 C 9.686 3.000 7.000 5.686 7.000 9.000 L 4.000 9.000 L 4.000 13.000 L 7.000 13.000 L 7.000 21.000 L 11.000 21.000 L 11.000 14.000 L 15.000 14.000 L 15.000 21.000 L 19.000 21.000 L 19.000 10.000 L 11.000 10.000 L 11.000 8.967 C 11.000 8.440 11.212 7.934 11.588 7.564 C 11.964 7.194 12.473 6.991 13.000 7.000 L 15.000 7.000 L 15.000 3.000"),
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
        return _brandFiverr!!
    }

private var _brandFiverr: ImageVector? = null
