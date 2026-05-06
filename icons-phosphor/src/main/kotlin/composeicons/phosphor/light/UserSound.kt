package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorLightIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M139 166.26c26.748-14.231 40.371-44.845 33.037-74.242C164.704 62.622 138.298 41.993 108 41.993c-30.298 0-56.704 20.628-64.037 50.025-7.333 29.397 6.29 60.011 33.037 74.242-22 6.22-41.88 19.15-57.61 37.88-2.012 2.544-1.639 6.227 .844 8.315 2.483 2.088 6.175 1.824 8.336-.595C49.11 187.45 77.31 174 108 174c30.69 0 58.9 13.45 79.41 37.86 1.356 1.715 3.538 2.556 5.695 2.195 2.157-.361 3.946-1.866 4.671-3.928 .725-2.063 .271-4.357-1.186-5.987C180.86 185.41 161 172.48 139 166.26ZM54 108C54 78.177 78.177 54 108 54c29.823 0 54 24.177 54 54 0 29.823-24.177 54-54 54C78.19 161.967 54.033 137.81 54 108ZM205.52 66.39c11.306 26.588 11.306 56.632 0 83.22-1.449 2.784-4.799 3.981-7.684 2.745-2.885-1.235-4.331-4.486-3.316-7.455 10.027-23.578 10.027-50.222 0-73.8-1.015-2.97 .431-6.22 3.316-7.455 2.885-1.235 6.235-.039 7.684 2.745ZM246 108c.037 18.692-3.747 37.194-11.12 54.37-1.43 2.831-4.817 4.06-7.73 2.805-2.913-1.255-4.346-4.561-3.27-7.545 13.534-31.703 13.534-67.557 0-99.26-1.076-2.984 .357-6.29 3.27-7.545 2.913-1.255 6.3-.026 7.73 2.805C242.253 70.806 246.037 89.308 246 108Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
