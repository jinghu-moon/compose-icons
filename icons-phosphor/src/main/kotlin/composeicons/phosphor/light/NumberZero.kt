package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorLightIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M181.56 64.28C169 44.47 150.43 34 128 34 105.57 34 87.05 44.47 74.44 64.28 63.84 80.94 58 103.57 58 128c0 24.43 5.84 47.06 16.44 63.72C87.05 211.53 105.57 222 128 222c22.43 0 40.95-10.47 53.56-30.28C192.16 175.06 198 152.43 198 128c0-24.43-5.84-47.06-16.44-63.72ZM128 210C87.93 210 70 168.82 70 128 70 87.18 87.93 46 128 46c40.07 0 58 41.18 58 82 0 40.82-17.93 82-58 82Z"),
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
