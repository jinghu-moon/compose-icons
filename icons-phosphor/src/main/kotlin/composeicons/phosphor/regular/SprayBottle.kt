package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorRegularIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 80c4.418 0 8-3.582 8-8C207.967 41.086 182.914 16.033 152 16h-72C71.163 16 64 23.163 64 32v48c0 13.255-10.745 24-24 24-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 22.091 0 40-17.909 40-40h32v24.62c.021 7.294-3.294 14.196-9 18.74L87 136.15c-9.507 7.573-15.032 19.075-15 31.23v56.62c0 8.837 7.163 16 16 16h104c8.837 0 16-7.163 16-16v-12.53C208.013 165.471 196.312 120.226 174 80ZM80 32h72c19 .027 35.37 13.39 39.2 32h-111.2ZM192 211.47v12.53h-104v-56.62c-.021-7.294 3.294-14.196 9-18.74l16-12.79c9.507-7.573 15.032-19.075 15-31.23v-24.62h27.52c23.882 39.694 36.494 85.146 36.48 131.47Z"),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
