package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorThinIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 44c-21.44 0-39.92 10.19-50 27.07C117.92 54.19 99.44 44 78 44 45.983 44.039 20.039 69.983 20 102c0 28.59 18 58.47 53.4 88.79 16.345 13.909 33.993 26.209 52.7 36.73 1.186 .64 2.614 .64 3.8 0 18.707-10.521 36.355-22.821 52.7-36.73C218 160.47 236 130.59 236 102 235.961 69.983 210.017 44.039 178 44ZM128 219.42C114 211.42 28 160.07 28 102 28.033 74.399 50.399 52.033 78 52c21.11 0 38.85 11.31 46.3 29.51 .616 1.5 2.078 2.48 3.7 2.48 1.622 0 3.084-.98 3.7-2.48C139.15 63.31 156.89 52 178 52c27.601 .033 49.967 22.399 50 50 0 58-86 109.46-100 117.42Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _heart!!
    }

private var _heart: ImageVector? = null
