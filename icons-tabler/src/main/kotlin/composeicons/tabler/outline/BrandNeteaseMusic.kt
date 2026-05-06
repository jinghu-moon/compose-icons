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
                pathData = parseSvgPathData("M9 4C6.07 5.346 4 9.046 4 12.492 4 17 8 20 12 20c4 0 8-3 8-7C20 9.487 16.5 7.487 14 7.487 11.5 7.487 9 9 9 12c0 2 1.5 3 3 3 1.5 0 3-1 3-3C15 8.487 13 7.492 13 5.485 13 1.981 16.5 2.882 17 3.983"),
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
