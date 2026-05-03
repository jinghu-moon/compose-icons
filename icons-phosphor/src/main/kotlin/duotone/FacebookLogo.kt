package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorDuotoneIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 136.000 215.630 L 136.000 152.000 L 160.000 152.000 C 164.418 152.000 168.000 148.418 168.000 144.000 C 168.000 139.582 164.418 136.000 160.000 136.000 L 136.000 136.000 L 136.000 112.000 C 136.000 103.163 143.163 96.000 152.000 96.000 L 168.000 96.000 C 172.418 96.000 176.000 92.418 176.000 88.000 C 176.000 83.582 172.418 80.000 168.000 80.000 L 152.000 80.000 C 134.327 80.000 120.000 94.327 120.000 112.000 L 120.000 136.000 L 96.000 136.000 C 91.582 136.000 88.000 139.582 88.000 144.000 C 88.000 148.418 91.582 152.000 96.000 152.000 L 120.000 152.000 L 120.000 215.630 C 73.151 211.353 37.951 170.986 40.091 123.990 C 42.232 76.995 80.956 39.994 128.000 39.994 C 175.044 39.994 213.768 76.995 215.909 123.990 C 218.049 170.986 182.849 211.353 136.000 215.630 Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
