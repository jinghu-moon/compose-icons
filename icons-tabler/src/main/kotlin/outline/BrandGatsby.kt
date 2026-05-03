package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGatsby: ImageVector
    get() {
        if (_brandGatsby != null) return _brandGatsby!!
        _brandGatsby = tablerOutlineIcon(
            name = "BrandGatsby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.296 14.297 L 9.703 20.704 C 6.676 19.902 4.281 17.587 3.378 14.588 L 3.296 14.297"),
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
                pathData = parseSvgPathData("M 16.000 13.000 L 21.000 13.000 C 20.590 16.603 17.993 19.590 14.614 20.614 L 3.386 9.385 C 4.357 6.182 7.026 3.783 10.313 3.157 C 13.601 2.530 16.965 3.779 19.046 6.400"),
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
        return _brandGatsby!!
    }

private var _brandGatsby: ImageVector? = null
