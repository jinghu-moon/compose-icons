package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorLightIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.9 82.79 189.21 30.1c-5.466-5.461-14.324-5.461-19.79 0L62.1 137.42c-5.461 5.466-5.461 14.324 0 19.79l22.1 22.1L35.76 227.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L92.69 187.8l22.1 22.1c5.466 5.461 14.324 5.461 19.79 0L241.9 102.58c5.461-5.466 5.461-14.324 0-19.79ZM126.1 201.42c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L101.17 179.31l31.07-31.07c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L92.69 170.83 70.58 148.73c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415L106.48 110h55.52v55.52ZM233.42 94.1 174 153.52v-49.52c0-3.314-2.686-6-6-6h-49.52L177.9 38.58c.375-.376 .884-.587 1.415-.587 .531 0 1.04 .211 1.415 .587l52.69 52.69c.376 .375 .587 .884 .587 1.415 0 .531-.211 1.04-.587 1.415ZM60 86C74.359 86 86 74.359 86 60 86 45.641 74.359 34 60 34 45.641 34 34 45.641 34 60c0 14.359 11.641 26 26 26ZM60 46c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14C52.268 74 46 67.732 46 60 46 52.268 52.268 46 60 46Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
