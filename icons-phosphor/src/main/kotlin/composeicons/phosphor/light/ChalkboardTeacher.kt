package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorLightIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h13.39c2.317-.001 4.427-1.336 5.42-3.43C67.08 193.104 84.675 181.968 104 181.968c19.325 0 36.92 11.136 45.19 28.602 .993 2.094 3.103 3.429 5.42 3.43h61.39c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM78 144c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26C89.641 170 78 158.359 78 144ZM218 200c0 1.105-.895 2-2 2h-57.73c-6.996-12.558-18.117-22.311-31.48-27.61 13.09-9.811 18.432-26.898 13.262-42.418C134.881 116.452 120.359 105.983 104 105.983c-16.359 0-30.881 10.469-36.052 25.989-5.171 15.52 .172 32.607 13.262 42.418C67.847 179.689 56.726 189.442 49.73 202h-9.73c-1.105 0-2-.895-2-2v-144c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2ZM198 80v96c0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h10v-84h-116v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6h128c3.314 0 6 2.686 6 6Z"),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
