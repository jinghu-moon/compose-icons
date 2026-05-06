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
                pathData = parseSvgPathData("M9 19C4.7 20.4 4.7 16.5 3 16M15 21v-3.5c0-1 .1-1.4-.5-2C17.3 15.2 20 14.1 20 9.5 19.999 8.305 19.533 7.157 18.7 6.3c.39-1.038 .355-2.188-.1-3.2 0 0-1.1-.3-3.5 1.3-2.033-.529-4.167-.529-6.2 0C6.5 2.8 5.4 3.1 5.4 3.1 4.945 4.112 4.91 5.262 5.3 6.3 4.467 7.157 4.001 8.305 4 9.5c0 4.6 2.7 5.7 5.5 6-.6 .6-.6 1.2-.5 2v3.5"),
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
