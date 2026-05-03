package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTwitter: ImageVector
    get() {
        if (_brandTwitter != null) return _brandTwitter!!
        _brandTwitter = tablerOutlineIcon(
            name = "BrandTwitter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 4.010 C 21.000 4.500 20.020 4.699 19.000 5.000 C 17.879 3.735 16.217 3.665 14.620 4.263 C 13.023 4.861 11.977 6.323 12.000 8.000 L 12.000 9.000 C 8.755 9.083 5.865 7.605 4.000 5.000 C 4.000 5.000 -0.182 12.433 8.000 16.000 C 6.128 17.247 4.261 18.088 2.000 18.000 C 5.308 19.803 8.913 20.423 12.034 19.517 C 15.614 18.477 18.556 15.794 19.685 11.775 C 20.022 10.553 20.189 9.290 20.182 8.022 C 20.182 7.773 21.692 5.250 22.000 4.009 L 22.000 4.010"),
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
        return _brandTwitter!!
    }

private var _brandTwitter: ImageVector? = null
