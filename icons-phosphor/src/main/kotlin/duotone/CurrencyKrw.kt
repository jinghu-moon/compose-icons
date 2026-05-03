package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorDuotoneIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 50.000 136.000 L 102.000 136.000 L 76.000 200.000 ZM 102.000 136.000 L 154.000 136.000 L 128.000 72.000 ZM 154.000 136.000 L 180.000 200.000 L 206.000 136.000 Z"),
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
                pathData = parseSvgPathData("M 240.000 128.000 L 217.890 128.000 L 239.410 75.000 C 240.612 72.327 240.256 69.211 238.483 66.878 C 236.710 64.545 233.803 63.368 230.906 63.811 C 228.009 64.253 225.586 66.244 224.590 69.000 L 200.590 128.000 L 159.380 128.000 L 135.380 69.000 C 134.154 65.986 131.224 64.015 127.970 64.015 C 124.716 64.015 121.786 65.986 120.560 69.000 L 96.560 128.000 L 55.380 128.000 L 31.380 69.000 C 29.616 65.078 25.068 63.252 21.082 64.866 C 17.096 66.479 15.098 70.956 16.560 75.000 L 38.080 128.000 L 16.000 128.000 C 11.582 128.000 8.000 131.582 8.000 136.000 C 8.000 140.418 11.582 144.000 16.000 144.000 L 44.610 144.000 L 68.610 203.000 C 69.836 206.014 72.766 207.985 76.020 207.985 C 79.274 207.985 82.204 206.014 83.430 203.000 L 107.430 144.000 L 148.670 144.000 L 172.670 203.000 C 173.896 206.014 176.826 207.985 180.080 207.985 C 183.334 207.985 186.264 206.014 187.490 203.000 L 211.490 144.000 L 240.000 144.000 C 244.418 144.000 248.000 140.418 248.000 136.000 C 248.000 131.582 244.418 128.000 240.000 128.000 ZM 76.000 178.750 L 61.880 144.000 L 90.120 144.000 ZM 113.880 128.000 L 128.000 93.260 L 142.120 128.000 ZM 180.000 178.750 L 165.880 144.000 L 194.120 144.000 Z"),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
