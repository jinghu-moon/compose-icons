package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldPin: ImageVector
    get() {
        if (_shieldPin != null) return _shieldPin!!
        _shieldPin = tablerOutlineIcon(
            name = "ShieldPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.597 20.829 C 12.400 20.891 12.200 20.948 12.000 21.000 C 8.855 20.184 6.175 18.128 4.573 15.301 C 2.971 12.473 2.584 9.118 3.500 6.000 C 6.616 6.143 9.664 5.067 12.000 3.000 C 14.336 5.067 17.384 6.143 20.500 6.000 C 21.006 7.720 21.114 9.512 20.842 11.248"),
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
                pathData = parseSvgPathData("M 21.121 20.121 C 21.979 19.263 22.236 17.973 21.772 16.852 C 21.307 15.730 20.213 14.999 19.000 14.999 C 17.787 14.999 16.693 15.730 16.228 16.852 C 15.764 17.973 16.021 19.263 16.879 20.121 C 17.297 20.540 18.004 21.166 19.000 22.000 C 20.051 21.110 20.759 20.484 21.121 20.121"),
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
                pathData = parseSvgPathData("M 19.000 18.000 L 19.000 18.010"),
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
        return _shieldPin!!
    }

private var _shieldPin: ImageVector? = null
