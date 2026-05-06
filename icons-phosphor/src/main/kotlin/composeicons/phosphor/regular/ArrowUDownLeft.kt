package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) return _arrowUDownLeft!!
        _arrowUDownLeft = phosphorRegularIcon(
            name = "ArrowUDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 112c-.039 35.33-28.67 63.961-64 64h-116.69l34.35 34.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-48-48C24.838 172.159 23.994 170.123 23.994 168c0-2.123 .844-4.159 2.346-5.66l48-48c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L51.31 160h116.69c26.51 0 48-21.49 48-48C216 85.49 194.51 64 168 64h-88c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h88c35.33 .039 63.961 28.67 64 64Z"),
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
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
