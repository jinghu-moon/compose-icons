package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorLightIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.81 114.89 164.5 91.5 141.11 27.19C139.105 21.677 133.866 18.008 128 18.008c-5.866 0-11.105 3.67-13.11 9.182L91.5 91.5 27.19 114.89c-5.513 2.005-9.182 7.244-9.182 13.11 0 5.866 3.67 11.105 9.182 13.11l64.31 23.39 23.39 64.31c2.005 5.513 7.244 9.182 13.11 9.182 5.866 0 11.105-3.67 13.11-9.182l23.39-64.31 64.31-23.39c5.513-2.005 9.182-7.244 9.182-13.11 0-5.866-3.67-11.105-9.182-13.11ZM224.71 129.89l-66.94 24.34c-1.669 .606-2.984 1.921-3.59 3.59l-24.34 66.94c-.314 .738-1.038 1.216-1.84 1.216-.802 0-1.526-.479-1.84-1.216L101.82 157.82c-.606-1.669-1.921-2.984-3.59-3.59L31.29 129.84c-.738-.314-1.216-1.038-1.216-1.84 0-.802 .479-1.526 1.216-1.84L98.23 101.82c1.669-.606 2.984-1.921 3.59-3.59L126.16 31.29c.314-.738 1.038-1.216 1.84-1.216 .802 0 1.526 .479 1.84 1.216l24.34 66.94c.606 1.669 1.921 2.984 3.59 3.59l66.94 24.34c.738 .314 1.216 1.038 1.216 1.84 0 .802-.479 1.526-1.216 1.84Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
