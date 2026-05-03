package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorDuotoneIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 120.000 104.000 C 120.000 126.091 102.091 144.000 80.000 144.000 C 57.909 144.000 40.000 126.091 40.000 104.000 C 40.000 81.909 57.909 64.000 80.000 64.000 C 102.091 64.000 120.000 81.909 120.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 152.000 80.000 C 152.000 75.582 155.582 72.000 160.000 72.000 L 248.000 72.000 C 252.418 72.000 256.000 75.582 256.000 80.000 C 256.000 84.418 252.418 88.000 248.000 88.000 L 160.000 88.000 C 155.582 88.000 152.000 84.418 152.000 80.000 ZM 248.000 120.000 L 160.000 120.000 C 155.582 120.000 152.000 123.582 152.000 128.000 C 152.000 132.418 155.582 136.000 160.000 136.000 L 248.000 136.000 C 252.418 136.000 256.000 132.418 256.000 128.000 C 256.000 123.582 252.418 120.000 248.000 120.000 ZM 248.000 168.000 L 184.000 168.000 C 179.582 168.000 176.000 171.582 176.000 176.000 C 176.000 180.418 179.582 184.000 184.000 184.000 L 248.000 184.000 C 252.418 184.000 256.000 180.418 256.000 176.000 C 256.000 171.582 252.418 168.000 248.000 168.000 ZM 151.750 190.000 C 152.278 192.055 151.968 194.237 150.888 196.063 C 149.807 197.890 148.046 199.213 145.990 199.740 C 145.338 199.916 144.665 200.003 143.990 200.000 C 140.341 200.002 137.152 197.534 136.240 194.000 C 130.080 170.060 105.900 152.000 79.990 152.000 C 54.080 152.000 29.900 170.050 23.740 194.000 C 22.635 198.280 18.270 200.855 13.990 199.750 C 9.710 198.645 7.135 194.280 8.240 190.000 C 13.830 168.290 30.080 150.710 50.700 142.000 C 34.421 129.462 27.929 107.953 34.551 88.502 C 41.174 69.051 59.443 55.972 79.990 55.972 C 100.537 55.972 118.806 69.051 125.429 88.502 C 132.051 107.953 125.559 129.462 109.280 142.000 C 129.910 150.710 146.160 168.290 151.750 190.000 ZM 80.000 136.000 C 97.673 136.000 112.000 121.673 112.000 104.000 C 112.000 86.327 97.673 72.000 80.000 72.000 C 62.327 72.000 48.000 86.327 48.000 104.000 C 48.000 121.673 62.327 136.000 80.000 136.000 Z"),
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
        return _userList!!
    }

private var _userList: ImageVector? = null
