package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorBoldIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 12h-88C92.954 12 84 20.954 84 32v75L46.43 144.6c-24.577 24.577-24.577 64.423 0 89 24.577 24.577 64.423 24.577 89 0l68.4-68.4c5.269-5.24 8.222-12.37 8.2-19.8v-113.4c0-5.31-2.111-10.401-5.868-14.153C202.404 14.096 197.31 11.992 192 12ZM188 36v16h-80v-16ZM118.43 216.6c-9.716 10.345-24.294 14.58-38.04 11.05C66.644 224.12 55.91 213.386 52.38 199.64c-3.53-13.746 .705-28.324 11.05-38.04l41.09-41.08c2.246-2.265 3.498-5.33 3.48-8.52v-36h80v25.21c-27.917 5.734-47.966 30.29-48 58.79-.017 9.791 2.388 19.434 7 28.07ZM186.83 148.2l-21.51 21.51c-5.078-18.248 4.829-37.315 22.68-43.65v19.31c.001 1.061-.42 2.079-1.17 2.83Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
