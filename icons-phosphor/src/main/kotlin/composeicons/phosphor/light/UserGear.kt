package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorLightIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M139 158.25c26.748-14.231 40.371-44.845 33.037-74.242C164.704 54.612 138.298 33.983 108 33.983c-30.298 0-56.704 20.628-64.037 50.025-7.333 29.397 6.29 60.011 33.037 74.242-22 6.23-41.88 19.16-57.61 37.89-2.012 2.544-1.639 6.227 .844 8.315 2.483 2.088 6.175 1.824 8.336-.595C49.1 179.44 77.31 166 108 166c30.69 0 58.9 13.44 79.41 37.86 1.356 1.715 3.538 2.556 5.695 2.195 2.157-.361 3.946-1.866 4.671-3.928 .725-2.063 .271-4.357-1.186-5.987C180.86 177.41 161 164.48 139 158.25ZM54 100C54 70.177 78.177 46 108 46c29.823 0 54 24.177 54 54 0 29.823-24.177 54-54 54C78.19 153.967 54.033 129.81 54 100ZM251.25 144.8l-5.92-3.41c.894-3.538 .894-7.242 0-10.78l5.92-3.41c2.872-1.657 3.857-5.328 2.2-8.2-1.657-2.872-5.328-3.857-8.2-2.2l-5.93 3.43c-2.612-2.541-5.815-4.393-9.32-5.39v-6.84c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v6.84c-3.505 .997-6.708 2.849-9.32 5.39l-5.93-3.43c-2.872-1.657-6.543-.672-8.2 2.2-1.657 2.872-.672 6.543 2.2 8.2l5.92 3.41c-.894 3.538-.894 7.242 0 10.78l-5.92 3.41c-2.872 1.657-3.857 5.328-2.2 8.2 1.657 2.872 5.328 3.857 8.2 2.2l5.93-3.43c2.612 2.541 5.815 4.393 9.32 5.39v6.84c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-6.84c3.505-.997 6.708-2.849 9.32-5.39l5.93 3.43c2.872 1.657 6.543 .672 8.2-2.2 1.657-2.872 .672-6.543-2.2-8.2ZM224 146c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
