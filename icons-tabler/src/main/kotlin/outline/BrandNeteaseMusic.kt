package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNeteaseMusic: ImageVector
    get() {
        if (_brandNeteaseMusic != null) return _brandNeteaseMusic!!
        _brandNeteaseMusic = tablerOutlineIcon(
            name = "BrandNeteaseMusic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 4.000 C 6.070 5.346 4.000 9.046 4.000 12.492 C 4.000 17.000 8.000 20.000 12.000 20.000 C 16.000 20.000 20.000 17.000 20.000 13.000 C 20.000 9.487 16.500 7.487 14.000 7.487 C 11.500 7.487 9.000 9.000 9.000 12.000 C 9.000 14.000 10.500 15.000 12.000 15.000 C 13.500 15.000 15.000 14.000 15.000 12.000 C 15.000 8.487 13.000 7.492 13.000 5.485 C 13.000 1.981 16.500 2.882 17.000 3.983"),
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
        return _brandNeteaseMusic!!
    }

private var _brandNeteaseMusic: ImageVector? = null
