package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorLightIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 102c3.314 0 6-2.686 6-6v-32c0-7.732-6.268-14-14-14h-192C24.268 50 18 56.268 18 64v32c0 3.314 2.686 6 6 6 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26-3.314 0-6 2.686-6 6v32c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-32c0-3.314-2.686-6-6-6-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26ZM30 192v-26.47C48.456 162.6 62.042 146.687 62.042 128 62.042 109.313 48.456 93.4 30 90.47v-26.47c0-1.105 .895-2 2-2h58v132h-58c-1.105 0-2-.895-2-2ZM226 165.53v26.47c0 1.105-.895 2-2 2h-122v-132h122c1.105 0 2 .895 2 2v26.47C207.544 93.4 193.958 109.313 193.958 128c0 18.687 13.586 34.6 32.042 37.53Z"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
