package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorLightIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M74 88v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM214 40v184c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-50h-50c-3.314 0-6-2.686-6-6 0-4.41 .68-108.25 59.64-133.51 1.853-.793 3.979-.602 5.662 .507 1.682 1.109 2.696 2.988 2.698 5.003ZM202 50c-36.79 24.29-42.82 91.48-43.81 112h43.81ZM117.92 39c-.552-3.27-3.65-5.472-6.92-4.92-3.27 .552-5.472 3.65-4.92 6.92L114 88.48c0 18.778-15.222 34-34 34-18.778 0-34-15.222-34-34L53.92 41C54.472 37.73 52.27 34.632 49 34.08 45.73 33.528 42.632 35.73 42.08 39l-8 48c-.052 .331-.079 .665-.08 1 .03 23.073 17.127 42.564 40 45.6v90.4c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-90.4C108.873 130.564 125.97 111.073 126 88c-.001-.335-.028-.669-.08-1Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
