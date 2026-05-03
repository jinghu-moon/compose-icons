package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGithub: ImageVector
    get() {
        if (_brandGithub != null) return _brandGithub!!
        _brandGithub = tablerOutlineIcon(
            name = "BrandGithub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 19.000 C 4.700 20.400 4.700 16.500 3.000 16.000M 15.000 21.000 L 15.000 17.500 C 15.000 16.500 15.100 16.100 14.500 15.500 C 17.300 15.200 20.000 14.100 20.000 9.500 C 19.999 8.305 19.533 7.157 18.700 6.300 C 19.090 5.262 19.055 4.112 18.600 3.100 C 18.600 3.100 17.500 2.800 15.100 4.400 C 13.067 3.871 10.933 3.871 8.900 4.400 C 6.500 2.800 5.400 3.100 5.400 3.100 C 4.945 4.112 4.910 5.262 5.300 6.300 C 4.467 7.157 4.001 8.305 4.000 9.500 C 4.000 14.100 6.700 15.200 9.500 15.500 C 8.900 16.100 8.900 16.700 9.000 17.500 L 9.000 21.000"),
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
        return _brandGithub!!
    }

private var _brandGithub: ImageVector? = null
