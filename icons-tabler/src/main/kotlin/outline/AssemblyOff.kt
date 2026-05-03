package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AssemblyOff: ImageVector
    get() {
        if (_assemblyOff != null) return _assemblyOff!!
        _assemblyOff = tablerOutlineIcon(
            name = "AssemblyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.376 18.377 L 13.092 21.720 C 12.412 22.093 11.588 22.093 10.908 21.720 L 4.158 17.450 C 3.446 17.060 3.003 16.314 3.000 15.502 L 3.000 8.217 C 3.000 7.408 3.443 6.663 4.158 6.270 L 5.486 5.487M 8.000 4.000 L 10.908 2.290 C 11.608 1.904 12.458 1.904 13.158 2.290 L 19.908 6.270 L 19.875 6.270 C 20.575 6.668 21.005 7.413 21.000 8.218 L 21.000 15.502 C 21.000 15.919 20.882 16.319 20.670 16.662"),
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
                pathData = parseSvgPathData("M 14.855 14.855 L 12.485 16.374 C 12.183 16.541 11.817 16.541 11.515 16.374 L 8.515 14.452 C 8.197 14.275 7.999 13.940 8.000 13.576 L 8.000 10.298 C 8.000 9.934 8.197 9.598 8.514 9.421 L 9.077 9.085M 11.514 7.631 C 11.825 7.458 12.203 7.458 12.514 7.631 L 15.514 9.421 L 15.500 9.421 C 15.812 9.602 16.003 9.937 16.000 10.298 L 16.000 12.000"),
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
        return _assemblyOff!!
    }

private var _assemblyOff: ImageVector? = null
