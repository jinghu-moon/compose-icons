package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorLightIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 210h-18v-78.83l5.76 5.76c2.35 2.309 6.122 2.292 8.451-.039 2.328-2.331 2.341-6.104 .029-8.451L137.9 30.09C135.274 27.464 131.713 25.989 128 25.989c-3.713 0-7.274 1.475-9.9 4.101L19.76 128.44c-2.312 2.347-2.299 6.12 .029 8.451 2.328 2.331 6.101 2.349 8.451 .039L34 131.17v78.83h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM46 119.17 126.58 38.58c.376-.379 .887-.592 1.42-.592 .533 0 1.044 .213 1.42 .592L210 119.17v90.83h-52v-58c0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v58h-52ZM146 210h-36v-52h36Z"),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
