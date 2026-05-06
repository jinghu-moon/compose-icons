package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorLightIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.35 54.61C224.081 41.464 206.907 34 188.925 34c-17.982 0-35.156 7.464-47.425 20.61C135.838 60.562 131.269 67.464 128 75 124.729 67.471 120.16 60.576 114.5 54.63 102.231 41.484 85.057 34.02 67.075 34.02c-17.982 0-35.156 7.464-47.425 20.61-1.349 1.426-1.915 3.421-1.516 5.342 .399 1.921 1.712 3.527 3.516 4.298L83.48 91.17c-1.85 .34-3.7 .74-5.54 1.23C60.019 97.093 44.717 108.755 35.44 124.79c-9.341 15.938-11.865 34.968-7 52.79 .52 1.931 1.967 3.476 3.86 4.12 .622 .21 1.274 .318 1.93 .32 1.315 0 2.594-.432 3.64-1.23L122 116.64v107.36c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-107.36l84.17 64.13c1.046 .798 2.325 1.23 3.64 1.23 .656-.002 1.308-.11 1.93-.32 1.893-.644 3.34-2.189 3.86-4.12 4.865-17.822 2.341-36.852-7-52.79C211.323 108.735 196.021 97.073 178.1 92.38c-1.84-.49-3.69-.89-5.54-1.23L234.39 64.25c1.804-.771 3.117-2.377 3.516-4.298 .399-1.921-.168-3.916-1.516-5.342ZM67.08 46c14.688 .035 28.706 6.145 38.73 16.88 8.272 8.72 13.671 19.766 15.47 31.65L34.93 57C44.134 49.877 55.441 46.008 67.08 46ZM38.29 165.33c-1.243-12.013 1.377-24.109 7.48-34.53C53.473 117.529 66.155 107.882 81 104c4.932-1.32 10.015-1.993 15.12-2 6.98-.003 13.902 1.261 20.43 3.73ZM210.23 130.8c6.103 10.421 8.723 22.517 7.48 34.53L139.47 105.72c26.547-9.985 56.427 .605 70.76 25.08ZM134.72 94.53c1.799-11.884 7.198-22.93 15.47-31.65C160.214 52.145 174.232 46.035 188.92 46c11.639 .008 22.946 3.877 32.15 11Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
