package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorLightIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 50h-66v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-66C39.431 50 26 63.431 26 80v112c0 16.569 13.431 30 30 30h144c16.569 0 30-13.431 30-30v-112C230 63.431 216.569 50 200 50ZM218 192c0 9.941-8.059 18-18 18h-144c-9.941 0-18-8.059-18-18v-112C38 70.059 46.059 62 56 62h144c9.941 0 18 8.059 18 18ZM74 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM162 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM164 138h-72c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26h72c14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26ZM142 150v28h-28v-28ZM78 164c0-7.732 6.268-14 14-14h10v28h-10c-7.732 0-14-6.268-14-14ZM164 178h-10v-28h10c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
