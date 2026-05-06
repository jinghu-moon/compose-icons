package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorLightIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 18h-32C77.774 18.039 50.039 45.774 50 80v96c.039 34.226 27.774 61.961 62 62h32c34.226-.039 61.961-27.774 62-62v-96C205.961 45.774 178.226 18.039 144 18ZM194 176c-.033 27.601-22.399 49.967-50 50h-32C84.399 225.967 62.033 203.601 62 176v-96C62.033 52.399 84.399 30.033 112 30h32c27.601 .033 49.967 22.399 50 50ZM134 78.49v99l13.76-13.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-24 24c-2.343 2.34-6.137 2.34-8.48 0l-24-24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L122 177.51v-99L108.24 92.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l24-24c2.343-2.34 6.137-2.34 8.48 0l24 24c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723Z"),
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
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
