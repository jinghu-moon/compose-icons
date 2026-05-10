package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorFillIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.87 30.59c-.781-4.345-4.934-7.236-9.28-6.46L14.59 64.13c-4.067 .742-6.898 4.46-6.532 8.578C8.423 76.826 11.866 79.987 16 80c.476-.001 .951-.041 1.42-.12L120 61.56v34.44h-56C46.327 96 32 110.327 32 128v64c0 17.673 14.327 32 32 32h128c17.673 0 32-14.327 32-32v-64C224 110.327 209.673 96 192 96h-56v-37.3L241.4 39.88c2.091-.373 3.947-1.561 5.161-3.304 1.214-1.743 1.685-3.896 1.309-5.986ZM104 160v-48h48v48ZM64 112h24v48h-40v-32c0-8.837 7.163-16 16-16ZM208 128v32h-40v-48h24c8.837 0 16 7.163 16 16Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
