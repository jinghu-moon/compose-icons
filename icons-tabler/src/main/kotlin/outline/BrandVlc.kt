package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVlc: ImageVector
    get() {
        if (_brandVlc != null) return _brandVlc!!
        _brandVlc = tablerOutlineIcon(
            name = "BrandVlc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.790 4.337 L 16.891 13.642 C 17.221 14.627 16.778 15.712 15.871 16.141 C 13.418 17.287 10.582 17.287 8.129 16.141 C 7.222 15.713 6.779 14.627 7.109 13.642 L 10.209 4.337 C 10.476 3.537 11.194 3.000 12.000 3.000 C 12.807 3.000 13.525 3.537 13.790 4.337"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.000 14.000 L 5.571 14.000 C 4.678 14.000 3.894 14.592 3.648 15.450 L 3.077 17.450 C 2.904 18.054 3.025 18.703 3.403 19.204 C 3.781 19.705 4.372 20.000 5.000 20.000 L 18.998 20.000 C 19.626 20.000 20.217 19.705 20.595 19.204 C 20.973 18.703 21.094 18.054 20.921 17.450 L 20.349 15.450 C 20.103 14.592 19.319 14.000 18.426 14.000 L 17.000 14.000"),
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
        return _brandVlc!!
    }

private var _brandVlc: ImageVector? = null
