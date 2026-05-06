package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) return _alignCenterHorizontalSimple!!
        _alignCenterHorizontalSimple = phosphorLightIcon(
            name = "AlignCenterHorizontalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 82h-74v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-74C40.268 82 34 88.268 34 96v64c0 7.732 6.268 14 14 14h74v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h74c7.732 0 14-6.268 14-14v-64c0-7.732-6.268-14-14-14ZM210 160c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-64c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2Z"),
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
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null
