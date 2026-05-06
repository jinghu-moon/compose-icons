package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorLightIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M145 78.55c-12.372-7.138-27.887-5.782-38.833 3.394C95.22 91.121 91.176 106.16 96.045 119.589c4.869 13.429 17.611 22.382 31.895 22.411 1.9-.003 3.797-.166 5.67-.49l-18.76 31.42c-1.701 2.844-.774 6.529 2.07 8.23 2.844 1.701 6.529 .774 8.23-2.07L157.45 125c4.51-7.81 5.732-17.093 3.397-25.804C158.512 90.485 152.812 83.058 145 78.55ZM147.06 119h0c-4.435 7.721-13.087 12.008-21.917 10.859-8.83-1.149-16.096-7.508-18.407-16.108-2.31-8.599 .791-17.744 7.856-23.164C121.657 85.167 131.293 84.541 139 89c10.49 6.075 14.09 19.49 8.05 30ZM128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
