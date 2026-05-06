package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorRegularIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 144c-.039 35.33-28.67 63.961-64 64h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c26.51 0 48-21.49 48-48C216 117.49 194.51 96 168 96h-116.69l34.35 34.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-48-48C24.838 92.159 23.994 90.123 23.994 88c0-2.123 .844-4.159 2.346-5.66L74.34 34.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L51.31 80h116.69c35.33 .039 63.961 28.67 64 64Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
