package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorLightIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 26h-128C64.268 26 58 32.268 58 40v26h-18C32.268 66 26 72.268 26 80v96c0 7.732 6.268 14 14 14h18v26c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-176c0-7.732-6.268-14-14-14ZM158 102h44v52h-44ZM70 40c0-1.105 .895-2 2-2h128c1.105 0 2 .895 2 2v50h-44v-10c0-7.732-6.268-14-14-14h-74ZM38 176v-96c0-1.105 .895-2 2-2h104c1.105 0 2 .895 2 2v96c0 1.105-.895 2-2 2h-104c-1.105 0-2-.895-2-2ZM200 218h-128c-1.105 0-2-.895-2-2v-26h74c7.732 0 14-6.268 14-14v-10h44v50c0 1.105-.895 2-2 2ZM70.18 153.46l-12-48c-.806-3.214 1.146-6.474 4.36-7.28 3.214-.806 6.474 1.146 7.28 4.36l8.07 32.27 8.74-17.49c1.015-2.036 3.095-3.324 5.37-3.324 2.275 0 4.355 1.287 5.37 3.324l8.74 17.49 8.07-32.27c.806-3.214 4.066-5.166 7.28-4.36 3.214 .806 5.166 4.066 4.36 7.28l-12 48c-.613 2.434-2.675 4.229-5.17 4.5-.216 .015-.434 .015-.65 0-2.275 .001-4.354-1.285-5.37-3.32L92 133.42 81.37 154.68c-1.121 2.248-3.523 3.56-6.02 3.288-2.497-.272-4.56-2.071-5.17-4.508Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
