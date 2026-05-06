package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) return _mouseMiddleClick!!
        _mouseMiddleClick = phosphorLightIcon(
            name = "MouseMiddleClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 18h-32C77.774 18.039 50.039 45.774 50 80v96c.039 34.226 27.774 61.961 62 62h32c34.226-.039 61.961-27.774 62-62v-96C205.961 45.774 178.226 18.039 144 18ZM194 80v26h-44v-18c0-7.732-6.268-14-14-14h-2v-44h10c27.601 .033 49.967 22.399 50 50ZM118 88c0-1.105 .895-2 2-2h16c1.105 0 2 .895 2 2v48c0 1.105-.895 2-2 2h-16c-1.105 0-2-.895-2-2ZM112 30h10v44h-2c-7.732 0-14 6.268-14 14v18h-44v-26C62.033 52.399 84.399 30.033 112 30ZM144 226h-32C84.399 225.967 62.033 203.601 62 176v-58h44v18c0 7.732 6.268 14 14 14h16c7.732 0 14-6.268 14-14v-18h44v58c-.033 27.601-22.399 49.967-50 50Z"),
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
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
