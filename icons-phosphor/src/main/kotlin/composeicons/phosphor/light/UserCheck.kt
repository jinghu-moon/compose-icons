package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorLightIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M139 158.25c26.748-14.231 40.371-44.845 33.037-74.242C164.704 54.612 138.298 33.983 108 33.983c-30.298 0-56.704 20.628-64.037 50.025-7.333 29.397 6.29 60.011 33.037 74.242-22 6.23-41.88 19.16-57.61 37.89-2.012 2.544-1.639 6.227 .844 8.315 2.483 2.088 6.175 1.824 8.336-.595C49.11 179.44 77.31 166 108 166c30.69 0 58.9 13.44 79.41 37.86 1.356 1.715 3.538 2.556 5.695 2.195 2.157-.361 3.946-1.866 4.671-3.928 .725-2.063 .271-4.357-1.186-5.987C180.86 177.41 161 164.48 139 158.25ZM54 100C54 70.177 78.177 46 108 46c29.823 0 54 24.177 54 54 0 29.823-24.177 54-54 54C78.19 153.967 54.033 129.81 54 100ZM252.24 132.24l-32 32c-2.343 2.34-6.137 2.34-8.48 0l-16-16c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L216 151.51l27.76-27.75c1.496-1.605 3.748-2.266 5.874-1.723 2.126 .543 3.786 2.203 4.329 4.329 .543 2.126-.118 4.379-1.723 5.874Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
