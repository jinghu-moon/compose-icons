package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorLightIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM158 152c-0 13.816-8.361 26.258-21.152 31.479-12.792 5.221-27.47 2.182-37.138-7.689-2.317-2.369-2.274-6.168 .095-8.485 2.369-2.317 6.168-2.274 8.485 .095 6.989 7.131 17.904 8.66 26.584 3.725 8.68-4.935 12.948-15.096 10.396-24.749C142.718 136.723 133.985 129.999 124 130c-2.238 .002-4.291-1.242-5.325-3.227-1.034-1.984-.878-4.38 .405-6.213L140.48 90h-36.48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c2.238-.002 4.291 1.242 5.325 3.227 1.034 1.984 .878 4.38-.405 6.213l-22.53 32.18c14.059 4.532 23.594 17.609 23.61 32.38Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
