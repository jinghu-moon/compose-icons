package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorFillIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 152v-48h48v48ZM32 53v95c0 2.209 1.791 4 4 4h52v-52.69L38.83 50.14c-1.148-1.149-2.877-1.49-4.375-.863C32.957 49.905 31.986 51.376 32 53ZM220 104h-52v52.69l49.17 49.17c1.148 1.149 2.877 1.49 4.375 .863 1.498-.627 2.468-2.099 2.455-3.723v-95c0-2.209-1.791-4-4-4ZM152 36c0-2.209-1.791-4-4-4h-95c-1.619-.001-3.079 .973-3.698 2.469-.62 1.496-.277 3.217 .868 4.361L99.31 88h52.69ZM212.49 81.17 174.83 43.51c-1.144-1.145-2.866-1.488-4.361-.868-1.496 .62-2.47 2.08-2.469 3.698v41.66h41.66c1.619 .001 3.079-.973 3.698-2.469 .62-1.496 .277-3.217-.868-4.361ZM156.69 168h-52.69v52c0 2.209 1.791 4 4 4h95c1.619 .001 3.079-.973 3.698-2.469 .62-1.496 .277-3.217-.868-4.361ZM43.51 174.83l37.66 37.66c1.144 1.145 2.866 1.488 4.361 .868 1.496-.62 2.47-2.08 2.469-3.698v-41.66h-41.66c-1.619-.001-3.079 .973-3.698 2.469-.62 1.496-.277 3.217 .868 4.361Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
