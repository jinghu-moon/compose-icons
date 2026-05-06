package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorRegularIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 48v160c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72h-52.69l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-32-32C16.838 132.159 15.994 130.123 15.994 128c0-2.123 .844-4.159 2.346-5.66l32-32c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L43.31 120h52.69v-72c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM237.66 122.34l-32-32c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L212.69 120h-52.69v-72c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h52.69l-18.35 18.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
