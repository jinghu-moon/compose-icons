package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGrindr: ImageVector
    get() {
        if (_brandGrindr != null) return _brandGrindr!!
        _brandGrindr = tablerOutlineIcon(
            name = "BrandGrindr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 13.282 C 13.000 13.774 13.784 15.000 15.102 15.000 C 16.420 15.000 18.000 14.034 18.000 12.938 C 18.000 12.121 17.068 12.000 16.591 12.000 C 16.363 12.000 13.000 12.111 13.000 13.282"),
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
                pathData = parseSvgPathData("M 12.000 21.000 C 9.016 21.000 5.529 18.279 5.370 18.018 C 3.240 14.528 3.000 4.315 3.000 4.315 L 4.446 3.000 C 6.945 3.390 9.469 3.617 12.000 3.680 C 14.530 3.617 17.053 3.389 19.554 3.000 L 21.000 4.315 C 21.000 4.315 20.760 14.528 18.630 18.019 C 18.470 18.279 14.984 21.000 12.000 21.000"),
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
                pathData = parseSvgPathData("M 11.000 13.282 C 11.000 13.774 10.216 15.000 8.898 15.000 C 7.580 15.000 6.000 14.034 6.000 12.938 C 6.000 12.121 6.932 12.000 7.409 12.000 C 7.637 12.000 11.000 12.111 11.000 13.282"),
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
        return _brandGrindr!!
    }

private var _brandGrindr: ImageVector? = null
