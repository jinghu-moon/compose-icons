package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDeliveroo: ImageVector
    get() {
        if (_brandDeliveroo != null) return _brandDeliveroo!!
        _brandDeliveroo = tablerOutlineIcon(
            name = "BrandDeliveroo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 11.000 L 16.000 2.000 L 21.000 2.500 L 20.000 16.000 L 17.000 22.000 L 4.500 19.500 L 3.000 13.500 L 10.000 12.000 L 8.500 4.500 L 13.000 3.500 L 15.000 11.000"),
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
                pathData = parseSvgPathData("M 14.500 15.500 C 14.500 16.052 14.948 16.500 15.500 16.500 C 16.052 16.500 16.500 16.052 16.500 15.500 C 16.500 14.948 16.052 14.500 15.500 14.500 C 14.948 14.500 14.500 14.948 14.500 15.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.500 14.500 C 10.500 15.052 10.948 15.500 11.500 15.500 C 12.052 15.500 12.500 15.052 12.500 14.500 C 12.500 13.948 12.052 13.500 11.500 13.500 C 10.948 13.500 10.500 13.948 10.500 14.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandDeliveroo!!
    }

private var _brandDeliveroo: ImageVector? = null
