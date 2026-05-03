package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDrops: ImageVector
    get() {
        if (_brandDrops != null) return _brandDrops!!
        _brandDrops = tablerOutlineIcon(
            name = "BrandDrops",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.637 7.416 C 19.935 9.676 20.631 13.105 19.397 16.082 C 18.152 19.065 15.233 21.006 12.000 21.000 C 8.767 21.005 5.849 19.065 4.604 16.082 C 3.369 13.105 4.065 9.676 6.363 7.416 L 12.000 2.000 L 17.637 7.416"),
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
                pathData = parseSvgPathData("M 14.466 10.923 C 15.474 11.946 15.777 13.470 15.236 14.800 C 14.706 16.124 13.426 16.994 12.000 17.000 C 10.574 16.994 9.294 16.124 8.764 14.800 C 8.223 13.470 8.526 11.946 9.534 10.923 L 12.000 8.500 L 14.466 10.923"),
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
        return _brandDrops!!
    }

private var _brandDrops: ImageVector? = null
