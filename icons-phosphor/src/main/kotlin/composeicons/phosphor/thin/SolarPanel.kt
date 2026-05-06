package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = phosphorThinIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 104c0-2.209 1.791-4 4-4h16c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4ZM74.26 55.92c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L68.6 39c-1.592-1.194-3.821-1.036-5.228 .372-1.408 1.408-1.566 3.636-.372 5.228ZM128 36c2.209 0 4-1.791 4-4v-16c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v16c0 2.209 1.791 4 4 4ZM178.91 57.09c1.061 .001 2.079-.42 2.83-1.17L193.05 44.6c1.187-.967 1.717-2.526 1.367-4.016-.35-1.49-1.52-2.649-3.013-2.986-1.493-.337-3.048 .208-4.004 1.403L176.08 50.26c-1.145 1.144-1.488 2.866-.868 4.361 .62 1.496 2.08 2.47 3.698 2.469ZM200 108h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM88 108c2.209 0 4-1.791 4-4C92 84.118 108.118 68 128 68c19.882 0 36 16.118 36 36 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C172 79.699 152.301 60 128 60 103.699 60 84 79.699 84 104c0 2.209 1.791 4 4 4ZM235.45 218c-.712 1.233-2.026 1.995-3.45 2h-208c-1.432 .006-2.758-.754-3.476-1.993-.718-1.239-.72-2.767-.004-4.007L61.21 142c.719-1.246 2.052-2.009 3.49-2h126.6c1.438-.009 2.771 .754 3.49 2l40.69 72c.705 1.243 .694 2.768-.03 4ZM189 148h-31.69l5.22 24h40ZM154.37 172l-5.22-24h-42.27l-5.22 24ZM99.95 180l-7 32h70.05l-7-32ZM53.49 172h40l5.22-24h-31.71ZM30.89 212h53.89l7-32h-42.84ZM225.17 212 207.09 180h-42.82l6.95 32Z"),
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
