package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorBoldIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 116h-20.78C213.721 74.74 181.26 42.279 140 36.78v-20.78C140 9.373 134.627 4 128 4c-6.627 0-12 5.373-12 12v20.78C74.74 42.279 42.279 74.74 36.78 116h-20.78C9.373 116 4 121.373 4 128c0 6.627 5.373 12 12 12h20.78c5.499 41.26 37.96 73.721 79.22 79.22v20.78c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20.78c41.26-5.499 73.721-37.96 79.22-79.22h20.78c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM128 196C90.445 196 60 165.555 60 128 60 90.445 90.445 60 128 60c37.555 0 68 30.445 68 68-.039 37.539-30.461 67.961-68 68ZM128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
