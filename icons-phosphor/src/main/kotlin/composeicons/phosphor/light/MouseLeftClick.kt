package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorLightIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 18h-32C77.774 18.039 50.039 45.774 50 80v96c.039 34.226 27.774 61.961 62 62h32c34.226-.039 61.961-27.774 62-62v-96C205.961 45.774 178.226 18.039 144 18ZM194 80v26h-60v-76h10c27.601 .033 49.967 22.399 50 50ZM122 30v35.51L91.09 34.6C97.643 31.567 104.779 29.997 112 30ZM80.62 41.11 122 82.49v23.51h-7.51L66.9 58.42C70.134 51.705 74.821 45.792 80.62 41.11ZM62 80c.005-2.927 .266-5.848 .78-8.73L97.51 106h-35.51ZM144 226h-32C84.399 225.967 62.033 203.601 62 176v-58h132v58c-.033 27.601-22.399 49.967-50 50Z"),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
