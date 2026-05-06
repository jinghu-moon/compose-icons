package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorLightIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.16 55.88C170.989 26.705 127.116 17.976 89 33.763 50.883 49.55 26.03 86.744 26.03 128c0 41.256 24.853 78.45 62.969 94.237 38.116 15.787 81.99 7.058 111.16-22.117C219.434 181.071 230.281 155.099 230.281 128c0-27.099-10.847-53.071-30.121-72.12ZM64.33 64.36C79.636 49.038 99.974 39.777 121.58 38.29 120.09 59.885 110.808 80.205 95.46 95.47 80.182 110.816 59.853 120.094 38.25 121.58 39.746 99.982 49.01 79.657 64.33 64.36ZM38.2 133.63C63.026 132.16 86.444 121.614 104 104 121.624 86.479 132.188 63.087 133.68 38.28c45.287 2.741 81.407 38.845 84.17 84.13-51.301 3.209-92.199 44.09-95.43 95.39C77.1 215.081 40.946 178.949 38.2 133.63ZM191.67 191.63c-15.308 15.318-35.645 24.575-57.25 26.06 3.2-44.621 38.707-80.107 83.33-83.28-1.494 21.601-10.758 41.931-26.08 57.23Z"),
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
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
