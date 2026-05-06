package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = phosphorFillIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 104c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM71.43 58.75c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L71.43 36.12c-3.145-2.988-8.099-2.925-11.167 .143-3.068 3.068-3.131 8.022-.143 11.167ZM128 40c4.418 0 8-3.582 8-8v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16c0 4.418 3.582 8 8 8ZM178.91 61.09c2.122 .002 4.158-.84 5.66-2.34L195.88 47.43c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143L173.25 47.43c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938ZM192 104c0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16c-4.418 0-8 3.582-8 8ZM88 112c4.418 0 8-3.582 8-8C96 86.327 110.327 72 128 72c17.673 0 32 14.327 32 32 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C176 77.49 154.51 56 128 56 101.49 56 80 77.49 80 104c0 4.418 3.582 8 8 8ZM143.2 136h-30.4c-1.882-.001-3.51 1.311-3.91 3.15L102.62 168h50.76l-6.27-28.85c-.4-1.839-2.028-3.151-3.91-3.15ZM31.75 186 17 212.06c-1.734 3.062-1.263 6.898 1.16 9.45 1.573 1.619 3.743 2.519 6 2.49h46.69c1.882 .001 3.51-1.311 3.91-3.15l8-36.85h-47.53c-1.435-.006-2.763 .757-3.48 2ZM238.96 212 224.25 186c-.717-1.243-2.045-2.006-3.48-2h-47.54l8 36.85c.4 1.839 2.028 3.151 3.91 3.15h46.62c2.257 .029 4.427-.871 6-2.49 2.449-2.533 2.953-6.371 1.24-9.45ZM210.69 162 198.27 140c-1.426-2.521-4.104-4.074-7-4.06h-23.51c-1.21-0-2.356 .547-3.115 1.489-.76 .942-1.052 2.178-.795 3.361l5.9 27.15h37.45c1.415-.003 2.724-.753 3.441-1.974 .717-1.22 .736-2.729 .049-3.966ZM88.24 136h-23.54c-2.896-.014-5.574 1.539-7 4.06L45.31 162c-.717 1.242-.714 2.772 .006 4.011 .721 1.239 2.05 1.998 3.484 1.989h37.45l5.9-27.15c.257-1.183-.035-2.418-.795-3.361-.76-.942-1.905-1.49-3.115-1.489ZM156.86 184h-57.72l-7.64 35.15c-.257 1.183 .035 2.418 .795 3.361 .76 .942 1.905 1.49 3.115 1.489h65.18c1.21 0 2.356-.547 3.115-1.489 .76-.942 1.052-2.178 .795-3.361Z"),
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
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
