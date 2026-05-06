package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorDuotoneIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M183.25 63.2C170.25 42.79 151.15 32 128 32 104.85 32 85.75 42.79 72.75 63.2 62 80.18 56 103.19 56 128c0 24.81 6 47.82 16.75 64.8C85.75 213.21 104.85 224 128 224c23.15 0 42.25-10.79 55.25-31.2C194.05 175.8 200 152.8 200 128c0-24.8-5.95-47.82-16.75-64.8ZM128 208C89.32 208 72 167.82 72 128 72 88.18 89.32 48 128 48c38.68 0 56 40.18 56 80 0 39.82-17.32 80-56 80Z"),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
