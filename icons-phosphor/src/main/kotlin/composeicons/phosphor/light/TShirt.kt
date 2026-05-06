package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorLightIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.64 63 194.87 34.74c-.879-.486-1.866-.74-2.87-.74h-32c-3.314 0-6 2.686-6 6 0 14.359-11.641 26-26 26C113.641 66 102 54.359 102 40c0-3.314-2.686-6-6-6h-32c-1.007-.002-1.998 .253-2.88 .74L9.36 63C2.656 66.538 .072 74.83 3.58 81.55l19.28 36.81c2.512 4.735 7.45 7.68 12.81 7.64h22.33v82c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-82h22.34c5.36 .04 10.298-2.905 12.81-7.64L252.43 81.55c3.506-6.723 .918-15.015-5.79-18.55ZM35.64 114c-.895 .031-1.733-.435-2.18-1.21L14.21 76c-.219-.445-.247-.961-.077-1.427 .17-.466 .523-.843 .977-1.043L58 50.11v63.89ZM186 208c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2v-162h20.48c3.01 18.37 18.885 31.856 37.5 31.856 18.615 0 34.49-13.485 37.5-31.856h20.52ZM241.8 76l-19.28 36.8c-.447 .775-1.285 1.241-2.18 1.21h-22.34v-63.9l42.9 23.4c.456 .204 .809 .585 .977 1.055 .168 .47 .137 .989-.087 1.435Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
