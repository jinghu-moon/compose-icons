package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Frustum: ImageVector
    get() {
        if (_frustum != null) return _frustum!!
        _frustum = tablerOutlineIcon(
            name = "Frustum",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.402 5.508 L 20.940 15.666 C 21.171 16.582 20.726 17.533 19.876 17.944 L 12.840 21.310 C 12.308 21.565 11.690 21.565 11.158 21.310 L 4.123 17.945 C 3.273 17.534 2.828 16.583 3.059 15.667 L 5.598 5.508 C 5.745 4.918 6.154 4.429 6.708 4.180 L 11.204 2.170 C 11.710 1.944 12.288 1.944 12.794 2.170 L 17.290 4.180 C 17.844 4.426 18.253 4.916 18.402 5.508"),
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
                pathData = parseSvgPathData("M 18.000 4.820 L 12.802 7.144 C 12.292 7.372 11.710 7.372 11.200 7.144 L 6.000 4.819"),
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
                pathData = parseSvgPathData("M 12.000 7.320 L 12.000 21.500"),
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
        return _frustum!!
    }

private var _frustum: ImageVector? = null
