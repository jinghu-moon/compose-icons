package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorLightIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 180c-0 13.816-8.361 26.258-21.152 31.479-12.792 5.221-27.47 2.182-37.138-7.689-2.317-2.369-2.274-6.168 .095-8.485 2.369-2.317 6.168-2.274 8.485 .095 6.989 7.131 17.904 8.66 26.584 3.725 8.68-4.935 12.948-15.096 10.396-24.749C230.718 164.723 221.985 157.999 212 158c-2.238 .002-4.291-1.242-5.325-3.227-1.034-1.984-.878-4.38 .405-6.213L228.48 118h-36.48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c2.236 .002 4.285 1.248 5.317 3.231 1.032 1.984 .875 4.377-.407 6.209l-22.52 32.18c14.059 4.532 23.594 17.609 23.61 32.38ZM144 50c-3.314 0-6 2.686-6 6v54h-92v-54c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v120c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-54h92v54c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-120c0-3.314-2.686-6-6-6Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
