package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorLightIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM145 78.55c-12.372-7.138-27.887-5.782-38.833 3.394C95.22 91.121 91.176 106.16 96.045 119.589c4.869 13.429 17.611 22.382 31.895 22.411 1.9-.003 3.797-.166 5.67-.49l-18.76 31.42c-1.701 2.844-.774 6.529 2.07 8.23 2.844 1.701 6.529 .774 8.23-2.07L157.45 125c4.51-7.81 5.732-17.093 3.397-25.804C158.512 90.485 152.812 83.058 145 78.55ZM147.06 119h0c-4.435 7.721-13.087 12.008-21.917 10.859-8.83-1.149-16.096-7.508-18.407-16.108-2.31-8.599 .791-17.744 7.856-23.164C121.657 85.167 131.293 84.541 139 89c10.49 6.075 14.09 19.49 8.05 30Z"),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
