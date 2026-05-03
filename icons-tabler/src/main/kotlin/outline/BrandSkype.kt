package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSkype: ImageVector
    get() {
        if (_brandSkype != null) return _brandSkype!!
        _brandSkype = tablerOutlineIcon(
            name = "BrandSkype",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 14.857 2.999 17.545 4.355 19.242 6.654 C 20.939 8.952 21.444 11.920 20.603 14.650 C 21.373 16.356 21.007 18.360 19.684 19.684 C 18.360 21.007 16.356 21.373 14.650 20.603 C 11.462 21.586 7.992 20.726 5.633 18.367 C 3.274 16.008 2.414 12.538 3.397 9.350 C 2.626 7.644 2.992 5.639 4.316 4.315 C 5.639 2.992 7.644 2.626 9.350 3.396 C 10.209 3.132 11.102 2.999 12.000 3.000"),
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
                pathData = parseSvgPathData("M 8.000 14.500 C 8.500 16.500 10.358 17.000 12.000 17.000 C 14.905 17.000 16.000 15.813 16.000 14.500 C 16.000 12.997 14.073 12.000 12.000 12.000 C 9.927 12.000 8.000 11.000 8.000 9.500 C 8.000 8.187 9.095 7.000 12.000 7.000 C 13.642 7.000 15.500 7.500 16.000 9.500"),
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
        return _brandSkype!!
    }

private var _brandSkype: ImageVector? = null
