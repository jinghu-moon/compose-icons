package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorLightIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M102 88v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM128 82c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96c0-3.314-2.686-6-6-6ZM160 82c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96c0-3.314-2.686-6-6-6ZM206 64v144c0 7.732-6.268 14-14 14h-18v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-68v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-18c-7.732 0-14-6.268-14-14v-144C50 56.268 56.268 50 64 50h26v-26C90 11.85 99.85 2 112 2h32c12.15 0 22 9.85 22 22v26h26c7.732 0 14 6.268 14 14ZM102 50h52v-26c0-5.523-4.477-10-10-10h-32c-5.523 0-10 4.477-10 10ZM194 64c0-1.105-.895-2-2-2h-128c-1.105 0-2 .895-2 2v144c0 1.105 .895 2 2 2h128c1.105 0 2-.895 2-2Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
