package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) return _brandBitbucket!!
        _brandBitbucket = tablerOutlineIcon(
            name = "BrandBitbucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.648 4.000 C 3.459 3.997 3.278 4.079 3.154 4.223 C 3.031 4.366 2.977 4.557 3.008 4.744 L 6.148 19.272 C 6.218 19.689 6.578 19.996 7.000 20.000 L 17.000 20.000 C 17.318 20.003 17.590 19.774 17.642 19.461 L 20.992 4.751 C 21.022 4.564 20.969 4.373 20.845 4.230 C 20.722 4.086 20.541 4.005 20.352 4.007 L 3.648 4.000"),
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
                pathData = parseSvgPathData("M 14.000 15.000 L 10.000 15.000 L 9.000 9.000 L 15.000 9.000 L 14.000 15.000"),
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
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
