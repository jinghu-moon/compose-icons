package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorLightIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 80.000 34.000 C 72.268 34.000 66.000 40.268 66.000 48.000 L 66.000 66.000 L 48.000 66.000 C 40.268 66.000 34.000 72.268 34.000 80.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 176.000 222.000 C 183.732 222.000 190.000 215.732 190.000 208.000 L 190.000 190.000 L 208.000 190.000 C 215.732 190.000 222.000 183.732 222.000 176.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 78.000 48.000 C 78.000 46.895 78.895 46.000 80.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 122.200 L 189.900 102.100 C 187.274 99.474 183.713 97.999 180.000 97.999 C 176.287 97.999 172.726 99.474 170.100 102.100 L 94.200 178.000 L 80.000 178.000 C 78.895 178.000 78.000 177.105 78.000 176.000 ZM 178.000 208.000 C 178.000 209.105 177.105 210.000 176.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 80.000 C 46.000 78.895 46.895 78.000 48.000 78.000 L 66.000 78.000 L 66.000 176.000 C 66.000 183.732 72.268 190.000 80.000 190.000 L 178.000 190.000 ZM 208.000 178.000 L 111.170 178.000 L 178.580 110.590 C 178.955 110.214 179.464 110.003 179.995 110.003 C 180.526 110.003 181.035 110.214 181.410 110.590 L 210.000 139.170 L 210.000 176.000 C 210.000 177.105 209.105 178.000 208.000 178.000 ZM 120.000 110.000 C 132.150 110.000 142.000 100.150 142.000 88.000 C 142.000 75.850 132.150 66.000 120.000 66.000 C 107.850 66.000 98.000 75.850 98.000 88.000 C 98.000 100.150 107.850 110.000 120.000 110.000 ZM 120.000 78.000 C 125.523 78.000 130.000 82.477 130.000 88.000 C 130.000 93.523 125.523 98.000 120.000 98.000 C 114.477 98.000 110.000 93.523 110.000 88.000 C 110.000 82.477 114.477 78.000 120.000 78.000 Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
