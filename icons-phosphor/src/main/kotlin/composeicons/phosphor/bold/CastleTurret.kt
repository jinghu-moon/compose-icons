package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorBoldIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 212h-12v-95l10.14-10.14c3.772-3.748 5.882-8.853 5.86-14.17v-44.69C220 36.954 211.046 28 200 28h-144C44.954 28 36 36.954 36 48v44.69c-.014 5.307 2.096 10.399 5.86 14.14L52 117v95h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM72.49 103.51 60 91v-39h28v24c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24h32v24c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24h28v39l-12.49 12.48c-2.257 2.26-3.52 5.326-3.51 8.52v100h-16v-44c0-19.882-16.118-36-36-36-19.882 0-36 16.118-36 36v44h-16v-100c.003-3.184-1.26-6.238-3.51-8.49ZM140 212h-24v-44c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
