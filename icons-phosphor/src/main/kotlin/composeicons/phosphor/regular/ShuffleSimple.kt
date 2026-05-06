package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorRegularIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-20.69L156.28 111c-3.174 2.718-7.906 2.535-10.861-.419-2.955-2.955-3.138-7.686-.419-10.861L188.69 56h-20.69c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM208 160c-4.418 0-8 3.582-8 8v20.69L53.66 42.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L188.69 200h-20.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM99.72 145 42.34 202.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L111 156.28c2.718-3.174 2.535-7.906-.419-10.861-2.955-2.955-7.686-3.138-10.861-.419Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
