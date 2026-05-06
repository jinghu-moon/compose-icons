package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorDuotoneIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 172c0 15.464-12.536 28-28 28C28.536 200 16 187.464 16 172c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM212 144c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28Z"),
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
                pathData = parseSvgPathData("M212 136c-1.18 0-2.35 .06-3.51 .17L175.59 37.47C174.501 34.203 171.444 32 168 32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h26.23l17.44 52.31L124.21 168h-44.44C77.729 149.8 62.348 136.033 44.034 136.013 25.719 135.993 10.309 149.726 8.228 167.922c-2.081 18.196 9.83 35.054 27.676 39.17C53.75 211.208 71.842 201.269 77.94 184h50.06c2.398 .001 4.67-1.075 6.19-2.93l51.46-62.81 7.66 23c-15.361 9.362-21.452 28.627-14.268 45.118 7.185 16.492 25.441 25.149 42.757 20.275 17.316-4.873 28.377-21.781 25.906-39.599C245.234 149.236 229.989 135.977 212 136ZM44 192C32.954 192 24 183.046 24 172c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM212 192c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
