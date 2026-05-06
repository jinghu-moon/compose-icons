package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorThinIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 52h-68v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36h-68C40.536 52 28 64.536 28 80v112c0 15.464 12.536 28 28 28h144c15.464 0 28-12.536 28-28v-112C228 64.536 215.464 52 200 52ZM220 192c0 11.046-8.954 20-20 20h-144C44.954 212 36 203.046 36 192v-112C36 68.954 44.954 60 56 60h144c11.046 0 20 8.954 20 20ZM76 108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM164 108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM164 140h-72c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24h72c13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24ZM144 148v32h-32v-32ZM76 164c0-8.837 7.163-16 16-16h12v32h-12c-8.837 0-16-7.163-16-16ZM164 180h-12v-32h12c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
