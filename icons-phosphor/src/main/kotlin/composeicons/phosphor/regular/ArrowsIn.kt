package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorRegularIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 104v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v20.69L202.34 42.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L171.31 96h20.69c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8ZM104 144h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h20.69L42.34 202.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L96 171.31v20.69c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM171.31 160h20.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-20.69l42.34 42.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM104 56c-4.418 0-8 3.582-8 8v20.69L53.66 42.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L84.69 96h-20.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
