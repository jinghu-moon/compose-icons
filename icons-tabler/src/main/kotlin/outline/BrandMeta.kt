package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMeta: ImageVector
    get() {
        if (_brandMeta != null) return _brandMeta!!
        _brandMeta = tablerOutlineIcon(
            name = "BrandMeta",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 10.174 C 13.766 7.390 15.315 6.000 16.648 6.000 C 18.648 6.000 19.911 8.213 20.648 11.217 C 21.352 14.086 21.148 18.000 18.648 18.000 C 17.534 18.000 16.000 16.435 14.500 14.348 C 13.546 13.033 12.709 11.636 12.000 10.174"),
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
                pathData = parseSvgPathData("M 12.000 10.174 C 10.234 7.390 8.685 6.000 7.352 6.000 C 5.352 6.000 4.089 8.213 3.352 11.217 C 2.648 14.086 2.852 18.000 5.352 18.000 C 6.466 18.000 8.000 16.435 9.500 14.348 C 10.500 12.957 11.333 11.565 12.000 10.174"),
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
        return _brandMeta!!
    }

private var _brandMeta: ImageVector? = null
