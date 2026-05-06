package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorLightIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 58c-19.15 0-35.57 7.79-46 20.32v-40.32h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v40.32C111.57 65.79 95.15 58 76 58 43.983 58.039 18.039 83.983 18 116c0 29.11 14.17 47.62 26.05 58 6.595 5.736 14.01 10.455 22 14v20c0 7.732 6.268 14 14 14h96c7.732 0 14-6.268 14-14v-19.95C198.025 184.485 205.424 179.75 212 174c11.88-10.39 26.05-28.9 26.05-58C238.011 83.964 212.036 58.011 180 58ZM182.1 178.31c-2.448 .817-4.099 3.109-4.1 5.69v24c0 1.105-.895 2-2 2h-96c-1.105 0-2-.895-2-2v-24c-.001-2.581-1.652-4.873-4.1-5.69C73.46 178.16 30 163.13 30 116 30.033 90.609 50.609 70.033 76 70c26.65 0 46 17.66 46 42v64c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-64c0-24.34 19.35-42 46-42 25.391 .033 45.967 20.609 46 46 0 46.9-42.12 61.71-43.9 62.31Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
