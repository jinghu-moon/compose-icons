package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleBigQuery: ImageVector
    get() {
        if (_brandGoogleBigQuery != null) return _brandGoogleBigQuery!!
        _brandGoogleBigQuery = tablerOutlineIcon(
            name = "BrandGoogleBigQuery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.730 19.875 C 17.332 20.575 16.587 21.005 15.782 21.000 L 8.499 21.000 C 7.687 20.999 6.941 20.555 6.552 19.842 L 2.280 13.092 C 1.907 12.412 1.907 11.588 2.280 10.908 L 6.552 4.158 C 6.941 3.446 7.687 3.002 8.498 3.000 L 15.783 3.000 C 16.592 3.000 17.337 3.443 17.730 4.158 L 21.710 10.908 C 22.096 11.608 22.096 12.458 21.710 13.158 L 17.730 19.908 L 17.730 19.875"),
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
                pathData = parseSvgPathData("M 8.000 11.500 C 8.000 13.433 9.567 15.000 11.500 15.000 C 13.433 15.000 15.000 13.433 15.000 11.500 C 15.000 9.567 13.433 8.000 11.500 8.000 C 9.567 8.000 8.000 9.567 8.000 11.500"),
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
                pathData = parseSvgPathData("M 14.000 14.000 L 16.000 16.000"),
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
        return _brandGoogleBigQuery!!
    }

private var _brandGoogleBigQuery: ImageVector? = null
