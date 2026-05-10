package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorFillIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 136v-64h19.47c5.616 .018 10.816 2.963 13.72 7.77L165.72 114c1.491 2.49 2.278 5.338 2.28 8.24v93.76c0 8.837-7.163 16-16 16h-96c-8.837 0-16-7.163-16-16v-93.78c.005-2.895 .793-5.736 2.28-8.22L62.81 79.77C65.714 74.963 70.914 72.018 76.53 72h19.47v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM224 160c-8.837 0-16-7.163-16-16v-80C208 33.072 182.928 8 152 8 121.072 8 96 33.072 96 64v8h16v-8c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40v80c0 17.673 14.327 32 32 32 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
