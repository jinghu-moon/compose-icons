package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandElastic: ImageVector
    get() {
        if (_brandElastic != null) return _brandElastic!!
        _brandElastic = tablerOutlineIcon(
            name = "BrandElastic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 C 16.761 2.000 19.000 4.239 19.000 7.000 C 19.000 7.712 18.768 8.387 18.500 9.000 C 20.394 9.042 22.000 10.595 22.000 12.500 C 22.000 14.369 20.344 15.900 18.500 16.000 C 18.833 16.625 19.000 17.125 19.000 17.500 C 19.000 18.881 17.881 20.000 16.500 20.000 C 15.713 20.000 14.958 19.568 14.500 19.000 C 13.714 20.730 12.024 22.000 10.000 22.000 C 8.313 22.000 6.740 21.150 5.816 19.739 C 4.893 18.328 4.742 16.546 5.417 15.000 C 3.546 14.945 2.050 13.428 2.020 11.557 C 1.991 9.685 3.439 8.122 5.307 8.008 L 5.502 8.008 C 4.934 7.250 4.842 6.237 5.266 5.390 C 5.689 4.543 6.555 4.008 7.502 4.008 C 8.289 4.008 9.044 4.440 9.502 5.008 C 10.288 3.278 11.978 2.008 14.002 2.008 L 14.000 2.000"),
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
                pathData = parseSvgPathData("M 8.500 9.000 L 5.500 8.000"),
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
                pathData = parseSvgPathData("M 9.500 5.000 L 8.500 9.000 L 9.500 11.000 L 14.500 13.000 L 18.500 9.000"),
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
                pathData = parseSvgPathData("M 18.499 16.000 L 15.499 15.500 L 14.499 13.000"),
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
                pathData = parseSvgPathData("M 14.500 19.000 L 15.500 15.500"),
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
                pathData = parseSvgPathData("M 5.417 15.000 L 9.500 11.000"),
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
        return _brandElastic!!
    }

private var _brandElastic: ImageVector? = null
