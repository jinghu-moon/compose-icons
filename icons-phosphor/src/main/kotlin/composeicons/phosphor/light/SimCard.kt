package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorLightIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.24 83.76l-56-56C155.116 26.634 153.591 26.001 152 26h-96C48.268 26 42 32.268 42 40v176c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-128c-.001-1.591-.634-3.116-1.76-4.24ZM202 216c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-176c0-1.105 .895-2 2-2h93.52L202 90.49ZM74 120v72c0 3.314 2.686 6 6 6h96c3.314 0 6-2.686 6-6v-72c0-3.314-2.686-6-6-6h-96c-3.314 0-6 2.686-6 6ZM86 126h84v60h-20v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-20v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-20Z"),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
