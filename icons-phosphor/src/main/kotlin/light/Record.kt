package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Record: ImageVector
    get() {
        if (_record != null) return _record!!
        _record = phosphorLightIcon(
            name = "Record",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 128.000 58.000 C 89.340 58.000 58.000 89.340 58.000 128.000 C 58.000 166.660 89.340 198.000 128.000 198.000 C 166.660 198.000 198.000 166.660 198.000 128.000 C 197.956 89.358 166.642 58.044 128.000 58.000 ZM 128.000 186.000 C 95.967 186.000 70.000 160.033 70.000 128.000 C 70.000 95.967 95.967 70.000 128.000 70.000 C 160.033 70.000 186.000 95.967 186.000 128.000 C 185.961 160.017 160.017 185.961 128.000 186.000 Z"),
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
        return _record!!
    }

private var _record: ImageVector? = null
