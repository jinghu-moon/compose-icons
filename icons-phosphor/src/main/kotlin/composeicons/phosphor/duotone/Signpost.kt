package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorDuotoneIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 112l-33.62 37.35c-1.515 1.685-3.674 2.648-5.94 2.65h-160.44c-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8h160.44c2.266 .002 4.425 .965 5.94 2.65Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M246 106.65 212.33 69.3C209.297 65.928 204.975 64.002 200.44 64h-64.44v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-80C31.163 64 24 71.163 24 80v64c0 8.837 7.163 16 16 16h80v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64h64.44c4.535-.002 8.857-1.928 11.89-5.3L246 117.35c2.736-3.042 2.736-7.658 0-10.7ZM200.44 144h-160.44v-64h160.44l28.8 32Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
