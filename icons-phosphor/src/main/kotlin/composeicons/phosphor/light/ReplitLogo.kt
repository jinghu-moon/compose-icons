package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) return _replitLogo!!
        _replitLogo = phosphorLightIcon(
            name = "ReplitLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 90h-66v-50c0-7.732-6.268-14-14-14h-64C64.268 26 58 32.268 58 40v48c0 7.732 6.268 14 14 14h66v52h-66c-7.732 0-14 6.268-14 14v48c0 7.732 6.268 14 14 14h64c7.732 0 14-6.268 14-14v-50h66c7.732 0 14-6.268 14-14v-48c0-7.732-6.268-14-14-14ZM138 216c0 1.105-.895 2-2 2h-64c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h66ZM138 90h-66c-1.105 0-2-.895-2-2v-48c0-1.105 .895-2 2-2h64c1.105 0 2 .895 2 2ZM218 152c0 1.105-.895 2-2 2h-66v-52h66c1.105 0 2 .895 2 2Z"),
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
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null
