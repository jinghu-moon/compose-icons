package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorLightIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 34c-.583-.002-1.162 .083-1.72 .25l-160 48h0C19.739 83.01 17.999 85.348 18 88v24c0 3.314 2.686 6 6 6h8c9.787 .046 17.762 7.866 18 17.65 .071 4.755-1.787 9.337-5.15 12.7-3.533 3.592-8.352 5.625-13.39 5.65h-7.46c-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6h200c7.732 0 14-6.268 14-14v-96C237.967 58.19 213.81 34.033 184 34ZM184.85 46c20.544 .445 37.76 15.666 40.72 36h-160.69ZM194 104c0 10.523-6.343 20.008-16.067 24.028-9.724 4.02-20.913 1.782-28.343-5.669C142.159 114.908 139.953 103.713 144 94h48c1.324 3.168 2.003 6.567 2 10ZM138 186h-52v-2c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26ZM226 184c0 1.105-.895 2-2 2h-74v-2c0-20.987-17.013-38-38-38-20.987 0-38 17.013-38 38v2h-44v-20h1.46c8.274-.024 16.195-3.354 22-9.25 5.617-5.661 8.699-13.357 8.54-21.33C61.61 119.11 48.314 106.071 32 106h-2v-12h101.34c-4.216 15.453 1.71 31.89 14.817 41.097 13.107 9.207 30.58 9.207 43.686 0C202.95 125.89 208.876 109.453 204.66 94h21.34Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
