package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorLightIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.12 55.87C174.423 29.753 136.693 19.425 101.277 28.813 65.861 38.201 38.202 65.863 28.816 101.279c-9.386 35.417 .945 73.146 27.064 98.841 25.697 26.117 63.427 36.445 98.843 27.057 35.416-9.388 63.076-37.05 72.461-72.466 9.386-35.416-.945-73.146-27.064-98.841ZM106 134h44l14.1 30.56C151.335 158.93 136.375 162.842 128 174c-8.37-11.17-23.338-15.091-36.11-9.46ZM111.54 122 128 86.32 144.47 122ZM134 192c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18v15.64c-11.149 5.884-23.419 9.34-36 10.14ZM86 192c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18v25.78c-12.581-.8-24.851-4.256-36-10.14ZM191.64 191.64c-3.018 3.005-6.239 5.798-9.64 8.36v-24c0-.867-.188-1.723-.55-2.51l-48-104c-.98-2.128-3.108-3.491-5.45-3.491-2.342 0-4.47 1.363-5.45 3.491l-48 104c-.362 .787-.55 1.643-.55 2.51v24c-3.402-2.565-6.623-5.362-9.64-8.37C29.213 156.483 29.213 99.498 64.361 64.351c35.147-35.147 92.132-35.147 127.279 0 35.147 35.147 35.147 92.132 .001 127.279Z"),
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
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
