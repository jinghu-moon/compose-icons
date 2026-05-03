package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlameOff: ImageVector
    get() {
        if (_flameOff != null) return _flameOff!!
        _flameOff = tablerOutlineIcon(
            name = "FlameOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.973 8.974 C 8.638 9.352 8.303 9.690 8.000 10.000 C 6.774 11.260 6.000 13.240 6.000 15.000 C 5.998 17.830 7.973 20.276 10.739 20.871 C 13.505 21.466 16.311 20.047 17.472 17.466M 17.855 13.869 C 17.535 12.460 16.733 10.824 16.000 10.000 C 15.719 10.472 15.457 10.870 15.210 11.202M 12.852 8.852 C 12.784 6.695 11.670 4.668 11.000 4.000 C 11.000 4.968 10.820 5.801 10.535 6.527"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _flameOff!!
    }

private var _flameOff: ImageVector? = null
