package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MouseSimple: ImageVector
    get() {
        if (_mouseSimple != null) return _mouseSimple!!
        _mouseSimple = phosphorBoldIcon(
            name = "MouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 12h-32C74.461 12.039 44.039 42.461 44 80v96c.039 37.539 30.461 67.961 68 68h32c37.539-.039 67.961-30.461 68-68v-96C211.961 42.461 181.539 12.039 144 12ZM188 176c-.028 24.289-19.711 43.972-44 44h-32C87.711 219.972 68.028 200.289 68 176v-96C68.028 55.711 87.711 36.028 112 36h32c24.289 .028 43.972 19.711 44 44ZM140 64v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _mouseSimple!!
    }

private var _mouseSimple: ImageVector? = null
