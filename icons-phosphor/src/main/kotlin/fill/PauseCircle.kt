package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) return _pauseCircle!!
        _pauseCircle = phosphorFillIcon(
            name = "PauseCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.928 70.592 185.408 24.072 128.000 24.000 ZM 112.000 160.000 C 112.000 164.418 108.418 168.000 104.000 168.000 C 99.582 168.000 96.000 164.418 96.000 160.000 L 96.000 96.000 C 96.000 91.582 99.582 88.000 104.000 88.000 C 108.418 88.000 112.000 91.582 112.000 96.000 ZM 160.000 160.000 C 160.000 164.418 156.418 168.000 152.000 168.000 C 147.582 168.000 144.000 164.418 144.000 160.000 L 144.000 96.000 C 144.000 91.582 147.582 88.000 152.000 88.000 C 156.418 88.000 160.000 91.582 160.000 96.000 Z"),
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
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
