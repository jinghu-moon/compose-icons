package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKickstarter: ImageVector
    get() {
        if (_brandKickstarter != null) return _brandKickstarter!!
        _brandKickstarter = tablerOutlineIcon(
            name = "BrandKickstarter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 9.000 L 13.975 4.350 C 14.590 3.450 15.380 3.000 16.352 3.000 C 17.142 3.000 17.826 3.286 18.406 3.858 C 18.982 4.432 19.272 5.114 19.272 5.912 C 19.272 6.500 19.119 7.021 18.812 7.471 L 16.000 11.500 L 19.465 16.412 C 19.821 16.872 20.000 17.412 20.000 18.025 C 20.012 18.809 19.708 19.565 19.157 20.123 C 18.596 20.707 17.915 21.000 17.117 21.000 C 16.241 21.000 15.572 20.710 15.117 20.130 L 11.005 14.433 L 11.005 17.500 C 11.005 18.376 10.692 19.190 10.394 19.675 C 9.851 20.558 9.044 21.000 8.005 21.000 C 7.061 21.000 6.252 20.673 5.734 20.026 C 5.248 19.426 5.005 18.634 5.005 17.646 L 5.005 6.275 C 5.005 5.341 5.252 4.569 5.745 3.962 C 6.257 3.321 7.092 3.000 8.005 3.000 C 8.873 3.000 9.826 3.321 10.405 3.962 C 10.728 4.318 10.920 4.676 11.005 5.042 C 11.057 5.266 11.005 5.685 11.005 6.302 L 11.005 9.000 L 11.000 9.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandKickstarter!!
    }

private var _brandKickstarter: ImageVector? = null
