package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SoundModuleLine: ImageVector
    get() {
        if (_soundModuleLine != null) return _soundModuleLine!!
        _soundModuleLine = remixIcon(
            name = "SoundModuleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 18v3h-2v-3h-2v-2h6v2h-2ZM5 18v3h-2v-3h-2v-2h6v2h-2ZM11 6v-3h2v3h2v2h-6v-2h2ZM11 10h2v11h-2v-11ZM3 14v-11h2v11h-2ZM19 14v-11h2v11h-2Z"),
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
        return _soundModuleLine!!
    }

private var _soundModuleLine: ImageVector? = null
