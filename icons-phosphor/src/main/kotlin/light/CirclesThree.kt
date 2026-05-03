package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorLightIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.000 76.000 C 170.000 52.804 151.196 34.000 128.000 34.000 C 104.804 34.000 86.000 52.804 86.000 76.000 C 86.000 99.196 104.804 118.000 128.000 118.000 C 151.196 118.000 170.000 99.196 170.000 76.000 ZM 128.000 106.000 C 111.431 106.000 98.000 92.569 98.000 76.000 C 98.000 59.431 111.431 46.000 128.000 46.000 C 144.569 46.000 158.000 59.431 158.000 76.000 C 158.000 92.569 144.569 106.000 128.000 106.000 ZM 188.000 130.000 C 164.804 130.000 146.000 148.804 146.000 172.000 C 146.000 195.196 164.804 214.000 188.000 214.000 C 211.196 214.000 230.000 195.196 230.000 172.000 C 230.000 148.804 211.196 130.000 188.000 130.000 ZM 188.000 202.000 C 171.431 202.000 158.000 188.569 158.000 172.000 C 158.000 155.431 171.431 142.000 188.000 142.000 C 204.569 142.000 218.000 155.431 218.000 172.000 C 218.000 188.569 204.569 202.000 188.000 202.000 ZM 68.000 130.000 C 44.804 130.000 26.000 148.804 26.000 172.000 C 26.000 195.196 44.804 214.000 68.000 214.000 C 91.196 214.000 110.000 195.196 110.000 172.000 C 110.000 148.804 91.196 130.000 68.000 130.000 ZM 68.000 202.000 C 51.431 202.000 38.000 188.569 38.000 172.000 C 38.000 155.431 51.431 142.000 68.000 142.000 C 84.569 142.000 98.000 155.431 98.000 172.000 C 98.000 188.569 84.569 202.000 68.000 202.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
